package com.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.equip.Equip;
import com.equip.Player;

public class EquipTest {
	@Test
    public void test() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player p = (Player) context.getBean("zhangsan");
		Equip ring = p.getRing();
		Equip boot = p.getBoot();
		printEquip(ring, boot);
		
		System.out.println("==========升级靴子==========");
		p.updateEquip(boot);
		System.out.println("=========升级靴子结束=========");
		System.out.println("==========升级指环==========");
		p.updateEquip(ring);
		System.out.println("=========升级指环结束=========");
		
		printEquip(p.getRing(), p.getBoot());
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
