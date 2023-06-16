package com.app.gbs.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gbs.modelo.Usuarios;

/*aqui ira nuestra tabla y el tipo de varible de la id ( por el id se buscaran a los usarios) en este caso que se llame 
  user, pueden ir mas repositorios*/

public interface GbsRepository extends JpaRepository<Usuarios, Long> {

}
