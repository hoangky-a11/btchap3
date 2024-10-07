public class Player {
    private String name;  // Name of the player
    private double x, y;  // Position of the player on the field
    private Ball ball;    // The ball the player can interact with

    // Constructor to initialize the player's name and position
    public Player(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    // Method to kick the ball
    public void kickBall(double newSpeed, double newDirection) {
        if (ball != null) {
            ball.kick(newSpeed, newDirection); // Player kicks the ball with a new speed and direction
            System.out.println(name + " kicked the ball! " + ball);
        } else {
            System.out.println(name + " has no ball to kick.");
        }
    }

    // Print the player's position and name
    @Override
    public String toString() {
        return name + " is at position (" + x + ", " + y + ").";
    }
}
