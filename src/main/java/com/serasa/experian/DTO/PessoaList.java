package com.serasa.experian.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serasa.experian.enums.StatusScore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaList {

    private String nome;
    private String cidade;
    private String estado;
    private StatusScore scoreDescricao;
}
