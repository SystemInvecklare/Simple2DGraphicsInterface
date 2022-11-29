package net.pointlessgames.libs.s2dgi.window;

import net.pointlessgames.libs.s2dgi.color.IColorInterpreter;
import net.pointlessgames.libs.s2dgi.texture.ITexture;

public interface IGraphics {
	void render(ITexture texture, int x, int y);
	void render(ITexture texture, int x, int y, int width, int height);
	void renderTiled(ITexture texture, int offsetX, int offsetY, int x, int y, int width, int height);
	<C> void renderRectangle(int x, int y, int width, int height, C color, IColorInterpreter<C> colorInterpreter);
	<C> void renderLine(int x1, int y1, int x2, int y2, C color, IColorInterpreter<C> colorInterpreter);
	<C> void setTint(C color, IColorInterpreter<C> colorInterpreter);
	/**
	 * finalColor = color*tint + additive (clamped between 0 and 255 for each channel)
	 * 
	 * tint and additive is assumed to be reset at {@link IWindow#renderBegin()}
	 */
	<C> void setAdditive(C color, IColorInterpreter<C> colorInterpreter);
}
