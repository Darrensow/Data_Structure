package General.Exam.LabTest1_Pua;

public class Person {

    private String name_contact;
    private String contact_number;
    private String[] employees;
    private int number_employees;

    public Person() {
    }

    public Person(String name_contact, String contact_number, String[] employees) {
        this.name_contact = name_contact;
        this.contact_number = contact_number;
        this.employees = employees;
    }

    public int getNumber_employees() {
        return employees.length;
    }

    public void setNumber_employees() {
        this.number_employees = employees.length;
    }

    public String getName_contact() {
        return name_contact;
    }

    public void setName_contact(String name_contact) {
        this.name_contact = name_contact;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String[] getEmployees() {
        return employees;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public String print_employee() {
        String result ="";
        for (int i = 0; i < employees.length; i++) {
            result += (i + 1) + ") " + employees[i]+"\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Boss: " + name_contact + "\ncontact_number: " + contact_number + "\nEmployees: \n" + print_employee();
    }

}
