package com.api.senac.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity
@Table(name = "Funcionario")
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @CPF(message = "CPF inválido")
    private String cpf;

    @Size(min = 2,message = "Informe ao menos 2 caracteres para o campo nome")
    private String nome;

    @NotBlank(message = "Telefone obrigatório")
    private String telefone;

    @NotBlank(message = "E-mail obrigatório")
    @Email(message = "E-mail inválido")
    private String email;

    @NotNull(message = "Salário obrigatório")
    private double salario;
}
