package br.gov.sp.etec.modelagem;

public class Mensalidades {
    
    private int id_aluno, id_mensalidade;
    private String mes, nome;
    private boolean pendente;

    public Mensalidades(int id_aluno, int id_mensalidade, String mes, String nome, boolean pendente) {
        this.id_aluno = id_aluno;
        this.id_mensalidade = id_mensalidade;
        this.mes = mes;
        this.pendente = pendente;
        this.nome = nome;
    }
    
    public Mensalidades(){
        
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_mensalidade() {
        return id_mensalidade;
    }

    public void setId_mensalidade(int id_mensalidade) {
        this.id_mensalidade = id_mensalidade;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public boolean getPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
