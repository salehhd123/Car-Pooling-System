public  abstract class Passenger {
   private String name;
    private String id;

    private Car c;


    public Passenger(Car c, String id,String name ) {
        this.name = name;
        this.id = id;
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }


    abstract double CalFinalPrice();
    abstract void print();


}
