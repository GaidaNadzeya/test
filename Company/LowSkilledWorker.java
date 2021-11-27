package Company;

public class LowSkilledWorker implements employeeQualification{
    @Override
    public void doWork() {
        System.out.println("Низкоквалифицированный сотрудник- 33 $ в день");
    }
}
