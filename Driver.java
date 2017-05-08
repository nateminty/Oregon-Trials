import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Driver 
{

	public static void main(String[] args) 
	{
		String partyMembers [] = {"Clyde", "Margie", "Baxter"};
		Random gen = new Random();
		
		 ImageIcon icon = new ImageIcon("/Users/nate/Desktop/oregontrialpic.jpg");
		 ImageIcon stickfam = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/stickFam.gif");
		 ImageIcon img = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/heartIcon.png");
		 ImageIcon canteen = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/emptyCanteen.jpg");
		 ImageIcon cactus = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/cactus.jpeg");
		 ImageIcon village1 = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/village1.jpeg");
		 ImageIcon thermometer = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/thermometer.jpeg");
		 ImageIcon meat = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/meat.png");
		 ImageIcon shoppe = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/YeOldeShoppe.jpg");
		 ImageIcon cold = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/cold.jpeg");
		 ImageIcon desert = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/desert.png");
		 ImageIcon bandit = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/banditCamp.jpg");
		 ImageIcon watercrossing = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/waterCrossing.jpeg");
		 ImageIcon net = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/net.jpeg");
		 ImageIcon gun = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/pixGun.jpg");
		 ImageIcon necklace = new ImageIcon("/Users/nate/Desktop/Oregon Trial Pics/necklace.jpeg");
		
		String[] choices1 = {"Right Trail", "Left Trail", "Check Stats"};
		String [] choices2 = {"Right Trail", "Left Trail"};
		String[] choices3 = {"Dig Up", "Move On", "Check Stats"};
		String [] choices4 = {"Dig Up", "Move On"};
		String [] merchants  = {"Chef", "Cocktail Mixer","Salesman","Leave Village"};
		String [] salesman = {"Buy", "Pass"};
		String [] BANDITcamp = {"Fight to save Clyde", "Sneak out"};
		String[] river = {"Use the Vine", "use the Raft", "Pay for the Ferry"};
		String [] raftProb = {"Reach out and save Baxter", "Get onto the riverbank"};
		String[] riverNo$ = {"Use the Vine", "Use the Raft"};
		String [] merch2  = {"Chef", "Cocktail Mixer","Salesman","Blacksmith","Jeweler","Leave Village"};
		String[] margieclydevill = {"Hospital", "Ye Olde Shoppe"};
		String [] mug = {"Rob Them", "Pass Them"};
		String[] nacamp = {"Negotiate", "Run", "Fight"};
		String[] mountain = {"Pay the Sherpa", "Climb the Mountain", "Buy the Lamp"};
		
		Clyde clyde = new Clyde();
		Margie margie = new Margie();
		Baxter baxter = new Baxter();
		
		String currentLocation = "Trail";
		int balance = 10;
		boolean hasGun = false;
		boolean hasNet = false;
		boolean hasShield = false;
		boolean hasJewel = false;
		
		
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	ge.getAllFonts();
	JLabel text = new JLabel("Choose a Trail or Check Stats?");
	text.setFont(new Font("Eurostile", Font.PLAIN, 24));	
	
	int input1 = JOptionPane.showOptionDialog(null, text, "Oregon Trial", 0, 0, icon, choices1, 0);
	
	if(input1 == 0 || input1 == 1)
	{
		int fiftyfifty = gen.nextInt(2);
		
		if (fiftyfifty == 0)
		{
			JOptionPane.showMessageDialog(null, "<html>The sun beats down on your family, and a tumbleweed rolls by.<br>Lose one thirst for ALL.<html>", "Scenario", 0, desert);
			clyde.setThirst(9);
			margie.setThirst(9);
			baxter.setThirst(9);
		}
		else
			JOptionPane.showMessageDialog(null,"You continue on, hoping the temperature doesn't rise", "Scenario", 0, thermometer);
			
	}
	else if(input1 == 2)
	{
		String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();
		
		JOptionPane.showMessageDialog(null, "<html>" + partyMembers[0] + "<br>" + partyMembers[1] + "<br>" + partyMembers[2], "Party", 0, stickfam );
		JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
		
		
		JOptionPane.showOptionDialog(null, text, "Oregon Trial", 0, 0, icon, choices2, 0);
		
		int fiftyfifty = gen.nextInt(2);
		
		if (fiftyfifty == 0)
		{
			JOptionPane.showMessageDialog(null, "The sun beats down on your family, and a tumbleweed rolls by. Lose one thirst for ALL.", "Scenario", 0, desert);
			clyde.setThirst(9);
			margie.setThirst(9);
			baxter.setThirst(9);
		}
		else
			JOptionPane.showMessageDialog(null,"You continue on, hoping the temperature doesn't rise", "Scenario", 0, thermometer);
		
	}
	
	//
	//
	//

	JOptionPane.showMessageDialog(null, "You come across a cacti field, and remember that cacti have water in their roots. Dig up the bulbs or Move on", "Choose Path", 0, icon);
	
	int input3 = JOptionPane.showOptionDialog(null, text, "Oregon Trial", 0, 0, icon, choices3, 0);
	
	if(input3 == 0)
	{
		JOptionPane.showMessageDialog(null, "You get close to the cactus and successfully pull up the bulbs! Congrats! Gain a Thirst for ALL","Scenario", 0, cactus);
		clyde.setThirst(10);
		margie.setThirst(10);
		baxter.setThirst(10);
	}
	else if(input3 == 2)
	{
		String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();

		JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
		
		
		int input4 = JOptionPane.showOptionDialog(null, text, "Oregon Trial", 0, 0, icon, choices4, 0);
		
		if(input4 == 0)
		{
			JOptionPane.showMessageDialog(null,"You get close to the cactus and successfully pull up the bulbs! Congrats! Gain a Thirst for ALL","Scenario", 0, cactus);
			clyde.setThirst(10);
			margie.setThirst(10);
			baxter.setThirst(10);
		}
		
		else if(input4 == 1)
		{
			JOptionPane.showMessageDialog(null, "You continue on, but Baxter is too thirsty. He lunges out and gulps down all of your water. Baxter gain ONE THIRST. Margie and Clyde LOSE ONE THIRST.", "Scenario", 0, canteen);
			baxter.setThirst(baxter.getThirst() + 1);
			margie.setThirst(margie.getThirst() - 1);
			clyde.setThirst(clyde.getThirst() - 1);
			
		}
		
	}
	 else if(input3 == 1)
	{
		JOptionPane.showMessageDialog(null, "You continue on, but Baxter is too thirsty. He lunges out and gulps down all of your water. Baxter gain ONE THIRST. Margie and Clyde LOSE ONE THIRST.", "Scenario", 0, canteen);
	}
	
	//
	//
	//
	
	int meatSpoil = gen.nextInt(3);
	
	if(meatSpoil <= 2) 
	{
		JOptionPane.showMessageDialog(null, "As the heat increases, some of your meat spoils, and you go for three days without food. Lose TWO health for ALL", "Scenario", 0, meat);
		clyde.setHealth(clyde.getHealth() - 2);
		margie.setHealth(margie.getHealth() - 2);
		baxter.setHealth(baxter.getHealth() - 2);
	}
	
	//
	//
	//
	
	JOptionPane.showMessageDialog(null, "Luckily, you find another crossroads, and hear humanoid noise coming from the left.");
	int input5 = JOptionPane.showOptionDialog(null, text, "Oregon Trial", 0, 0, icon, choices1, 0);
	
	if(input5 == 0)
	{
			JOptionPane.showMessageDialog(null, "Fortunately, you find a village", "Scenario", 0, village1);
			currentLocation = "Village";
	}
	
	else if(input5 == 2)
	{
		String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();

		JOptionPane.showMessageDialog(null, "<html>" + partyMembers[0] + "<br>" + partyMembers[1] + "<br>" + partyMembers[2], "Party", 0, stickfam);
		JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
		
		
		int input6 = JOptionPane.showOptionDialog(null, "Choose a Trail", "Oregon Trial", 0, 0, icon, choices2, 0);
		
		if(input6 == 0)
		{
			JOptionPane.showMessageDialog(null,"Fortunately you find a village", "Scenario", 0, village1);
			currentLocation = "Village";
		}
		
		else if(input6 == 1)
		{
			JOptionPane.showMessageDialog(null,"You happen upon a Bandit camp", "Scenario", 0);
			currentLocation = "NA Camp";
		}
		
	}
	
	//
	//
	//
	
	if(currentLocation.equals("Village"))
	{
		JOptionPane.showMessageDialog(null, "You find refuge at an inn, gain ONE HUNGER and THIRST");
		clyde.setHealth(clyde.getHealth() + 1);
		clyde.setThirst(clyde.getThirst() + 1);
		
		margie.setHealth(margie.getHealth() + 1);
		margie.setThirst(margie.getThirst() + 1);
		
		baxter.setHealth(baxter.getHealth() + 1);
		baxter.setThirst(baxter.getThirst() + 1);
		
		//
		//
		//
		
		JOptionPane.showMessageDialog(null, "You enter a shop with " + balance + " coins.");
		int input10 = JOptionPane.showOptionDialog(null, "Choose a Merchant", "Ye Olde Shoppe", 0, 0, shoppe, merchants, 0);
		
		if(input10 == 0)
		{
			JOptionPane.showMessageDialog(null, "You buy a meal for 3$, everyone gets ONE health");
			balance = balance - 3;
			clyde.setHealth(clyde.getHealth() + 1);
			margie.setHealth(margie.getHealth() + 1);
			baxter.setHealth(baxter.getHealth() + 1);
			
			JOptionPane.showMessageDialog(null, "You set off, leaving the village");
		}
		else if(input10 == 1)
		{
			JOptionPane.showMessageDialog(null, "You buy drinks 3$, everyone gets ONE THIRST");
			balance = balance - 3;
			clyde.setThirst(clyde.getThirst() + 1);
			margie.setThirst(margie.getThirst() + 1);
			baxter.setThirst(baxter.getThirst() + 1);
			
			JOptionPane.showMessageDialog(null, "You set off, leaving the village");
		}
		else if(input10 == 2)
		{
			int salesman1 = JOptionPane.showOptionDialog(null, "The salesman tells you that when you leave the village it will get cold. He offers you sweaters for 3$ each. Buy?", "Salesman", 0,0, cold, salesman,0);
			if(salesman1 == 0)
			{
				balance = balance - 9;
				JOptionPane.showMessageDialog(null, "You leave the village with your warm sweater");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
		}
		else 
			{
				JOptionPane.showMessageDialog(null, "You set off, heading toward the setting sun");
				JOptionPane.showMessageDialog(null, "As you leave the village, you hear locals talking about the upcoming heatwave, and realize you got scammed out of your money.");
			}
	}
	
	if(currentLocation.equals("NA Camp"))
	{
		JOptionPane.showMessageDialog(null, "The Bandits take Clyde and torture him to 5 HEALTH and Margie and Baxter to 5 THIRST.");
		clyde.setHealth(5);
		margie.setThirst(5);
		baxter.setThirst(5);
		
		int BanditCamp = JOptionPane.showOptionDialog(null, "The Bandits are about to kill Clyde. What shoud Margie and Baxter do?", "Bandit Camp", 0, 0, bandit, BANDITcamp, 0);
		
		if(BanditCamp == 0)
		{
			JOptionPane.showMessageDialog(null, "Baxter and Margie rise up and rebel against the camp. Baxter and Margie lose 2 HEALTH, but rescue Clyde.");
			baxter.setHealth(baxter.getHealth() - 2);
			margie.setHealth(margie.getHealth() - 2);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Margie and Baxter slip away unnoticed,and leave Clyde to die. Then, Baxter finds apple tree, so he and Margie gain 1 HEALTH.");
			partyMembers [0] = "None";
			baxter.setHealth(baxter.getHealth() + 1);
			margie.setHealth(margie.getHealth() + 1);
		}
	}
	
	
	//
	//
	/*{"Clyde", "baxter", "Margie"}
	{
		print("Margie, Clyde and Baxter...
	}
	
	{"Baxter","Margie"}
	{
		print("Margie and Baxter...
	}
	
	{"Margie"}
	{
	
	}
	*/
	
	int riverCross = JOptionPane.showOptionDialog(null, "You come to a river and see a village across its rapids. There is a raft, but the river is violent, and a vine, that looks like it could break at any moment. Finally, there is a Ferry for 3$", "River Crossing", 0, 0, watercrossing, river, 0);
	
	if(riverCross == 0)
	{
		if(partyMembers[0].equals("None"))
		{
			JOptionPane.showMessageDialog(null, "Baxter makes it across the river, but Margie falls in. Baxter rescues her, but she loses 3 HEALTH");
			margie.setHealth(margie.getHealth() - 3);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Baxter and Clyde make it across the river, but Margie falls in. Baxter and Clyde rescue her, but she loses 3 HEALTH");
			margie.setHealth(margie.getHealth() - 3);
		}
	}
	
	else if(riverCross == 1)
	{
		if(partyMembers[0].equals("None"))
		{
			int raft = JOptionPane.showOptionDialog(null, "<html>The raft gets whisked away by the current and flips over. Margie is quickly approaching spikey rocks sticking out of the water.<br>Baxter can't swim and is struggling next to Margie.<br>What should Margie do?", "River Catastrophe", 0, 0, watercrossing, raftProb, 0);
			
			if(raft == 0)
			{
				JOptionPane.showMessageDialog(null, "Margie reaches out to save Baxter. She grabs him and pulls him onto land, before being thrown into the rocks.");
				margie.setHealth(1);
				JOptionPane.showMessageDialog(null, "Baxter sees his mother washed up on the bank. He drags her to the village.");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Margie pulls herself to safety, but isn't fast enough to grab Baxter. As she stumbles toward the village, she trips on a hunk of gold. Gain 5$.");
				partyMembers[2] = "None";
				balance = balance + 5;
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Baxter and Clyde make it across the river, but Margie falls in. Baxter and Clyde rescue her, but she loses 3 HEALTH");
			margie.setHealth(margie.getHealth() - 3);
		}
	}
	
	else if(riverCross == 2)
	{
		if(balance >= 3)
		{
		JOptionPane.showMessageDialog(null, "You pay the ferry 3$ and get a safe ride across.");
		balance = balance - 3;
		}
		else if(balance < 3)
		{
			JOptionPane.showMessageDialog(null, "You don't have enough money!");
			int riverPay = JOptionPane.showOptionDialog(null, "You come to a river and see a village across its rapids. There is a raft, but the river is violent, and a vine, that looks like it could break at any moment.", "River Crossing", 0, 0, watercrossing, riverNo$, 0);
			if(riverPay == 0)
			{
				if(partyMembers[0].equals("None"))
				{
					JOptionPane.showMessageDialog(null, "Baxter makes it across the river, but Margie falls in. Baxter rescues her, but she loses 3 HEALTH");
					margie.setHealth(margie.getHealth() - 3);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Baxter and Clyde make it across the river, but Margie falls in. Baxter and Clyde rescue her, but she loses 3 HEALTH");
					margie.setHealth(margie.getHealth() - 3);
				}
			}
			
			else if(riverPay == 1)
			{
				if(partyMembers[0].equals("None"))
				{
					int raft = JOptionPane.showOptionDialog(null, "<html>The raft gets whisked away by the current and flips over. Margie is quickly approaching spikey rocks sticking out of the water.<br>Baxter can't swim and is struggling next to Margie.<br>What should Margie do?", "River Catastrophe", 0, 0, watercrossing, raftProb, 0);
					
					if(raft == 0)
					{
						JOptionPane.showMessageDialog(null, "Margie reaches out to save Baxter. She grabs him and pulls him onto land, before being thrown into the rocks.");
						margie.setHealth(1);
						JOptionPane.showMessageDialog(null, "Baxter sees his mother washed up on the bank. He drags her to the village.");
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Margie pulls herself to safety, but isn't fast enough to grab Baxter. As she stumbles toward the village, she trips on a hunk of gold. Gain 5$.");
						partyMembers[2] = "None";
						balance = balance + 5;
					}
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Baxter and Clyde make it across the river, but Margie falls in. Baxter and Clyde rescue her, but she loses 3 HEALTH");
					margie.setHealth(margie.getHealth() - 3);
				}
			
		}
	}
	
	
	
	}
	
	//
	//
	//
	
	//Clyde,Margie,Baxter
	//Margie, Baxter,
	//Margie
	//{"Clyde","Margie","Baxter"}
	
	if(partyMembers[2].equals("None"))
	{
		JOptionPane.showMessageDialog(null, "You find refuge at an inn, gain ONE HUNGER and THIRST");
		margie.setHealth(margie.getHealth() + 1);
		margie.setThirst(margie.getThirst() + 1);

		JOptionPane.showMessageDialog(null, "You enter a shop with " + balance + " coins.");
		String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();
		JOptionPane.showMessageDialog(null, "<html>" + partyMembers[0] + "<br>" + partyMembers[1] + "<br>" + partyMembers[2], "Party", 0 );
		JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
		int input10 = JOptionPane.showOptionDialog(null, "Choose a Merchant", "Ye Olde Shoppe", 0, 0, shoppe, merch2, 0);
		
		//String [] merch2  = {"Chef", "Cocktail Mixer","Salesman","Blacksmith","Jeweler","Leave Village"};
		
		if(input10 == 0)
		{
			JOptionPane.showMessageDialog(null, "You buy a meal for 3$, everyone gets ONE health");
			if(balance >= 3)
			{
			balance = balance - 3;
			clyde.setHealth(clyde.getHealth() + 1);
			margie.setHealth(margie.getHealth() + 1);
			baxter.setHealth(baxter.getHealth() + 1);
			}
			else
			{
			JOptionPane.showMessageDialog(null, "You don't have enough money, but that doesn't discourage you. You set off, leaving the village");
			}
		}
		else if(input10 == 1)
		{
			JOptionPane.showMessageDialog(null, "You buy drinks 3$, everyone gets ONE THIRST");
			if(balance >= 3)
			{
			balance = balance - 3;
			clyde.setThirst(clyde.getThirst() + 1);
			margie.setThirst(margie.getThirst() + 1);
			baxter.setThirst(baxter.getThirst() + 1);
			}
			else
			{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village");
			}
		}
		else if(input10 == 2)
		{
			int salesman1 = JOptionPane.showOptionDialog(null, "The salesman tells you that when you leave the village you will find a hostile Native American group. He offers you a gun for 5$. Buy?", "Salesman", 0,0, gun, salesman,0);
			if(salesman1 == 0)
			{
				balance = balance - 9;
				hasGun = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a loaded gun");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
		}
		else if(input10 == 3) 
			{
			int blacksmith = JOptionPane.showOptionDialog(null, "The blacksmith offers you a shield for 4$. Buy?", "Blacksmith", 0,0, gun, salesman,0);
			if(blacksmith == 0)
			{
				balance = balance - 4;
				hasShield = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a shield");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
			}
		else if(input10 == 4)
		{
			int jeweler = JOptionPane.showOptionDialog(null, "The blacksmith offers you a necklace for 4$. Buy?", "Jeweler", 0,0, necklace, salesman,0);
			if(jeweler == 0)
			{
				balance = balance - 9;
				hasJewel = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a shiny necklace");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
		}
		//IF(Baxter and Clyde r ded)
		//Margie stumbles into village
	}
	else if(partyMembers[0].equals("Clyde"))
	{
		JOptionPane.showMessageDialog(null, "You find refuge at an inn, gain ONE HUNGER and THIRST");
		clyde.setHealth(clyde.getHealth() + 1);
		clyde.setThirst(clyde.getThirst() + 1);
		
		margie.setHealth(margie.getHealth() + 1);
		margie.setThirst(margie.getThirst() + 1);
		
		baxter.setHealth(baxter.getHealth() + 1);
		baxter.setThirst(baxter.getThirst() + 1);
		
		JOptionPane.showMessageDialog(null, "You enter a shop with " + balance + " coins.");
		String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();
		JOptionPane.showMessageDialog(null, "<html>" + partyMembers[0] + "<br>" + partyMembers[1] + "<br>" + partyMembers[2], "Party", 0 );
		JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
		int input10 = JOptionPane.showOptionDialog(null, "Choose a Merchant", "Ye Olde Shoppe", 0, 0, shoppe, merch2, 0);
		
		//String [] merch2  = {"Chef", "Cocktail Mixer","Salesman","Blacksmith","Jeweler","Leave Village"};
		
		if(input10 == 0)
		{
			JOptionPane.showMessageDialog(null, "You buy a meal for 3$, everyone gets ONE health");
			if(balance >= 3)
			{
			balance = balance - 3;
			clyde.setHealth(clyde.getHealth() + 1);
			margie.setHealth(margie.getHealth() + 1);
			baxter.setHealth(baxter.getHealth() + 1);
			}
			else
			{
			JOptionPane.showMessageDialog(null, "You don't have enough money, but that doesn't discourage you. You set off, leaving the village");
			}
		}
		else if(input10 == 1)
		{
			JOptionPane.showMessageDialog(null, "You buy drinks 3$, everyone gets ONE THIRST");
			if(balance >= 3)
			{
			balance = balance - 3;
			clyde.setThirst(clyde.getThirst() + 1);
			margie.setThirst(margie.getThirst() + 1);
			baxter.setThirst(baxter.getThirst() + 1);
			}
			else
			{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village");
			}
		}
		else if(input10 == 2)
		{
			int salesman1 = JOptionPane.showOptionDialog(null, "The salesman tells you that when you leave the village you will find a hostile Native American group. He offers you a gun for 5$. Buy?", "Salesman", 0,0, gun, salesman,0);
			if(salesman1 == 0)
			{
				balance = balance - 9;
				hasGun = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a loaded gun");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
		}
		else if(input10 == 3) 
			{
			int blacksmith = JOptionPane.showOptionDialog(null, "The blacksmith offers you a shield for 4$. Buy?", "Blacksmith", 0,0, gun, salesman,0);
			if(blacksmith == 0)
			{
				balance = balance - 4;
				hasShield = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a shield");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
			}
		else if(input10 == 4)
		{
			int jeweler = JOptionPane.showOptionDialog(null, "The blacksmith offers you a necklace for 4$. Buy?", "Jeweler", 0,0, necklace, salesman,0);
			if(jeweler == 0)
			{
				balance = balance - 9;
				hasJewel = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a shiny necklace");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
		}

		//Every1 is alive
		//Normal village
	}
	else if(partyMembers[0].equals("None") && partyMembers[2].equals("Baxter") && partyMembers[1].equals("Margie"))
	{
		//String[] margieclydevill = {"Hospital", "Ye Olde Shoppe"};
		int margclyde = JOptionPane.showOptionDialog(null, "You go to an inn, where you gain ONE HEALTH and ONE THIRST. The inn keeper suggests you take Margie to a hospital. Where should they go?", "Salesman", 0,0, net, margieclydevill,0);
		
		if(margclyde == 0)
		{
			JOptionPane.showMessageDialog(null, "Baxter takes Margie to the Hospital, where they heal Margie to " + (balance%2 + 1) + "for all of your money. LOSE " + balance + "$");
			margie.setHealth(balance%2 + 1);
			margie.setThirst(balance%2 + 1);
			
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "You enter a shop with " + balance + " coins.");
			String list = "<html>Clyde's health is " + clyde.getHealth() + "<br>Clyde's thirst is " + clyde.getThirst() + "<br>Margie's health is " + margie.getHealth() + "<br>Margie's Thirst is " + margie.getThirst() + "<br>Baxter's Health is " + baxter.getHealth() + "<br>Baxter's Thirst is " + baxter.getThirst();
			JOptionPane.showMessageDialog(null, "<html>" + partyMembers[0] + "<br>" + partyMembers[1] + "<br>" + partyMembers[2], "Party", 0 );
			JOptionPane.showMessageDialog(null, list, "Party Stats", 0, img);
			int input10 = JOptionPane.showOptionDialog(null, "Choose a Merchant", "Ye Olde Shoppe", 0, 0, shoppe, merch2, 0);
			
			//String [] merch2  = {"Chef", "Cocktail Mixer","Salesman","Blacksmith","Jeweler","Leave Village"};
			
			if(input10 == 0)
			{
				JOptionPane.showMessageDialog(null, "You buy a meal for 3$, everyone gets ONE health");
				if(balance >= 3)
				{
				balance = balance - 3;
				clyde.setHealth(clyde.getHealth() + 1);
				margie.setHealth(margie.getHealth() + 1);
				baxter.setHealth(baxter.getHealth() + 1);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "You don't have enough money, but that doesn't discourage you. You set off, leaving the village");
				}
			}
			else if(input10 == 1)
			{
				JOptionPane.showMessageDialog(null, "You buy drinks 3$, everyone gets ONE THIRST");
				if(balance >= 3)
				{
				balance = balance - 3;
				clyde.setThirst(clyde.getThirst() + 1);
				margie.setThirst(margie.getThirst() + 1);
				baxter.setThirst(baxter.getThirst() + 1);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village");
				}
			}
			else if(input10 == 2)
			{
				int salesman1 = JOptionPane.showOptionDialog(null, "The salesman tells you that when you leave the village you will find a hostile Native American group. He offers you a net for 3$. Buy?", "Salesman", 0,0, net, salesman,0);
				if(salesman1 == 0)
				{
					balance = balance - 9;
					hasNet = true;
					JOptionPane.showMessageDialog(null, "You leave the village with a net");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
				}
			}
			else if(input10 == 3)
			{
				int blacksmith = JOptionPane.showOptionDialog(null, "The blacksmith offers you a sheild for 4$. Buy?", "Salesman", 0,0, net, salesman,0);
				if(blacksmith == 0)
				{
					balance = balance - 4;
					hasShield = true;
					JOptionPane.showMessageDialog(null, "You leave the village with a shield");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
				}
			}
			else if(input10 == 4) 
			{
			int jewel = JOptionPane.showOptionDialog(null, "The jeweler offers you a necklace for 4$. Buy?", "Jeweler", 0,0, necklace, salesman,0);
			if(jewel == 0)
			{
				balance = balance - 4;
				hasJewel = true;
				JOptionPane.showMessageDialog(null, "You leave the village with a shiny necklace");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
			}
			}
		else if(input10 == 5)
		{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "You set off, leaving the village behind you");
		}
		}
		//Baxter and Margie, no Clyde
		//Baxter can take Margie to hospital - 5$
	}
	
	//
	//
	//String partyMembers [] = {"Clyde", "Margie", "Baxter"};
	
	if(partyMembers[2].equals("None"))
	{
		JOptionPane.showMessageDialog(null, "Since Margie is alone, she can drink all of her water without having to share. Gain TWO THIRST");
		margie.setThirst(margie.getThirst() + 2);
		int smoke = JOptionPane.showOptionDialog(null, "At 2AM, Margie comes across a crossroads. Margie sees smoke, coming from the left and right, but the left's smoke is stronger than the right's. Which way?", "Smoke Signals", 0,0, img, choices1, 0);
		
		if(smoke == 1)
		{
			int mugs = JOptionPane.showOptionDialog(null, "Margie takes the path, and sees another family, who are sleeping. What should Margie do?", "Scenario", 0,0, desert,mug, 0);
			if(mugs == 0)
			{
				JOptionPane.showMessageDialog(null, "<html>Margie quietly robs the family, taking 3$ and a canteen of water. She doesn't see the family's<br>dog, and it attacks her. She flees, but loses two health");
				balance = balance + 3;
				margie.setThirst(margie.getThirst() + 2);
				margie.setHealth(margie.getHealth() - 2);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Margie continues on, hoping she'll get to Oregon soon.");
			}
		}
		else if(smoke == 0)
		{
			
			int naCamp = JOptionPane.showOptionDialog(null, "<html>Margie heard tribal music as she approached the cause of the smoke, a fire. Native Americans crowded it, and looked up as<br>she approached them. One of them pulled a bow and arrow out, and<br>aimed at her. What should Margie do?","Native American Camp", 0,0,icon,nacamp,0);
			
			//String[] nacamp = {"Negotiate", "Run", "Fight"};
			
			if(naCamp == 0)
			{
				if(hasJewel)
				{
				JOptionPane.showMessageDialog(null, "They take Margie's necklace and then let her go.");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie offers them money, but they decline. They bind her up and tie her to a post.<br>When she wakes up the next morning, the camp is gone, and she is lying on the ground. her throat is scratchy.<br>Lose 3 THIRST");
					margie.setThirst(margie.getThirst() - 3);
				}
			}
			else if(naCamp == 1)
				{
					if(hasShield)
					{
					JOptionPane.showMessageDialog(null,"Margie makes a break for it, blocking their arrows with her Shield. She makes it out, just as her shield breaks.");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"<html>Margie runs but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. When she wakes up the next morning she runs away.<br>Lose 7 HEALTH");
						margie.setHealth(margie.getHealth() - 7);
						if(margie.getHealth() <= 0)
						{
							JOptionPane.showMessageDialog(null, "You lose! Play again.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Margie limps away from the village clutching her head.");
						}
					}
				}
			else if(naCamp == 2)
			{
				if(hasGun)
				{
					JOptionPane.showMessageDialog(null,"Margie shot her way out of the camp, overpowering thier bows.");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie fights but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. When she wakes up the next morning she runs away.<br>Lose 7 HEALTH");
					margie.setHealth(margie.getHealth() - 7);
					if(margie.getHealth() <= 0)
					{
						JOptionPane.showMessageDialog(null, "You lose! Play again.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Margie limps away from the village clutching her head.");
					}
				}
			}
			}
			
			
		}
	else if(partyMembers[0].equals("None") && partyMembers[2].equals("Baxter"))
	{
		JOptionPane.showMessageDialog(null, "Since Margie and Baxter are alone, they can drink all of their water without having to share. Gain ONE THIRST EACH");
		margie.setThirst(margie.getThirst() + 1);
		baxter.setThirst(baxter.getThirst() + 1);
		int smoke = JOptionPane.showOptionDialog(null, "At 2AM, they come across a crossroads. Margie sees smoke, coming from the left and right, but the left's smoke is stronger than the right's. Which way?", "Smoke Signals", 0,0, img, choices1, 0);
		
		if(smoke == 1)
		{
			int mugs = JOptionPane.showOptionDialog(null, "They take the path, and see another family, who are sleeping. What should Margie and Baxter do?", "Scenario", 0,0, desert,mug, 0);
			if(mugs == 0)
			{
				JOptionPane.showMessageDialog(null, "<html>Margie quietly robs the family, taking 3$ and a canteen of water. She doesn't see the family's<br>dog, and it attacks her. She flees with Baxter, but drops a coin. LOSE ONE DOLLAR");
				balance = balance + 2;
				margie.setThirst(margie.getThirst() + 1);
				baxter.setThirst(baxter.getThirst() + 1);
				margie.setHealth(margie.getHealth() - 2);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Margie and Baxter continue on, hoping they will get to Oregon soon.");
			}
		}
		else if(smoke == 0)
		{
			
			int naCamp = JOptionPane.showOptionDialog(null, "<html>Margie and Baxter hear tribal music as they approached the cause of the smoke, a fire. Native Americans crowd it, and look up as<br>they approach them. One of them pulled a bow and arrow out, and<br>aim at them. What should Margie and Baxter do?","Native American Camp", 0,0,icon,nacamp,0);
			
			//String[] nacamp = {"Negotiate", "Run", "Fight"};
			
			if(naCamp == 0)
			{
				if(hasJewel)
				{
				JOptionPane.showMessageDialog(null, "They take Margie's necklace and then let her and Baxter go.");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie offers them money, but they decline. They bind her and Baxter up and tie them to a post.<br>When they wakes up the next morning, the camp is gone, and they are lying on the ground. Their throats are scratchy.<br>Lose 2 THIRST");
					margie.setThirst(margie.getThirst() - 2);
					baxter.setThirst(baxter.getThirst() - 2);
				}
			}
			else if(naCamp == 1)
				{
					if(hasShield)
					{
					JOptionPane.showMessageDialog(null,"Margie and Baxter make a break for it, blocking their arrows with her Shield. They make it out, just as her shield breaks.");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"<html>Margie runs but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. They take Baxter and leave him next to her. When they wake up the next morning they run away.<br>Margie lose 7 HEALTH");
						margie.setHealth(margie.getHealth() - 7);
						
						if(margie.getHealth() <= 0)
						{
							partyMembers[1] = "None";
							JOptionPane.showMessageDialog(null,"Baxter runs away, evading the Native Americans.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Margie and Baxter limp away from the village clutching their head.");
						}
					}
				}
			else if(naCamp == 2)
			{
				if(hasGun)
				{
					JOptionPane.showMessageDialog(null,"Margie and Baxter shoot their way out of the camp, overpowering the Native's bows.");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie fights but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. They leave Baxter with her. When she wakes up the next morning she runs away.<br>Margie ose 4 HEALTH");
					margie.setHealth(margie.getHealth() - 4);
					if(margie.getHealth() <= 0)
					{
						JOptionPane.showMessageDialog(null, "Baxter leaves the camp, not having time to think about his mother's death.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Margie limps away from the village clutching her head,holding baxter's hand.");
					}
				}
			}
			}
			
			
		
		else
		{
			JOptionPane.showMessageDialog(null,"Margie and Baxter continue on, hoping they'll get to Oregon soon.", "Scenario", 0, img);
		}
		
	}
	
	else//(partyMembers[0].equals("Clyde") && partyMembers[2].equals("Baxter") && partyMembers[1].equals("Margie"))
	{
		JOptionPane.showMessageDialog(null, "It's shady, and the family's burned bodies can cool down. Gain ONE HEALTH");
		margie.setHealth(margie.getHealth() + 1);
		clyde.setHealth(clyde.getHealth() + 1);
		baxter.setHealth(baxter.getHealth() + 1);
		
		int smoke = JOptionPane.showOptionDialog(null, "At 2AM, they come across a crossroads. They see smoke, coming from the left and right, but the left's smoke is stronger than the right's. Which way?", "Smoke Signals", 0,0, img, choices1, 0);
		
		if(smoke == 1)
		{
			int mugs = JOptionPane.showOptionDialog(null, "They take the path, and see another family, who are sleeping. What should Margie, Clyde, and Baxter do?", "Scenario", 0,0, desert,mug, 0);
			if(mugs == 0)
			{
				JOptionPane.showMessageDialog(null, "<html>Margie quietly robs the family, taking 3$ and a canteen of water. She doesn't see the family's<br>dog, and it attacks her. They flee, but drops three coin. LOSE 2 DOLLARs");
				balance = balance + 1;
				margie.setThirst(margie.getThirst() + 1);
				baxter.setThirst(baxter.getThirst() + 1);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "They continue on, hoping they will get to Oregon soon.");
			}
		}
		else if(smoke == 0)
		{
			
			int naCamp = JOptionPane.showOptionDialog(null, "<html>They hear tribal music as they approach the cause of the smoke, a fire. Native Americans crowd around it, and look up as<br>they approach them. One of them pulls a bow and arrow out, and<br>aim at them. What should Margie, Clyde, and Baxter do?","Native American Camp", 0,0,icon,nacamp,0);
			
			//String[] nacamp = {"Negotiate", "Run", "Fight"};
			
			if(naCamp == 0)
			{
				if(hasJewel)
				{
				JOptionPane.showMessageDialog(null, "They take Margie's necklace and then let the family go.");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie offers them money, but they decline. They bind her and Baxter and Clyde up and tie them to a post.<br>When they wake up the next morning, the camp is gone, and they are lying on the ground. Their throats are scratchy.<br>Lose 2 THIRST");
					margie.setThirst(margie.getThirst() - 2);
					baxter.setThirst(baxter.getThirst() - 2);
					baxter.setThirst(baxter.getThirst() - 2);
				}
			}
			else if(naCamp == 1)
				{
					if(hasShield)
					{
					JOptionPane.showMessageDialog(null,"They make a break for it, blocking the Native's arrows with their Shield. They make it out, just as their shield breaks.");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"<html>Margie runs but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. They take Baxter and Clyde and leave him next to her. When they wake up the next morning they run away.<br>Margie lose 7 HEALTH");
						margie.setHealth(margie.getHealth() - 7);
						
						if(margie.getHealth() <= 0)
						{
							partyMembers[1] = "None";
							JOptionPane.showMessageDialog(null,"Baxter runs away, evading the Native Americans.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Margie and Baxter limp away from the village clutching their head.");
						}
					}
				}
			else if(naCamp == 2)
			{
				if(hasGun)
				{
					JOptionPane.showMessageDialog(null,"They shoot their way out of the camp, overpowering the Native's bows.");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"<html>Margie fights but gets shot in the head by an arrow. The Native Americans thought she was dead,<br>so they left her there. They leave Baxter and Clyde with her. When she wakes up the next morning she runs away.<br>Margie ose 4 HEALTH");
					margie.setHealth(margie.getHealth() - 4);
					if(margie.getHealth() <= 0)
					{
						JOptionPane.showMessageDialog(null, "Baxter leaves the camp, not having time to think about his mother's death.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Margie limps away from the village clutching her head,holding baxter's hand.");
					}
				}
			}
			}
			
			
		
		else
		{
			JOptionPane.showMessageDialog(null,"Margie and Baxter continue on, hoping they'll get to Oregon soon.", "Scenario", 0, img);
		}
		
	}
	
	//
	//
	//String[] mountain = {"Pay the Sherpa", "Climb the Mountain", "Buy the Lamp"};
	
	if(partyMembers[2].equals("Baxter") && partyMembers[0].equals("None"))
	{
		JOptionPane.showMessageDialog(null, "Baxter and Margie move on to a mountain range, and see the sprawling city of Oregon behind it.", "Scenario",0);
		
		int mount = JOptionPane.showOptionDialog(null, "<html>There is a who sherpa offers to escort them for a steep 4$ price. <br>The second option is to brave the fierce winds and chilly temperatures and pass through. <br>Finally, buy a kerosene lamp for 2$ and cross the mountains.", "Mountain Crossing", 0, 0, icon, mountain, 0);
		
		if(mount == 0)
		{
			JOptionPane.showMessageDialog(null, "The sherpa safely escorts Baxter and Margie, and they make it to Oregon.");
			balance = balance - 4;
		}
		
	}
	
	String grade;
	
	if(partyMembers[0].equals("Clyde"))
	{
		if(clyde.getHealth() == 10 && margie.getHealth() == 10 && baxter.getHealth() == 10)
		{
			grade = "A+";
		}
		
		else if(clyde.getHealth() > 8 && margie.getHealth() > 8 && baxter.getHealth() > 8)
		{
			grade = "A";
		}
		
		else if(clyde.getHealth() > 7 && margie.getHealth() > 7 && baxter.getHealth() > 7)
		{
			grade = "B+";
		}
		
		else if(clyde.getHealth() > 7 || margie.getHealth() > 7 || baxter.getHealth() > 7)
		{
			grade = "B";
		}
		
		else
		{
			grade = "F";
		}
		
		JOptionPane.showMessageDialog(null, "Your grade is " + grade + "! Thanks for playing!");
	}
	
	JOptionPane.showMessageDialog(null, "If you play again, you will have a different experience, as the game is completely randomized!");

}
}

