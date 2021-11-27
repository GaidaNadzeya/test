package Company;

public abstract class Service {
    protected int price;
    protected double leadTime;
    protected String nameCustomer;
    protected byte dataVolume;
    protected employeeQualification employeeQualification;
    protected int employeesNumber;

    public Service(int price, double leadTime, String nameCustomer, byte dataVolume, Company.employeeQualification employeeQualification, int employeesNumber) {
        this.price = price;
        this.leadTime = leadTime;
        this.nameCustomer = nameCustomer;
        this.dataVolume = dataVolume;
        this.employeeQualification = employeeQualification;
        this.employeesNumber = employeesNumber;
    }
    public abstract void provideServices();
}
