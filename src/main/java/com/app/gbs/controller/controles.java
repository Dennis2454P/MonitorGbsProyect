package com.app.gbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.gbs.ServicioRegister;
import com.app.gbs.modelo.Usuarios;


/*lsito para hacer las consutlas y especificar nuestras rutas*/

@RestController
@RequestMapping("api/usuarios")
public class controles {
	
    @Autowired
    private ServicioRegister userService;

    @PostMapping
    public Usuarios createUser(@RequestBody Usuarios user){
        return userService.createuser(user);
    }
}
