

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.StatService;


public class StatServiceTest {
    @Test
    public void testsum() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testaverage() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testcountLessThanAverage() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.countLessThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testcountMoreThanAverage() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.countMoreThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
