package com.tse;


public class FestivalAttendeeThread extends Thread {
    private TicketType ticketType;
    private FestivalGate gate;
    private int nrOfPersons;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;

    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println(ticketType);
            gate.addTicket(ticketType);
        }
    }

    public int getNrOfPersons() {
        return nrOfPersons;
    }
}
