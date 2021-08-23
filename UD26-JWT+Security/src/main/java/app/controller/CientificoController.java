package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Cientifico;
import app.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientificos/{id}")
	public Cientifico EstudianteXID(@PathVariable(name="id") String id) {
		
		Cientifico Cientifico_xid= new Cientifico();
		
		Cientifico_xid=cientificoServiceImpl.cientificoXID(id);
		
		System.out.println("Cientifico XID: "+Cientifico_xid);
		
		return Cientifico_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarEstudiante(@PathVariable(name="id")String id,@RequestBody Cientifico Cientifico) {
		
		Cientifico Cientifico_seleccionado= new Cientifico();
		Cientifico Cientifico_actualizado= new Cientifico();
		
		Cientifico_seleccionado= cientificoServiceImpl.cientificoXID(id);
		
		Cientifico_seleccionado.setNomApels(Cientifico.getNomApels());
		
		Cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(Cientifico_seleccionado);
		
		System.out.println("El Estudiante actualizado es: "+ Cientifico_actualizado);
		
		return Cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eleiminarEstudiante(@PathVariable(name="id")String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}

}
