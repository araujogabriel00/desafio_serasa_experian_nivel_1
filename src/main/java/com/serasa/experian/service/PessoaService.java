package com.serasa.experian.service;

import com.serasa.experian.DTO.PessoaList;
import com.serasa.experian.DTO.PessoabyId;
import com.serasa.experian.entities.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa addPessoa(Pessoa pessoa);

    PessoabyId getPessoaById(Long id);

    List<PessoaList> getAll();

}
