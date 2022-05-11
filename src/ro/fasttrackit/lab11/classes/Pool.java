package ro.fasttrackit.lab11.classes;

public class Pool {
    String shape; //round, rectangular, square
    int depth;
    boolean filled;

    public Pool(String shape, int depth, boolean filled) {
        this.shape = shape;
        this.depth = depth;
        this.filled = filled;
    }

    public String getShape() {
        return shape;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isFilled() {
        return filled;
    }
}
