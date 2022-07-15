import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public
class TriangleTest {

    @Test
    void shouldReturnTrueWhenTriangleHasTowSideIsGreaterOrEqualOfThirdSide() {
        Triangle triangle = new Triangle(4,5,6);
        boolean actual = triangle.isTriangle();
        assertEquals(actual,true);
    }

    @Test
    void shouldReturnTrueWhenEquilateralHasAllSideAreSame() {
        Triangle equilateralTriangle = new Triangle(10,10,10);
        boolean actual = equilateralTriangle.isEquilateral();
        assertEquals(actual,true);
    }

    @Test
    void shouldReturnTrueWhenIsoscelesHasAnyTwoSideAreSame() {
        Triangle isoscelesTriangle = new Triangle(5,9,5);
        boolean actual = isoscelesTriangle.isIsosceles();
        assertEquals(actual,true);
    }

    @Test
    void shouldReturnTrueWhenScaleneHasAllSideAreDifferent() {
        Triangle isoscelesTriangle = new Triangle(7,4,6);
        boolean actual = isoscelesTriangle.isScalene();
        assertEquals(actual,true);
    }
}
