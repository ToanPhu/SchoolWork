package testingProj;
//@SuppressWarnings("resource")

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//@SuppressWarnings("unused")

import org.omg.PortableServer.THREAD_POLICY_ID;


public class UniversalMess {
	final static String ESC = "\033[";
	static Scanner sc = new Scanner(System.in);
	public static void GetCard() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("Obtained Card");
	}
	public static void Nothing() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("There is nothing in here..");
		Thread.sleep(2000);
		ShelfA();
		
	}
	public static void NothingB() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("There is nothing in here..");
		Thread.sleep(2000);
		DrawA();
		
	}
	public static void DrawA() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("1.Look at the Top");
		Thread.sleep(100);
		System.out.println("2.Look at the Middle");
		Thread.sleep(100);
	    System.out.println("3.Look at the Bottom");
	    Thread.sleep(100);
	    System.out.println("4.Go back");
		    int i = sc.nextInt();
			if (i == 1) {
		
				
				NothingB();
			}
			if (i == 2) {
			
				GetCard();
			}
			if (i == 3) {

				NothingB();
			}
				if (i == 4) {

				keyCard();
			}
	}
	public static void ShelfA() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("1.Look at the Top of the Shelf");
		Thread.sleep(100);
		System.out.println("2.Look at the Middle of the Shelf");
		Thread.sleep(100);
	    System.out.println("3.Look at the Bottom of the shelf");
	    Thread.sleep(100);
	    System.out.println("4.Go back");
		    int i = sc.nextInt();
			if (i == 1) {
		
				
				Nothing();
			}
			if (i == 2) {
			
				Nothing();
			}
			if (i == 3) {

				Nothing();
			}
				if (i == 4) {

				keyCard();
			}
			
	}
	
	public static void keyCard() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("1. LOOK AT SHELF");
		Thread.sleep(100);
		System.out.println("2. LOOK AT DRAWER");
		int i = sc.nextInt();
			if (i == 1) {
				ShelfA();
				
			}
			if (i == 2) {
			   DrawA();
			}
		
	}
	public static void OverrideSettingsDISP() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		
		System.out.println("You approach the control panel of the space suit, "
				+ "\n Prying it open with the nearest object.");
		Thread.sleep(3000);
		System.out.println("...");
		Thread.sleep(3000);
		System.out.println("You have no electrical or mechanical experiences with the machine, "
				+ "\n you then realise the circuit is too complicated to operate on");
		Thread.sleep(3500);
		Death();
	}
	
	public static void DispatchArea() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("The Space Dispatch Area contains Space Suits. "
				+ "\n However they require the keycard to unlock the suit power.");
		Thread.sleep(2000);
		System.out.println("1. LOOK AROUND FOR THE KEYCARD");
		System.out.println("2. ATTEMPT TO OVERRIDE THE MAINFRAME");
		int i = sc.nextInt();
			if (i == 1) {
				keyCard();
				//System.out.println("1.LOOK AROUND FOR THE KEYCARD");
				
			}
			if (i == 2) {
				//System.out.println("2. ATTEMPT TO OVERRIDE THE MAINFRAME");
				OverrideSettingsDISP();
			}
			
	}
	public static void UtilityRoom(){
		
	}
		
	public static void CntrlPanel() throws InterruptedException{
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("The Control Panel is warning you that there is a"
				+ "\n oxygen leakage in the space ship.");
		Thread.sleep(2000);
		System.out.println("You find it slightly difficult to breathe.");
		Thread.sleep(2000);
		System.out.println("1.HEAD TO UTILITY ROOM");
		System.out.println("2.HEAD TO SPACE DISPATCH");
			int i = sc.nextInt();
			if (i == 1) {
		
				//System.out.println("1.HEAD TO UTILITY ROOM");
				UtilityRoom();
			}
			if (i == 2) {
			//	System.out.println("2.HEAD TO SPACE DISPATCH");
				DispatchArea();
			}
	}
	public static void NAMEOFMETHOD(){
		
	}
	
	
	public static void Death() throws InterruptedException  {
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("You start to feel dizzy, as ice forms presents itself on your eye, nose, hands.");
				Thread.sleep(1000); //Wait		
				System.out.println("\n Your heart.");
				Thread.sleep(1000); //Wait	
				System.out.println("\n Beating slower.");
				Thread.sleep(1000); //Wait	
				System.out.println("\n And slower.");
				Thread.sleep(1000); //Wait	
				System.out.println("\n Deprived of O X Y G E N.");
				Thread.sleep(2000);
				System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("Game Restarting.");
				Thread.sleep(1000);
				System.out.println("Game Restarting..");
				Thread.sleep(1000);
				System.out.println("Game Restarting...");
				Thread.sleep(1000);
				System.out.println("Game Restarting.");
				Thread.sleep(1000);
				System.out.println("Game Restarting..");
				Thread.sleep(1000);
				System.out.println("Game Restarting...");
				Thread.sleep(1000);

				Introduction();
		
		//Options
				
	} //FunctionClose -----------------------------------------------------
	
	
	public static void Introduction() throws InterruptedException {
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
				+ "__________________________________________________________");
		System.out.println("\n"
				+ "Alarms siren, And red lights flash around your room, \n"
				+ "you struggle to breathe as you get cold. \n"
				+ "You feel this throbbing pressure on your ear.");
		
			System.out.println("1.LOOK AT CONTROL PANEL");
			System.out.println("2.WAIT");
			System.out.println("\n");
			
				int i = sc.nextInt();
						if (i == 1) {
							//		System.out.println("1.LOOK AT CONTROL PANEL.");
							CntrlPanel();
						}
						if (i == 2) {
							//	System.out.println("2.WAIT.");
							Death();
						}
		//Options
				
	} //FunctionClose -----------------------------------------------------


	public static void main(String args[]) throws InterruptedException, IOException {
		// String Letters;
		
		System.out.println("The game is tailored to how you play. Select your choices by typing the number");
	Thread.sleep(2000); //Wait
	System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n"
			+ "__________________________________________________________");
		System.out.println("O X Y G E N");
	Thread.sleep(3000);
		
		
		Introduction(); // Initiates function - Introduction

	
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




