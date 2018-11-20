package cn.aop;



import org.aspectj.lang.JoinPoint;

import cn.entity.Equip;

public class EquipServiceLogger {
	public void before(JoinPoint jp) {
		Equip eq = (Equip) jp.getArgs()[0];
		if(eq != null && "指环".equals(eq.getType())) {
			System.out.println("活动期间，可以免费将任意指环升级为“紫色梦幻”指环");
			eq.setName("紫色梦幻" + eq.getName());
			eq.setAttackPlus(eq.getAttackPlus()+6);
			eq.setDefencePlus(eq.getDefencePlus()+6);
		}else {
			System.out.println("不是指环类型的装备！！");
		}
		
	}
}
