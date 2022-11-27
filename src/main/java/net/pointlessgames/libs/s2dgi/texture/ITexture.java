package net.pointlessgames.libs.s2dgi.texture;

public interface ITexture {
	int getWidth();
	int getHeight();
	ITexture createSubTexture(int sourceX, int sourceY, int width, int height);
}
