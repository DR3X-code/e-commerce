package com.github.dr3x_code.e_commerce.controller.cliente;

import com.github.dr3x_code.e_commerce.dto.cliente.ClienteCriacaoResponse;
import com.github.dr3x_code.e_commerce.dto.cliente.ClienteDetalhesResponse;
import com.github.dr3x_code.e_commerce.dto.cliente.ClienteRequest;
import com.github.dr3x_code.e_commerce.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteDetalhesResponse>> listar() {
        return ResponseEntity.ok(clienteService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDetalhesResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteCriacaoResponse> criar(@RequestBody @Valid ClienteRequest cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.criar(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDetalhesResponse> atualizar(@PathVariable Long id, @RequestBody @Valid ClienteRequest cliente) {
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
//controller tem como função receber dados e repassar

//todo:Da proxima aula: atualizar para comecar a retorna valor
//      Revisar codigos http de respostas
//      Criar service para retornar os valores
//      talvez criar as expcetion
//
//todo: liçãoDeCasaOpcional:Revisar DTO's e organizar melhor
