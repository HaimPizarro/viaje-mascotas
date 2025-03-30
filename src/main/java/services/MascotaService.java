package services;

import java.util.List;
import model.Mascota;

public interface MascotaService {
    List<Mascota> getMascotas();
    Mascota getMascotaById(Long id);
}
