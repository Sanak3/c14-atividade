package org.example;

import java.sql.SQLOutput;

public class Pessoa {
    private String nome ;
    private int idade;


    public Pessoa(String nome, int idade) {
        if(nome == null){
            throw new NullPointerException();
        }

        if (idade < 0 || idade > 100) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        this.idade = idade;
    }

    public boolean verificaIdade() {
        return this.idade >= 18;
    }

    public void faixaEtaria (){
        if (this.idade > 18 && this.idade < 60 ) {
            System.out.println("Adulto");
        }
        else if (this.idade > 60){
            System.out.println("Idoso");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}