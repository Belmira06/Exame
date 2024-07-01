package ao.com.fazendo.api.exame.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.com.fazendo.api.exame.BEL.IUsuario;
import ao.com.fazendo.api.exame.model.Usuario;


@RestController
@CrossOrigin("*")
@RequestMapping ("/usuarios")
public class UsuarioController{
	
	@Autowired
	private IUsuario bel;
	
	
	@GetMapping ("/usuario")
	public List<Usuario> listaUsuarios () {
		return (List<Usuario>) bel.findAll();
	}
	
	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = bel.save(usuario);
		return usuarioNovo;
		
	}
	@PutMapping
	public Usuario editarUsuario(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = bel.save(usuario);
		return usuarioNovo;
	
	}
	
	@DeleteMapping("/id")
	public Optional  <Usuario> excluirUsuario(@PathVariable Integer id) {
	   Optional <Usuario> usuario = bel.findById(id);
	   bel.deleteById(id);
	   return usuario;
	}
}