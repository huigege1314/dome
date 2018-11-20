package com.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.entity.Equip;

import cn.entity.Player;

public class JdTest {
	@Test
	public void Testgetcs() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player  pa = (Player) context.getBean("zhangsan");
		Equip armet = pa.getArmet();
		Equip loricae = pa.getLoricae();
		Equip boot = pa.getBoot();
		Equip ring = pa.getRing();
		printEquip(armet,loricae,boot,ring);
		System.out.println("升级头盔");
		pa.updateEquip(armet);
		System.out.println("升级结束");
		
		System.out.println("升级铠甲");
		pa.updateEquip(loricae);
		System.out.println("升级结束");
		System.out.println("升级靴子");
		pa.updateEquip(boot);
		System.out.println("升级结束");
		System.out.println("升级指环");
		pa.updateEquip(ring);
		System.out.println("升级结束");
		
		printEquip(pa.getArmet(),pa.getLoricae(),pa.getBoot(),pa.getRing());
	}
	
	private static void printEquip(Equip... equips) {
		if (equips == null || equips.length == 0)
			return;
		System.out.println("***************************************");
		for (Equip e : equips)
			System.out.println(e.getName() + " [速度增加：" + e.getSpeedPlus()
					+ "；攻击增加：" + e.getAttackPlus() + "；防御增加："
					+ e.getDefencePlus() + "]");
		System.out.println("***************************************");
	}
}
