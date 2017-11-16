package com.fredericboisguerin.insa;

public class InvalidEmailException extends Exception {
    private String contenu;

    public InvalidEmailException(String message){
        super();
        this.contenu = message;
    }

    public void printError(){
        System.err.println(contenu);
    }

}
