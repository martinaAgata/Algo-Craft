package modelo;

import modelo.herramientas.ConstructorHacha;
import modelo.herramientas.Hacha;
import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;
import org.junit.Test;

import static modelo.juego.ConstantesJuego.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HachaPiedraTests {

    private final int DURABILIDAD_HACHA_PIEDRA = 200;
    private final int FUERZA_HACHA_PIEDRA = 5;

    @Test
    public void test08HachaPiedraSeUsaContraMaderaReduceSuDurabilidad() {
        ConstructorHacha constructor = new ConstructorHacha();
        constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Madera madera = new Madera();
        hachaPiedra.usar(madera);
        assertThat(hachaPiedra.getDurabilidad(), is(195));
    }

    @Test
    public void test09HachaPiedraSeUsaContraPiedraReduceSuDurabilidad() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Piedra piedra = new Piedra();
        hachaPiedra.usar(piedra);
        assertThat(hachaPiedra.getDurabilidad(), is(195));
    }

    @Test
    public void test10HachaPiedraSeUsaContraMetalReduceSuDurabilidad() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Metal metal = new Metal();
        hachaPiedra.usar(metal);
        assertThat(hachaPiedra.getDurabilidad(), is(195));
    }

    @Test
    public void test11HachaPiedraSeUsaContraDiamanteReduceSuDurabilidad() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Diamante diamante = new Diamante();
        hachaPiedra.usar(diamante);
        assertThat(hachaPiedra.getDurabilidad(), is(195));
    }

    @Test
    public void test05SeUsaContraMaderaReduceSuDurabilidadDeManeraCorrecta() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Madera madera = new Madera();
        Integer durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        hachaPiedra.usar(madera);
        assertThat(hachaPiedra.getDurabilidad(), is(DURABILIDAD_HACHA_PIEDRA - FUERZA_HACHA_PIEDRA));
    }

    @Test
    public void test06HachaPiedraSeUsaContraPiedraReduceSuDurabilidadDeManeraCorrecta() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Piedra piedra = new Piedra();
        hachaPiedra.usar(piedra);
        assertThat(hachaPiedra.getDurabilidad(), is(DURABILIDAD_HACHA_PIEDRA - FUERZA_HACHA_PIEDRA));

    }

    @Test
    public void test07HachaPiedraSeUsaContraMetalReduceSuDurabilidadDeManeraCorrecta() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Metal metal = new Metal();
        Integer durabilidadHachaPiedra = hachaPiedra.getDurabilidad();
        hachaPiedra.usar(metal);
        assertThat(hachaPiedra.getDurabilidad(), is(DURABILIDAD_HACHA_PIEDRA - FUERZA_HACHA_PIEDRA));
    }

    @Test
    public void test08HachaPiedraSeUsaContraDiamanteReduceSuDurabilidadDeManeraCorrecta() {
        ConstructorHacha constructor = new ConstructorHacha();
                constructor
                .conMaterial(new Piedra())
                .conDurabilidad(DURABILIDAD_HACHA_PIEDRA)
                .conDesgaste(DESGASTE_HACHA_PIEDRA)
                .conFuerza(FUERZA_HACHA_PIEDRA);
        Hacha hachaPiedra= constructor.construir();
        Diamante diamante = new Diamante();
        hachaPiedra.usar(diamante);
        assertThat(hachaPiedra.getDurabilidad(), is(DURABILIDAD_HACHA_PIEDRA - FUERZA_HACHA_PIEDRA));
    }
}