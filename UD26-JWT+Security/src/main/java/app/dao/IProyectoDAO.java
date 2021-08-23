package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import app.dto.Proyecto;

/**
 * @author Raul
 *
 */


public interface IProyectoDAO extends JpaRepository<Proyecto, String>{

}
