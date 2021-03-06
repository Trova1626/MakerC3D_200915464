package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static int L = 0;
    private static String c3d = "";
    private static String EtqV = "";
    private static String EtqF = "";

    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        L = 0;
        c3d = "";
        EtqV = "";
        EtqF = "";
    }

    public static int getTemp() {
        return temp;
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
     public static String generaEtiqueta(){
        return "L$"+L++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    
    public static String getEtqV() {
        return EtqV;
    }

    public static void setEtqV(String EtqV) {
        ControlC3D.EtqV = EtqV;
    }

    public static String getEtqF() {
        return EtqF;
    }

    public static void setEtqF(String EtqF) {
        ControlC3D.EtqF = EtqF;
    }
    
}
