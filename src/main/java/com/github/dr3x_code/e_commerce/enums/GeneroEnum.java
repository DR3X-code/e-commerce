package com.github.dr3x_code.e_commerce.enums;

public enum GeneroEnum {
    MASCULINO("M"),
    FEMININO("F");
private final String valor;

    GeneroEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
