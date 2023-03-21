public class Q11Fraction {
    /*
        sum_frac = e1*d2+e2*d1. for adding the fractions
        multi_frac = e1*e2. multplying
        formula of denom = d1*d2 used in addition and multiplication of two fractions
     */
    public static void main(String[] args) {
        int e1,d1,e2,d2,sum_frac,multi_frac,denom;
        e1 = 1; d1 = 2; e2 = 1; d2 = 3;
        sum_frac = e1*d2+e2*d1; multi_frac = e1*e2;
        denom = d1*d2;
        System.out.println("Result of adding fraction1 and fraction2 is "+sum_frac+"/"+denom);
        System.out.println("The result of multiplying Fraction1 and Fraction2 is "+multi_frac+"/"+denom);
        System.out.println("");
        
        //f1 f2 1/3 and 3/4
        e1 = 1; d1 = 3; e2 = 3; d2 = 4;
        sum_frac = e1*d2+e2*d1; multi_frac = e1*e2;
        denom = d1*d2;
        System.out.println("Result of adding fraction1 and fraction2 is "+sum_frac+"/"+denom);
        System.out.println("The result of multiplying Fraction1 and Fraction2 is "+multi_frac+"/"+denom);
        System.out.println("");

        //f1 f2 1/2 and 2/3
        e1 = 1; d1 = 2; e2 = 2; d2 = 3;
        sum_frac = e1*d2+e2*d1; multi_frac = e1*e2;
        denom = d1*d2;
        System.out.println("Result of adding fraction1 and fraction2 is "+sum_frac+"/"+denom);
        System.out.println("The result of multiplying Fraction1 and Fraction2 iss "+multi_frac+"/"+denom);
        System.out.println("");

        //f1 f2 1/4 and 2/3
        e1 = 1; d1 = 4; e2 = 2; d2 = 3;
        sum_frac = e1*d2+e2*d1; multi_frac = e1*e2;
        denom = d1*d2;
        System.out.println("Result of adding fraction1 and fraction2 is "+sum_frac+"/"+denom);
        System.out.println("The result of multiplying Fraction1 and Fraction2 is "+multi_frac+"/"+denom);
        System.out.println("");

        System.out.println("next time try to use a calculator instead od doing this");  //   xDDDD
    }
}
