public class Chair {

    private String model;
    private int numberOfLegs;
    private double price;

    public Chair(String model, int numberOfLegs, double price) {
        this.model = model;
        this.numberOfLegs = numberOfLegs;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice (int numberOfChairs){
        return price * numberOfChairs;
    }

    @Override
    public String toString() {
        return String.format("This chair model is %s, it has %s legs and costs %s",model,numberOfLegs,price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chair){
            Chair temp = (Chair)obj;
//            if (this.price == temp.getPrice() && this.model.equals(temp.getModel()) && this.numberOfLegs == temp.getNumberOfLegs()){
//                return true;
//            }else{
//                return false;
//            }
            return this.price == temp.getPrice() && this.model.equals(temp.getModel()) && this.numberOfLegs == temp.getNumberOfLegs();
        }else{
            return false;
        }
    }
}
