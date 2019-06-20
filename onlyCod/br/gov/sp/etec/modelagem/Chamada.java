package br.gov.sp.etec.modelagem;


public class Chamada {
    
    private int id_registro, id_turma;
    private String nome_aluno, dia;
    private boolean presenca;

    public Chamada(int id_registro, int id_turma, String nome_aluno, String dia, boolean presenca) {
        this.id_registro = id_registro;
        this.id_turma = id_turma;
        this.nome_aluno = nome_aluno;
        this.dia = dia;
        this.presenca = presenca;
    }

    public Chamada() {

    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

}
