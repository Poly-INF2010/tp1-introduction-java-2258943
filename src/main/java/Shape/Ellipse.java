package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        final Double DIVISEUR_INCREMENT =16.0;
        Double space = Math.PI / DIVISEUR_INCREMENT;

        Double radiusX = widthDiameter / 2.0;
        Double radiusY = heightDiameter / 2.0;

        for (Double angle = 0.0; angle <= 2 * Math.PI; angle += space) {
            Double x = radiusX * Math.cos(angle);
            Double y = radiusY * Math.sin(angle);
            add(new Point2d(x, y));
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords());
    }
}
