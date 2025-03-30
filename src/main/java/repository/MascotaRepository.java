package repository;

import java.util.List;
import java.util.Optional;

import model.Mascota;
import model.Cuidador;

public class MascotaRepository {
    
    private final List<Mascota> mascotas;

    public MascotaRepository() {
        mascotas = List.of(
            new Mascota(1L, "Pepe", "Gato", "Rojo", 10, 1, 2, true,
                new Cuidador("Juan", "Perez", 12345678, "Calle de la República, 123", "juan.perez@gmail.com")),
            new Mascota(2L, "Pablo", "Perro", "Verde", 20, 1, 3, false,
                new Cuidador("Juan", "Perez", 12345678, "Calle de la República, 123", "juan.perez@gmail.com")),
            new Mascota(3L, "Maria", "Gato", "Amarillo", 30, 1, 4, true,
                new Cuidador("Juan", "Perez", 12345678, "Calle de la República, 123", "juan.perez@gmail.com")),
            new Mascota(4L, "Luis", "Perro", "Azul", 40, 1, 5, false,
                new Cuidador("Juan", "Perez", 12345678, "Calle de la República, 123", "juan.perez@gmail.com")),
            new Mascota(5L, "Carlos", "Perro", "Rojo", 50, 1, 6, true,
                new Cuidador("Juan", "Perez", 12345678, "Calle de la República, 123", "juan.perez@gmail.com"))
        );
    }

    public List<Mascota> getAllMascotas() {
        return mascotas;
    }

    public Optional<Mascota> getMascotaById(Long id) {
        return mascotas.stream().filter(mascota -> mascota.getId().equals(id)).findFirst();
    }
}
