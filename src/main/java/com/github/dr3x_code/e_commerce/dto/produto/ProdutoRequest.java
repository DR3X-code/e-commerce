package com.github.dr3x_code.e_commerce.dto.produto;

import java.math.BigDecimal;

public record ProdutoRequest(
        String nome,
        String descricao,
        BigDecimal preco,
        Integer estoque,
        Long categoriaId
) {
}
