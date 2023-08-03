public class Sub extends Passenger{

    public Sub(Car c, String id, String name) {
        super(c, id, name);
        CalFinalPrice();
    }

    @Override
    double CalFinalPrice() {
        double price= super.getC().getFixedRoute().tripPrice;
        double after= price*0.5;
        return price-after;
    }

    public void print(){
        System.out.println("your id :" +getId());
        System.out.println("your name :"+getName());
        System.out.println("the code car :"+super.getC().getCode());
        System.out.println("the price :"+CalFinalPrice());
    }


}
