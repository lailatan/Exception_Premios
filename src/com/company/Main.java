package com.company;

import java.util.Scanner;

/*
Crear un sistema que permita registrar usuarios de una empresa para un sistema de premios.
Para el registro se necesita el nombre y legajo.

El legajo debe tener 4 letras o números, y comenzar con "A", "B" o "C".

No permitir el registro si el legajo no es correcto.

TIP:
palabra.toUpperCase() // convierte a mayúsculas
palabra.startsWith("HOLA") // verifica si comienza con el texto que pasamos por parámetro.

Anotaciones sobre excepciones:

TryCatch
========
try {
	asignarDNI(dni);
} catch (DatosIncorrectosException e) {
	e.printStackTrace();
        this.dni = 0;
}

Método que arroja una excepción
===============================

private void asignarDNI(Integer dni) throws DatosIncorrectosException {
	if(String.valueOf(dni).length()!=8){
		throw new DatosIncorrectosException("El DNI debe tener 8 dígitos.");
	}else{
		this.dni = dni;
	}
}

 */
public class Main {
    static String nombre;
    static String legajo;

    public static void main(String[] args) {
        Usuario u = pedirUsuario();
        System.out.printf("Usuario %s creado con Exito",u.getNombre() + "/" + u.getLegajo());
    }

    private static Usuario pedirUsuario(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        nombre = sn.nextLine();

        System.out.print("Ingrese el legajo: ");
        legajo = sn.nextLine();

        try {
            return new Usuario(nombre,legajo);
        } catch (DatosIncorrectosException e) {
            System.out.println(e.getMessage());
            return pedirUsuario();
        }
    }

}
