package net.pointlessgames.libs.s2dgi.window;

import net.pointlessgames.libs.s2dgi.texture.ITexture;

public interface IGraphics {
	void render(ITexture texture, int x, int y);
	void render(ITexture texture, int x, int y, int width, int height);
	void renderTiled(ITexture texture, int offsetX, int offsetY, int x, int y, int width, int height);
}
