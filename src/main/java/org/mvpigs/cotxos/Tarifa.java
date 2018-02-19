package org.mvpigs.cotxos;

public class Tarifa {
    private static final double costeMilla = 1.35;
    private static final double costeMinuto = 0.35;
    private static final int costeMinimo = 5;
    private static final int porcentajeComision = 20;

    public static double getCosteDistancia(double distancia){
        System.out.println(distancia * costeMilla);
        return distancia * costeMilla;
    }

    public static double getCosteTiempo(int minutos){

        return minutos * costeMinuto;
    }
    public static double  getCosteTotalEsperado(Carrera carrera){
        double totalEsperado = getCosteTiempo(carrera.getTiempoEsperado()) + getCosteDistancia(carrera.getDistancia());
        if (totalEsperado >= costeMinimo){
            return totalEsperado;
            }
            return costeMinimo;
    }
}
