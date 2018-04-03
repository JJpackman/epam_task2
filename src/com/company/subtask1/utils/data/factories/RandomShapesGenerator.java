package com.company.subtask1.utils.data.factories;

import com.company.subtask1.model.entity.Shape;
import com.company.subtask1.model.entity.enums.ShapeName;

import java.util.*;

import static com.company.subtask1.utils.data.factories.constant.FactoryConstants.*;

public final class RandomShapesGenerator {
    private static final Map<ShapeName, ShapeFactory> shapeFactories;

    static {
        shapeFactories = new HashMap<>();
        shapeFactories.putAll(new HashMap<ShapeName, ShapeFactory>() {{
            put(ShapeName.CIRCLE, new CircleFactory());
            put(ShapeName.RECTANGLE, new RectangleFactory());
            put(ShapeName.TRIANGLE, new TriangleFactory());
        }});
    }

    static double getRandomValue() {
        return random.nextInt((int)Math.round(MAX - MIN) + 1) + MIN;
    }

    static String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)].getColor();
    }

    public static Shape[] createShapeArray(int len) {
        if (len < 0) {
            throw new IllegalArgumentException("Length of shape array cannot be negative");
        }

        Shape[] shapes = new Shape[len];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeFactories.get(sNames[random.nextInt(sNames.length)]).create();
        }

        return shapes;
    }
}
