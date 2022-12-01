package net.pointlessgames.libs.s2dgi.window;

import java.util.Objects;

public interface IClippingRectangle {
	int getX();
	int getY();
	int getWidth();
	int getHeight();
	
	public static IClippingRectangle create(int x, int y, int width, int height) {
		return new ClippingRectangle(x, y, width, height);
	}
	
	public static IClippingRectangle create(IClippingRectangle copy) {
		if(copy == null) {
			return null;
		}
		return create(copy.getX(), copy.getY(), copy.getWidth(), copy.getHeight());
	}
}
/*package-protected*/ class ClippingRectangle implements IClippingRectangle {
	private final int x;
	private final int y;
	private final int width;
	private final int height;
	
	public ClippingRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IClippingRectangle) {
			IClippingRectangle other = (IClippingRectangle) obj;
			return this.getX() == other.getX()
				&& this.getY() == other.getY()
				&& this.getWidth() == other.getWidth()
				&& this.getHeight() == other.getHeight();
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x,y,width,height);
	}
}