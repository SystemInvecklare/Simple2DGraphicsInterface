package net.pointlessgames.libs.s2dgi.window;

import net.pointlessgames.libs.s2dgi.key.IKeyListener;
import net.pointlessgames.libs.s2dgi.mouse.IMouseListener;

public interface IWindow {
	void renderBegin();
	IGraphics getGraphics();
	void renderEnd();
	
	int getWidth();
	int getHeight();
	
	void addMouseListener(IMouseListener mouseListener);
	void removeMouseListener(IMouseListener mouseListener);
	void addKeyListener(IKeyListener keyListener);
	void removeKeyListener(IKeyListener keyListener);
	
	boolean isKeyDown(int keyCode);
	boolean isMouseButtonDown(IMouseListener.MouseButton mouseButton);
	int getMouseX();
	int getMouseY();
}
