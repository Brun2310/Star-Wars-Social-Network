package br.com.letscode.java.star_wars_resistence.rebel;

import lombok.Data;

@Data
public class Recursos {

    private int arma, municao, agua, comida;

    public int getScoreArma(){
        return this.arma * 4;
    }

    public int getScoreMunicao(){
        return this.municao * 3;
    }

    public int getScoreAgua(){
        return this.agua * 2;
    }

    public int getScoreComida(){
        return this.comida;
    }

}
