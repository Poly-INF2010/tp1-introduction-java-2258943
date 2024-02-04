package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Square square = new Square(5.0);
        Rectangle rectangle = new Rectangle(5.0, 5.0);
        rectangle.remove(square);
        BaseShape A = new BaseShape();
        A.add(rectangle);
        return rectangle;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        double rectWidth = 8.0;
        double rectHeight = halfMaxHeight;
        double circleRadius = halfMaxHeight / 2;

        Rectangle rectangle = new Rectangle(rectWidth, rectHeight);
        Circle circleTop = new Circle(circleRadius);
        Circle circleBottom = new Circle(circleRadius);

        Point2d topCirclePosition = new Point2d(rectWidth*2, -rectHeight/4);
        circleTop.replaceAll(circleTop.translate(circleTop.getCoords(), topCirclePosition));

        Point2d bottomCirclePosition = new Point2d(rectWidth*2, rectHeight/4);
        circleBottom.replaceAll(circleBottom.translate(circleBottom.getCoords(), bottomCirclePosition));

        BaseShape B = new BaseShape();
        B.add(rectangle);
        B.add(circleBottom);
        B.add(circleTop);

        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Rectangle rectangle = new Rectangle(5.0, halfMaxHeight);
        Circle circle = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        BaseShape C = new BaseShape();
        C.add(rectangle);
        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle rectangle = new Rectangle(5.0, halfMaxHeight);
        BaseShape E = new BaseShape();
        E.add(rectangle);

        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangle = new Rectangle(5.0, 15.0);
        Circle circle = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        BaseShape H = new BaseShape();
        H.add(rectangle);

        return H;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        double rectWidth = 5.0;
        double rectHeight = halfMaxHeight;
        double rectDiagHeight = rectHeight+rectWidth;
        double rotationAngle = Math.toRadians(-25);
        double translationDiagX = rectWidth *4;
        double translationDiagY = -rectWidth/10;
        double translationDroite = rectWidth*8;

        Rectangle rectangleDiag = new Rectangle(rectWidth, rectDiagHeight);
        Rectangle rectangleGauche = new Rectangle(rectWidth, rectHeight);
        Rectangle rectangleDroite = new Rectangle(rectWidth, rectHeight);

        rectangleDiag.replaceAll(rectangleDiag.rotate(rectangleDiag.getCoords(), rotationAngle));

        rectangleDiag.replaceAll(rectangleDiag.translate(rectangleDiag.getCoords(), new Point2d(translationDiagX, translationDiagY)));

        rectangleDroite.replaceAll(rectangleDroite.translate(rectangleDroite.getCoords(), new Point2d(translationDroite, 0.0)));

        BaseShape N = new BaseShape();
        N.add(rectangleGauche);
        N.add(rectangleDiag);
        N.add(rectangleDroite);

        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse = new Ellipse(halfMaxWidth,halfMaxHeight);
        BaseShape O = new BaseShape();
        O.add(ellipse);

        return O;
    }

}
