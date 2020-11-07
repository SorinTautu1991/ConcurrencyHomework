package com.tse;

import java.util.HashMap;
import java.util.Map;

public class FestivalStatisticsThread extends Thread {
    public final FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(3879);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!gate.getInfo().isEmpty()) {
                printStatistics();
            }
        }
    }

    private void printStatistics(){
        System.out.println(gate.getNrOfPersons()+" persons entered so far.\n");
        for (Map.Entry<TicketType, Integer> entry : gate.getInfo().entrySet()){
            System.out.println(entry.getValue() + " tickets of type " + entry.getKey());
        }
    }
}
