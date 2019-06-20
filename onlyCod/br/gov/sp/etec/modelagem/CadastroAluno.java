package br.gov.sp.etec.modelagem;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CadastroAluno {

    private String nome, rg, endereco, dtNasc, telefone;
    private int id_aluno;

//    public boolean calculaIdade(String dt_nasc) {
//
//// Data de hoje. 
//        GregorianCalendar hoje = new GregorianCalendar();
//        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
//        int mesAtual = hoje.get(Calendar.MONTH) + 1;
//        int anoAtual = hoje.get(Calendar.YEAR);
//
//// Data do nascimento. 
//        int diaNc = Integer.valueOf(dt_nasc.substring(0, 2));
//        int mesNc = Integer.valueOf(dt_nasc.substring(3, 5));
//        int anoNc = Integer.valueOf(dt_nasc.substring(6, 10));
//
//// Idade. 
//        int idade;
//
//        if (mesNc < mesAtual || (mesNc == mesAtual && diaNc <= diaAtual)) {
//            idade = anoAtual - anoNc;
//        } else {
//            idade = (anoAtual - anoNc) - 1;
//        }
//
//        if (idade >= 18) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }
    
}
