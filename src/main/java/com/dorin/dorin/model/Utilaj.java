package com.dorin.dorin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilaj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeUtilaj;
    private String tipUtilaj;
    private String motor;
    private Integer cilindriiMotor;
    private String aspirat;
    private Integer caiPutere;
    private String racireMotor;
    private String sistemElectricMotor;
    private Integer capacitateLitrii;
    private Integer cmc;
    private String tipTransmisie;
    private String powerTrain;
    private String ceCara;
    private Integer km;
    private String roataRezerva;
    private String itp;
    private String schimbUlei;
    private String schimbFiltre;
    private String rar;
    private String areAtasament;


    public Utilaj() {
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

    public String getTipUtilaj() {
        return tipUtilaj;
    }

    public void setTipUtilaj(String tipUtilaj) {
        this.tipUtilaj = tipUtilaj;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getCilindriiMotor() {
        return cilindriiMotor;
    }

    public void setCilindriiMotor(Integer cilindriiMotor) {
        this.cilindriiMotor = cilindriiMotor;
    }

    public String getAspirat() {
        return aspirat;
    }

    public void setAspirat(String aspirat) {
        this.aspirat = aspirat;
    }

    public Integer getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(Integer caiPutere) {
        this.caiPutere = caiPutere;
    }

    public String getRacireMotor() {
        return racireMotor;
    }

    public void setRacireMotor(String racireMotor) {
        this.racireMotor = racireMotor;
    }

    public String getSistemElectricMotor() {
        return sistemElectricMotor;
    }

    public void setSistemElectricMotor(String sistemElectricMotor) {
        this.sistemElectricMotor = sistemElectricMotor;
    }

    public Integer getCapacitateLitrii() {
        return capacitateLitrii;
    }

    public void setCapacitateLitrii(Integer capacitateLitrii) {
        this.capacitateLitrii = capacitateLitrii;
    }

    public Integer getCmc() {
        return cmc;
    }

    public void setCmc(Integer cmc) {
        this.cmc = cmc;
    }

    public String getTipTransmisie() {
        return tipTransmisie;
    }

    public void setTipTransmisie(String tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }

    public String getPowerTrain() {
        return powerTrain;
    }

    public void setPowerTrain(String powerTrain) {
        this.powerTrain = powerTrain;
    }

    public String getCeCara() {
        return ceCara;
    }

    public void setCeCara(String ceCara) {
        this.ceCara = ceCara;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getRoataRezerva() {
        return roataRezerva;
    }

    public void setRoataRezerva(String roataRezerva) {
        this.roataRezerva = roataRezerva;
    }

    public String getItp() {
        return itp;
    }

    public void setItp(String itp) {
        this.itp = itp;
    }

    public String getSchimbUlei() {
        return schimbUlei;
    }

    public void setSchimbUlei(String schimbUlei) {
        this.schimbUlei = schimbUlei;
    }

    public String getSchimbFiltre() {
        return schimbFiltre;
    }

    public void setSchimbFiltre(String schimbFiltre) {
        this.schimbFiltre = schimbFiltre;
    }

    public String getRar() {
        return rar;
    }

    public void setRar(String rar) {
        this.rar = rar;
    }

    public String getAreAtasament() {
        return areAtasament;
    }

    public void setAreAtasament(String areAtasament) {
        this.areAtasament = areAtasament;
    }
}
