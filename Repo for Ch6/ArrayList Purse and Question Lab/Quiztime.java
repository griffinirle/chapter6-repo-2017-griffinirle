//Justin Borella and Griffin Irle

import Java.util.Scanner;
public class Quiztime
{



    public Quiztime()
    {
    }

    public static void main( String[] args)
    {
        Quiz The_Test = new Quiz();
        Question question1 = new Question();
        ArrayList <Question> quiz = new ArrayList<>();
        System.out.println("Hey there, welcome to the test!");
        System.out.println("How many questions you want?");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("Alright, here we go...");
        quiz = The_Test.getQuestions(answer);
        int length = quiz.length;
        int count = 0;
        int anscount = 0;
        while(count < length)
        {
			System.out.println(quiz[count].getQuestion());
			String newanswer = scan.next();
			if (newanswer.equals(quiz[count].getAnswer()))
			{
				anscount++;
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Incorrect");
			}
			count++;
		}
		System.out.println("Here is your score:");
		System.out.println(anscount + " answers right");



    }

}
