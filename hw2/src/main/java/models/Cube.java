package models;

public class Cube extends Shape implements IShape {
    private double dim;

    public double getDim() {
        return dim;
    }

    public void setDim(double dim) {
        this.dim = dim;
    }

    public Cube(double dim) {
        setDim(dim);
    }

    @Override
    public double computeSquare() {
        return 6 * (dim * dim);
    }
}