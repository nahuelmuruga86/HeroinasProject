package Model;

public class Usuario {

	public String mail;
    public String password;
    public String tipo;

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail(){return mail;}

    public void setContra(String contra) {
        this.password = contra;
    }
    public String getContra(){return password;}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){return tipo;}
}
