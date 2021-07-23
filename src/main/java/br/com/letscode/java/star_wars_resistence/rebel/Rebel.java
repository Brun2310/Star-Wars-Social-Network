package br.com.letscode.java.star_wars_resistence.rebel;

import br.com.letscode.java.star_wars_resistence.rebel.enuns.generoEnum;
import br.com.letscode.java.star_wars_resistence.rebel.enuns.isRebelEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rebel {
    private Recursos recursos;
    private Localizacao localizacao;
    private String nome;
    private generoEnum MASCULINO;
    private Integer idade;
    private isRebelEnum REBEL;
    private Integer reports = 0;

}
