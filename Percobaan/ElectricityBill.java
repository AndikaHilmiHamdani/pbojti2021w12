/**
 * ElectricityBill
 */
public class ElectricityBill implements Payable {

    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public int getKwh() {
        return kwh;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getBasePrice() {
        int Price = 0;
        switch (category) {
            case "R-1":
                Price = 100;
                break;
            case "R-2":
                Price = 100;
                break;
        }
        return Price;
    }

    @Override
    public int getPaymentAmount() {
        return kwh * getBasePrice();
    }

    public String getBillInfo(){
        return "kwh = "+kwh+"\n"+
               "category = "+ category +"("+getBasePrice()+"per kWh)\n";
    }
}