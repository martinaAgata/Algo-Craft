package main;

import main.estrategias.DesgasteAbrupto;
import main.estrategias.DesgasteLinealFactor;
import main.estrategias.EstrategiaDesgaste;

public class ConstantesJuego {

    public static final int CANTIDAD_FILAS = 20;
    public static final int CANTIDAD_COLUMNAS = 20;
    public static final int CANTIDAD_MADERAS = 70;
    public static final int CANTIDAD_PIEDRAS = 50;
    public static final int CANTIDAD_METALES = 35;
    public static final int CANTIDAD_DIAMANTES = 10;


    /*----- Hacha Madera -----*/
    public static final int DURABILIDAD_HACHA_MADERA = 100;
    public static final int FUERZA_HACHA_MADERA = 2;
    public static final double FACTOR_DESGASTE_HACHA_MADERA = 1;
    public static final EstrategiaDesgaste DESGASTE_HACHA_MADERA = new DesgasteLinealFactor(FACTOR_DESGASTE_HACHA_MADERA);

    /*----- Hacha Piedra -----*/
    public static final int DURABILIDAD_HACHA_PIEDRA = 200;
    public static final int FUERZA_HACHA_PIEDRA = 5;
    public static final double FACTOR_DESGASTE_HACHA_PIEDRA = 1;
    public static final EstrategiaDesgaste DESGASTE_HACHA_PIEDRA = new DesgasteLinealFactor(FACTOR_DESGASTE_HACHA_PIEDRA);
    /*----- Hacha Metal -----*/
    public static final int DURABILIDAD_HACHA_METAL = 400;
    public static final int FUERZA_HACHA_METAL = 10;
    public static final double FACTOR_DESGASTE_HACHA_METAL = 0.5;
    public static final EstrategiaDesgaste DESGASTE_HACHA_METAL = new DesgasteLinealFactor(FACTOR_DESGASTE_HACHA_METAL);

    /*----- PicoMadera -----*/
    public static final double FACTOR_DESGASTE_PICO_MADERA = 1.0;
    public static final int DURABILIDAD_PICO_MADERA = 100;
    public static final int FUERZA_PICO_MADERA = 2;
    public static final EstrategiaDesgaste DESGASTE_PICO_MADERA =new DesgasteLinealFactor(FACTOR_DESGASTE_PICO_MADERA);
    /*----- PicoPiedra -----*/
    public static final double FACTOR_DESGASTE_PICO_PIEDRA = (1 / 1.5);
    public static final int DURABILIDAD_PICO_PIEDRA = 200;
    public static final int FUERZA_PICO_PIEDRA = 4;
    public static final EstrategiaDesgaste DESGASTE_PICO_PIEDRA =new DesgasteLinealFactor(FACTOR_DESGASTE_PICO_PIEDRA);

    /*----- PicoMetal -----*/
    public static final int DURABILIDAD_PICO_METAL = 400;
    public static final int FUERZA_PICO_METAL = 12;
    public static final EstrategiaDesgaste DESGASTE_PICO_METAL =new DesgasteAbrupto();


    public static final int DURABILIDAD_PICO_FINO = 1000;
    public static final int FUERZA_PICO_FINO = 20;
    public static final double FACTOR_DESGASTE_PICO_FINO = 0.1;
    public static final EstrategiaDesgaste DESGASTE_PICO_FINO =new DesgasteLinealFactor(FACTOR_DESGASTE_PICO_FINO);
}
