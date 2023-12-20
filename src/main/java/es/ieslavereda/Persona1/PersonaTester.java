package es.ieslavereda.Persona1;

public class PersonaTester {
    public static void main(String[] args) {
        Persona[] personas = new Persona[6];

        for(int i=0;i<personas.length;i++){
            String nombre = Input.getString("Introduce el nombre para la persona " +(i+1)+": ");
            String apellidos = Input.getLine("Introduce los apellidos para la persona "+(i+1)+": ");
            int edad = Input.getInteger("Introduce una edad para la persona "+(i+1)+": ");

            if (Input.getOption("¿Quieres introducir DNI? (Y/N): ").equals("N"))
                personas[i] = new Persona(nombre,apellidos,edad);
            else {
                String DNI = Input.getString("Introduce un DNI para la persona "+(i+1)+": ");
                Sexo sexo = Sexo.getSexoFrom("Selecciona el sexo que quieras (H-Hombre/M-Mujer/N-Nothing) para la persona "+(i+1)+": ");
                double peso = Input.getDouble("Introduce tu peso en kg con coma para los decimales para la persona "+(i+1)+": ");
                double altura = Input.getDouble("Introduce tu altura en metros con coma para los decimales para la persona "+(i+1)+": ");
                personas[i] = new Persona(nombre,apellidos,edad,DNI,sexo,peso,altura);
            }
            System.out.println();

            final int debajoDeSuPeso = -1;
            final int pesoideal = 0;
            final int sobrepeso = 1;
            final int obeso = 2;
            switch (personas[i].calcularIMC()){
                case debajoDeSuPeso:
                    System.out.println(personas[i].getNombre() + " " + personas[i].getApellidos() + " está por debajo de su peso.");
                    break;
                case pesoideal:
                    System.out.println(personas[i].getNombre() + " " + personas[i].getApellidos() + " está en un peso ideal.");
                    break;
                case sobrepeso:
                    System.out.println(personas[i].getNombre() + " " + personas[i].getApellidos() + " tiene un poco de sobrepeso.");
                    break;
                case obeso:
                    System.out.println(personas[i].getNombre() + " " + personas[i].getApellidos() + " es morbosamente obeso.");
                    break;
            }
            String mayorEdadTexto = personas[i].getNombre() + " " + personas[i].getApellidos() + " es mayor de edad.";
            String menorEdadTexto = personas[i].getNombre() + " " + personas[i].getApellidos() + " es menor de edad.";
            System.out.println(personas[i].esMayorDeEdad()?mayorEdadTexto:menorEdadTexto);
            System.out.println(personas[i]);

            System.out.println();
        }
    }
}