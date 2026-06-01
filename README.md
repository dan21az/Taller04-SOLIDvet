# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Integrante 3 - LSP

| Criterio | Sí/No |
| --- | --- |
| El proyecto compila | ✓ |
| Ningún animal implementa acciones imposibles | ✓ |
| No hay `UnsupportedOperationException` por capacidades naturales | ✓ |
| El código cliente usa la interfaz correcta según la acción | ✓ |

Preguntas de discusión:

- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?

Porque no indica que las subclases no puede implementar todas la soperaciones que heredan su superclase, es decir, arrastran codigo que no les sirven ni pueden usar, lo cual no cumple con el principio de LSP ni el principio de ISP.


- ¿Qué contrato estaba prometiendo `Animal`?

Cumplía con implementar todos los tipos de movilidad que tienen los animales, aunque no aplicaba para todos.


- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?

En este caso se dividen las interfaces en varias más pequeñas y especializadas; y se implementan según lo que requiere cada clase, lo que implica no arrastrar codigo no necesario en algunos casos como se lo haria con una herencia amplia.

