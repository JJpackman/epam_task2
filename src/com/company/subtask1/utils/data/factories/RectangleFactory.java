package com.company.subtask1.utils.data.factories;

import com.company.subtask1.model.entity.Rectangle;
import com.company.subtask1.model.entity.Shape;
import static com.company.subtask1.utils.data.factories.RandomShapesGenerator.*;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
    }
}
