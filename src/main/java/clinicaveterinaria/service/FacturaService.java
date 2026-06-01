package clinicaveterinaria.service;
import java.time.LocalDate;
import java.util.List;

import clinicaveterinaria.model.Factura;
import clinicaveterinaria.repository.BaseDatos;


public class FacturaService {
    private final BaseDatos baseDatos;
    List<Factura> facturas;
    

    public FacturaService(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void crearFactura(Factura factura) {
        baseDatos.getFacturas().add(factura);
        baseDatos.registrarOperacion("crearFactura");
    }

    public Factura obtenerFactura(int id) {
        for (Factura factura : baseDatos.getFacturas()) {
            if (factura.getId() == id) {
                return factura;
            }
        }
        return null;
    }

    public void actualizarFactura(Factura factura) {
        eliminarFactura(factura.getId());
        crearFactura(factura);
    }

    public void eliminarFactura(int id) {
        baseDatos.getFacturas().removeIf(factura -> factura.getId() == id);
        baseDatos.registrarOperacion("eliminarFactura");
    }

    public void pagarFactura(int id) {
        Factura factura = obtenerFactura(id);
        if (factura != null) {
            factura.setPagada(true);
        }
    }

    public List<Factura> listarFacturas() {
        return baseDatos.getFacturas();
    }
        public double calcularIngresosMensual() {
        double total = 0;
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();
        for (Factura factura : facturas) {
            if (factura.isPagada()
                    && factura.getFecha().getMonthValue() == mesActual
                    && factura.getFecha().getYear() == anioActual) {
                total += factura.getMonto();
            }
        }
        return total;
    }
}
