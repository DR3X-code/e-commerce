package com.github.dr3x_code.e_commerce.dto.pedido;

import com.github.dr3x_code.e_commerce.enums.StatusPedidoEnum;

public record PedidoResponse(
        Long id,
        Long clienteId,
        //List<ItemPedidoResponse> itens,
        double total,
        StatusPedidoEnum status

) {
}
