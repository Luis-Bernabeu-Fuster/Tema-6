package Ejercicio1;

import java.util.ArrayList;

public class TelefonoMovil{
    protected String myNumber;
    ArrayList<Contacto> myContacts = new ArrayList<>();

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacto>();
    }

    public void printContacto(){
        System.out.println("Lista de contactos: ");
        for (int i = 0;i < myContacts.size();i++){
            System.out.println((i + 1)+ ". " + myContacts.get(i).getName()  + " ---> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
    public boolean addNewContact(Contacto contacto){
       if (this.myContacts.contains(contacto)){
           System.out.println("Error contacto ya existente !!!");
           return false;
       } else {
           System.out.println("Contacto agregado con exito\n");
           myContacts.add(contacto); //Añade a la ultima posicion del array por defecto
           return true;
       }
    }
    public boolean updateContact(Contacto anteupdate,Contacto postupdate){
        if (myContacts.contains(anteupdate) && !myContacts.contains(postupdate)) {
                int a = myContacts.indexOf(anteupdate);
                myContacts.set(a,postupdate);
                System.out.println("Contacto encontrado y actualizado");
            return true;
        }else {
            System.out.println("Error algo salio mal");
            return false;
            }
    }
    public boolean removeContact( Contacto contacto){
        if (myContacts.contains(contacto)){
            myContacts.remove(contacto);
            return true;
        } else {
            return false;
        }
    }
    private int findContact(Contacto contacto){
        if (myContacts.contains(contacto)){
            return myContacts.indexOf(contacto);
        } else {
            return -1;
        }
    }
    public Contacto queryContact(String nombre){
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(nombre)){
                return myContacts.get(i);
            }
        }
        return null;
    }
    public boolean findNombre(String nombre){
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equalsIgnoreCase(nombre)){
                System.out.println(myContacts.get(i).getName() + " -----> " +myContacts.get(i).getPhoneNumber());
                return true;
            }
        }
        return false;
    }
    public boolean findPhone(String number){
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getPhoneNumber().equals(number)){
                System.out.println(myContacts.get(i).getName() + " -----> " +myContacts.get(i).getPhoneNumber());
                return true;
            }
        }
        return false;
    }
    public boolean findClave(String clave){
        boolean encontrado = false;

        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().contains(clave)){
                System.out.println(myContacts.get(i).getName() + " -----> " +myContacts.get(i).getPhoneNumber());
                encontrado = true;
            }
        }
        return encontrado;
    }
}
