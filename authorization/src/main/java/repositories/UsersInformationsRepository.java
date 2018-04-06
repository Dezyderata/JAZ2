package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.UserInformation;

public class UsersInformationsRepository implements UsersInformationsRepositoryInterface {

	private static List<UserInformation> db = new ArrayList<UserInformation>();
	
	@Override
	public void setPrivilages(String name) {
		for(UserInformation user:db) {
			if(user.getName().equalsIgnoreCase(name)) {
	
			}
		}
	}
	@Override
	public UserInformation getUserInformationByName(String name) {
		for(UserInformation user: db){
			if(user.getName().equalsIgnoreCase(name))
				return user;
		}
		return null;
	}

	@Override
	public void add(UserInformation user) {
		db.add(user);	
	}
	@Override
	public int count() {
		return db.size();
	}

}
