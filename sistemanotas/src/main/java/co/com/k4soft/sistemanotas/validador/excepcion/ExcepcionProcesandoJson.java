package co.com.k4soft.sistemanotas.validador.excepcion;

public class ExcepcionProcesandoJson extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionProcesandoJson(String mensaje) {
        super(mensaje);
    }

}
