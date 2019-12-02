package edu.vtc.cis2260.hvz;

import java.util.Collection;
import java.util.Iterator;

public class SingleShotWeapon extends Weapon {
	private Collection<Player> targets;
	private boolean fired;
	
	
	protected SingleShotWeapon(Player owner) {
		super(owner);
	}


	@Override
	public void chooseTargets() {
		targets = getPlayer().findOpponents();
		//return getGame().findZombies(getPlayer(),120,300,240,50);

	}


	@Override
	public void fire() {
		// use getCurrentTargets iterator below
		// Code to shoot the weapon and eliminate one of the targets
		
	}


	@Override
	public boolean isEmpty() {

		return fired;
	}


	@Override
	public void reload() {
		fired = false;
	}


	@Override
	public int getRemainingShots() {
		if (!fired) {
			return 1;
		}
		else {
			return 0;
		}
	}


	@Override
	public Iterator<Player> getCurrentTargets() {
		// TODO Auto-generated method stub
		return null;
	}

}
