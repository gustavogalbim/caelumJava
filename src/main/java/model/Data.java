package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data {

    int dia;
    int mes;
    int ano;

    public String dataFormatada() {
       return "\nDia: " + this.dia + "\nMes: " + this.mes + "\nAno: " + this.ano;
    }

}
