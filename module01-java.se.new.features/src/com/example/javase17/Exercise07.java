package com.example.javase17;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise07 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object o = null;
		if (ThreadLocalRandom.current().nextBoolean()) {
			o = new Circle(0, 0, 100, "Red");
		} else {
			o = new Cube(10, "Blue");
		}
		if (o instanceof Circle) {
			Circle circle = (Circle) o; // explicit
		}
		if (o instanceof Circle circle) { // implicit
			
		} else if (o instanceof Cube cube) {
			
		} else {
			throw new IllegalArgumentException("Unexpected type: %s".formatted(o.getClass().getName()));
		}
		switch (o) {
		case Circle circle when (circle.color() == "Red" && circle.radius() >10 ) -> {
                 
		}
		case Cube cube when (cube.color() == "Blue" && cube.edge() > 10 ) -> {

		}
		default -> throw new IllegalArgumentException("Unexpected type: %s".formatted(o.getClass().getName()));
		}
	}

}

record Circle(int x, int y, int radius, String color) {
}

record Cube(int edge, String color) {
}

final class ColorfulCircle {
	private final int x;
	private final int y;
	private final int radius;
	private final String color;

	public ColorfulCircle(int x, int y, int radius, String color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, radius, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorfulCircle other = (ColorfulCircle) obj;
		return Objects.equals(color, other.color) && radius == other.radius && x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "ColorfulCircle [x=" + x + ", y=" + y + ", radius=" + radius + ", color=" + color + "]";
	}

}
