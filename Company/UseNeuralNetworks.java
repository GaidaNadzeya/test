package Company;

public class UseNeuralNetworks extends Service{
    public UseNeuralNetworks(int price, double leadTime, String nameCustomer, byte dataVolume, Company.employeeQualification employeeQualification, int employeesNumber) {
        super(price, leadTime, nameCustomer, dataVolume, employeeQualification, employeesNumber);
    }

    @Override
    public void provideServices() {
        System.out.println("Использовать нейронные сети - 500 $ в день либо 200 $*мегабай");
        employeeQualification.doWork();
    }
}
