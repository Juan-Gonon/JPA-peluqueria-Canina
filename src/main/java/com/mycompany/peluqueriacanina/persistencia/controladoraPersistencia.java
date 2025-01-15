package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;

public class controladoraPersistencia {
    
      DuenioJpaController duenioJpa = new DuenioJpaController();
      MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        this.duenioJpa.create(duenio);
        this.mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascota() {
        return this.mascotaJpa.findMascotaEntities();
    }
    
}
