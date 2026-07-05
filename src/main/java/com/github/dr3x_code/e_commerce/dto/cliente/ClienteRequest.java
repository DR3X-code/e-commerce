package com.github.dr3x_code.e_commerce.dto.cliente;

import com.github.dr3x_code.e_commerce.enums.GeneroEnum;

import java.time.Instant;
import java.time.LocalDate;

public record ClienteRequest(
        String nome,
        String email,
        String cpf,
        Instant dataNascimento,
        GeneroEnum genero
) {
}
