package com.dorin.dorin.entities;

public class UtilajDTO {

    private Long id;
    private String numeUtilaj;
    private String motor;

    public UtilajDTO(Long id, String NumeUtilaj, String motor) {
        this.id = id;
        this.numeUtilaj = NumeUtilaj;
        this.motor = motor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeUtilaj() {
        return numeUtilaj;
    }

    public void setNumeUtilaj(String numeUtilaj) {
        this.numeUtilaj = numeUtilaj;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}