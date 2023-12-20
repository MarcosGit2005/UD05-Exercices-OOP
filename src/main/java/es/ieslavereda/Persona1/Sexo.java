package es.ieslavereda.Persona1;

import java.util.Scanner;

public enum Sexo {
    HOMBRE("hombre"),
    MUJER("mujer"),
    NO("no");
    private String sexo;
    Sexo(String sexo) {
        this.sexo = sexo;
    }
    public static Sexo getSexoFrom(String message){
        Scanner sc = new Scanner(System.in);
        char sexoChar;
        do {
            System.out.print(message);
            sexoChar = sc.next().toUpperCase().charAt(0);
        } while (sexoChar!='H' && sexoChar!='M' && sexoChar!='N');
        switch (sexoChar){
            case 'H':
                return Sexo.HOMBRE;
            case 'M':
                return Sexo.MUJER;
            default:
                return Sexo.NO;
        }
    }
    @Override
    public String toString(){
        return sexo;
    }
}
