package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.DTOs.DuenioDto;
import com.mycompany.peluqueriacanina.DTOs.MascotaDto;
import com.mycompany.peluqueriacanina.persistencia.controladoraPersistencia;
import java.util.List;

public class Controladora {

    controladoraPersistencia controlPersis = new controladoraPersistencia();

    public void guardar(MascotaDto mascotaDto, DuenioDto duenioDto) {
        Duenio duenio = new Duenio();
        Mascota mascota = new Mascota();

        duenio.setNombre(duenioDto.getNomDuenio());
        duenio.setCelDuenio(duenioDto.getCelDuenio());

        mascota.setNombre(mascotaDto.getNomMascota());
        mascota.setRaza(mascotaDto.getRaza());
        mascota.setColor(mascotaDto.getColor());
        mascota.setAlergico(mascotaDto.getAlergico());
        mascota.setAtencion_especial(mascotaDto.getAtenEsp());
        mascota.setObservaciones(mascotaDto.getObservaciones());
        mascota.setUnDuenio(duenio);
        
        this.controlPersis.guardar(duenio, mascota);

    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascota();
    }

    public void deleteMascota(int numCliente) {
        this.controlPersis.deleteMascota(numCliente);
    }

    public Mascota getMascota(int numCliente) {
        return controlPersis.getMascota(numCliente);
    }

}
