package co.com.k4soft.sistemanotas.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleNota {
	
	private Integer idDetalleNota;
	private Asignatura asignatura;
	private Estudiante estudiante;
	private double notaParcial;
	private double notaFinal;
	private double notaSeguimiento;
	

}
