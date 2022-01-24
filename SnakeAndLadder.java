public class SnakeAndLadder 
{	
		
		public static void main(String[] args)
		{
			
			int ladder=0;
			int snake=0;
			int NO_PLAY=0;
			int PlayerOneCount=0;
			int PlayerTwoCount=0;
			boolean isPlayerOneActive=false;
			int diceNo=0;
			int diceRollCount=0;
			int WIN=100;
		while(PlayerOneCount<=WIN && PlayerTwoCount<=WIN)
		{
		
			diceNo=(int)Math.floor(Math.random()*10)%6+1;
			System.out.println("Dice Roll number : "+diceNo);
			diceRollCount++;
		
			int option=(int)Math.floor(Math.random()*10)%3;
			switch(option)
				{
					case 0:
					{
						break;
					}
					case 1:
					{
						ladder=diceNo;
						if(isPlayerOneActive)
							{
								
								PlayerOneCount=PlayerOneCount+ladder;
							if (PlayerOneCount>WIN)
							{
								PlayerOneCount=PlayerOneCount-ladder;
							}
							isPlayerOneActive=false;
							}
						else
						{
							PlayerTwoCount=PlayerTwoCount+ladder;
						if (PlayerOneCount>WIN)
						{
							PlayerTwoCount=PlayerTwoCount-ladder;
						}	
						isPlayerOneActive=true;
						}	
						break;
					}
					default: 
					{
						snake=diceNo;
						if(isPlayerOneActive)
						{
						PlayerOneCount=PlayerOneCount-snake;
						}
						else
						{
							PlayerTwoCount=PlayerTwoCount-snake;
						}
						break;
					}
				}
		if(PlayerOneCount<=0)
		{
			System.out.print("Player1 is restarting from Zero: ");
			PlayerOneCount=0;

		}
		else if(PlayerOneCount==WIN)
		{
			
			System.out.println("Player1 reached " +WIN + " And won the game");
			break;
		}
		if(PlayerTwoCount<=0)
		{
			System.out.print("Player2 is restarting from Zero: ");
			PlayerTwoCount=0;

		}
		else if(PlayerTwoCount==WIN)
		{
			
			System.out.println("Player2 reached " +WIN + " And won the game");
			break;
		}
		System.out.println("Player 1 count = "+PlayerOneCount);
		System.out.println("Player 2 count = "+PlayerTwoCount);
		}
		System.out.println("Dice rolled "+ diceRollCount+" times");
}
}