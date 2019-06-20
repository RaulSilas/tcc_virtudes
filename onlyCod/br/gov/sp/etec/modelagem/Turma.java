package br.gov.sp.etec.modelagem;

public class Turma {
    
    private int id_turma, id_aluno, id_produto;
    private String nome_turma;

    public Turma(int id_turma, int id_aluno, int id_produto, String nome_turma) {
        this.id_turma = id_turma;
        this.id_aluno = id_aluno;
        this.id_produto = id_produto;
        this.nome_turma = nome_turma;
    }
    
    public Turma(){
        
    }
    
    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }
    
}
