package com.atro.securityJPA.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.atro.securityJPA.dao.UserRepository;
import com.atro.securityJPA.models.User;

@Service
public class AppUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findByUsername(username);

		user.orElseThrow(() -> new UsernameNotFoundException("User Not found: " + username));
		
		return user.map(AppUserDetails::new).get();
		
		//1 User user = userRepository.findByUsername(username);
		//1 return new AppUserDetails(user);
		  
		//2return new AppUserDetails(username);
	}

}
