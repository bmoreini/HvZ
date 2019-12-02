/**
 * BuyWeapon.java
 * Copyright 2011-2014, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2260.hvz;

/**
 * BuyWeapon - a mission to go buy a gun (at the store)
 * @author Craig A. Damon
 *
 */
public class BuyWeapon extends GoToStore
{

	/**
	 * create the mission to but the weapon
	 * @param human the controller for the person buying the weapon, never null
	 */
	public BuyWeapon(HumanController human)
		{
			super(human.getPlayer());
			_human = human;
		}


	/**
	 * note that the person on the mission arrived at a structure
	 * @param structure never null
	 * @see edu.vtc.cis2260.hvz.Mission#arrivedAt(edu.vtc.cis2260.hvz.Structure)
	 */
	@Override
	public void arrivedAt(Structure structure)
	{
		if (structure.getName().equals("Store")) {
			_human.setCurrentWeapon(new SingleShotWeapon(getPlayer()));
		}
    super.arrivedAt(structure);
	}

	private final HumanController _human;  // the (controller for) the person doing this, never null
}
