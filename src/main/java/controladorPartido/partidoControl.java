package controladorPartido;
//@michi

import java.util.List;
import modeloPartido.Partido;
import servicioPartido.servicioPartido;

public class partidoControl {
    private final servicioPartido partidoServicio = new servicioPartido();
    
    public Partido crear(String [] args){
        var partido= new Partido(Integer.valueOf(args[0]),args[1],args[2],args[3]);
        this.partidoServicio.crear(partido);
        return partido;
    }
    
    public List<Partido> listar(){
        return this.partidoServicio.listar();
    }
    public Partido getByCodigo(Object i) {
        if((int)i>0)
           return this.partidoServicio.getByCodigo((int)i);
        else
           return this.partidoServicio.getByCodigo(0);
    }
}

