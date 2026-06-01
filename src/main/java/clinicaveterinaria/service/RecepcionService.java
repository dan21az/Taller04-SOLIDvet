package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ICitaService;
import clinicaveterinaria.interfaces.IFacturaService;
import clinicaveterinaria.interfaces.IMascotaService;
import clinicaveterinaria.interfaces.IReporteService;
import clinicaveterinaria.interfaces.IServicioClinica;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Factura;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Tratamiento;
import clinicaveterinaria.model.Veterinario;

import java.util.List;


public class RecepcionService implements IServicioClinica, IMascotaService, ICitaService, IFacturaService, IReporteService {
    // private final ServicioClinicaCompleto servicioCompleto;
    IServicioClinica servicioClinica; 
    IMascotaService mascotaService; 
    ICitaService citaService;
    IFacturaService facturaService; 
    IReporteService reporteService;


    public RecepcionService(ServicioClinicaCompleto servicioCompleto, IServicioClinica servicioClinica, IMascotaService mascotaService, ICitaService citaService, IFacturaService facturaService, IReporteService reporteService) {
        //this.servicioCompleto = servicioCompleto;
        this.servicioClinica = servicioClinica;
        this.mascotaService = mascotaService;
        this.citaService = citaService;
        this.facturaService = facturaService;
        this.reporteService = reporteService;
    }

    @Override
    public void crearMascota(Mascota mascota) {
        mascotaService.crearMascota(mascota);
    }

    @Override
    public Mascota obtenerMascota(int id) {
        return mascotaService.obtenerMascota(id);
    }

    @Override
    public void actualizarMascota(Mascota mascota) {
        mascotaService.actualizarMascota(mascota);
    }

    @Override
    public void eliminarMascota(int id) {
        mascotaService.eliminarMascota(id);
    }

    @Override
    public void crearVeterinario(Veterinario veterinario) {
        servicioClinica.crearVeterinario(veterinario);
    }

    @Override
    public Veterinario obtenerVeterinario(int id) {
        return servicioClinica.obtenerVeterinario(id);
    }

    @Override
    public void actualizarVeterinario(Veterinario veterinario) {
        servicioClinica.actualizarVeterinario(veterinario);;
    }

    @Override
    public void eliminarVeterinario(int id) {
        servicioClinica.eliminarVeterinario(id);;
    }

    @Override
    public void crearCita(Cita cita) {
        citaService.crearCita(cita);
    }

    @Override
    public Cita obtenerCita(int id) {
        return citaService.obtenerCita(id);
    }

    @Override
    public void cancelarCita(int id) {
        citaService.cancelarCita(id);
    }

    @Override
    public void crearTratamiento(Tratamiento tratamiento) {
        facturaService.crearTratamiento(tratamiento);
    }

    @Override
    public double calcularTratamiento(Tratamiento tratamiento) {
        return facturaService.calcularTratamiento(tratamiento);
    }

    @Override
    public void crearFactura(Factura factura) {
        facturaService.crearFactura(factura);;
    }

    @Override
    public void pagarFactura(int id) {
        facturaService.pagarFactura(id);
    }

    @Override
    public List<Cita> generarReporteCitasPorVeterinario(int veterinarioId) {
        return reporteService.generarReporteCitasPorVeterinario(veterinarioId);
    }

    @Override
    public List<Mascota> generarReporteMascotasPorDueno(String duenoNombre) {
        return reporteService.generarReporteMascotasPorDueno(duenoNombre);
    }

    @Override
    public double calcularIngresosMensual() {
        return reporteService.calcularIngresosMensual();
    }
}
