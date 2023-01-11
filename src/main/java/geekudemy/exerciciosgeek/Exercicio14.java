package geekudemy.exerciciosgeek;

import geekudemy.modelgeek.Pessoa;
import geekudemy.modelgeek.Produto;

public class Exercicio14 {
    /*
    Aula de objetos
     - São instâncias da classe
     */
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2367F);
        produto.setDesconto(15F);

        System.out.println("============ Produto ============");
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: " +produto.getPreco());
        System.out.println("Desconto: " +produto.getDesconto()+ "%");

        Produto novoProduto = new Produto();
        novoProduto.setNome("Caneta");
        novoProduto.setPreco(2.45F);
        novoProduto.setDesconto(5F);

        System.out.println("Produto: " +novoProduto.getNome());
        System.out.println("Preço: " +novoProduto.getPreco());
        System.out.println("Desconto: " +novoProduto.getDesconto()+ "%");

        System.out.println("\n");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setEmail("teste@gmail.com");
        pessoa.setDataNascimento("1995-01-01");

        System.out.println("\n");

        System.out.println("============ Pessoa ============");
        System.out.println("Nome: " +pessoa.getNome());
        System.out.println("E-mail: " +pessoa.getEmail());
        System.out.println("Data de nascimento: " +pessoa.getDataNascimento());

    }
}
