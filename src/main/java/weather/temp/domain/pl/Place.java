package weather.temp.domain.pl;

public class Place {
    private int temp;

    public Place() {

    }

    public Place(int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }


    @Override
    public String toString() {
        String info = String.format("Place info: temp = %d", temp);
        return info;
    }
}
