package geekudemy.modelgeek;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteGeek {

    private String nome;
    private String endereco;

    public ClienteGeek(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

}
