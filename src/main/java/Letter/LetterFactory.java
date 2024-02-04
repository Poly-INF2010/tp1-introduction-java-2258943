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

      /*  double rectWidth = 5.0;
        double rectHeight = halfMaxHeight;
        double rotationAngleMilieu = Math.toRadians(-90);
        double rotationAngle = Math.toRadians(20);
        double translationMilieuX = rectWidth*4;
        double translationDroiteX = rectWidth*8;

        Rectangle rectangleGauche = new Rectangle(rectWidth, rectHeight);
        Rectangle rectangleMilieu = new Rectangle(rectWidth, rectHeight/4);
        Rectangle rectangleDroite = new Rectangle(rectWidth, rectHeight);

        rectangleMilieu.replaceAll(rectangleMilieu.rotate(rectangleMilieu.getCoords(), rotationAngleMilieu));
        rectangleMilieu.replaceAll(rectangleMilieu.translate(rectangleMilieu.getCoords(), new Point2d(translationMilieuX, 0.0)));
        rectangleDroite.replaceAll(rectangleDroite.translate(rectangleDroite.getCoords(), new Point2d(translationDroiteX, 0.0)));

        BaseShape H = new BaseShape();
        H.add(rectangleGauche);
        H.add(rectangleMilieu);
        H.add(rectangleDroite);

        return H; */
        double rectWidth = 5.0;
        double rectHeight = halfMaxHeight;
        double rotationAngleMilieu = Math.toRadians(-90);
        double rotationAngle = Math.toRadians(15);
        double translationMilieuX = rectWidth*2;
        double translationMilieuY = 10;
        double translationDroiteX = rectWidth*4;

        Rectangle rectangleGauche = new Rectangle(rectWidth, rectHeight);
        Rectangle rectangleMilieu = new Rectangle(rectWidth, rectHeight/4);
        Rectangle rectangleDroite = new Rectangle(rectWidth, rectHeight);

        rectangleGauche.replaceAll(rectangleGauche.rotate(rectangleGauche.getCoords(), rotationAngle));
        rectangleMilieu.replaceAll(rectangleMilieu.rotate(rectangleMilieu.getCoords(), rotationAngleMilieu));
        rectangleMilieu.replaceAll(rectangleMilieu.translate(rectangleMilieu.getCoords(), new Point2d(translationMilieuX, translationMilieuY)));
        rectangleDroite.replaceAll(rectangleDroite.rotate(rectangleDroite.getCoords(), -rotationAngle));
        rectangleDroite.replaceAll(rectangleDroite.translate(rectangleDroite.getCoords(), new Point2d(translationDroiteX, 0.0)));

        BaseShape A = new BaseShape();
        A.add(rectangleGauche);
        A.add(rectangleMilieu);
        A.add(rectangleDroite);

        return A;
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
        double translationX = halfMaxWidth-18;
        double translationY = 0.0;

        Ellipse ellipse = new Ellipse(halfMaxWidth,halfMaxHeight);
        Rectangle rectangle = new Rectangle(5.0, halfMaxHeight-25);
        rectangle.replaceAll(rectangle.translate(rectangle.getCoords(), new Point2d(translationX, translationY)));

        BaseShape C = new BaseShape();
        C.add(ellipse);
        C.remove(rectangle);

        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        double rectWidth = 5.0;
        double rectHeight = halfMaxHeight;
        double rotationAngle = Math.toRadians(-90);
        double translationX = rectWidth*3.3;
        double translationYRect1 = -halfMaxHeight/2.1 ;
        double translationYRect3 = halfMaxHeight/2.1 ;

        Rectangle rectanglePrincipal = new Rectangle(rectWidth, rectHeight);
        Rectangle rectangle1 = new Rectangle(rectWidth, rectHeight/2);
        Rectangle rectangle2 = new Rectangle(rectWidth, rectHeight/2);
        Rectangle rectangle3 = new Rectangle(rectWidth, rectHeight/2);

        rectangle1.replaceAll(rectangle1.rotate(rectangle1.getCoords(), rotationAngle));
        rectangle1.replaceAll(rectangle1.translate(rectangle1.getCoords(), new Point2d(translationX, translationYRect1)));
        rectangle2.replaceAll(rectangle2.rotate(rectangle2.getCoords(), rotationAngle));
        rectangle2.replaceAll(rectangle2.translate(rectangle2.getCoords(), new Point2d(translationX, 0.0)));
        rectangle3.replaceAll(rectangle3.rotate(rectangle3.getCoords(), rotationAngle));
        rectangle3.replaceAll(rectangle3.translate(rectangle3.getCoords(), new Point2d(translationX, translationYRect3)));


        BaseShape E = new BaseShape();
        E.add(rectanglePrincipal);
        E.add(rectangle1);
        E.add(rectangle2);
        E.add(rectangle3);

        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        double rectWidth = 5.0;
        double rectHeight = halfMaxHeight;
        double rotationAngle = Math.toRadians(-90);
        double translationMilieuX = rectWidth*3.3;
        double translationDroiteX = rectWidth*8;

        Rectangle rectangleGauche = new Rectangle(rectWidth, rectHeight);
        Rectangle rectangleMilieu = new Rectangle(rectWidth, rectHeight/2);
        Rectangle rectangleDroite = new Rectangle(rectWidth, rectHeight);

        rectangleMilieu.replaceAll(rectangleMilieu.rotate(rectangleMilieu.getCoords(), rotationAngle));
        rectangleMilieu.replaceAll(rectangleMilieu.translate(rectangleMilieu.getCoords(), new Point2d(translationMilieuX, 0.0)));
        rectangleDroite.replaceAll(rectangleDroite.translate(rectangleDroite.getCoords(), new Point2d(translationDroiteX, 0.0)));

        BaseShape H = new BaseShape();
        H.add(rectangleGauche);
        H.add(rectangleMilieu);
        H.add(rectangleDroite);

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
