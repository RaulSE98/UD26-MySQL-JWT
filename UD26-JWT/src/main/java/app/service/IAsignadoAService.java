package app.service;

import java.util.List;

import app.dto.AsignadoA;


public interface IAsignadoAService {

			//Metodos del CRUD
			public List<AsignadoA> listarAsignadoA(); //Listar All 
			
			public AsignadoA guardarAsignadoA(AsignadoA asignadoA);	//Guarda un AsignadoA CREATE
			
			public AsignadoA asignadoAXID(String id); //Leer datos de un AsignadoA READ
			
			public AsignadoA actualizarAsignadoA(AsignadoA asignadoA); //Actualiza datos del AsignadoA UPDATE
			
			public void eliminarAsignadoA(String id);// Elimina el AsignadoA DELETE

}
