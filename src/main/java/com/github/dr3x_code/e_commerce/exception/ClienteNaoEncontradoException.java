package com.github.dr3x_code.e_commerce.exception;

public class ClienteNaoEncontradoException extends RuntimeException {
    public ClienteNaoEncontradoException() {
        super("Cliente não encontrado");
    }

    public ClienteNaoEncontradoException(String message) {
        super(message);
    }
}
