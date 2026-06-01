package clinicaveterinaria.service;

import clinicaveterinaria.repository.BaseDatos;


public class GestorReportesClinica {
    private final BaseDatos baseDatos;

    public GestorReportesClinica(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void imprimirResumenOperaciones() {
        System.out.println("Resumen interno: " + baseDatos.getAuditoria());
    }
}
