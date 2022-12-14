package net.pointlessgames.libs.s2dgi.core;

import java.io.IOException;

import net.pointlessgames.libs.s2dgi.clipboard.ISimpleClipboard;
import net.pointlessgames.libs.s2dgi.texture.ITexture;
import net.pointlessgames.libs.s2dgi.window.IWindow;

public interface ISimple2DGraphics {
	IWindow getMainWindow();
	ITexture loadTexture(String path) throws IOException;
	/**
	 * @return clipboard object if supported. Might be null.
	 */
	ISimpleClipboard getClipboard();
}
