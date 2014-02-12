package com.indev.worldcup.user;

import javax.ejb.Remote;

import com.indev.worldcup.data.FreelanceRequestServiceImpl;

@Remote
public interface SubscribedService {

	/*as subscribed*/
	public boolean subscribe();
	public boolean sendFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest);
	public boolean consultFreelanceRequestState(FreelanceRequestServiceImpl freelanceRequest);
}
