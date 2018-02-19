package org.mvpigs.cotxos;

import java.util.ArrayList;

public class PoolConductores {
    private ArrayList<Conductor> poolConductores = new ArrayList<>();

    public PoolConductores(ArrayList<Conductor> conductores){
        this.poolConductores = conductores;
    }
    public Conductor asignarConductor(){
        Conductor fahrer = null;
        for (Conductor conductor : poolConductores){
            if (conductor.isOcupado() == false){
                conductor.setOcupado(true);
                fahrer = conductor;
                break;
            }
        }
        return fahrer;
    }
}
