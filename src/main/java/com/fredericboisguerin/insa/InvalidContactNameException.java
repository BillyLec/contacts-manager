package com.fredericboisguerin.insa;

public class InvalidContactNameException extends Exception {

    private String contenu;

    public InvalidContactNameException(String message){
        super();
        this.contenu = message;
    }

    public void printError(){
        System.err.println(contenu);
    }


}
