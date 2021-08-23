package app.dto;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")//en caso que la tabala sea diferente
public class AsignadoA {
	
		//Atributos de entidad registro_curso
		
		@ManyToOne
	    @JoinColumn(name = "cien_DNI")
		Cientifico cientifico;
	 
	    @ManyToOne
	    @JoinColumn(name = "proy_id")
	    Proyecto proyecto;
	    
	  //Constructores
		
		public AsignadoA() {
		
		}

		public AsignadoA(Cientifico cientifico, Proyecto proyecto) {
			this.cientifico = cientifico;
			this.proyecto = proyecto;
		}

		/**
		 * @return the cientifico
		 */
		public Cientifico getCientifico() {
			return cientifico;
		}


		/**
		 * @param cientifico the cientifico to set
		 */
		public void setCientifico(Cientifico cientifico) {
			this.cientifico = cientifico;
		}


		/**
		 * @return the proyecto
		 */
		public Proyecto getProyecto() {
			return proyecto;
		}


		/**
		 * @param proyecto the proyecto to set
		 */
		public void setProyecto(Proyecto proyecto) {
			this.proyecto = proyecto;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "AsignadoA [cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
		}




}
