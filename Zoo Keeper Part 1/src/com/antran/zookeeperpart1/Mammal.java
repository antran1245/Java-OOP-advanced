package com.antran.zookeeperpart1;

public class Mammal {
	public int energyLevel;

	/**
	 * @param energyLevel
	 */
	public Mammal() {
		this.energyLevel = 100;
	}

	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
}
