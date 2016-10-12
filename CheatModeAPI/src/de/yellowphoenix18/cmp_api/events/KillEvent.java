package de.yellowphoenix18.cmp_api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KillEvent extends Event {
	
	public static HandlerList handlers = new HandlerList();
	
	Player player;
	Player killer;

	
	public KillEvent(Player p, Player k) {
		this.player = p;
		this.killer = k;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public Player getKiller() {
		return this.killer;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}
