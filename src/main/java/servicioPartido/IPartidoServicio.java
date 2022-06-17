package servicioPartido;
//@michi

import java.util.List;
import modeloPartido.Partido;

public interface IPartidoServicio {
    public Partido crear(Partido partido);
    public List<Partido> listar();
    public Partido getByCodigo(int i);
}
