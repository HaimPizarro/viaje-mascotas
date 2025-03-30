package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mascota {
    private Long id;            // Campo agregado para identificar de forma única la mascota
    private String nombre;
    private String raza;
    private String color;
    private int peso;
    private int altura;
    private int edad;
    private boolean alergia;
    private Cuidador cuidador;
}
