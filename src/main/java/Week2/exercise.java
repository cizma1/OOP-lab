package Week2;


import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        //EXERCISE 1
        //String password="carrot";

        //while(true){
            //System.out.print("Type the password: ");
            //String text=reader.nextLine();

            //if(text.equals(password)){
                //System.out.println("Right!");
                //System.out.print("The secret is: jryy qbar!");
                //break;
            //}
            //else{
                //System.out.println("Wrong!");
            //}
        //}

        //EXERCISE 2
        //int sum=0;
        //int read;

        //System.out.println("Type the first number: ");
        //read=reader.nextInt();
        //sum+=read;

        //System.out.println("Type the second number: ");
        //read=reader.nextInt();
        //sum+=read;

        //System.out.println("Type the third number: ");
        //read=reader.nextInt();
        //sum+=read;

        //System.out.println("Sum: " + sum);

        //EXERCISE 3
        //int sum=0;
        //while (true){
            //int read=Integer.parseInt(reader.nextLine());
            //if(read==0){
                //break;
            //}
            //sum+=read;
            //System.out.println("Sum now: "+sum);
        //}
        //System.out.println("Sum in the end: "+sum);

        //EXERCISE 4
        //System.out.print("First: ");
        //int number1=reader.nextInt();

        //System.out.print("Second: ");
        //int number2= reader.nextInt();

        //while(number1<=number2){
            //System.out.println(number1);
            //number1++;

            //if(number1>number2){
                //System.out.println(" ");
            //}
        //}

        //EXERCISE 5
        //System.out.print("Type a number: ");
        //int power= reader.nextInt();

        //int sum=0;
        //for(int i=0;i<=power;i++){
            //int number=(int)Math.pow(2,i);
            //sum+=number;
        //}
        //System.out.println("The result is "+sum);

        //EXERCISE 6
        //printText();

        //EXERCISE 7
        //printStars(5);
        //printStars(3);
        //printStars(9);

        //EXERCISE 8
        //drawStarsPiramid(5);

        //EXERCISE 9
        //drawStarsPiramid(10);

        //EXERCISE 10
        int guess=0;
        int number=1+(int)(100*Math.random());
        while(true){
            guess++;
            System.out.print("Guess a number: ");
            int number1= reader.nextInt();

            if (number1 < number) {
                System.out.println("The number is greater, guesses made: " + guess);

            }

            else if (number1 > number) {
                System.out.println("The number is lesser, guesses made: " + guess);
            }

            else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
      }

      //FOR EXERCISE 9
      //public static void drawStarsPiramid(int numberofRows){
        //for(int i=1;i<=numberofRows;i++){
            //for(int j=1;j<=i;j++){
                //System.out.print(j+" ");
            //}
            //System.out.println();
        //}
      //}

      //FOR EXERCISE 8
      //public static void drawStarsPiramid(int numberofRows){
        //for(int i=1;i<=numberofRows;i++){
            //for(int j=1;j<=i;j++){
                //System.out.print("* ");
            //}
            //System.out.println();
        //}
      //}

      //FOR EXERCISE 7
      //public static void printStars(int amount){
        //for(int i=1;i<=amount;i++){
            //System.out.print("*");
        //}
          //System.out.println();
      //}

      //FOR EXERCISE 6
      //public static void printText(){
          //System.out.println("In the beginning there were the swamp, the hoe and Java.");
    //}
    }
