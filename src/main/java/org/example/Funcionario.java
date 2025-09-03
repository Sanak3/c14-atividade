package org.example;

public class Funcionario extends Pessoa{
    int numero;
    float salario;

    public Funcionario(String nome, int idade, int numero, float salario){
        super(nome, idade);
        this.numero = numero;
        this.salario = salario;
    }

    public void bonusSalario(float salario){
        this.salario = salario + (salario * 0.10f);
    }

     public void salarioNaoNegativo(){
        if (salario < 0){
            throw new IllegalArgumentException();
        }

     }
}
