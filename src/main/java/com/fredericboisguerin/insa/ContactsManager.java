package com.fredericboisguerin.insa;

import java.util.ArrayList;

public class ContactsManager {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException, InvalidEmailException {
            if(name == null || name.equals("")){
                throw new InvalidContactNameException("C'est le Nom qui bug");
            }
            else if (email!=null && !email.contains("@")){
                throw new InvalidEmailException("C'est le mail, le pb");
            }
            else{
                Contact contact = new Contact(name, email, phoneNumber);
                this.contactList.add(contact);}}

    public void printAllContacts(){
        for (Contact contact : this.contactList){
            printContact(contact);
        }
    }

    public void printContact(Contact contact) {
        if (contact.getEmail() == null){
            if (contact.getPhoneNumber()==null){
                System.out.println(contact.getName());}
            System.out.println(contact.getName()+ ", " + contact.getPhoneNumber());
        }
        System.out.println(contact.getName() + ", "+ contact.getEmail() + ", "+ contact.getPhoneNumber());
    }

    public void searchContactByName(String name) {
        for (int i =0; i<this.contactList.size() ;i++){
            if(this.contactList.get(i).getName().toUpperCase().contains(name.toUpperCase())) {
                printContact(contactList.get(i));
            }
        }
    }
}
