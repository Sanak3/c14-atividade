package org.example;

public class Funcionario extends Pessoa{
    int numero;
    float salario;

    public Funcionario(String nome, int idade, int numero, float salario){
        super(nome, idade);
        this.numero = numero;
        this.salario = salario;
    }
}
