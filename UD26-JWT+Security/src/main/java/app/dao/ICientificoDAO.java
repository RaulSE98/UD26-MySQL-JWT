package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import app.dto.Cientifico;

/**
 * @author Raul
 *
 */


public interface ICientificoDAO extends JpaRepository<Cientifico, String>{

}
