package Ejercicio1;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {

    private String name;
    private String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name,String phoneNumber){
        Contacto contacto = new Contacto(name,phoneNumber);
       return contacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(name, contacto.name) && Objects.equals(phoneNumber, contacto.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public int compareTo(Contacto contacto) {
        return this.name.compareTo(contacto.name);
    }
}
