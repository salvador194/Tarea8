package modelo;
import control.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
/**
 * @author ITCE
 */
@ManagedBean(name = "login")
@SessionScoped
public class LoginBean {
    /**
     * Creates a new instance of LoginBean
     */
    private String user;
    private String password;
    //@ManagedProperty(name=)
    private Usuario uusario;
//    private tablaUsuario usuarios;
//    private ArrayList<Usuario> lista;
        
    public LoginBean() {
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
