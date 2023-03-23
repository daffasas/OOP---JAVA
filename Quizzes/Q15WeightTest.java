public class Q15Weight5Test {
    /*
        u can use any parameters as u desire, but in this test case i use 115 lbs because why not
        system will tell you your current weight in pounds and
        system will tell you your current weight in kilograms as well.
     */
    public static void main(String[] args) {
        Q15Weight currentWeight = new Q15Weight(115);

        System.out.println("Your current weight in pound is"+ currentWeight.getPounds());
        System.out.println("Your Current weight in Kilogram is "+ currentWeight.getKilograms());

        System.out.println("i think that.. u have.. to eat salad- I'm kidding!"); // XD

    }
}
