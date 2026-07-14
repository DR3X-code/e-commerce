package com.github.dr3x_code.e_commerce.dto.carrinho;
import java.math.BigDecimal;
import java.util.List;

public record CarrinhoResponse(
        Long id,
        Long clienteId,
        List<ItemCarrinhoResponse> itens,
        BigDecimal total
) {}
