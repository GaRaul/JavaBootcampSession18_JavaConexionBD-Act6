/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainApp {

	public static void main(String[] args) {

		Mysql.openConnection();
		Mysql.createDB("PiezasYProveedores");

		Mysql.createTable("PiezasYProveedores", "Piezas", Inserciones.tablaPiezasCampos);
		Mysql.createTable("PiezasYProveedores", "Proveedores", Inserciones.tablaProveedoresCampos);
		Mysql.createTable("PiezasYProveedores", "Suministra", Inserciones.tablaSuministraCampos);

		Mysql.insertData("PiezasYProveedores", "Piezas", Inserciones.insercionTablaPiezas);
		Mysql.insertData("PiezasYProveedores", "Proveedores", Inserciones.insercionTablaProveedores);
		Mysql.insertData("PiezasYProveedores", "Suministra", Inserciones.insercionTablaSuministra);

		Mysql.getValues("PiezasYProveedores", "Piezas");
		Mysql.deleteRecord("PiezasYProveedores", "Piezas", 1);
		Mysql.getValues("PiezasYProveedores", "Piezas");
		Mysql.closeConnection();
	}

}