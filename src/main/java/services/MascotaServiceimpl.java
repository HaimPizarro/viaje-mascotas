package services;

import java.util.List;
import model.Mascota;
import org.springframework.stereotype.Service;
import repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl() {
        // Para fines de ejemplo, instanciamos directamente el repositorio.
        // En un proyecto real, lo inyectarías con @Autowired y marcarías MascotaRepository con @Repository.
        this.mascotaRepository = new MascotaRepository();
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.getAllMascotas();
    }

    @Override
    public Mascota getMascotaById(Long id) {
        return mascotaRepository.getMascotaById(id).orElse(null);
    }
}
