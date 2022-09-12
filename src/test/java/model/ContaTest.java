package model;

import org.junit.Test;

public class ContaTest {

    @Test
    public void createAccount() {
        Conta c1 = new Conta();
        c1.setNomeTitular("Gustavo");
        c1.setSaldo(100);

        Conta c2 = new Conta();
        c2.setNomeTitular("Vinicius");
        c2.setSaldo(100);

        if (c1 == c2) {
            System.out.println("São iguais");
        }
        System.out.println("São diferentes");
    }

    @Test
    public void createReferer() {
        Conta c1 = new Conta();
        c1.setNomeTitular("Gustavo");
        c1.setSaldo(100);

        Conta c2 = new Conta();
        c2 = c1;

        if(c1 == c2) {
            System.out.println("São iguais");
        }
    }

}
