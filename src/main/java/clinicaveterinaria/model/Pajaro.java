package clinicaveterinaria.model;
import clinicaveterinaria.interfaces.*;


public class Pajaro extends Animal implements Volador, Caminador {
    public Pajaro(int id, String nombre) {
        super(id, nombre, TipoAnimal.PAJARO);
    }

    @Override
    public void volar() {
        System.out.println(this.getNombre() + " esta volando.");
    }

    @Override
    public void caminar() {
        System.out.println(this.getNombre() + " esta caminando.");
    }
}
