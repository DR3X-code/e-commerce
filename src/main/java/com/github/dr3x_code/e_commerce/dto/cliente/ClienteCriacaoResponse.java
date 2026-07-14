package com.github.dr3x_code.e_commerce.dto.cliente;

import com.github.dr3x_code.e_commerce.dto.cartao.CartaoResponse;
import com.github.dr3x_code.e_commerce.dto.endereco.EnderecoResponse;
import com.github.dr3x_code.e_commerce.dto.telefone.TelefoneResponse;
import com.github.dr3x_code.e_commerce.enums.GeneroEnum;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

//recebe valor somente uma vez
public record ClienteCriacaoResponse(
        Long id,
        String nome
        )
{ }
//lição de casa implementar telefone e cartoes, inserir enum, e pensar mais regras possiveis Pensando no CRUD

//Ao Deletar vai se por id nao vai ter retorno
//update
//create vai ser quase a mesma estruta do ClienteResponse,
// mas vai ser ClienteRequest, vai receber os dados do cliente e vai retornar o ClienteResponse
//se estiver de boa faz os outros DTO

/*
Anotação
Request = o que o usuário manda para o sistema
Response = o que o sistema devolve para o usuário
*/