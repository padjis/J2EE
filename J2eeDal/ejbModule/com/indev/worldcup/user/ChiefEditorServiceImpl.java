package com.indev.worldcup.user;

import javax.ejb.Stateless;

import com.indev.worldcup.data.FreelanceRequestServiceImpl;

@Stateless
public class ChiefEditorServiceImpl extends UserServiceImpl implements ChiefEditorService {

	@Override
	public boolean acceptFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean refuseFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest) {
		// TODO Auto-generated method stub
		return false;
	}

}
