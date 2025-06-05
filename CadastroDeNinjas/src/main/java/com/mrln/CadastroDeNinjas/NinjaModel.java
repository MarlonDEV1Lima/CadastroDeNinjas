package com.mrln.CadastroDeNinjas;

import com.mrln.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entidade de Ninja para o banco de dados
@Entity
@Table(name ="tb_cadastro")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;

private String Email;

private int idade;
//@ManyToOne um ninja tem uma uma unica missão
@ManyToOne
@JoinColumn(name = "missoes_id") //Foreing Key (Chave estrangeira)
private MissoesModel missoes;


}
