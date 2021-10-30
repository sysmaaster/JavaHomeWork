package com.pb.enot.hw5;

public class Reader {
    private String fio;
    private int etik;
    private String facylt;
    private String brthDay;
    private String number;

    public Reader() {    }
    public Reader(String fio,int etik,String facylt,String brthDay,String number) {
        this.fio = fio;
        this.etik = etik;
        this.facylt = facylt;
        this.brthDay = brthDay;
        this.number = number;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public int getEtik() {
        return etik;
    }
    public void setEtik(int etik) {
        this.etik = etik;
    }
    public String getFacylt() {
        return facylt;
    }
    public void setFacylt(String facylt) {
        this.facylt = facylt;
    }
    public String getBrthDay() {
        return brthDay;
    }
    public void setBrthDay(String brthDay) {
        this.brthDay = brthDay;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber (String number) {
        this.number = number;
    }
}
