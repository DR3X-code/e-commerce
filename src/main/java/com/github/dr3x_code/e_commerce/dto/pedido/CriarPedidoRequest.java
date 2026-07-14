package com.github.dr3x_code.e_commerce.dto.pedido;

public record CriarPedidoRequest(
        Long carrinhoId,
        Long enderecoId,
        Long cartaoId
) {
}
