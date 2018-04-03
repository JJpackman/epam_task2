package com.company.subtask1.utils.data;

import com.company.subtask1.model.entity.Shape;
import com.company.subtask1.utils.data.factories.RandomShapesGenerator;

public class ShapesDataSource {
   private static final int DEFAULT_COUNT = 10;

    public static Shape[] readShapes() {
        return RandomShapesGenerator.createShapeArray(DEFAULT_COUNT);
    }
    public static Shape[] readShapes(int count) {
        return RandomShapesGenerator.createShapeArray(count);
    }
}
