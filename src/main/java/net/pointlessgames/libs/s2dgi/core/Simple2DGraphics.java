package net.pointlessgames.libs.s2dgi.core;

public class Simple2DGraphics {
	private static ISimple2DGraphics instance = null;

	private Simple2DGraphics() {}
	
	public static ISimple2DGraphics get() {
		return instance;
	}
	
	public static void set(ISimple2DGraphics instance) {
		Simple2DGraphics.instance = instance;
	}
}
