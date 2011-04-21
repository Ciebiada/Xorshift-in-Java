package org.reddot.math;

public class Xorshift {
	private int x = 123456789;
	private int y = 362436069;
	private int z = 521288629;
	private int w = 88675123;

	public Xorshift() {
	}
	
	public float getFloat() {
		int t;
		t = (x ^ (x << 11));
		x = y;
		y = z;
		z = w;
		return (float) ((w = (w ^ (w >>> 19)) ^ (t ^ (t >>> 8)))
				& 0xffffffffl) * 2.328306e-10f;
	}
}
