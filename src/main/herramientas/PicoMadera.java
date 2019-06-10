package main.herramientas;

import main.EstadoVivo;
import main.estrategias.DesgasteLineal;
import main.materiales.Material;

public class PicoMadera extends Herramienta {

    private static final int DURABILIDAD_PICO_MADERA = 100;
    private static final int FUERZA_PICO_MADERA = 2;
    private static final DesgasteLineal DESGASTE = new DesgasteLineal();

    public PicoMadera() {
        this.estado = new EstadoVivo(DURABILIDAD_PICO_MADERA);
        this.estrategia = DESGASTE;
        this.fuerza = FUERZA_PICO_MADERA;
    }

    @Override
    protected void desgastarMaterial(Material material) {
        material.desgastar(this);
    }

}
