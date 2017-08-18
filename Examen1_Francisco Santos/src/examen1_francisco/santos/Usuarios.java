
package examen1_francisco.santos;

import java.util.ArrayList;
import java.util.Date;


public class Usuarios {
    ArrayList<Usuarios> amigos=new ArrayList();
    ArrayList solicitudes=new ArrayList();
    ArrayList<Libros>MisLibros=new ArrayList();
    private String Nombre;
    private String user;
    private String contraseña;
    private String telefono;
    private Date nacimiento;
    private String correo;
    private String favorito;
    private boolean normal;

    public Usuarios() {
    }

    public Usuarios(String Nombre, String user, String contraseña, String telefono, Date nacimiento, String correo, String favorito,boolean normal) {
        this.Nombre = Nombre;
        this.user = user;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.favorito = favorito;
        this.normal=normal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuarios> amigos) {
        this.amigos = amigos;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<Libros> getMisLibros() {
        return MisLibros;
    }

    public void setMisLibros(ArrayList<Libros> MisLibros) {
        this.MisLibros = MisLibros;
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }
    
    

    @Override
    public String toString() {
        return "Usuarios{" + "Nombre=" + Nombre + ", user=" + user + ", contrase\u00f1a=" + contraseña + ", telefono=" + telefono + ", nacimiento=" + nacimiento + ", correo=" + correo + ", favorito=" + favorito + '}';
    }
    
    
}
