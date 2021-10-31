package com.pb.enot.hw5;

public class Reader {
    private String fio;
    private int etik;
    private String facylt;
    private String brthDay;
    private String number;

    public Reader(String fio, int etik, String facylt, String brthDay, String number) {
        this.fio = fio;
        this.etik = etik;
        this.facylt = facylt;
        this.brthDay = brthDay;
        this.number = number;
    }
    /**
     * @return  номер читательского билета
     * - ФИО
     * - дата рождения
     * - факультет
     * - телефон
     */
    public String getInfo() {
        String info = "=> "+getEtik()+" "+getFio()+" "+getBrthDay()+" "+getFacylt()+" "+getNumber()+")";
        return info;
    }

    public String getFio() {
        return fio;
    }
    public int getEtik() {
        return etik;
    }
    public String getFacylt() {
        return facylt;
    }
    public String getBrthDay() {
        return brthDay;
    }
    public String getNumber() {
        return number;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setEtik(int etik) {
        this.etik = etik;
    }
    public void setFacylt(String facylt) {
        this.facylt = facylt;
    }
    public void setBrthDay(String brthDay) {
        this.brthDay = brthDay;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
