package component;

import org.springframework.stereotype.Component;

@Component("rooobot")
public class Robot {

	private MissileAttack attack = new MissileAttack();
	
	public void fight() {
		System.out.println("로봇이 공격을 합니다.!");
		attack.attack();
	}
}
