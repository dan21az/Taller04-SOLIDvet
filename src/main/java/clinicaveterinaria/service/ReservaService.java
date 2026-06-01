package clinicaveterinaria.service;

import java.time.LocalDate;

import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.EstadoCita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;
import clinicaveterinaria.repository.BaseDatos;

public class ReservaService {
    private final BaseDatos baseDatos;
    private Veterinario veterinario;

    public ReservaService(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public Cita reservarCita(int id, Mascota mascota, Veterinario veterinario, LocalDate fecha) {
        Cita cita = new Cita(id, mascota, veterinario, fecha, "Pendiente", EstadoCita.PROGRAMADA);
        baseDatos.getCitas().add(cita);
        veterinario.setDisponible(false);
        return cita;
    }
    public Cita reservarCita(int citaId, Mascota mascota, LocalDate fecha) {
         veterinario.setDisponible(false);
        return new Cita(citaId, mascota, veterinario, fecha, "Pendiente", EstadoCita.PROGRAMADA);
    }
}
