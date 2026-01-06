package ru.netology.javaqahw5.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
public void testChangingAmounts(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calcVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void thresholdOver150000() {
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        int actual = service.calcVacation(100_000,60_000,150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
