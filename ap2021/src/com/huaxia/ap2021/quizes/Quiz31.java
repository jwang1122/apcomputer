package com.huaxia.ap2021.quizes;

public class Quiz31 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

	private static void question1() {


	}

	private static void question2() {
		// TODO Auto-generated method stub

	}

	private static void question3() {
		// TODO Auto-generated method stub

	}

	private static void question4() {
		// TODO Auto-generated method stub

	}

	private static void question5() {
		Fish Bob = new shark () ;
		System.out.println(Bob.endoskeleton);  
		Bob.action() ; 
	}

}

class Fish
{
    public String endoskeleton = "bone"; 
    public void action ( ) 
    {
        System.out.println ("splash splash") ; 
    }

} 

class shark extends Fish 
{
    public void action() 
    {
        System.out.println("chomp chomp") ; 
    }
    public String endoskeleton = "cartilage"; 
}

