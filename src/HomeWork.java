public class HomeWork {
    public static void main(String[] args) {
        task1("Cotne");
        int sum = task2(5, 5);
        System.out.println("sumIs: " + sum);
        System.out.println("isEven: " + task3(5));
        System.out.println("doubleToInt: " + task4(5.67));
        System.out.println("biggerNumberIs: " + task5(7,8));
        System.out.println("length is: " + task6("cotne"));
        System.out.println(task7(2,3));
        System.out.println(task7(2,2, 2));
    }


    public static void task1(String name) {
        System.out.println("Hello " + name);
    }

    public static int task2(int a, int b) {
        return a + b;
    }

    public static boolean task3(int a) {
        return a % 2 == 0;
    }

    public static int task4(double a) {
        return (int) a;
    }

    public static int task5(int a, int b) {
        if(a>b) {
            return a;
        }else {
            return b;
        }
    }

    public static int task6(String a){
        return a.length();
    }

    public static int task7(int a, int b) {
        return a*b;
    }
    public static int task7(int a, int b, int c) {
        return a*b*c;
    }
}
