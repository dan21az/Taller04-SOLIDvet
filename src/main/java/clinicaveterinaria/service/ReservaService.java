package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IVeterinarioService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.EstadoCita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;
import clinicaveterinaria.repository.BaseDatos;

import java.time.LocalDate;

public class ReservaService implements IVeterinarioService{
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

    @Override
    public Cita reservarCita(Mascota mascota, Veterinario veterinario, LocalDate fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reservarCita'");
    }

    @Override
    public void diagnosticar(Cita cita, String diagnostico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'diagnosticar'");
    }
}
