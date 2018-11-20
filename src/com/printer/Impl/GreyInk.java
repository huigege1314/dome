package com.printer.Impl;

import java.awt.Color;

import com.printer.Ink;

/**
 * 灰色墨盒。GreyInk实现Ink接口。
 */
public class GreyInk implements Ink {
	// 打印采用灰色
	public String getColor(int r, int g, int b) {
		int c = (r + g + b) / 3;
		Color color = new Color(c, c, c);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
}
