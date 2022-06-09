package com.antran.zookeeperpart1;

public class Mammal {
	protected int energyLevel;

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

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
