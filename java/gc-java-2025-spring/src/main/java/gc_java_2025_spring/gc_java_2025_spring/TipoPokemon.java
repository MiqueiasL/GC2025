package gc_java_2025_spring.gc_java_2025_spring;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class TipoPokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NomeTipo nome;

    private Set<Pokemon> pokemon;

    enum NomeTipo {
        AGUA,
        VENENOSO,
        FOGO,
        GRAMA,
        ELETRICO,
        NORMAL,
        LUTADOR,
        VOADOR,
        PSIQUICO,
        INSETO,
        PEDRA,
        TERRA,
        FANTASMA,
        ACO,
        GELO,
        DRAGAO,
        SOMBRIO,
        FADA
    }
}
