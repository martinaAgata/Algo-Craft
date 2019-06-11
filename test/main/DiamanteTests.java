package main;

import main.herramientas.*;
import main.materiales.Desgastable;
import main.materiales.Diamante;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class DiamanteTests {

    Diamante diamante = new Diamante();

    static final int DURABILIDAD_INICIAL_DIAMANTE = 100;

    @Test
    public void testSeCreaDiamanteConDurabilidadCorrespondiente() {
        Diamante diamante = new Diamante();
        assertThat(diamante.getDurabilidad(), is(100));
    }

    @Test
    public void testDiamanteNoEsDesgastadoPorHachaMadera() {
        Diamante diamante = new Diamante();
        Hacha hachaMadera = Hacha.nuevaHachaMadera();
        hachaMadera.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));
    }

    @Test
    public void test03DiamanteNoEsDesgastadoPorHachaPiedra() {
        Diamante diamante = new Diamante();
        Hacha hachaPiedra= Hacha.nuevaHachaPiedra();
        hachaPiedra.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));
    }

    @Test
    public void test04DiamanteNoEsDesgastadoPorHachaMetal() {
        Diamante diamante = new Diamante();
        Hacha hachaMetal = Hacha.nuevaHachaMetal();
        hachaMetal.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));
    }

    @Test
    public void test05DiamanteNoEsDesgastadoPorPicoMadera() {
        Diamante diamante = new Diamante();
        Pico picoMadera = Pico.nuevoPicoMadera();
        picoMadera.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));
    }

    @Test
    public void test06DiamanteNoEsDesgastadoPorPicoPiedra(){
        Diamante diamante = new Diamante();
        Pico picoPiedra = Pico.nuevoPicoPiedra();
        picoPiedra.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));
    }

    @Test
    public void test07DiamanteNoEsDesgastadoPorPicoMetal(){
        Diamante diamante = new Diamante();
        Pico picoMetal = Pico.nuevoPicoMetal();
        picoMetal.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE));

    }

    @Test
    public void test08DiamanteEsDesgastadoPorPicoFino(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino();
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE - 20));
    }

    @Test
    public void test09DiamanteEsDesgastadoPorPicoFinoSeReduceVariasVeces(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino();
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE - 20));
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE - 40));
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE - 60));
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(DURABILIDAD_INICIAL_DIAMANTE - 80));
    }

    @Test(expected = IllegalStateException.class)
    public void test10DiamanteEsDesgastadoPorPicoFinoLanzaExcepcionTrasRomperse(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino();
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(0));
    }

    @Test
    public void test11DiamanteConEstadoMuertoDevuelveDurabilidadCero(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino();
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        picoFino.usar(diamante);
        assertThat(diamante.getDurabilidad(), is(0));
    }
    
}

