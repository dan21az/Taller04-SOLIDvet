package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Veterinario;

public interface IServicioClinica {

    void crearVeterinario(Veterinario veterinario);

    Veterinario obtenerVeterinario(int id);

    void actualizarVeterinario(Veterinario veterinario);

    void eliminarVeterinario(int id);
}
