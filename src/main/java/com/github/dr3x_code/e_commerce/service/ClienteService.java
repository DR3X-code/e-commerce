package com.github.dr3x_code.e_commerce.service;

import com.github.dr3x_code.e_commerce.dto.cliente.ClienteCriacaoResponse;
import com.github.dr3x_code.e_commerce.dto.cliente.ClienteDetalhesResponse;
import com.github.dr3x_code.e_commerce.dto.cliente.ClienteRequest;
import com.github.dr3x_code.e_commerce.enums.GeneroEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    public List<ClienteDetalhesResponse> listar (){
        List<ClienteDetalhesResponse> clientes = new ArrayList<>();
        ClienteDetalhesResponse cliente1 = new ClienteDetalhesResponse(1L, "teste", "teste@email.com",null,null,null,null,null, GeneroEnum.MASCULINO);
        ClienteDetalhesResponse cliente2 = new ClienteDetalhesResponse(2L, "teste2", "teste@email.com",null,null,null,null,null, GeneroEnum.MASCULINO);
        ClienteDetalhesResponse cliente3 = new ClienteDetalhesResponse(3L, "teste3", "teste@email.com",null,null,null,null,null, GeneroEnum.MASCULINO);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    return clientes;
    }

    public ClienteDetalhesResponse buscarPorId(Long id){
        ClienteDetalhesResponse cliente1 = new ClienteDetalhesResponse(1L, "teste", "teste@email.com",null,null,null,null,null, GeneroEnum.MASCULINO);
        return cliente1;
    }

    public ClienteCriacaoResponse criar(ClienteRequest cliente){
        ClienteCriacaoResponse clienteResponse = new ClienteCriacaoResponse(1L, cliente.nome());
        return clienteResponse;
    }

    public void atualizar(Long id, ClienteRequest cliente){
        if(id != 1){
            throw new RuntimeException("Cliente não encontrado");
        }
    }

    public void deletar(Long id){
        if(id != 2){
            throw new RuntimeException("Cliente não encontrado");
        }
    }

}
