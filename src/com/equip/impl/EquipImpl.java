package com.equip.impl;

import org.aspectj.lang.JoinPoint;

import com.equip.Equip;

public class EquipImpl {
	public void before(JoinPoint jp) throws Throwable {
		Equip e = (Equip) jp.getArgs()[0];
		if (e != null && "指环".equals(e.getType())) {
			System.out.println("活动期间，可以免费将任意指环升级为“紫色梦幻”指环");
			e.setName("紫色梦幻" + e.getName());
			e.setAttackPlus(e.getAttackPlus() + 6);
			e.setDefencePlus(e.getDefencePlus() + 6);
		} else {
			System.out.println("非指环类装备");
		}
	}
}
