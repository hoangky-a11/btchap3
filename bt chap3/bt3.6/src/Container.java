public class Container {
    private double x1, y1, x2, y2;


    public Container(double x1, double y1, double width, double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }


    @Override
    public String toString() {
        return "Container at (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")";
    }

    public boolean collidesWith(Ball ball) {
        boolean collision = false;

        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            collision = true;
        }

        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            collision = true;
        }

        return collision;
    }
}

