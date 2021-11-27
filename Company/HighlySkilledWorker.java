package Company;

public class HighlySkilledWorker implements employeeQualification{
    @Override
    public void doWork() {
        System.out.println("Высококвалифицированный сотрудник - 120 $ в день");
    }
}
