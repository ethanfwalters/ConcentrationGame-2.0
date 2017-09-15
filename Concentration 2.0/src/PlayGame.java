import java.util.Scanner;
		
public class PlayGame
	{
				public static void main(String[] args)
					{
						// creating the what the user will see
						
						String [] [] concentrationGame = new String [4][4];
						
						concentrationGame [0][0] = " |   pipes   | ";
						concentrationGame [0][1] = " |  metallic | ";
						concentrationGame [0][2] = " |   gloomy  | ";
						concentrationGame [0][3] = " |    half   | ";
						concentrationGame [1][0] = " | discovery | ";
						concentrationGame [1][1] = " |   gadget  | ";
						concentrationGame [1][2] = " | discovery | ";
						concentrationGame [1][3] = " |   scared  | ";
						concentrationGame [2][0] = " |   gloomy  | ";
						concentrationGame [2][1] = " |   pipes   | ";
						concentrationGame [2][2] = " |   scared  | ";
						concentrationGame [2][3] = " |   actor   | ";
						concentrationGame [3][0] = " | discovery | ";
						concentrationGame [3][1] = " |   half    | ";
						concentrationGame [3][2] = " |   gadget  | ";
						concentrationGame [3][3] = " |  metallic | ";
						
						System.out.println("         We're going to play a concentration game!");
						
						
						System.out.println("        0              1              2              3");
						
						for(int row = 0 ; row < concentrationGame.length ; row ++){
							
							System.out.print(row);
							
							for(int col = 0 ; col < concentrationGame[0].length ; col ++){
								if(row == 0){
									
									System.out.print(concentrationGame [row] [col]);
									
								}
								else if(row == 1){
									
									System.out.print(concentrationGame [row] [col]);
								}
								else if(row == 2){
									
									System.out.print(concentrationGame [row] [col]);
								}
								else if(row == 3){
									
									System.out.print(concentrationGame [row] [col]);
								}
								
							}
							
							System.out.println();
						}
						
						Scanner userInput = new Scanner(System.in);
						
						int whatUserSaid = userInput.nextInt();
						
						
						
						System.out.println("Enter the Row and then the Column");

					}

			}
	
