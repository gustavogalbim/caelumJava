package geekudemy.modelgeek;

import lombok.Getter;
import lombok.Setter;


public class ContaGeek {

    @Getter
    private int numero;
    private double saldo;
    private double limite;
    @Getter @Setter
    ClienteGeek cliente;

    public ContaGeek(final int numero, final double saldo, final double limite, final ClienteGeek cliente) {
        this.numero = numero;
        this.saldo = saldo + limite;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(final double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(final double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Parabéns você adicionou " +valor+ "reais na sua conta.");
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
