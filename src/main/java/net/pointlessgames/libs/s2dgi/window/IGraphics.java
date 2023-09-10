package net.pointlessgames.libs.s2dgi.window;

import net.pointlessgames.libs.s2dgi.color.IColorInterpreter;
import net.pointlessgames.libs.s2dgi.texture.ITexture;

public interface IGraphics {
	void render(ITexture texture, int x, int y);
	void render(ITexture texture, int x, int y, int width, int height);
	/**
	 * Implementations should combine parameter transforms in the following order.
	 * 1. Apply flipX and flipY
	 * 2. Apply rotation
	 * 3. Apply translastion.
	 * 
	 * @param texture
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param quarterRotations
	 * @param flipX
	 * @param flipY
	 * @param rotateDimensions
	 */
	void render(ITexture texture, int x, int y, int width, int height, int quarterRotations, boolean flipX, boolean flipY, boolean rotateDimensions);
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
	/**
	 * <p>Implementations promise to make a snapshot copy of the clipping rectangle when this is called.</p>
	 * <p>Calling this with {@code null} corresponds to clearing any current clipping.</p>
	 * <p>Clipping is reset to an implementation dependent default at {@link IWindow#renderBegin()}. For example {@code null} or a rectangle covering the whole window.</p>
	 */
	void setClip(IClippingRectangle clippingRectangle);
	/**
	 * @see #setClip(IClippingRectangle)
	 */
	void setClip(int x, int y, int width, int height);
	/**
	 * Returns an immutable copy of the current clip rectangle, or {@code null} if there is currently no clipping set.
	 */
	IClippingRectangle getClip();
}
