package models;

public class Rectangle extends Shape implements IShape {
    private double dim1;
    private double dim2;

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public Rectangle(double dim1, double dim2) {
        setDim1(dim1);
        setDim2(dim2);
    }

    @Override
    public double computeSquare() {
        return dim1 * dim2;
    }
}
