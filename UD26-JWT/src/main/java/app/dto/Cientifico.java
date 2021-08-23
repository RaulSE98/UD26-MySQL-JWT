package app.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cientificos")//en caso que la tabala sea diferente
public class Cientifico {
	
		//Atributos de entidad estudiante
		@Column(name= "DNI")
		private long DNI;
		@Column(name = "nomApels")//no hace falta si se llama igual
		private String nomApels;
		
		@OneToMany
	    @JoinColumn(name="cien_DNI")
	    private List<AsignadoA> asignadoA;

		
		//Constructores
		
		public Cientifico() {
		
		}

		public Cientifico(int DNI, String nomApels, List<AsignadoA> asignadoA) {
			super();
			this.DNI = DNI;
			this.nomApels = nomApels;
			this.asignadoA = asignadoA;
		}

		//Getters y Setters
		/**
		 * @return the id
		 */
		public long getId() {
			return DNI;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(long DNI) {
			this.DNI = DNI;
		}

		/**
		 * @return the nombre
		 */
		public String getNomApels() {
			return nomApels;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNomApels(String nomApels) {
			this.nomApels = nomApels;
		}

		/**
		 * @return the asignadoA
		 */
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
		public List<AsignadoA> getAsignadoA() {
			return asignadoA;
		}

		/**
		 * @param registroCurso the registroCurso to set
		 */
		public void setAsignadoA(List<AsignadoA> asignadoA) {
			this.asignadoA = asignadoA;
		}

		//Metodo toString
		@Override
		public String toString() {
			return "Cientifico [id=" + DNI + ", nombre=" + nomApels 
					+ "]";
		}



}
