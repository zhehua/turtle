package com.hm;

import ch.aplu.turtle.Turtle;

import java.util.Objects;

public class MyTurtle extends Turtle {
    public Turtle arc(double radius, double angle) {
        if (radius < 0)
            return super.rightArc(-radius, angle);
        else
            return super.leftArc(radius, angle);
    }

    public Turtle arc(double radius) {
        super.setHeading(90);
        if (radius < 0)
            return super.rightCircle(radius);
        else
            return super.leftCircle(radius);
    }

    @Override
    public Turtle setHeading(double degrees) {
        degrees = 90 - degrees;
        return super.setHeading(degrees);
    }

    String colorStr = null;

    @Override
    public Turtle fillToPoint() {
        colorStr = super.getPenColorStr();
        String fillColorStr = super.getFillColorStr();
        super.setPenColor(fillColorStr);
        return super.fillToPoint();
    }

    @Override
    public Turtle fillOff() {
        if (Objects.nonNull(colorStr))
            super.setPenColor(colorStr);
        return super.fillOff();
    }
}
