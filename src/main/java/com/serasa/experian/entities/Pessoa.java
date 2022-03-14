package com.serasa.experian.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serasa.experian.enums.StatusScore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotNull
    private Integer idade;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotNull
    private Integer score;

}
