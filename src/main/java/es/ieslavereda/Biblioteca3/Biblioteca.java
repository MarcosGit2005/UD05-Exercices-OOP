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
    public boolean añadirLibro(Libro libro, int numEjemplares){
        if (numLibrosActuales<libros.length){
            libros[numLibrosActuales++] = new Libro(libro.getTítulo(),libro.getAutor(),numEjemplares);
            return true;
        }
        return false;
    }
    public boolean eliminarLibro(String palabraClave){
        int posiciónLibro = buscarPosicionLibro(palabraClave);
        if (numLibrosActuales>0 && posiciónLibro!=-1){
            libros[posiciónLibro] = libros[numLibrosActuales-1]; // Directamente le añado el último libro
            libros[numLibrosActuales-1] = null; // Y al último lo borro
            numLibrosActuales--;
            return true;
        }
        return false;
    }
    public int buscarPosicionLibro(String palabraClave){
        if (palabraClave.isEmpty())
            return -1;
        for(int posición=0;posición<numLibrosActuales;posición++){

            for (int j=0;j<libros[posición].getTítulo().length() - (palabraClave.length()-1);j++){

                if (palabraClave.toLowerCase().equals(libros[posición].getTítulo().substring(j,j+palabraClave.length()).toLowerCase())){
                    return posición;
                }

            }

        }
        return -1;
    }
    public boolean prestamo(String palabraClave){
        int posicionLibro = buscarPosicionLibro(palabraClave);
        if (posicionLibro!=-1 && libros[posicionLibro].préstamo()){
            return true;
        }
        return false;
    }
    public boolean devolución(String palabraClave){
        int posicionLibro = buscarPosicionLibro(palabraClave);
        if (posicionLibro!=-1 && libros[posicionLibro].devolución()){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        String out = "[Nombre: " + nombre + ", barrio: " + barrio + ", numLibrosActuales: " + numLibrosActuales + ", listado de libros: ";
        for (int i=0;i<numLibrosActuales;i++){
            out += libros[i].getTítulo() + ", ";
        }
        out = out.substring(0,out.length()-2) + "]";
        return out;
    }
}
