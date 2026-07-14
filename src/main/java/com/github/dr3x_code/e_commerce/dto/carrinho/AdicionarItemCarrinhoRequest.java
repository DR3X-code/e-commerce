package com.github.dr3x_code.e_commerce.dto.carrinho;

public record AdicionarItemCarrinhoRequest(
        Long produtoId,
        Integer quantidade
) {
}
