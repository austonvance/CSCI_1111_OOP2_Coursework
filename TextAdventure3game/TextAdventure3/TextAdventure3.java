import java.util.Scanner;
import java.util.Random;


public class TextAdventure3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		int min = 500;
		int max = 800;
		String[] addEquipment = {"knife","phone","butter"};
		
		
		while (user != 1 && user != 2) {
			System.out.println("--Translating into native language--");
			System.out.println("Welcome. Would you like to accept the incoming transmission?");
			System.out.println("Please press 1 for yes or 2 for no.");
			
			user = input.nextInt();
		
		
				if (user == 1) {
					System.out.println("I cant believe I got through! You need to help me. My name is Tom and I just crash landed on a planet and my mapping system is not working. I need to get to the next safe site for a rescue team to come get me and I need your help to get me there alive.");
					
				System.out.println("Please press 1 to continue message.");
			
					
					user = input.nextInt();
					
					if (user == 1) {
						System.out.println("First off, I want to thank you for helping me. Second is, I think I have a concussion. Im not thinking straight at the moment. My computer is saying I have about"); 
						double a = Math.random()*(max - min + 1)+ min;
						System.out.print(a);
						System.out.println(" hours left of life support in my suit.");
						System.out.println("As for equipment I only have my E.A.S.I.(Environment Adventure Suit Insulator) suit and");
						
						System.out.println(addEquipment [0]);
						System.out.println("But I really hope that I don't need to use the knife on anything, or anyone.");
						System.out.println("");
						System.out.println("Please press 1 to continue message.");
					}

							user = input.nextInt();
					
							if (user == 1) {
								System.out.println("Should I stay in the crash site or should I start heading west to the rescue site?");
					
								System.out.println("Press 1 to stay or 2 to leave.");
							}
									user = input.nextInt();
					
				
					
				if (user == 2){ 
					System.out.println("Ok I will start heading west to the rescue cite. Ill try to stay awake while Im walking.");
					System.out.println("--1 hour later--");
					System.out.println("You still there? I think I found something that is a bit life threatening.  My wrist computer is telling me it is a big piece of shale that is on the way to the rescue cite. should I try to go across it, or go around it and risk more time spent traveling and less life support?");
				}
			
						if (user == 1) {
							System.out.println("Tom stays in the crashed ship and falls asleep with a concussion. He dies in his sleep.");
							System.out.println("Tom died. You just killed someone. good job.");
							System.out.println("--Transmission End--");
							break;
						}
			
			
				System.out.println("Press 1 to cross or 2 to go around.");
					user = input.nextInt();
					if (user == 1){
						System.out.println("Ok, Im going to try crossing the shale. It looks very unstable but if your sure...");
						System.out.println("*you hear a cracking sound followed by a lot of grunting*");
						System.out.println("-2 hours later-");
						System.out.println("Uh what happened? AAGHH my legs! Both my legs are broken! There is bone sticking through the suit! uuuuhhhh I don't feel right.");
						System.out.println("==life support failing==");
						System.out.println("Tom has died. good job you successfully killed Tom and made him shorter. You monster.");
						System.out.println("--Transmission End--");
						break;
					
					}
					
					if (user == 2){
						System.out.println("Good thinking. Going around sounds like a smart move. It looks like it will be a bit before I actually get around this shale so I will contact you when Im past this obstacle.");
						System.out.println("-30 minutes later-");
						System.out.println("That was a bit of a walk. It looks like a straight shot to the rescue site. I'll contact you if something comes up.");
						System.out.println("-4 hours later-");
						System.out.println("There are some mountains coming up. Looks like there might be a path up the mountain and also a cave near the base.");
						
					}
					System.out.println("Press 1 to enter the cave or 2 to hike up the mountain.");
					user = input.nextInt();
					
						if (user == 1){
							System.out.println("The cave it is then! I really hope there isn't anything living on this planet that could be in there.");
							System.out.println("So far so good. The cave has a bunch of this glowing stuff on the roof of the cave and lights it up enough I can see a bit.");
							System.out.println("Im feeling really tired. I really need to lay down and get some sleep.");
							System.out.println("Should I continue going deeper into the cave or stop to sleep?");
							
							
						}
					
						if (user == 2){
							System.out.println("The mountain looks like a very long trek up... you sure? well you haven't let me die yet so I guess ill keep following your great ideas");
							System.out.println("");
							System.out.println("-4 hours later-");
							System.out.println("*pant* I dont think *pant* that Im going *pant* make it to the top of *pant* the mountain *pant*");
							System.out.println("-Tom slips on some loose gravel and falls all the way to the bottom of the mountain and cracks open his helmet-");
							System.out.println("-Tom has died. didn't think the mountain had loose gravel did you.-");
							System.out.println("--Transmission End--");
							break;
							
						}
					
					
					
					System.out.println("Press 1 to go deeper into the cave or 2 to take a nap.");
						user = input.nextInt();
						if (user == 1){
							System.out.println("Im going to head beeper into the cave. Hopefully there is a way through the mountain.");
							System.out.println("The tunnel is pretty big and long so I'll contact you if anything comes up. ");
							System.out.println("-15 minutes later-");
							System.out.println("You there! I can feel the ground shaking! Its either an earth quake or I guess an unknown planet quake or something very large coming toward me. ");
							System.out.println("What should I do!");
														
							
						}
					
						if (user == 2){
							System.out.println("Your right. a nap would be great right now.");
							System.out.println("-30 minutes later-");
							System.out.println("");
							System.out.println("-4 hours later-");
							System.out.println("-Tom had died. Didn't you know that you shouldn't fall asleep with a concussion before getting medical help?-");
							System.out.println("--Transmission End--");
							break;
							
						}
					
					System.out.println("Press 1 to hide behind some rocks or 2 for the Intimidation technique.");
						user = input.nextInt();
						if (user == 1){
							System.out.println("Great! Common sense says to hide from giant things.");
							System.out.println("-Tom hides behind a large rock-");
							System.out.println("*loud grunting and footsteps come closer and eventually pass Tom by*");
							System.out.println("Holy $#%& (swearing filtered out for convience) did you see how big that thing was! Of course not your just a voice in my head but it was huge and an alien! There is actually alien life out in space! But for now I need to survive long enough to report this and save my life. ");
							System.out.println("I guess my only choice is to head deeper into the cave. There is no way Im going back and running into that creature again.");
							System.out.println("If something comes up again i'll just hide like last time.");
							System.out.println("");
							System.out.println("So apparently this tunnel goes straight through this mountain. Like no turns or inclines or anything, just straight. It's actually super convenient.");
							System.out.println("Im finally out of the tunnel. And I can see the rescue site! now all I have to do is wait and stay alive long enough for the rescue team to arrive.");
							
							
						}
					
						if (user == 2){
							System.out.println("Intimidation always works against things that are bigger than you.");
							System.out.println("When it gets closer ill jump out and use the guaranteed intimidation technique that my grandfather taught me when I was younger. ");
							System.out.println("*Tom jumps out in-front of the creature, followed by a lot of screeching, grunting, spitting and rapid hand movements.");
							System.out.println("Tom has died.  Didn't think to take off your helmet before yelling and spitting at a giant monster did you.");
							System.out.println("");
							System.out.println("--Transmission End--");
							break;
						}
					
					System.out.println("Press 1 for Tom to wait for the rescue team or 2 for more adventure...");
						user = input.nextInt();
						if (user == 1){
							System.out.println("Your right! I'll just wait for the rescue team. No sense in continued exploration of a foreign planet with alien life on it without equipment");
							System.out.println("-Hours later-");
							System.out.println("*loud engines roaring and coming closer*");
							System.out.println("Holy $#%& (swearing filtered out for convience) they are actually here! Thank you so much for helping me survive for so long! I really owe you a lot who every you are.");
							System.out.println("");
							System.out.println("Tom successfully lives. Finally an ending that doesn't result in Toms gruesome demise.");
							System.out.println("--Transmission End--");
							break;
							
							
							
						}
					
						if (user == 2){
							System.out.println("No your right! Im the first person to discover alien life. I need to discover more and be even more famous.");
							System.out.println("Lets get exploring.");
							System.out.println("");
							
							System.out.println("");
							
							
						}
					
					
					System.out.println("Press 1 to continue?");
						user = input.nextInt();
						if (user == 1){
							System.out.println("-Alert! Alert! Air filter failing! Recommend replacement of air filter in the next 5 minutes.-");
							System.out.println("I need... to replace... my filter...");
							System.out.println("-The area of the filter needs to be about 1100 to properly fit in the suit.-");
							
							{
							// Create an array of five GeometricObjects
							GeometricObject[] triangles = {new Triangle(4, 5, 6), new Triangle(14, 15, 16), 
								new Triangle(8, 9, 10), new Triangle(12, 13, 14), new Triangle(10, 11, 12)};
							
							// Display the area and invoke the howToColor 
							// method for each GeometricObject
							for (int i = 0; i < triangles.length; i++) {
								System.out.println("\nTriangle #" + (i + 1));
								System.out.println("Area: " + triangles[i].getArea());
								
							} 
						}
						
							
						
						
						System.out.println("Which filter triangle should I use? Im not doing very good at the moment. My vision is blurred and it's getting harder to think.");
					
			
						
						}
							
							
						
					
						System.out.println("-Select triangle filter 1-5 for the correct air filter for the suit.-");
							user = input.nextInt();
							if (user == 1){
								System.out.println("Its not fitting! Why wont it fit! *gasp* I cant *gasp* breath!");
								System.out.println("Tom suffocated because you couldn't remember the correct number. Nice going stupid.");
								System.out.println("--Transmission End--");
								break;
							}
							
							if (user == 2){
								System.out.println("Thank God that you picked the correct size for me to still be able to breath. I cant imagine what would have happened if you forgot the number that was shown to you just a few seconds ago.");
								System.out.println("Now that I can breath properly, at least for now, lets go explore some more! Now I will start going west and see what I will come across. Don't worry the rescue team will be here in... a very long time. OK. I will just have to remember this location and come back to it when the timer for the rescue team goes off in... a very long time. OK no need to panic jus need to focus on the adventure and discovery on this hopefully not completely desolate planet.");
								
								
							}
					if (user == 3){
						System.out.println("Its not fitting! Why wont it fit! *gasp* I cant *gasp* breath!");
						System.out.println("Tom suffocated because you couldn't remember the correct number. Nice going stupid.");
						System.out.println("--Transmission End--");
						break;						
						
						
					}
					if (user == 4){
						System.out.println("Its not fitting! Why wont it fit! *gasp* I cant *gasp* breath!");
						System.out.println("Tom suffocated because you couldn't remember the correct number. Nice going stupid.");
						System.out.println("--Transmission End--");
						break;						
						
						
					}
					if (user == 5){
						System.out.println("Its not fitting! Why wont it fit! *gasp* I cant *gasp* breath!");
						System.out.println("Tom suffocated because you couldn't remember the correct number. Nice going stupid.");
						System.out.println("--Transmission End--");
						break;						
						
						
					}
					
					
					
					
					System.out.println("Press 1 to check in with Tom. or Press 2 to wait until something interesting or unusual happens.");
						user = input.nextInt();
						if (user == 1){
							System.out.println("Yes I'm still here and yes I'm still walking. There might be some sort of forrest or jungle on the horizon if I'm not mistaken, or it's the carbon dioxide poisoning.");
							
							
							
						}
					
					if (user == 2){
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("-Please insert more change to extend call to... Tom.-");
							System.out.println("-But your on your little computer and that little hole in the back isn't actually for change is it. Well I just made you check your computer and if your that dumb then I'm cutting you off.-");
							System.out.println("--Transmission End--");
						
							
							break;
							
						}
					
								
					
								System.out.println("Press 1 to check in again.");
									user = input.nextInt();
									if (user == 1){
										System.out.println("So I just walked into a forrest. I know I must be dreaming or not seeing straight but I just walked into a tree! An actual tree! Im going to start exploring the forrest and see what I can find.");
										
										
										
									}
					
					
								System.out.println("Press 1 to check in with Tom again.");
									user = input.nextInt();
									if (user == 1){
									System.out.println("So the forrest is pretty big and there are a ton of weird and unique plants here. Lots of giant trees and strange flowers.");
									System.out.println("With so much plant life I am starting to wonder if I could just take off my helmet and be fine here. I don't have any device or sensor to tell if I wont die. Should I risk it?");
									
									}
																		
																		
					
								System.out.println("Press 1 to keep the helmet on or 2 to take the helmet off.");
									user = input.nextInt();
									if (user == 1){
									System.out.println("OK fine I'll keep the helmet on. No way I'm taking the chance of being dead. but i don't have that much left of my air supply with no other filters that can fit. I guess i'll keep exploring until I die or get rescued and have the time left to think about what I have been doing with my life.");
									System.out.println("-Many hours of breathing and exploring later-");
									System.out.println("My life support is about to run out. These are my final words... tell my wife I....");
									System.out.println("-Life support fail-");
									System.out.println("-Life support fail-");
									System.out.println("-Tom has died-");
									System.out.println("-tell your wife what? that you thought she smelled ugly? ok ill tell her for you-");
									System.out.println("--Transmission End--");
									break;
									}
					
									if (user == 2){
									System.out.println("OK fine! on 3.");
									System.out.println("1...");
									System.out.println("2...");
									System.out.println("3!");
									System.out.println("*gasp* *gasp* *gasp* I cant breath!... Just kidding! its supprisingly easy to breath here. And it smells a little like mint! How refreshing!");
									System.out.println("WOW look at that flower! Its so beautiful. ");
									System.out.println("Its so bezutiful...");
									System.out.println("so beeutifool..");
									System.out.println("beiutifoul and tasty");
									
									
									}
								
								
								
								System.out.println("Press 1 to yell at Tom to get him back to his senses or 2 to eat the beeutifool flowers!");
									user = input.nextInt();
									if (user == 1){
										System.out.println("!!!");
										System.out.println("AAHH this thing has teeth and the flower soo good looking");
										System.out.println("Stop that! I need to get out of here and stop looking at these flowers and start looking for something edible for food");
										System.out.println("This fruit looks ok i guess. it looks like a peach but with blue spots on it. Im going to take a bite out of it");
										
										
										
									}
					
								if (user == 2){
										System.out.println("...");
										System.out.println("!!!");
										System.out.println("*CRUNCH*");
										System.out.println("-Tom has been eaten by a very bootiful flower, flowers are so good for looking at-");
										System.out.println("--Transmission End--");
										break;
									
									}
								
								System.out.println("Press 1 to eat the mystery fruit? or 2 to test it out like a normal person");
									user = input.nextInt();
									if (user == 1){
										System.out.println("Wow this tastes like caramel popcorn my favorite!");
										System.out.println("my stomach doesn't feel so good.");
										System.out.println("I need a bathroom now!!");
										System.out.println("-Tom just had the biggest bowel movement of his life, he would be lucky if he didn't pass a bone or two with that one-");
										System.out.println("-Tom has died and is now lacking one or two necessary bones-");
										System.out.println("--Transmission End--");
										
										
										break;
									}
					
								if (user == 2){
										System.out.println("What am I thinking! first you rub it on your skin to see if it irritates it.");
										System.out.println("...");
										System.out.println("my skin just started to melt a little.");
										System.out.println("Glad i didn't put that inside of my body. let's try to find something else that may be edible.");
									System.out.println("Do you hear that? it's like a sort of ticking sound but a little slow like one and a half ticks. What is that sound?");
									
									}
								
								System.out.println("Press 1 to look for the mysterious ticking noise. or 2 to ignore the obvious distraction.");
									user = input.nextInt();
									if (user == 1){
										System.out.println("What is that ticking noise I must find it.");
										System.out.println("its almost coming from inside this strange tree.");
										System.out.println("I found it! it's weirdly shaped and has actual shapes instead of clock hands on it.");
										System.out.println("Its also kind of slow for a clock and one of the shapes keeps disappearing and reappearing but never in the same spot.");
										System.out.println("What could this possibly be used for??");
										System.out.println("I will try to send you an image of the thing but the image might be very simplistic because of the distance.");
										System.out.println("--Go to your desktop and open the file called Exercise1819 Sierpinski triangle--");
										System.out.println("After examining this thing... I have no idea what this is supposed to do.");
										System.out.println("It looks like a triangle made out of triangles that has a ticking sound coming from it but it also has a dial that increases the number of triangles inside of the other triangles.");
										System.out.println("This is so confusing! But its something mysterious and I");
									}
										
					
								if (user == 2){
										System.out.println("I mean come on! it's just a ticking noise, maybe it's just in my head because of the strange atmosphere.");
										System.out.println("...");
										System.out.println("yes I think it was just in my head. Im going to move on.");
										System.out.println("Ooohh maybe there is an ancient temple here with secret passage ways! I cant wait!");
									
									break;
									}
						
						System.out.println("Press 1 to look for the mysterious ticking noise. or 2 to ignore the obvious distraction.");
							user = input.nextInt();
							if (user == 1){
								System.out.println("What is that ticking noise I must find it.");
								System.out.println("its almost coming from inside this strange tree.");
								System.out.println("I found it! it's weirdly shaped and has actual shapes instead of clock hands on it.");
								System.out.println("Its also kind of slow for a clock and one of the shapes keeps disappearing and reappearing but never in the same spot.");
								System.out.println("What could this possibly be used for??");
								System.out.println("I will try to send you an image of the thing but the image might be very simplistic because of the distance.");
								System.out.println("--Go to your desktop and open the file called Exercise1819 Sierpinski triangle--");
							}
					
					
						if (user == 2){
								System.out.println("I mean come on! it's just a ticking noise, maybe it's just in my head because of the strange atmosphere.");
								System.out.println("...");
								System.out.println("yes I think it was just in my head. Im going to move on.");
								System.out.println("Ooohh maybe there is an ancient temple here with secret passage ways! I cant wait!");
							
							break;
							}
					
								
								
								
								
								
								
					
					
					
					}
					
					
					
						else {  System.out.println("Ok, good bye.");
							System.out.println("--Transmission ended--");
						
					
						}
				
				
				
				
				
				
		
	
						
		
		
		
		}
	}
}
abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	
	/**Default construct*/
	protected GeometricObject() {
	}
	
	/**Construct a geometric object*/
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	/**Getter method for color*/
	public String getColor() {
		return color;
	}
	
	/**Setter method for color*/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**Getter method for filled. Since filled is boolean,
			so, the get method name is isFilled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**Setter method for filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**Abstract method findArea*/
	public abstract double getArea();
	
	/**Abstract method getPerimeter*/
	public abstract double getPerimeter();
	
	public abstract String howToColor();
}

class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSideOne() {
		return this.side1;
	}
	
	public double getSideTwo() {
		return this.side2;
	}
	
	public double getSideThree() {
		return this.side3;
	}
	
	public double getArea() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return Math.sqrt(perimeter * (
				(perimeter - this.side1) * 
				(perimeter - this.side2) * 
				(perimeter - this.side3)));
		
		
	}
	
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	public String howToColor() {
		return "Color all three sides";
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 +
				" side3 = " + this.side3;
	}
}
	
	