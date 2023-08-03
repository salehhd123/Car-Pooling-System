
public class Main {
    public static void main(String[] args) {
        try {
            Route r1 = new Route("النهضة", "العليا", 100);
            Route r2 = new Route("الدرعية", "التخصصي", 200);


            Car c1 = new Car("111", r1, 1);
            c1.check();
            Car c2 = new Car("89", r2, 4);
            c2.check();


            Sub s1 = new Sub(c1, "29", "saleh");


            NonSub n1 = new NonSub(c2, "99", "meshal", true);


            Passenger[] arr = {s1, n1};
            for (int i = 0; i < arr.length; i++) {
                arr[i].print();
                System.out.println("------------");
            }


        } catch (Exception c) {
            System.out.println(c.getMessage());
        }
    }
}