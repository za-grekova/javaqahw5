package ru.netology.javaqahw5.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
public void thresholdOver20000() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calcVacation(10_000,3000,20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thresholdOver150000() {
        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calcVacation(100_000,60_000,150_000);

        Assertions.assertEquals(expected, actual);
    }
}
