import java.util.Scanner;

public class RPS {

            public static void main(String[] args) {
				Scanner kb = new Scanner(System.in);
                        // initialize points
                        int playerPoints = 0;
                        int aiPoints = 0;

                        // initialize # of rounds
                        int totRounds = 5;
                        int currRound = 0;

						String RpcPlayer = "";
						int RpcAiNum = 0;
						
						String RpcAi = "";
						
						String R = "Rock";
						String P = "Paper";
						String S = "Scissors";
						
						boolean Continue = false;
						
						
                        while (currRound < totRounds) {
									currRound ++;
							
									System.out.println("");
                                    System.out.println("I am The Lord Dominator of all matters Rock, Paper and also Scissors! You dare challenge me!?!? I shall paint the streets black with black paint!");
                                    System.out.println("*what shall you choose? Rock? Paper? or even, Scissors?*");
									
                                    RpcPlayer = kb.nextLine();
									
									if (!RpcPlayer.equals(R) && !RpcPlayer.equals(P) && !RpcPlayer.equals(S)) {
										System.out.println("You have chosen a false element, challenger. Face my mocking chuckle: HAHAHA....");
										System.out.println("");
										System.out.println("please select a correct element.");
										
										RpcPlayer = kb.nextLine();
									}
									
									else {
										Continue = true;
									}

                                if (Continue) {
                                  
								  RpcAiNum = (int)(Math.random()*2); 
                                    
									if (RpcAiNum == 0) {
										RpcAi = "Rock";
									}
									
									if (RpcAiNum == 1) {
										RpcAi= "Paper";
									}
									
									if (RpcAiNum == 2) {
										RpcAi = "Scissors";
									}
									
									System.out.println("Ah, you have chosen. It is time for the conclusion of round #" + currRound);
									System.out.println("Oh God's of RPS, favour me!");
									System.out.println("");
									System.out.println("*The Lord Dominator chose the element " + RpcAi + " you chose the element " + RpcPlayer + "*");
									System.out.println("");
									
									if (RpcAi.equals(R) && RpcPlayer.equals(P)) {
										System.out.println("NO! How could this be??? I have lost! No matter, you shall be slain withal");
										playerPoints ++;
									}
									
									if (RpcAi.equals(P) && RpcPlayer.equals(S)) {
										System.out.println("NO! How could this be??? I have lost! No matter, you shall be slain withal");
										playerPoints ++;
									}
									
									if (RpcAi.equals(S) && RpcPlayer.equals(R)) { 
										System.out.println("NO! How could this be??? I have lost! No matter, you shall be slain withal");
										playerPoints ++;
									}
									
									if (RpcAi.equals(S) && RpcPlayer.equals(S)) { 
										System.out.println("Damn, you have matched me, but only for a time. I shall best you this time thereafter");
										playerPoints ++;
									}
									
									if (RpcAi.equals(R) && RpcPlayer.equals(R)) {
										System.out.println("Damn, you have matched me, but only for a time. I shall best you this time thereafter");
										aiPoints ++;
									}
									
									if (RpcAi.equals(R) && RpcPlayer.equals(S)) {
										System.out.println("You naive inept fool, you have miscalculated the sway of Rock Paper Scissors force! Once again, I am victorious");
										aiPoints ++;
									}
									
									if (RpcAi.equals(P) && RpcPlayer.equals(P)) {
										System.out.println("Damn, you have matched me, but only for a time. I shall best you this time thereafter");
										aiPoints ++;
									}
						
								}
                                   
                                    
                                currRound +=;  

                        } 
						
						if (aiPoints > playerPoints && currRound > totRounds) {
							System.out.println("NO!!!! HOW CAN THIS BE! I HAVE BEEN FORESAKEN! YOU...you...are now the Lord Dominator of all matters Rock, Paper and also Scissors...");
							System.out.println("*you have defeated the Lord Dominator, congratulations*");
								
								}
						
						if (aiPoints > playerPoints && currRound > totRounds) {	
							System.out.println("You inept fool! You have challenged me all in vain and you have but gained failure withal! Prepare for the blackening of the streets with my paint black and ominous!!!!");
							System.out.println("*you have been defeated by the Lord Dominator*");
						}
						
						
						if (aiPoints > playerPoints && currRound > totRounds) {		
							System.out.println("NO!!!! HOW CAN THIS BE! I HAVE BEEN FORESAKEN! YOU...you...are now the Lord Dominator of all matters Rock, Paper and also Scissors...");
							System.out.println("*you have defeated the Lord Dominator, congratulations*");
						}
                       
            }
}
