package es.ieslavereda.Biblioteca3;

public class Biblioteca {
    private Libro[] libros = new Libro[100];
    private int numLibrosActuales;
    private String nombre;
    private String barrio;
    public Biblioteca(String nombre, String barrio){
        this.nombre = nombre;
        this.barrio = barrio;

        String[][] títulos_Autores = {{"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Cien años de soledad", "Gabriel García Márquez"},
                {"El alquimista", "Paulo Coehlo"},
                {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
                {"La ciudad y los perros", "Mario Vargas Llosa"},
                {"La casa de los espíritus","Isabel Allende"},
                {"Desolación", "Gabriela Mistral"},
                {"Rayuela", "Julio Cortázar"},
                {"El Aleph", "Jorge Luis Borges"},
                {"El amor en los tiempos del cólera","Gabriel García Márquez"}};
        for (int i = 0; i < títulos_Autores.length; i++) {
            libros[numLibrosActuales++] = new Libro(títulos_Autores[i][0],títulos_Autores[i][1],3);
        }
    }
    public String getNombre(){
        return nombre;
    }
    public String getBarrio(){
        return barrio;
    }
    public int getNumLibrosActuales(){
        return numLibrosActuales;
    }
    /*public int buscarPosiciónDelLibro(String nombreLibro){
        int i = 0;
        while (i<numLibrosActuales){
            if (libros[i].getTítulo().equals(nombreLibro)){
                return i;
            }
            i++;
        }
        return -1;
    }*/
    public boolean añadirLibro(Libro libro, int numEjemplares){
        if (numLibrosActuales<libros.length){
            libros[numLibrosActuales++] = new Libro(libro.getTítulo(),libro.getAutor(),numEjemplares);
            return true;
        }
        return false;
    }
}
