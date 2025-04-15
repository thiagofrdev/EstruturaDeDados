package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Entidades;

import Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Excecoes.IdadeInvalidaException;

public class Participante {
    private String nome;
    private String sobrenome;
    private int idade;
    private boolean vip;

    public Participante (String nome, String sobrenome, int idade, boolean vip) throws IdadeInvalidaException {
        if(idade<18)
            throw new IdadeInvalidaException("O participante deve ter no mínimo 18 anos!");
        else if(idade>100) 
            throw new IdadeInvalidaException("O participante tem idade acima do permitido!");
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.vip = vip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException{
        if(idade<18)
            throw new IdadeInvalidaException("O participante deve ter no mínimo 18 anos!");
        else if(idade>100) 
            throw new IdadeInvalidaException("O participante tem idade acima do permitido!");
        this.idade = idade;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}