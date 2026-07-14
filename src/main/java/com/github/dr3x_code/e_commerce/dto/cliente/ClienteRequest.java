package com.github.dr3x_code.e_commerce.dto.cliente;

import com.github.dr3x_code.e_commerce.enums.GeneroEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.br.CPF;

import java.time.Instant;

public record ClienteRequest(
        @NotBlank
        String nome,
        @Email
        String email,
        @CPF
        String cpf,
        @Past
        Instant dataNascimento,
        //@NotBlank
        GeneroEnum genero
) {}
