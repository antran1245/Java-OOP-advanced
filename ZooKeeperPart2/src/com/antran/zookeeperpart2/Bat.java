package com.antran.zookeeperpart2;

import com.antran.zookeeperpart1.Mammal;

public class Bat extends Mammal {
	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Sound of a bat taking off.");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("so ~ well, never mind");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("FIRE!!!!!!!!!!!");
		this.energyLevel -= 100;
	}
}
