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
@Table(name="proyectos")//en caso que la tabala sea diferente
public class Proyecto {

	//Atributos de entidad curso
		@Column(name="id")
		private String id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "horas")//no hace falta si se llama igual
		private int horas;
		
		@OneToMany
	    @JoinColumn(name="proy_id")
	    private List<AsignadoA> asignadoA;
		
		//Constructores
		
		public Proyecto() {
		
		}

		/**
		 * @param id
		 * @param nombre
		 * @param horas
		 * @param registroCurso
		 */
		public Proyecto(String id, String nombre, int horas, List<AsignadoA> asignadoA) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.horas = horas;
			this.asignadoA = asignadoA;
		}

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the horas
		 */
		public int getHoras() {
			return horas;
		}

		/**
		 * @param horas the horas to set
		 */
		public void setHoras(int horas) {
			this.horas = horas;
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

		@Override
		public String toString() {
			return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
		}



}
