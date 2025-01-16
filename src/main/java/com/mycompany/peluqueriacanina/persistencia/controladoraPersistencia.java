package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void deleteMascota(int numCliente) {
        try {
            this.mascotaJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota getMascota(int numCliente) {
        return mascotaJpa.findMascota(numCliente);
    }

}
