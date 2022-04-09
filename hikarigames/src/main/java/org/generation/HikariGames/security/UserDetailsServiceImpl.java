package org.generation.HikariGames.security;

import java.util.Optional;

import org.generation.HikariGames.model.Usuario;
import org.generation.HikariGames.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> usuario = userRepository.findByUsuario(userName);
		  
		usuario.orElseThrow(() -> new UsernameNotFoundException(userName + " Usuário não encontrado!."));

		return usuario.map(UserDetailsImpl::new).get();
	}
	
}