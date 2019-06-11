package main.materiales;

import main.EstadoVivo;
import main.herramientas.Pico;

public class Piedra extends Material {

    public static final int DURABILIDAD_PIEDRA = 30;
    public Piedra() {
        this.estado = new EstadoVivo(DURABILIDAD_PIEDRA);
    }

/*    @Override
    public void desgastar(PicoMadera pico) {
        int fuerza = pico.getFuerza();
        this.reducirDurabilidad(fuerza);
    }

    @Override
    public void desgastar(PicoMetal pico) {
        int fuerza = pico.getFuerza();
        this.reducirDurabilidad(fuerza);
    }

    @Override
    public void desgastar(PicoPiedra pico) {
        int fuerza = pico.getFuerza();
        this.reducirDurabilidad(fuerza);
    }*/
    @Override
    public Desgastable desgastarContra(Desgastable desgastable){ return desgastable.desgastarContra(this);}
    @Override
    public Desgastable desgastarContra(Pico pico){ return pico.desgastarContra(this);}
    @Override
    public Desgastable desgastarContra(Metal metal){
        return this;
    }
}
