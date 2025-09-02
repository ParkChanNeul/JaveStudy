package com.mypet.model;

public interface PetType {
	
	public abstract void eat(Pet pet);
	/*public abstract*/ void play(Pet pet);
	void clean(Pet pet);
	String getType();
	
	
}
