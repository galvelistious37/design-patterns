package com.johnny.pack.age.solidpinciples.interfacesegregation.entity;

//Base class for all entities
public abstract class Entity {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
