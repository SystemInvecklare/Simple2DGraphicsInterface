package net.pointlessgames.libs.s2dgi.window;

import net.pointlessgames.libs.s2dgi.color.IColorInterpreter;
import net.pointlessgames.libs.s2dgi.texture.ITexture;

public interface IGraphics {
	void render(ITexture texture, int x, int y);
	void render(ITexture texture, int x, int y, int width, int height);
	void renderTiled(ITexture texture, int offsetX, int offsetY, int x, int y, int width, int height);
	<C> void renderRectangle(int x, int y, int width, int height, C color, IColorInterpreter<C> colorInterpreter);
	<C> void renderLine(int x1, int y1, int x2, int y2, C color, IColorInterpreter<C> colorInterpreter);
}
