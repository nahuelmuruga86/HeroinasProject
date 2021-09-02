package Model;

public class Usuario {

	public String mail;
    public String contra;
    public String tipo;

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail(){return mail;}

    public void setContra(String contra) {
        this.contra = contra;
    }
    public String getContra(){return contra;}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){return tipo;}
}
