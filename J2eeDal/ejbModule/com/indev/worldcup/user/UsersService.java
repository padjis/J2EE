package com.indev.worldcup.user;

import javax.ejb.Remote;

@Remote
public interface UsersService {
	
	public boolean login();
	public boolean editProfile(Users user);
	public boolean logout();
	
}
