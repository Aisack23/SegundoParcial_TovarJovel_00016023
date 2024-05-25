package cliente;

public class Cliente {
    private String user;
    private String pass;

    public Cliente(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUsuario() {
        return user;
    }

    public void setUsuario(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
