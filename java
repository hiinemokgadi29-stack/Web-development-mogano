package patient.admission.system;
public class Patient {

    // Encapsulation - private attributes
    private String patientId;
    private String firstName;
    private String surname;
    private int age;
    private String gender;
    private String contact;
    private PatientCategory category;

    // Enum for patient categories
    public enum PatientCategory {
        INPATIENT,
        OUTPATIENT,
        EMERGENCY
    }

    // Constructor
    public Patient(String patientId, String firstName, String surname,
                   int age, String gender, String contact,
                   PatientCategory category) {

        this.patientId = patientId;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.category = category;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    public PatientCategory getCategory() {
        return category;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCategory(PatientCategory category) {
        this.category = category;
    }

    // Display patient information
    public void displayPatient() {

        System.out.println("----------------------------------------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + firstName + " " + surname);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Contact    : " + contact);
        System.out.println("Category   : " + category);
        System.out.println("----------------------------------------");
    }
}