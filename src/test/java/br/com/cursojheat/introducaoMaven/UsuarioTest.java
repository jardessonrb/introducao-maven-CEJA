package br.com.cursojheat.introducaoMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {
	
	public static String email = "usuario@jrs.com.br";
	public static String senha = "usuario123456";
	
	@Test
	public void emailSenhaUsuario() {
		Usuario usuario =  new Usuario();
		
		assertEquals(usuario.getEmail(), email);
		assertTrue(usuario.getSenha().equals(senha));
	}

}
