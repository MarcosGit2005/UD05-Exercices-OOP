package es.ieslavereda.Password2;

public class Password {
    private static final int longitudPorDefecto = 10;
    private int longitud;
    private String contarseña;

    public Password() {
        this.longitud = longitudPorDefecto;
        this.contarseña = generarPassword(this.longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contarseña = generarPassword(this.longitud);
    }
    public String generarPassword(int longitud){
        String contraseña = "";
        for (int i = 0; i < longitud; i++) {

        }
        return contraseña;
    }
    public int getLongitud(){
        return longitud;
    }
    public String getContarseña(){
        return contarseña;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
        this.contarseña = generarPassword(this.longitud);
    }
}