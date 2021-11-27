package Company;

public class UseRegression extends Service{
    public UseRegression(int price, double leadTime, String nameCustomer, byte dataVolume, Company.employeeQualification employeeQualification, int employeesNumber) {
        super(price, leadTime, nameCustomer, dataVolume, employeeQualification, employeesNumber);
    }

    @Override
    public void provideServices() {
        System.out.println("Использовать регрессию - 200$ в день + 50$*мегабайт");
        employeeQualification.doWork();
    }
}
