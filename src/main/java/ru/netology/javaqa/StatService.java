package ru.netology.javaqa;

public class StatService {
    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += (int) sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int countLessThanAverage(long[] sales) {
        long average = averageSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public int countMoreThanAverage(long[] sales) {
        long average = averageSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }
}
