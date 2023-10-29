package com.enseirb.myapp.demo;

public class Truck {
    public String datePremiereCirculation;
    public String plaqueImmatriculation;

    public Truck(String datePremiereCirculation, String plaqueImmatriculation) {
        this.datePremiereCirculation = datePremiereCirculation;
        this.plaqueImmatriculation = plaqueImmatriculation;
    }
    public String getPlaqueImmatriculation() {
        return plaqueImmatriculation;
    }
    public void setPlaqueImmatriculation(String plaqueImmatriculation) {
        this.plaqueImmatriculation = plaqueImmatriculation;
    }
    public String getDatePremiereCirculation() {
        return datePremiereCirculation;
    }
    public void setDatePremiereCirculation(String datePremiereCirculation) {
        this.datePremiereCirculation = datePremiereCirculation;
    }
}
