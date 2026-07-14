package com.github.dr3x_code.e_commerce.dto.produto;
import com.github.dr3x_code.e_commerce.dto.categoria.CategoriaResponse;
import java.math.BigDecimal;

public record ProdutoResponse(
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        Integer estoque,
        CategoriaResponse categoria,
        boolean ativo
) {}
