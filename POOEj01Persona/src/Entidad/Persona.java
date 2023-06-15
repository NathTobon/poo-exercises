package Entidad;

public class Persona {
    public String name;
    public String idNumber;
    public String dateOfBirth;

    public Persona() {
    }

    public Persona(String name) {
        this.name = name;
    }

    public Persona(String idNumber, String dateOfBirth) {
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
