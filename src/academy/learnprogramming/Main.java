package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value =" +myMinFloatValue);
        System.out.println("Float minimum value =" +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =" +myMinDoubleValue);
        System.out.println("Double minimum value =" +myMaxDoubleValue);

        Float a = 5/3f;
        Double b= 5.00/3.00;
        System.out.println(a);
        System.out.println(b);

        //exercise pound to kg
        double pound = 1000d;
        double valueInKilo= pound * 0.453592;
        System.out.println(valueInKilo);

        //Char and boolean
        char a1= 'A';
        char w= '\u0057';
        System.out.println("WROC"+'\u0141'+a1+w);
        String wroclaw= "WROCŁAW";
        System.out.println(wroclaw);

        boolean myFirstBooleanTrue= true;
        boolean myFirstBooleanFalse= false;
        boolean isAnAdult= false;
        int age = 5;
        if(age>=18) {
        isAnAdult=true;
            System.out.println(isAnAdult);
        }
        System.out.println(isAnAdult);




        //String experiments
        int myNumber = 3;
        String stringNumber= "15";
        stringNumber= stringNumber + myNumber;
        System.out.println(stringNumber);

        //math experiments with operators
        //result = 3
        int result= 1+2;
        System.out.println(result);
        //previous result 3
        int previousResult= result;
        System.out.println(previousResult);
        //result 5
        result= result+2;
        System.out.println(result);
        //previousResult = 3
        System.out.println(previousResult);
        previousResult= result;
        //previousResult = 5
        System.out.println(previousResult);
        //modulo result = 1
        System.out.println(5%2 );
        previousResult++;
        System.out.println(previousResult);
        previousResult--;
        System.out.println(previousResult);
        //previousresult= 50
        System.out.println(previousResult*=10);

        //boolean exercise
        boolean isCar = false;
        if(!isCar){
            System.out.println("is not a car");

        }
        boolean isHuman = false;
        if (isHuman!=true){
            System.out.println("its not a human");
        }

        boolean isMyboyfriend= false;
        if(isMyboyfriend== false){
            System.out.println("he is not my boyfriend");
        }

        boolean isMyEx = false;
        boolean isNotGood = true;
        if (isMyEx == true && isNotGood == true){
            System.out.println("he is not good exbf leave him");
        }
        if (isMyEx== true|| isNotGood==false) {
            System.out.println("he is a good exbf keep him");
        }
        isMyEx= true;
        boolean wasBoyfriend = isMyEx? true: false;
        if(wasBoyfriend){
            System.out.println("he used to be my bf");
        }
        //OPERATOR CHALLENGE
        //1.CREATE DOUBLE VAR W/ VAL 20.00
        //2. CREATE A SECOND VAR OF TYPE  DOUBLE WITH THE VALUE 80.00
        //3. ADD BOTH NUMBERS TOGETHER AND MULTIPLY BY 100.00
        //4. USE THE REMAINDER OPERATOR  TO FIGURE OUT WHAT THE REMAINDER FROM THE RESULT OF THE OPERATION IN STEP 3
        // AND 40.00. WE USED THE MODULE OR REMAINDER OPERATOR ON INTS IN THE COURSE BUT WE CAN ALSO USE IT ON A DOUBLE.
        //5 . CREATE BOOLEA VAR THAT ASSIGN THE VAL TRUE IF THE REMAILDER IN NUMBER 4 IS 0 OR FALSE IF ITS NOT ZERO
        //6. OUTPUT THE BOOLEAN VAR
        //7. WRITE AN IF-THEN STATEMENT THAT DISPLAYS A MESSAGE "GOT SOME REMAINDER " IF THE BOOLEAN IN STEPS 5 IS NOT TRUE

        double e1 = 20.00;
        double e2 = 80.00;
        double e3 = e1 +e2 *100.00;
        double e4 = e3 % 40.00;
        //ternary operator
        boolean isZero = e4==0 ?true: false;
        if (isZero== false){
            System.out.println("print this");

        }
    }
}
