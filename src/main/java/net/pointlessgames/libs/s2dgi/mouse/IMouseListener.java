package net.pointlessgames.libs.s2dgi.mouse;

public interface IMouseListener {
	public static final class MouseButton {
		private MouseButton() {}
		
		public static final MouseButton BUTTON_1 = new MouseButton();
		public static final MouseButton BUTTON_2 = new MouseButton();
		public static final MouseButton BUTTON_3 = new MouseButton();
		public static final MouseButton UNKNOWN_BUTTON = new MouseButton();
	}
	void onPressed(int x, int y, MouseButton button);
	void onReleased(int x, int y, MouseButton button);
	void onMoved(int x, int y);
	void onDragged(int x, int y);
	void onScroll(int x, int y, int steps);
}
