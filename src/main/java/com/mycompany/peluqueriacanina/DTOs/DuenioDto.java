package com.mycompany.peluqueriacanina.DTOs;

import com.mycompany.peluqueriacanina.GenericDto.ResultDto;

public class DuenioDto {

    private String nomDuenio;
    private String celDuenio;

    private DuenioDto(String nomDuenio, String celDuenio) {
        this.nomDuenio = nomDuenio;
        this.celDuenio = celDuenio;
    }

    public static ResultDto<DuenioDto> createDuenioDto(String nomDuenio, String celDuenio) {

        if (nomDuenio.isEmpty() || nomDuenio == null) {
            return new ResultDto<>("El nombre del dueño no puede estar vacío", null);
        }

        if (celDuenio.isEmpty() || celDuenio == null) {
            return new ResultDto<>("El número de celular no puede estar vacío", null);
        }

        return new ResultDto<DuenioDto>(null, new DuenioDto(nomDuenio, celDuenio));
    }

    public String getNomDuenio() {
        return nomDuenio;
    }

    public void setNomDuenio(String nomDuenio) {
        this.nomDuenio = nomDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

}
