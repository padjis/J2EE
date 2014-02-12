package com.indev.worldcup.user;

import javax.ejb.Remote;

import com.indev.worldcup.data.Media;

@Remote
public interface AdministratorService {
	/*as administrator*/
	
	//user management
	public boolean createUser(Users user);
	public boolean deleteUser(Users user);
	public boolean updateUser(Users user);
	
	//Ads management
	public boolean createAdsPhoto(Media media);
	public boolean updateAdsPhoto(Media media);
	public boolean deleteAdsPhoto(Media media);
	public boolean createAdsVideo(Media media);
	public boolean updateAdsVideo(Media media);
	public boolean deleteAdsVideo(Media media);
	public boolean acceptAdsSuggestion(Media media);
	public boolean refuseAdsSuggestion(Media media);
	
	//gestion des photos
	public boolean createPhoto(Media media);
	public boolean updatePhoto(Media media);
	public boolean deletePhoto(Media media);
	
	//gestion des video
	public boolean createVideo(Media media);
	public boolean updateVideo(Media media);
	public boolean deleteVideo(Media media);
}
