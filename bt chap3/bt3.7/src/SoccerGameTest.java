public class SoccerGameTest {
    public static void main(String[] args) {
        // Create a Ball object at position (50, 50), with a speed of 5 and direction of 45 degrees
        Ball soccerBall = new Ball(50, 50, 5, 45);

        // Create players for Team 1
        Player player1 = new Player("Player 1", 10, 20);
        player1.setBall(soccerBall); // Give the ball to Player 1

        Player player2 = new Player("Player 2", 30, 40);
        player2.setBall(soccerBall); // Give the ball to Player 2

        // Create players for Team 2
        Player player3 = new Player("Player 3", 60, 70);
        player3.setBall(soccerBall); // Give the ball to Player 3

        Player player4 = new Player("Player 4", 80, 90);
        player4.setBall(soccerBall); // Give the ball to Player 4

        // Print initial positions
        System.out.println("Initial Ball Position: " + soccerBall);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        // Simulate some actions
        System.out.println("\n--- First Kick ---");
        player1.kickBall(10, 90); // Player 1 kicks the ball

        System.out.println("\n--- Second Kick ---");
        player3.kickBall(8, 180); // Player 3 kicks the ball

        // Move the ball after the kicks
        soccerBall.move();
        System.out.println("\nBall after movement: " + soccerBall);

        System.out.println("\n--- Third Kick ---");
        player2.kickBall(12, 45); // Player 2 kicks the ball

        // Move the ball again
        soccerBall.move();
        System.out.println("\nBall after movement: " + soccerBall);
    }
}
