public class NonSub extends Passenger{

    private boolean discount;

    public NonSub(Car c, String id, String name, boolean discount) {
        super(c, id, name);
        this.discount = discount;
    }


    @Override
    double CalFinalPrice() {
        double price= super.getC().getFixedRoute().tripPrice;
        if(discount==true){
            double after= price*0.1;
            return price-after;

        }else
        return price;
    }

    public void print(){
        System.out.println("your id :" +getId());
        System.out.println("your name :"+getName());
        System.out.println("the code car :"+super.getC().getCode());
        System.out.println(discount == true ?"valid coupon":"invalid coupon");
        System.out.println("the price :"+CalFinalPrice());
    }


}
