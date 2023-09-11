package com.AInutricao.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "T_REFEICAO")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "hora", nullable = false)
    private String hora;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "calorias_totais", nullable = false)
    private double caloriasTotais;

}