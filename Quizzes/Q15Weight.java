public class Q15Weight {
    /*
        The variable weight_pounds is a double
        The method getKilograms is a double return so it can get the weight_punds in double as well.
        getKilograms's formula  1 pound = 0.45359237 kilograms.
     */
    private double weight_pounds;

    public double getPounds() { //getting the pund number
        return weight_pounds;
    }
    public double getKilograms() {
        return weight_pounds*0.45359237; //its actually already trnasformed into KGs here.
    }

    public Q15Weight(double x){
        this.weight_pounds = x;
    }
}
