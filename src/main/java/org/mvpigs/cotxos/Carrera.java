package org.mvpigs.cotxos;

public class Carrera {
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private Conductor conductor = null;
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0d;
    private int tiempoEsperadoMinutos = 0;
    private double propina = 0d;

    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperadoMinutos() {
        return tiempoEsperadoMinutos;
    }

    public void setTiempoEsperadoMinutos(int tiempoEsperadoMinutos) {
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
    }

    public double getCosteEsperado(){

        return Tarifa.getCosteTotalEsperado(this);
    }

    public void asignarConductor(PoolConductores conductores){
        setConductor(conductores.asignarConductor());
    }
    public void realizarPago(double pago){
        this.costeTotal = pago;
    }

    public void recibirPropina(double propina){
        this.propina = propina;
    }

    public void liberarConductor(){
        getConductor().setOcupado(false);
    }

    public double getPropina(){
        return propina;
    }
}

