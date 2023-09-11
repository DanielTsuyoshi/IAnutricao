package com.AInutricao.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "T_EXERCICIO")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private User usuario;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "duracao", nullable = false)
    private double duracao;

    @Column(name = "calorias_gastas", nullable = false)
    private double caloriasGastas;

    @ManyToOne
    @JoinColumn(name = "plano_treino_id", nullable = false)
    private WorkoutPlan planoTreino;

}
