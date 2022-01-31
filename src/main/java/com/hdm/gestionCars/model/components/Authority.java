package com.hdm.gestionCars.model.components;

public class Authority {
	public static final String[] USER_AUTHORITIES = { "user:read" };
	public static final String[] SUPER_ADMIN_AUTHORITIES = { "user:read", "user:create", "user:update", "user:delete" };
}