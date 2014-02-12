package com.indev.worldcup.user;

import javax.ejb.Stateless;

import com.indev.worldcup.data.FreelanceRequestServiceImpl;

@Stateless
public class SubscribedServiceImpl extends UserServiceImpl implements SubscribedService {

	@Override
	public boolean subscribe() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean consultFreelanceRequestState(
			FreelanceRequestServiceImpl freelanceRequest) {
		// TODO Auto-generated method stub
		return false;
	}

}
