package com.app.gbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.gbs.modelo.Usuarios;
import com.app.gbs.repository.GbsRepository;

/*preparando metodos para interactuar con base de datos h2*/
/*inyeccion de dependeicnasi*/

@Component
public class ServicioRegister {
    @Autowired
    private GbsRepository userRepository;

    public Usuarios createuser(Usuarios user){
        return userRepository.save(user);
    }

}