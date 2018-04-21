package br.com.example.mobile.carregaquiapp.model;

public class Saldo {

    private double saldo01;
    private double saldo02;

    public Saldo(){}

    public Saldo(double saldo01, double saldo02){
        this.saldo01 = saldo01;
        this.saldo02 = saldo02;
    }

    public double getSaldo01() {
        return saldo01;
    }

    public void setSaldo01(double saldo01) {
        this.saldo01 = saldo01;
    }

    public double getSaldo02() {
        return saldo02;
    }

    public void setSaldo02(double saldo02) {
        this.saldo02 = saldo02;
    }
}
