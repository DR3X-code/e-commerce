package com.github.dr3x_code.e_commerce.dto.cartao;

import com.github.dr3x_code.e_commerce.enums.TipoCartaoEnum;

public record CartaoRequest(
        String nomeCartao,
        TipoCartaoEnum tipoCartao,
        String numero,
        String nomeTitular,
        String dataValidade,
        String cvv
) {
}
