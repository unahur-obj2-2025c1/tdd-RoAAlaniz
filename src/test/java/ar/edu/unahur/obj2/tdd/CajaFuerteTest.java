package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    @Test
    public void queLaCajaFuerteEsteAbiertaAlCerrarse(){
        //creo una referencia de tipo CajaFuerte
        CajaFuerte caja = new CajaFuerte();

        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queSePuedaCerrarLaCajaFuerteConUnCodigo(){

        CajaFuerte caja = new CajaFuerte();

        caja.cerrar(1234);

        assertFalse(caja.estaAbierta());
    } 

    @Test
    public void queSePuedaAbrirLaCajaFuerteConElCodigoCorrecto(){
        
        CajaFuerte caja = new CajaFuerte();

        caja.cerrar(1234);
        caja.abrir(1234);

        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queNoSeAbreLaCajaFuerteConElCodigoIncorrecto(){
       
        CajaFuerte caja = new CajaFuerte();

        caja.cerrar(1234);
        caja.abrir(1234);

        assertFalse(caja.estaAbierta());
    }
    @Test
    public void queNoSePuedeCambiarElCodigoUnaVezCerradaLaCaja(){
       
        CajaFuerte caja = new CajaFuerte();

        caja.cerrar(1234);
        caja.cerrar(5678);
        caja.abrir(1234);

        assertTrue(caja.estaAbierta());
    }

    @Test 
    public void queLuegoDeBloqueadaNoPuedaAbrirConCodigoCorrecto(){
        
        CajaFuerte caja = new CajaFuerte();

        caja.cerrar(1234);
        caja.abrir(2345);
        caja.abrir(3456);
        caja.abrir(4567);
        caja.abrir(1234);

        assertFalse(caja.estaAbierta());
        assertTrue(caja.estaBloqueada());

    }

    @Test
    public void seReseteanLosIntentosFallidosTrasAperturaCorrecta(){
        
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(2345);
        caja.abrir(3456);
        caja.abrir(1234);
        caja.cerrar(5678);
        caja.abrir(4567);


        assertFalse(caja.estaBloqueada());
    }
  

}
