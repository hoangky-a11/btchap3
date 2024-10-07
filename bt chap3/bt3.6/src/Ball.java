public class Ball {
    private double x, y, radius;
    private double xDelta, yDelta;

    // Constructor to initialize the ball with x, y, radius, speed, and direction
    public Ball(double x, double y, double radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        setSpeedAndDirection(speed, direction);
    }

    // Method to set speed and direction and calculate xDelta and yDelta
    private void setSpeedAndDirection(double speed, double direction) {
        // Convert the speed and direction to xDelta and yDelta
        double radian = Math.toRadians(direction);
        this.xDelta = speed * Math.cos(radian);
        this.yDelta = -speed * Math.sin(radian); // Note that y-axis is inverted
    }

    // Getters and setters
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getXDelta() { return xDelta; }
    public void setXDelta(double xDelta) { this.xDelta = xDelta; }

    public double getYDelta() { return yDelta; }
    public void setYDelta(double yDelta) { this.yDelta = yDelta; }

    // Method to move the ball one step
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Reflect the ball horizontally (bounce off a vertical wall)
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Reflect the ball vertically (bounce off a horizontal wall)
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // Return a string representation of the ball
    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ") of velocity (" + xDelta + ", " + yDelta + ")";
    }
}
