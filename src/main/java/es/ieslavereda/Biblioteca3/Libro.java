package es.ieslavereda.Biblioteca3;

public class Libro {
    private String título;
    private String autor;
    private  int numEjemplaresTotal;
    private int numEjemplaresPrestados;
    public Libro(String título,String autor,int numEjemplaresTotal){
        this.título = título;
        this.autor = autor;
        this.numEjemplaresTotal = numEjemplaresTotal;
        this.numEjemplaresPrestados = 0;
    }
    public String getTítulo(){
        return título;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumEjemplaresTotal(){
        return numEjemplaresTotal;
    }
    public int getNumEjemplaresPrestados(){
        return numEjemplaresPrestados;
    }
    public boolean préstamo(){
        if (numEjemplaresPrestados<numEjemplaresTotal) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }
    public boolean devolución(){
        if (numEjemplaresPrestados>0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "[Título: " + título + ", autor: " + autor +
                ", ejemplares: " + numEjemplaresTotal + ", ejemplares prestados: " + numEjemplaresPrestados + "]";
    }
}
