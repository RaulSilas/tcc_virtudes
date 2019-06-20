package br.gov.sp.etec.modelagem;

public class Usuario{

public Usuario(String usuario, String cpf, String telefone, String endereco, String senha, String confirmarSenha, String tpUsuario){

this.usuario = "";
this.cpf = "";
this.telefone = "";
this.endereco = "";
this.senha = "";
this.confirmarSenha = "";
this.tpUsuario = "";

}

public Usuario(){

}
private String  usuario, cpf, telefone, endereco, senha, confirmarSenha, tpUsuario;

public static String adm;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the confirmarSenha
     */
    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    /**
     * @param confirmarSenha the confirmarSenha to set
     */
    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    /**
     * @return the tpUsuario
     */
    public String getTpUsuario() {
        return tpUsuario;
    }

    /**
     * @param tpUsuario the tpUsuario to set
     */
    public void setTpUsuario(String tpUsuario) {
        this.tpUsuario = tpUsuario;
    }

}
