package com.mycompany.peluqueriacanina.DTOs;

import com.mycompany.peluqueriacanina.ENUMs.MascotaEM;
import com.mycompany.peluqueriacanina.GenericDto.ResultDto;
import java.util.Map;

public class MascotaDto {

    private String nomMascota;
    private String raza;
    private String color;
    private String observaciones;
    private String alergico;
    private String atenEsp;

    private MascotaDto(String nomMascota, String raza, String color, String observaciones, String alergico, String atenEsp) {
        this.nomMascota = nomMascota;
        this.raza = raza;
        this.color = color;
        this.observaciones = observaciones;
        this.alergico = alergico;
        this.atenEsp = atenEsp;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtenEsp() {
        return atenEsp;
    }

    public static ResultDto<MascotaDto> createMascotaDto(Map<String, Object> Options) {
        String nombre = (String) Options.get(MascotaEM.NOMBRE.name());
        String raza = (String) Options.get(MascotaEM.RAZA.name());
        String color = (String) Options.get(MascotaEM.COLOR.name());
        String observaciones = (String) Options.get(MascotaEM.OBSERVACIONES.name());
        String alergico = (String) Options.get(MascotaEM.ALERGICO.name());
        String atenEsp = (String) Options.get(MascotaEM.ATENESP.name());
        
        
        if(nombre.isEmpty() || nombre == null) return new ResultDto<>("Nombre is Empty", null);
        if(raza.isEmpty() || raza == null) return new ResultDto<>("Raza is Empty", null);
        if(color.isEmpty() || color == null) return new ResultDto<>("Color is Empty", null);
        if(observaciones.isEmpty() || observaciones == null) return new ResultDto<>("Observaciones is Empty", null);
        if(alergico.isEmpty() || alergico == null) return new ResultDto<>("Alergico is Empty", null);
        if(atenEsp.isEmpty() || atenEsp == null) return new ResultDto<>("Atencion Especial is Empty", null);
        
        
        return new ResultDto<MascotaDto>(null, new MascotaDto(nombre, raza, color, observaciones, alergico, atenEsp));
    }

}
