package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Mascota;
import repository.MascotaRepository;

@RestController
@RequestMapping("/viajesmascotas")
@CrossOrigin(origins = "*")
public class MascotasController {

    private final MascotaRepository mascotaRepository = new MascotaRepository();

    @GetMapping
    public List<Mascota> getAllMascotas() {
        return mascotaRepository.getAllMascotas();
    }

    @GetMapping("/{id}")
    public Optional<Mascota> getMascotaById(@PathVariable Long id) {
        return mascotaRepository.getMascotaById(id);
    }
}
