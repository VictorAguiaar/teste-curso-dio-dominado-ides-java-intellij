package br.com.dio.Model;

import java.util.Objects;

public class Gato {
    private String Nome;
    private String cor;
    private Integer idade;

    public Gato() {}

    public Gato(String nome, String cor, Integer idade) {
        Nome = nome;
        this.cor = cor;
        this.idade = idade;

}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(Nome, gato.Nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Nome='" + Nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
