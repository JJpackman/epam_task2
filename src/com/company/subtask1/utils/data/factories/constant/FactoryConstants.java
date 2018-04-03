package com.company.subtask1.utils.data.factories.constant;

import com.company.subtask1.model.entity.enums.ShapeName;
import com.company.subtask1.utils.data.enums.ShapeColors;
import java.util.Random;

public interface FactoryConstants {
    double MIN = 4.5;
    double MAX = 17.45;
    ShapeColors[] COLORS = ShapeColors.values();
    ShapeName[] sNames = ShapeName.values();
    Random random = new Random();
}
