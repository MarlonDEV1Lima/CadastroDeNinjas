package com.mrln.CadastroDeNinjas.Missoes;


import com.mrln.CadastroDeNinjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id    private Long Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private String dificuldade;

    //@OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy ="missoes")
    private List <NinjaModel> ninjas;


}
