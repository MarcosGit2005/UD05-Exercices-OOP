package es.ieslavereda.Persona1;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso; // En kg
    private double altura; // En m
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = Sexo.NO;
        this.peso = 65;
        this.altura = 1.78;
    }
    public Persona(String nombre, String apellidos, int edad, String DNI, Sexo sexo, double peso, double altura){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public String getDNI(){
        return DNI;
    }
    public Sexo getSexo(){
        return sexo;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public boolean esMayorDeEdad(){
        return edad>=18;
    }
    public String generaDNI(){
        int numDni = (int)(Math.random()*100000000);

        String numDniString = String.valueOf(numDni);
        for (int i = numDniString.length(); i < 8; i++) {
            numDniString = "0" + numDniString;
        }

        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
        return numDniString + letra[numDni%23];
    }
    public int calcularIMC(){
        final int debajoDeSuPeso = -1;
        final int pesoideal = 0;
        final int sobrepeso = 1;
        final int obeso = 2;

        double IMC = peso/Math.pow(altura,2);

        if (IMC<18.5){
            return debajoDeSuPeso;
        } else if (IMC>=18.5 && IMC<25){
            return pesoideal;
        } else if (IMC>=25 && IMC<30){
            return sobrepeso;
        } else { // else if (IMC>=30)
            return obeso;
        }
    }
    @Override
    public String toString(){
        return "[Nombre: " + nombre + ", apellidos: " + apellidos + ", edad: " + edad +
                ", DNI: " + DNI + ", sexo: " + sexo + ", peso: " + peso + ", altura: " + altura + "]";
    }
}
