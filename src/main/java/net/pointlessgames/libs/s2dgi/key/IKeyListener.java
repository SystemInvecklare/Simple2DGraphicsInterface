package net.pointlessgames.libs.s2dgi.key;

public interface IKeyListener {
	void onKeyTyped(int keyCode, char c);
	void onKeyPressed(int keyCode);
	void onKeyReleased(int keyCode);
}
