package asmecbs.agranee.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import asmecbs.agranee.models.User;
import asmecbs.agranee.models.UserPrincipal;
import asmecbs.agranee.repositories.UserRepository;

@Service
public class MyUserdetailsServices implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user =userRepository.findByUsername(username);	
		if(user==null) {
			 throw new UsernameNotFoundException("User Not Found !");
		}

		return new UserPrincipal(user) ;
	}

}
