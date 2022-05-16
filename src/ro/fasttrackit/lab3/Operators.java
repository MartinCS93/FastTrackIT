package ro.fasttrackit.lab3;

public class Operators {
    public static void main(String[] args) {
        System.out.println(Methods.square(15));
        System.out.println(Methods.fahrenheitToCelsius(98.6));
        System.out.println(Methods.fahrenheitToCelsius(100.4));
        System.out.println(Methods.daysToSeconds(7));
        System.out.println(Methods.weekDay(5));
        System.out.println(Methods.averageValue(8529634587L, 5679843169L, 3678492158L));
        System.out.println(Methods.intervalSum(5, 11));
        System.out.println(Methods.fourIntegers(5, 8, 7, 3));
    }

    public static class Methods {
        public static int square(int number) {
            return number * number;
            //calculating the square of a given number
        }

        public static double fahrenheitToCelsius(double temp) {
            return (temp - 32) * (5D / 9D);
            //transforming fahrenheit to celsius
        }

        public static int daysToSeconds(int days) {
            return days * 24 * 60 * 60;
            //calculating how many second are in given days
        }

        public static String weekDay(int day) {
            String[] weekDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return weekDays[day - 1];
            //return the corresponding week
        }

        public static long averageValue(long firstLong, long secondLong, long thirdLong) {
            return (firstLong + secondLong + thirdLong) / 3;
            //return average value of 3 long
        }

        public static int intervalSum(int firstOne, int secondOne) {
            return firstOne * (secondOne - firstOne) + (secondOne - firstOne + 1) * (secondOne - firstOne) / 2 + firstOne;
            //firstOne<secondOne
            //calculating the sum of integers in the interval (firstOne,secondOne)
        }

        public static int fourIntegers(int firstOne, int secondOne, int thirdOne, int fourthOne) {
            return firstOne % secondOne + firstOne / thirdOne + 4 * fourthOne;
            //thirdOne != 0;
            // if thirdOne = 0; ==> Exception in thread "main" java.lang.ArithmeticException: / by zero
        }
    }
}
