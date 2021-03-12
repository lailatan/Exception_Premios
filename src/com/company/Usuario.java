package com.company;

public class Usuario {
    private String nombre;
    private String legajo;

    public void Usuario(){

    }

    public Usuario(String nombre, String legajo) throws DatosIncorrectosException {
        this.nombre = nombre;
        asignarLegajo(legajo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public  void asignarLegajo(String legajo) throws DatosIncorrectosException {
        legajo=legajo.toUpperCase();
        if (legajo.length()==4) {
            if (legajo.startsWith("A") ||
                    legajo.startsWith("B")  ||
                    legajo.startsWith("C")) this.legajo=legajo;
            else
                throw new DatosIncorrectosException("Legajo inválido. Debe comenzar con la letra A, B o C.");
        } else
            throw new DatosIncorrectosException("Legajo inválido. Debe contener 4 letras/números");
    }

}


