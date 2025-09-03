package org.example;

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