package model;

import java.util.ArrayList;
import java.util.List;

public class Treino {

    private int id;
    private String nome;
    private String objetivo;
    private Aluno aluno;
    private List<Exercicio> exercicios;

    public Treino() {
        this.exercicios = new ArrayList<>();
    }

    public Treino(int id, String nome, String objetivo, Aluno aluno) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.aluno = aluno;
        this.exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(Exercicio exercicio) {
        this.exercicios.add(exercicio);
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}