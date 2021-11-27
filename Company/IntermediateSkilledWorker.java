package Company;

public class IntermediateSkilledWorker implements employeeQualification{
    @Override
    public void doWork() {
        System.out.println("Среднеквалифицированный сотрудник - 70 $ в день");
    }
}
