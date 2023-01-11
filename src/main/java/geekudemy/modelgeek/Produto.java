package geekudemy.modelgeek;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    String nome;
    float preco;
    float desconto;

    private void aumentarPreco(float valor) {
        this.preco = this.preco + valor;
    }

}
