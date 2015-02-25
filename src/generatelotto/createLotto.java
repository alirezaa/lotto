package generatelotto;
import java.util.Random;

public class createLotto {

private static Random randomGenerator = new Random();


 
public static void  main( String args[]){
	createIt();
 }
 
public static void createIt(){
	System.out.println("here");
	 int whiteBallCntr;
	    System.out.println("white balls ---");
	 for (whiteBallCntr=0;whiteBallCntr<5;whiteBallCntr++){
		  int randomInt = randomGenerator.nextInt(57);
		 System.out.print(randomInt+", ");
	 }
	 System.out.println("\n");
	 System.out.println("gold ball ---");
	 for (whiteBallCntr=0;whiteBallCntr<=0;whiteBallCntr++){
		  int randomInt = randomGenerator.nextInt(47);
		 System.out.println(+randomInt);
	 }
}

public static Random getRandomGenerator() {
	return randomGenerator;
}

public static void setRandomGenerator(Random randomGenerator) {
	createLotto.randomGenerator = randomGenerator;
}

 
}