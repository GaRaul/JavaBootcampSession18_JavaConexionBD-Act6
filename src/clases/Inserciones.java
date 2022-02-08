/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaPiezasCampos = "(\r\n" + "  Codigo int unsigned NOT NULL AUTO_INCREMENT,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" + "  PRIMARY KEY (Codigo)\r\n" + ")";

	public static String tablaProveedoresCampos = "(\r\n" + "  Id char(4) NOT NULL,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" + "  PRIMARY KEY (Id)\r\n" + ")";

	public static String tablaSuministraCampos = "(\r\n" + "  CodigoPieza int unsigned NOT NULL AUTO_INCREMENT,\r\n"
			+ "  IdProveedor char(4) NOT NULL,\r\n" + "  Precio int unsigned DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (CodigoPieza,IdProveedor),\r\n" + "  KEY IdProveedor (IdProveedor),\r\n"
			+ "  CONSTRAINT Suministra_ibfk_1 FOREIGN KEY (CodigoPieza) REFERENCES Piezas (Codigo) ON DELETE CASCADE,\r\n"
			+ "  CONSTRAINT Suministra_ibfk_2 FOREIGN KEY (IdProveedor) REFERENCES Proveedores (Id) ON DELETE CASCADE\r\n" + ")";

	public static String insercionTablaPiezas = "(Nombre) values "
			+ "('Tornillo'), ('Tuerca'), ('Visagra'), ('Pomo'), ('Placa');";

	public static String insercionTablaProveedores = "(Id, Nombre) values " + "('1111', 'ABC')," + "('2222', 'DEF'),"
			+ "('3333', 'GHC')," + "('4444', 'SAD')," + "('5555', 'FAS');";

	public static String insercionTablaSuministra = "(CodigoPieza, IdProveedor, Precio) values " 
			+ "(1, '1111', 200),"
			+ "(2, '2222', 300)," 
			+ "(3, '3333', 400)," 
			+ "(4, '4444', 1000)," 
			+ "(5, '5555', 600);";
}