package repositories;

import domain.UserInformation;

public interface UsersInformationsRepositoryInterface {
	UserInformation getUserInformationByName(String name);
	void add(UserInformation user);
	int count();
	void setPrivilages(String name);
}
