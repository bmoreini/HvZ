/**
 * GoToStore.java
 * Copyright 2011-2014, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2260.hvz;

/**
 * GoToStore - the mission to go to the store and back
 * @author Craig A. Damon
 *
 */
public class GoToStore extends RoundTrip
{

	/**
	 * create a mission to go to the store and return
	 * @param player the player being sent on this mission, never null
	 */
	public GoToStore(Player player)
		{
			super(player,"Store",10);
		}

}
