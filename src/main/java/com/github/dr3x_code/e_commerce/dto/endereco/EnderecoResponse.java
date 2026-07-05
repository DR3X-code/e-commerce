package com.github.dr3x_code.e_commerce.dto.endereco;

public record EnderecoResponse(
        Long id,
        String rua,
        String numeroEndereco,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        String cep,
        String tituloEndereco,
        String pontoReferencia,
        boolean principal
) {
}
