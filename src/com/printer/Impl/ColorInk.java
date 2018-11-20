package com.printer.Impl;

import java.awt.Color;

import com.printer.Ink;



/**
 * 彩色墨盒。ColorInk实现Ink接口。
 * 
 */
public class ColorInk implements Ink {
	// 打印采用彩色
	public String getColor(int r, int g, int b) {
		Color color = new Color(r, g, b);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
}
