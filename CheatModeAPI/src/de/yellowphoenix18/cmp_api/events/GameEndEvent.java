package de.yellowphoenix18.cmp_api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameEndEvent extends Event {
	
	public static HandlerList handlers = new HandlerList();
	
	Player win;

	
	public GameEndEvent(Player winner) {
		this.win = winner;
	}
	
	public Player getWinner() {
		return this.win;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}
