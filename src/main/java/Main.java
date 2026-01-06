import ru.netology.javaqahw5.services.VacationService;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println(service.calcVacation(100_000, 60_000, 150_000));

    }
}
