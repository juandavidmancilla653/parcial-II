# Diagrama de Clases

```mermaid
classDiagram
    class Libro {
        #String titulo
        #String autor
        #int numeroEjemplares
        #int numeroPrestados
        +prestamo() boolean
        +devolucion() boolean
    }

    class LibroTexto {
        -String curso
    }

    class Novela {
        -String tipos
    }

    class LibroTextoUNIAC {
        -String facultad
    }

    LibroTexto --|> Libro
    LibroTextoUNIAC --|> LibroTexto
    Novela --|> Libro
```

## Situaciones donde no se podría aplicar herencia

1. Si la clase Libro se declara como final, las demás clases no podrían heredar de ella.

public final class Libro {

}

2. si se agrega una clase construtor private en libro ninguna clase podria crear objetos de esta clase.

public class Libro {

    private Libro() {
        System.out.println("Constructor privado");
    }

}