public class Car {


    private String code;
    private Route FixedRoute;
    private int maxCapacityPerTrip;



    public Car(String code, Route fixedRoute, int maxCapacityPerTrip) {
        this.code = code;
        FixedRoute = fixedRoute;
        this.maxCapacityPerTrip = maxCapacityPerTrip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return FixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        FixedRoute = fixedRoute;
    }

    public int getMaxCapacityPerTrip() {
        return maxCapacityPerTrip;
    }

    public void setMaxCapacityPerTrip(int maxCapacityPerTrip) {
        this.maxCapacityPerTrip = maxCapacityPerTrip;
    }


    public void check()throws Exception{
        if(maxCapacityPerTrip==0){
            throw new Exception("can not be zero or less");
        }
    }
}
