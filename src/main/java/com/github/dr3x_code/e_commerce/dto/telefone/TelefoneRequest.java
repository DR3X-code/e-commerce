package com.github.dr3x_code.e_commerce.dto.telefone;

public record TelefoneRequest(
        String tituloTelefone,
        Integer ddd,
        String telefone,
        String tipoTelefone

) {
}
