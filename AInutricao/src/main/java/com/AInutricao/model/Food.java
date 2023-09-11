package com.AInutricao.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "T_ALIMENTO")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "porcao", nullable = false)
    private String porcao;

    @Column(name = "calorias", nullable = false)
    private double calorias;

}
