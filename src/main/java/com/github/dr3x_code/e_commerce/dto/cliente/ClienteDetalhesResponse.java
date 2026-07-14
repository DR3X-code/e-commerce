package com.github.dr3x_code.e_commerce.dto.cliente;

import com.github.dr3x_code.e_commerce.dto.cartao.CartaoResponse;
import com.github.dr3x_code.e_commerce.dto.endereco.EnderecoResponse;
import com.github.dr3x_code.e_commerce.dto.telefone.TelefoneResponse;
import com.github.dr3x_code.e_commerce.enums.GeneroEnum;

import java.time.LocalDate;
import java.util.List;

public record ClienteDetalhesResponse(
        Long id,
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento,
        List<EnderecoResponse> enderecos,
        List<TelefoneResponse> telefones,
        List<CartaoResponse> cartoes,
        GeneroEnum genero
) {}
