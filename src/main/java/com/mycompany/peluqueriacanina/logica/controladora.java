package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.controladoraPersistencia;

public class Controladora {

    controladoraPersistencia controlPersis = new controladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String alergico, String atenEsp, String nomDuenio, String celDuenio) {
        Duenio duenio = new Duenio();
        Mascota mascota = new Mascota();

        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(celDuenio);

        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        this.controlPersis.guardar(duenio, mascota);

    }

}
