package Activity_41;

public class Statistic {
    private String maker;
    private int sold;
    private float totalMoney;

    public Statistic(String maker, int sold, float totalMoney) {
        this.maker = maker;
        this.sold = sold;
        this.totalMoney = totalMoney;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "maker='" + maker + '\'' +
                ", sold=" + sold +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
