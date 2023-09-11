package com.AInutricao.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "T_REFEICAO_ALIMENTO")
public class MealFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "refeicao_id")
    private Meal refeicao;

    @ManyToOne
    @JoinColumn(name = "alimento_id")
    private Food alimento;

}