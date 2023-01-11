package caelum.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private Data dataAbertura;


    public void sacar(double valor) {
        this.saldo = valor - saldo;
    }

    public void depositar(double valor) {
        this.saldo = valor + saldo;
    }

    public void calculaRendimento() {
        this.saldo = saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "\n" +"Nome do titular: "+getNomeTitular()+ "\n" + "Numero da conta: "+getNumeroConta()+ "\n" + "Agencia: "+getAgencia()+ "\n" + "Saldo: " +getSaldo()+ "\n";
        dados += dataAbertura.dataFormatada();

        return dados;
    }

}
