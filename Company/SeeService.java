package Company;

public class SeeService extends Service{
    public SeeService(int price, double leadTime, String nameCustomer, byte dataVolume, Company.employeeQualification employeeQualification, int employeesNumber) {
        super(price, leadTime, nameCustomer, dataVolume, employeeQualification, employeesNumber);
    }

    @Override
    public void provideServices() {
        System.out.println("Просто посмотреть - стоимость услуги 40$*мегабайт");
        employeeQualification.doWork();
    }

    @Override
    public String toString() {
        return "SeeService{" +
                "price=" + price +
                ", leadTime=" + leadTime +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", dataVolume=" + dataVolume +
                ", employeeQualification=" + employeeQualification +
                ", employeesNumber=" + employeesNumber +
                '}';
    }
}
