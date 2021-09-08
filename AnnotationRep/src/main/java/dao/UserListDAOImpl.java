package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Service.UserListResponseDTO;

@Repository("userListDAO")
public class UserListDAOImpl implements UserListDAO {

	@Override
	public List<UserListResponseDTO> getUserListdao() {
		System.out.println("dao call");
		
		//리스트를 만든다.
		List<UserListResponseDTO> userlist = new ArrayList<UserListResponseDTO>();
		
		//총 3명의 학생을 만든다.
		
		UserListResponseDTO list = new UserListResponseDTO();
		list.setUserName("홍길동");
		list.setUserAge("26");
		list.setUserAddress("경기도 수원시");
		list.setUserImage("peopleimage.png");
		
		userlist.add(list);
		
		UserListResponseDTO list2 = new UserListResponseDTO();
		list.setUserName("임꺽정");
		list.setUserAge("30");
		list.setUserAddress("경기도 안양시");
		list.setUserImage("peopleimage.png");
		
		userlist.add(list2);
		
		UserListResponseDTO list3 = new UserListResponseDTO();
		list.setUserName("김철수");
		list.setUserAge("28");
		list.setUserAddress("경기도 오산시");
		list.setUserImage("peopleimage.png");
		
		userlist.add(list3);
		
		return userlist;
		
		
	}
	
	

}
