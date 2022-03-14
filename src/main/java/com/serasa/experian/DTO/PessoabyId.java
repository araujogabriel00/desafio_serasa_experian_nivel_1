package com.serasa.experian.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serasa.experian.enums.StatusScore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoabyId {

    private String nome;
    private String telefone;
    private Integer idade;
    private StatusScore scoreDescricao;



}
