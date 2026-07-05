package com.github.dr3x_code.e_commerce.dto.telefone;

import com.github.dr3x_code.e_commerce.enums.TipoTelefoneEnum;

public record TelefoneResponse(
        Long id,
        String nomeTelefone,
        Integer ddd,
        String telefone,
        TipoTelefoneEnum tipoTelefone

) {
}
