package com.claseufpso.librery;

import InformationBooks.Information;

public class Librery {

    public static void main(String[] args) {
      Information dune = new Information("mesias de dune","frank herpertz" ,"ciencia ficcion" ,"1964", "disponible", "dos", "un mes", "luiggy", "6 de marzo", "6 de abril");
        dune.saySomething(); 
        
        System.out.println("");
      Information sebastian = new Information("cancion de hielo y fuego", "geor rr martin", "medieval", "1988", "no disponible", "cero", "ni un dia", "sebastian", "ni hoy ni mañana", "no se lo llevo" );
        sebastian.saySomething();
    }
}
