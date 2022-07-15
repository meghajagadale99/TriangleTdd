public
class Triangle {

    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public
    Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public
    boolean isTriangle() {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            return ((firstSide + secondSide) >= thirdSide) &&
                    ((secondSide + thirdSide) >= firstSide) &&
                    ((firstSide + thirdSide) >= secondSide);
        }
        return false;
    }


    public
    boolean isEquilateral() {
        return firstSide == secondSide && secondSide == thirdSide;
    }

    public
    boolean isIsosceles() {
        return  (firstSide == secondSide) || (secondSide == thirdSide) || (firstSide == thirdSide);
    }

    public
    boolean isScalene() {
        return (firstSide != secondSide) && (secondSide != thirdSide) && (firstSide != thirdSide);
    }
}
