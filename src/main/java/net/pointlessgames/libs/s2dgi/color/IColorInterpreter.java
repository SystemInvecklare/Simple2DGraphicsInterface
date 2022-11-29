package net.pointlessgames.libs.s2dgi.color;

/**
 * Extracts the components (0-255) of a color.
 * 
 * @author Mattias Selin
 *
 * @param <C> color type
 */
public interface IColorInterpreter<C> {
	int getRed(C color);
	int getGreen(C color);
	int getBlue(C color);
	int getAlpha(C color);
}
