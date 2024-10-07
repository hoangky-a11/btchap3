public class Ball {
    private double x, y; // Position of the ball on the field (x, y)
    private double speed; // Speed of the ball
    private double direction; // Direction in which the ball is moving (in degrees)

    // Constructor to initialize the ball's position, speed, and direction
    public Ball(double x, double y, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    // Getter and Setter methods
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    // Method to simulate the ball being kicked
    public void kick(double newSpeed, double newDirection) {
        this.speed = newSpeed;
        this.direction = newDirection;
    }

    // Move the ball based on speed and direction
    public void move() {
        this.x += speed * Math.cos(Math.toRadians(direction)); // Move on x-axis
        this.y += speed * Math.sin(Math.toRadians(direction)); // Move on y-axis
    }

    // Print the ball's position and speed
    @Override
    public String toString() {
        return "Ball is at position (" + x + ", " + y + ") with speed " + speed + " in direction " + direction + " degrees.";
    }
}
