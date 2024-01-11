package es.ieslavereda.Biblioteca3;

public class BibliotecaTester {
    public static void main(String[] args) {
        Biblioteca biblioteca1 =  new Biblioteca("Biblioteca","La Pobla de Vallbona");
        Biblioteca biblioteca2 =  new Biblioteca("Bibliotecaaa","La Canyada");

        System.out.println("Añadir libro a biblioteca 1 -> " + biblioteca1.añadirLibro(new Libro("NuevoLibro","Cervantes",1),5) + "\n");

        System.out.println("Primer libro de biblioteca 2 eliminado -> " + biblioteca2.eliminarLibro("Don Quijote"));
        System.out.println("Último libro de biblioteca 2 eliminado -> " + biblioteca2.eliminarLibro("El amor en"));
        System.out.println("La casa de los espiritus de biblioteca 2 eliminado -> " + biblioteca2.eliminarLibro("La casa de los"));
        System.out.println("Eliminar libro que no existe de biblioteca 2 -> " + biblioteca2.eliminarLibro("ksdjjsefdjwd") + "\n");

        System.out.println("Préstamo biblioteca 1 -> " + biblioteca1.prestamo("Don Quijote"));
        System.out.println("Préstamo biblioteca 2 -> " + biblioteca1.prestamo("El alquimista"));
        System.out.println("Devolución biblioteca 1 -> " + biblioteca1.devolución("Don Quijote"));
        System.out.println("Devolución biblioteca 2 -> " + biblioteca1.devolución("El alquim") + "\n");

        System.out.println(biblioteca1);
        System.out.println(biblioteca2);
    }
}