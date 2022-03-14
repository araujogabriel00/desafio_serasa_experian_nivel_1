package com.serasa.experian.service;

import com.serasa.experian.DTO.PessoaList;
import com.serasa.experian.DTO.PessoabyId;
import com.serasa.experian.entities.Pessoa;
import com.serasa.experian.enums.StatusScore;
import com.serasa.experian.repositories.PessoaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceImplTest {

    @InjectMocks
    private PessoaServiceImpl pessoaService;

    @Mock
    private PessoaRepository pessoaRepository;

    private Pessoa pessoa;

    private PessoabyId pessoabyId;

    private List<PessoaList> pessoaList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startPessoa();
    }

    @Test
    void addPessoa() {
        pessoaService.addPessoa(pessoa);
        Mockito.verify(pessoaRepository, Mockito.times(1)).save(pessoa);
    }

    @Test
    void getPessoaById() {
        Mockito.when(pessoaRepository.getById(Mockito.anyLong())).thenReturn(pessoa);

        pessoabyId = pessoaService.getPessoaById(pessoa.getId());

        Assertions.assertNotNull(pessoabyId);
        Assertions.assertEquals(PessoabyId.class, pessoabyId.getClass());
    }

    @Test
    void getAll() {
        List<Pessoa> pessoas = new ArrayList<>();

        Mockito.when(pessoaRepository.findAll()).thenReturn(pessoas);

        pessoaList = pessoaService.getAll();

        Assertions.assertNotNull(pessoaList);

    }

    @Test
    void getStatusScore() {
        Assertions.assertEquals(pessoaService.getStatusScore(0), StatusScore.INSUFICIENTE);
        Assertions.assertEquals(pessoaService.getStatusScore(201), StatusScore.INACEITÁVEL);
        Assertions.assertEquals(pessoaService.getStatusScore(501), StatusScore.ACEITÁVEL);
        Assertions.assertEquals(pessoaService.getStatusScore(701), StatusScore.RECOMENDÁVEL);
    }

    private void startPessoa(){
        pessoa = new Pessoa(1L, "Gabriel", "99999999",21, "Planaltina", "DF", 500);
    }

}