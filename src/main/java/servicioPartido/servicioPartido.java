package servicioPartido;
//@michi

import java.util.ArrayList;
import java.util.List;
import modeloPartido.Partido;

public class servicioPartido implements IPartidoServicio{
    private final List<Partido> partidoList = new ArrayList();
    

    @Override
    public Partido crear(Partido partido) {
        this.partidoList.add(partido);
        return partido;
    }

    @Override
    public List<Partido> listar() {
        return this.partidoList;
    }

    @Override
    public Partido getByCodigo(int i) {
        var partido = new Partido();
        for(Partido par:this.partidoList){
            if(par.getCodigoPartido()==i){
                partido=par;
                break;
            }
        }
        return partido;
    }
    
}
