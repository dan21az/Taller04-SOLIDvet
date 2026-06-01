package clinicaveterinaria.model;
import clinicaveterinaria.interfaces.*;

public class Perro extends Animal implements Caminador, Nadador {
    public Perro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PERRO);
    }

    @Override
    public void caminar() {
        System.out.println(this.getNombre() + " esta caminando.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNombre() + " esta nadando.");
    }
}
