package com.indev.worldcup.user;

import javax.ejb.Remote;

import com.indev.worldcup.data.FreelanceRequestServiceImpl;

@Remote
public interface ChiefEditorService {
	/*as chief editor*/
	public boolean acceptFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest);
	public boolean refuseFreelanceRequest(FreelanceRequestServiceImpl freelanceRequest);
}
