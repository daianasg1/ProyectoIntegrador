package com.portfolio.daianagodoyBACK.Security.Repository;

import com.portfolio.daianagodoyBACK.Security.Entity.Rol;
import com.portfolio.daianagodoyBACK.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
