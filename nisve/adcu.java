public class Bounds {
    // Properties
    private int x;
    private int y;
    private int width;
    private int height;

    // Default constructor
    public Bounds() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    // Parameterized constructor
    public Bounds(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public String toString() {
        return "Bounds[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize a new Bounds object
        Bounds b = new Bounds();

        // Optionally, you can initialize Bounds with specific values
        // Bounds b = new Bounds(0, 0, 100, 100);

        System.out.println(b);
    }
}
