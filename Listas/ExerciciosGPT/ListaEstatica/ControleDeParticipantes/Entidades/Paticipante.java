package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Entidades;

public class Paticipante {
    private String nome;
    private String sobrenome;
    private int idade;
    private boolean vip;

    public Paticipante (String nome, String sobrenome, int idade, boolean vip){
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}