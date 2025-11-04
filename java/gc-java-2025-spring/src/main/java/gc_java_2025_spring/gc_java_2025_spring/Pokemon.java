package gc_java_2025_spring.gc_java_2025_spring;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;


@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Pokemon {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String name;
    private Set<TipoPokemon> tipo;
    private Float altura;
    private Float peso;




}
