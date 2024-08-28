package model;
public class Usuario {
    private int id ;
    private String documento;
    private String nombres;
    private String apellidos;
    private String correo;
    public Usuario() {
    }
    
    public Usuario(String documento, String nombres, String apellidos, String correo) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public Usuario(int id, String documento, String nombres, String apellidos, String correo) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", documento=" + documento + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", correo=" + correo + "]";
    }

    

}
