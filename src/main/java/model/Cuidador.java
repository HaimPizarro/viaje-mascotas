package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cuidador {
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String email; 
}
