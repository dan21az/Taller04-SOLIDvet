package clinicaveterinaria.interfaces;
import clinicaveterinaria.model.*;

public interface IFacturaService {
    void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);

    void crearFactura(Factura factura);

    void pagarFactura(int id);
}