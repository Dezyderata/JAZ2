package repositories;

import domain.UserInformation;

public interface UsersInformationsRepositoryInterface {
	public boolean searchForUser(String name, String psw);
	UserInformation getUserInformationByName(String name);
	void add(UserInformation user);
	int count();
	void setPrivilages(String name);
}
