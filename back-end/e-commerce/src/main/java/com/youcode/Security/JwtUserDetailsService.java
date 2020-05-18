package com.youcode.Security;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.youcode.Entiter.Roles;
import com.youcode.Services.IUserSRV;





@Service
public class JwtUserDetailsService implements UserDetailsService{
	@Autowired 
	private IUserSRV gestionuser;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.youcode.Entiter.User GU = gestionuser.findByUsername(username);
		if (GU != null) {
			return new User(GU.getUsername(),GU.getPassword(),getGrantedAuthorities(GU));
		} 
		
//		if (GU != null) {
//			return new User(GU.getUsername(),GU.getPassword(),
//					new ArrayList<>());
//		} 
//		if ("javainuse".equals(username)) {
//			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
//					new ArrayList<>());
//		} 
		else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}

	}
	private List<GrantedAuthority> getGrantedAuthorities(com.youcode.Entiter.User user)
	 {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		Roles role = user.getRoles();
		
			authorities.add(new SimpleGrantedAuthority(role.getLable()));
		System.out.println(authorities);
		
		return authorities;
	}
}
