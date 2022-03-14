package com.serasa.experian.resources;

import com.serasa.experian.DTO.PessoaList;
import com.serasa.experian.entities.Pessoa;
import com.serasa.experian.exceptions.ExceptionHelper;
import com.serasa.experian.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/serasa/consulta_score")
@Validated
public class PessoaResource {

    private final PessoaService pessoaService;
    private final ExceptionHelper exceptionHelper;

    @PostMapping("/pessoa")
    @ResponseBody
    public ResponseEntity<Pessoa> addPessoa(@Valid @RequestBody Pessoa pessoa) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("consulta_score/pessoa").toUriString());
        if (pessoa.getScore() > 1000 || pessoa.getScore() < 0){
        throw new HttpMessageNotReadableException("O score deve ser menor que 1000 e maior que zero");
        }
        return ResponseEntity.created(uri).body(pessoaService.addPessoa(pessoa));
    }

    @GetMapping("/getPessoa/{id}")
    @ResponseBody
    public ResponseEntity<?> getPessoaById(@PathVariable Long id){
            return ResponseEntity.ok().body(pessoaService.getPessoaById(id));
    }

    @GetMapping("/getPessoa")
    @ResponseBody
    public ResponseEntity<List<PessoaList>> getPessoa() {
        if (pessoaService.getAll() == null || pessoaService.getAll().isEmpty() || pessoaService.getAll().equals(0L)){
            throw new EntityNotFoundException();
        }else {
            return ResponseEntity.ok().body(pessoaService.getAll());
        }
    }

}

