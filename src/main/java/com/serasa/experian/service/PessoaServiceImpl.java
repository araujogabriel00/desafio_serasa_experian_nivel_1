package com.serasa.experian.service;

import com.serasa.experian.DTO.PessoaList;
import com.serasa.experian.DTO.PessoabyId;
import com.serasa.experian.entities.Pessoa;
import com.serasa.experian.enums.StatusScore;
import com.serasa.experian.repositories.PessoaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PessoaServiceImpl implements PessoaService {

    private final  PessoaRepository pessoaRepository;

    private StatusScore statusScore;

    @Override
    public Pessoa addPessoa(Pessoa pessoa) {
        log.info("Adicionando pessoa: {}", pessoa);
        pessoa = pessoaRepository.save(pessoa);
        return pessoa;
    }

    @Override
    public PessoabyId getPessoaById(Long id) {
        Pessoa pessoa = pessoaRepository.getById(id);
        return new PessoabyId(pessoa.getNome(), pessoa.getTelefone(), pessoa.getIdade(), getStatusScore(pessoa.getScore()));
    }


    @Override
    public List<PessoaList> getAll() {
        List<Pessoa> pessoaLists = pessoaRepository.findAll();
        List<PessoaList> pessoas = new ArrayList<>();

        for (Pessoa pessoa: pessoaLists) {
            PessoaList pessoaList = new PessoaList(pessoa.getNome(), pessoa.getCidade(),pessoa.getEstado(),getStatusScore(pessoa.getScore()));
            pessoas.add(pessoaList);

        }

        return pessoas;
    }


    public StatusScore getStatusScore(Integer score) {

        StatusScore scoreFinal = null;

        StatusScore statusScore;

        if (score <= 200) {
            scoreFinal = statusScore = StatusScore.INSUFICIENTE;
        } else if (score > 200 && score <= 500) {
            scoreFinal = statusScore = StatusScore.INACEITÁVEL;
        } else if (score > 500 && score <= 700) {
            scoreFinal = statusScore = StatusScore.ACEITÁVEL;
        } else {
            scoreFinal = statusScore = StatusScore.RECOMENDÁVEL;
        }
        return scoreFinal;
    }


}

