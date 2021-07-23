package br.com.letscode.java.star_wars_resistence.rebel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Localizacao {
    private double latitude;
    private double longitude;
    private String BaseNaGalaxia;

}
