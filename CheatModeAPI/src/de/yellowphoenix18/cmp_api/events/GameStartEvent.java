package de.yellowphoenix18.cmp_api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameStartEvent extends Event {
	
	public static HandlerList handlers = new HandlerList();
	
	int count;

	
	public GameStartEvent(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}