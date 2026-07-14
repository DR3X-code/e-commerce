package com.github.dr3x_code.e_commerce.dto.carrinho;

import java.math.BigDecimal;

public record ItemCarrinhoResponse(
        Long id,
        Long produtoId,
        String nomeProduto,
        BigDecimal precoUnitario,
        Integer quantidade,
        BigDecimal subtotal
) {}
