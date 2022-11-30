package net.pointlessgames.libs.s2dgi.util;

public class ImplementationUtil {
	public static int mod(int x, int y) {
		if(y < 0) {
			return -mod(x, -y);
		}
		if(x >= 0) {
			return x%y;
		} else {
			int res = y - (-x)%y;
			return res == y ? 0 : res;
		}
	}
	
	
	public static int qSin(int quarterRotations) {
		quarterRotations = mod(quarterRotations, 4);
		return quarterRotations%2 == 0 ? 0 : (2-quarterRotations);
	}
	
	public static int qCos(int quarterRotations) {
		quarterRotations = mod(quarterRotations+1, 4);
		return quarterRotations%2 == 0 ? 0 : (2-quarterRotations);
	}
}
