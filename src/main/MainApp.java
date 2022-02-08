/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainApp {

	public static void main(String[] args) {

		Mysql.openConnection();
		Mysql.createDB("Investigadores");

		Mysql.createTable("Investigadores", "Facultad", Inserciones.tablaFacultadCampos);
		Mysql.createTable("Investigadores", "Equipos", Inserciones.tablaEquiposCampos);
		Mysql.createTable("Investigadores", "Investigadores", Inserciones.tablaInvestigadoresCampos);
		Mysql.createTable("Investigadores", "Reserva", Inserciones.tablaReservaCampos);

		Mysql.insertData("Investigadores", "Facultad", Inserciones.insercionTablaFacultad);
		Mysql.insertData("Investigadores", "Equipos", Inserciones.insercionTablaEquipos);
		Mysql.insertData("Investigadores", "Investigadores", Inserciones.insercionTablaInvestigadores);
		Mysql.insertData("Investigadores", "Reserva", Inserciones.insercionTablaReserva);

		Mysql.getValues("Investigadores", "Investigadores");
		Mysql.deleteRecord("Investigadores", "Investigadores", "12345678");
		Mysql.getValues("Investigadores", "Investigadores");
		Mysql.closeConnection();
	}

}