package com.company.subtask1.utils.data.factories;

import com.company.subtask1.model.entity.*;
import static com.company.subtask1.utils.data.factories.RandomShapesGenerator.*;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Circle(getRandomColor(), getRandomValue());
    }
}
