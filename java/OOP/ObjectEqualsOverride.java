package OOP;

import java.time.LocalDate;

public class ObjectEqualsOverride {
    public static void main(String[] args) {
        StaffMember staff1 = new StaffMember("John", "Smith", 150000, LocalDate.of(2022, 5, 25), LocalDate.of(2023, 5, 25));
        StaffMember staff2 = new StaffMember("John", "Smith", 150000, LocalDate.of(2022, 5, 25), LocalDate.of(2023, 5, 25));
        StaffMember staff3 = new StaffMember("Michah", "Smith", 150000, LocalDate.of(2022, 5, 25), LocalDate.of(2023, 5, 25));
        System.out.println(staff1.equals(staff2));
        System.out.println(staff1.equals(staff3));
    }
    
}

class StaffMember {
    private String firstName;
    private String lastName;
    private int salary;
    private LocalDate hireDate;
    private LocalDate endDate;

    /**
     * Constructor
     * @param firstName         - First Name of the Staff Member
     * @param lastName          - Last Name of the Staff Member
     * @param salary            - Salary in $ of the Staff Member
     * @param hireDate          - Hire Date of the Staff Member in format: yyyy-mm-dd
     * @param endDate           - End Date of the Staff Member in format: yyyy-mm-dd
     */
    public StaffMember(String firstName, String lastName, int salary, LocalDate hireDate, LocalDate endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireDate = hireDate;
        this.endDate = endDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " | Salary: " + this.salary + " | Hire Date: " + this.hireDate + " | End Date: " + this.endDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        final StaffMember staffMember = (StaffMember) obj;
        if (this.getFirstName().equals(staffMember.getFirstName()) && this.getLastName().equals(staffMember.getLastName()) && 
        this.getSalary() == staffMember.getSalary() && this.getHireDate().compareTo(staffMember.getHireDate()) == 0 && 
        this.getEndDate().compareTo(staffMember.getEndDate()) == 0) {
            return true;
        }
        return false;
    }

}
