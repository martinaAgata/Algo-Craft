package main.materiales;

import main.EstadoVivo;
import main.herramientas.HachaMadera;
import main.herramientas.HachaMetal;
import main.herramientas.HachaPiedra;

public class Madera extends Material {

    public static final int DURABILIDAD_MADERA = 10;
    public Madera() {
        this.estado = new EstadoVivo(DURABILIDAD_MADERA);
    }

    @Override
    public void desgastar(HachaMadera hacha) {
        int fuerza = hacha.getFuerza();
        this.reducirDurabilidad(fuerza);
    }

    @Override
    public void desgastar(HachaMetal hacha) {
        int fuerza = hacha.getFuerza();
        this.reducirDurabilidad(fuerza);
    }

    @Override
    public void desgastar(HachaPiedra hacha) {
        int fuerza = hacha.getFuerza();
        this.reducirDurabilidad(fuerza);
    }

}
