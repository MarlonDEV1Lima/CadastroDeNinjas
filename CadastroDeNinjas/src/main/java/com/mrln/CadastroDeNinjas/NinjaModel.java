package com.mrln.CadastroDeNinjas;

import jakarta.persistence.*;

//Entidade de Ninja para o banco de dados
@Entity
@Table(name ="tb_cadastro")
public class NinjaModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String Email;
private int idade;

    public NinjaModel() {
    }

    public NinjaModel(int idade, String email, String nome) {
        this.idade = idade;
        Email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
