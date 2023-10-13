/* Phase 1 :-
TASK 1 :- BMI Calculator */
import java.util.*;

public class BMI
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kg : ");
        float weight = sc.nextFloat();

        System.out.println("Enter height in meters : ");
        float height = sc.nextFloat();

        float BMI = weight / (height * height);

        if(BMI < 18.5)
        {
            System.out.println("The BMI score is "+BMI+" .The person is Under Weight.");
        }
        else if(BMI >= 18.5 && BMI < 25)
        {
            System.out.println("The BMI score is "+BMI+" .The person is Normal.");
        }
        else if(BMI >= 25 && BMI < 30)
        {
            System.out.println("The BMI score is "+BMI+" .The person is Over Weight.");
        }
        else if(BMI >= 30)
        {
            System.out.println("The BMI score is "+BMI+" .The person is Obese.");
        }
    }
}