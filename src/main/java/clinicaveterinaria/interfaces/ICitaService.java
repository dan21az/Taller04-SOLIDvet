package clinicaveterinaria.interfaces;
import clinicaveterinaria.model.*;


public interface ICitaService {
    void crearCita(Cita cita);

    Cita obtenerCita(int id);

    void cancelarCita(int id);
    
}
