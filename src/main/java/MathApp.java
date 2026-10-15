public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 50000;
        double garySalary = 60000;

        double highestSalary = garySalary;
        System.out.println("The highest salary is " + highestSalary);

        //question 2
        double carPrice = 100000;
        double truckPrice = 150000;

        double smallestPrice;
        if (carPrice > truckPrice) {
            smallestPrice = truckPrice;
        } else {
            smallestPrice = carPrice;
        }
        System.out.println("The smallest salary is " + smallestPrice);

        //question 3
        double radius = 7.25;
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is " + area);

        //question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of" + squareRoot);

        //question 5
        double x1 = 5;
        double y1 = 10;

        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt((x2-x1) *(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance is " + distance);

        //question 6
        double nambariN = -3.8;
        double positiveValue = Math.abs(number);
        System.out.println("The positive value is " + positiveValue);

        //question 7
        double randomValue = Math.random();
        System.out.println("The random value is " + randomValue);

        //question 8
        int days = 24;
        int hoursInDay = 24;
        int minutesInHour = 60;

        int totalMinutes = days * hoursInDay * minutesInHour;
        System.out.println("There are " + totalMinutes + "minutes" );

    }
}
