package net.pointlessgames.libs.s2dgi.clipboard;

public interface ISimpleClipboard {
	void setText(CharSequence text);
	String getText(String fallback);
}
