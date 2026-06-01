# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Setup en 5 minutos


Compilar con Maven. Salida esperada:

```text
=== ClinicaVeterinaria funcionando ===
```

## Estructura del proyecto

```text
src/main/java/clinicaveterinaria/
├── Main.java
├── interfaces/
│   ├── IAnimal.java
│   ├── IBaseDatos.java
│   ├── IServicioClinica.java
│   ├── ITratamiento.java
│   └── IVeterinarioService.java
├── model/
│   ├── Mascota.java
│   ├── Veterinario.java
│   ├── Cita.java
│   ├── Tratamiento.java
│   ├── Factura.java
│   └── clases auxiliares para animales y enums
├── repository/
│   ├── BaseDatos.java
│   └── DirectoBaseDatos.java
└── service/
    ├── ReservaService.java
    ├── DiagnosticoService.java
    ├── FacturacionService.java
    ├── ReporteService.java
    └── servicios CRUD y clases con violaciones intencionales
```

## Trabajo del taller

- Integrante 1: refactorizar SRP.
- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.

Preguntas
-Integrante 2
¿Porque los condicionales repetidos hacen mas caro el cambio?

Porque al seguir agregando mas condicionales el codigo dentro de la misma clase se va haciendo mas grande, haciendo que si queremos cambiar sea mas complejo de hacerlo.

¿Que pasaria si agregariamos "Odontologia" como tratamiento?

Al agregar odontologia como tratamiento ahora solo deberiamos de crear una nueva clase llamada OdontologiaTratamiento, asi evitando las modificaciones a las clases ya existentes y cumpliendo el principio de OCP.

¿Cuando una interfaz ayuda a extender el sistema?

Cuando se necesita que la interfaz se implemente en varias clases del mismo tipo, en este caso tuvimos que implementarlo muchas veces en las clases de los tipos de tratamiento.
