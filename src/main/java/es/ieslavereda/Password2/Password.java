package es.ieslavereda.Password2;

public class Password {
    private static final int longitudPorDefecto = 10;
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = longitudPorDefecto;
        do {
            this.contraseña = generarPassword(this.longitud);
        } while (!esFuerte());
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(this.longitud);
    }
    public boolean esFuerte(){

        if (longitud<10)
            return false;

        int contMay = 0;
        int contMin = 0;
        int contNum = 0;

        for (int i = 0; i < contraseña.length();i++){

            if (contNum<5 && contraseña.charAt(i) >= '0' && contraseña.charAt(i) <= '9')
                contNum++;
            if (contMin<2 && contraseña.charAt(i) >= 'a' && contraseña.charAt(i) <= 'z')
                contMin++;
            if (contMay<3 && contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z')
                contMay++;

            if (contNum>=5 && contMin>=2 && contMay>=3)
                return true;
        }

        return false;
    }
    public String generarPassword(int longitud){
        String contraseña = "";
        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = (int)(Math.random()*3); // 0-num, 1-min, 2-may
            switch (tipoCaracter){ // Cada uno tiene 1/3 de probabilidades de salir
                case 0:
                    contraseña += String.valueOf((int)(Math.random()*10));
                    break;
                case 1:
                    contraseña += (char)((Math.random()*26)+97);
                    break;
                case 2:
                    contraseña += (char)((Math.random()*26)+65);
                    break;
            }
        }
        return contraseña;
    }
    public int getLongitud(){
        return longitud;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
        this.contraseña = generarPassword(this.longitud);
    }
}