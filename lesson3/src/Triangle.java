public class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double gerArea() {
        double perimeter = getPerimeter();
        return Math.sqrt(perimeter * (perimeter - firstSide)
                        * (perimeter - secondSide)
                        * (perimeter - thirdSide));
    }
}
