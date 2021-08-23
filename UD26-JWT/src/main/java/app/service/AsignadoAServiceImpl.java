package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.IAsignadoADAO;
import app.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService{

	@Autowired
	IAsignadoADAO iAsignadoADAO;

	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA asignadoAXID(String id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public void eliminarAsignadoA(String id) {
		iAsignadoADAO.deleteById(id);
	}

}
