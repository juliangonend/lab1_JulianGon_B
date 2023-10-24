package Clases;

public class CuentaBancaria {
    private double saldo;
    private long numCuenta;

    public CuentaBancaria(double saldo, long numCuenta) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public long getNumCuenta() {
        return numCuenta;
    }
}

