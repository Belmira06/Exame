package ao.com.fazendo.api.exame.BEL;

import org.springframework.data.repository.CrudRepository;

import ao.com.fazendo.api.exame.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{
	
	}
