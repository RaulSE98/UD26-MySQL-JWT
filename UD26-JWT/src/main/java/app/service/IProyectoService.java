package app.service;

import java.util.List;

import app.dto.Proyecto;

public interface IProyectoService {
	
			//Metodos del CRUD
			public List<Proyecto> listarProyectos(); //Listar All 
			
			public Proyecto guardarProyecto(Proyecto proyecto);	//Guarda un Proyecto CREATE
			
			public Proyecto proyectoXID(String id); //Leer datos de un Proyecto READ
			
			public Proyecto actualizarProyecto(Proyecto proyecto); //Actualiza datos del Proyecto UPDATE
			
			public void eliminarProyecto(String id);// Elimina el Proyecto DELETE


}
