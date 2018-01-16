package com.javapoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author matteodaniele
 * @update 1/07/2018
 * @version 0.5.1
 */

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserRecord> getAllUsers(){  
        List<UserRecord>userRecords = new ArrayList();  
        userRepository.findAll().forEach(userRecords::add);  
        return userRecords;  
    }  
    public Optional<UserRecord> getUser(String id){  
        return userRepository.findById(Integer.parseInt(id));  
    }  
    public void addUser(UserRecord userRecord){  
        userRepository.save(userRecord);  
    }  
    public void delete(String id){  
        userRepository.deleteById(Integer.parseInt(id));  
    }  

}
