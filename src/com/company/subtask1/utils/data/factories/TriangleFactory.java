package com.company.subtask1.utils.data.factories;

import com.company.subtask1.model.entity.*;
import static com.company.subtask1.utils.data.factories.RandomShapesGenerator.*;

public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Triangle(getRandomValue(), getRandomValue(), getRandomColor());
    }
}
