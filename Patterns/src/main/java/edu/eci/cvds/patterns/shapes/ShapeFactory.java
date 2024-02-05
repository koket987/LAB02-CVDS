package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
public class ShapeFactory {
    public static Shape create(RegularShapeType type) throws Exception {
            switch (type){
                case Triangle:
                    return new Triangle();
                case Hexagon:
                    return new Hexagon();
                case Pentagon:
                    return new Quadrilateral();
                case Quadrilateral:
                    return new Quadrilateral();
                default:
                    throw new Exception();
            }

    }
}