import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.services.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/diapason.scv")
    public void ShouldCalcExact(int expected, int x, int y) {
        SqrtService service = new SqrtService();


        int actual = service.calcSqrt(x, y);

        Assertions.assertEquals(expected, actual);

    }

}
