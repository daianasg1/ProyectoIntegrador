package com.portfolio.daianagodoyBACK.Security.Service;

import com.portfolio.daianagodoyBACK.Security.Entity.Usuario;
import com.portfolio.daianagodoyBACK.Security.Repository.iUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import javax.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository isuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return isuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return isuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return isuarioRepository.existsByEmail(email);
    }
    public void save(Usuario usuario){
        isuarioRepository.save(usuario);
    }
}
