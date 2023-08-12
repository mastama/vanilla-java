package innerOuterClass;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("");

        Company.Employee employee = company.new Employee();
        employee.setName("Tama");

        System.out.println("ini dari employee " + employee.getName());
        System.out.println("ini dari company " + employee.getCompany());
    }
}
