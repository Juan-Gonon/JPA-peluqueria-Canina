package com.mycompany.peluqueriacanina.GenericDto;

public class ResultDto<T> {

    private String error;
    private T valor;

    public ResultDto(String error, T valor) {
        this.error = error;
        this.valor = valor;
    }

    public String getError() {
        return error;
    }

    public T getValor() {
        return valor;
    }

}
