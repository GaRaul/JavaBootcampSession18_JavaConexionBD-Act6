/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaEquiposCampos = "(\r\n" + "  NumSerie char(4) NOT NULL,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" + "  Facultad int unsigned DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (NumSerie),\r\n" + "  KEY Facultad (Facultad),\r\n"
			+ "  CONSTRAINT Equipos_ibfk_1 FOREIGN KEY (Facultad) REFERENCES Facultad (Codigo) ON DELETE CASCADE\r\n" + ")";

	public static String tablaFacultadCampos = "(\r\n" + "  Codigo int unsigned NOT NULL AUTO_INCREMENT,\r\n"
			+ "  Nombre varchar(100) DEFAULT NULL,\r\n" + "  PRIMARY KEY (Codigo)\r\n" + ")";

	public static String tablaInvestigadoresCampos = "(\r\n" + "  DNI varchar(8) NOT NULL,\r\n"
			+ "  NomApels varchar(255) DEFAULT NULL,\r\n" + "  Facultad int unsigned DEFAULT NULL,\r\n"
			+ "  PRIMARY KEY (DNI),\r\n" + "  KEY Facultad (Facultad),\r\n"
			+ "  CONSTRAINT Investigadores_ibfk_1 FOREIGN KEY (Facultad) REFERENCES Facultad (Codigo) ON DELETE CASCADE\r\n"
			+ ")";

	public static String tablaReservaCampos = "(\r\n" + "  DNI varchar(8) NOT NULL,\r\n"
			+ "  NumSerie char(4) NOT NULL,\r\n" + "  Comiendo varchar(20) DEFAULT NULL,\r\n"
			+ "  Fin varchar(20) DEFAULT NULL,\r\n" + "  PRIMARY KEY (DNI,NumSerie),\r\n"
			+ "  KEY NumSerie (NumSerie),\r\n"
			+ "  CONSTRAINT Reserva_ibfk_1 FOREIGN KEY (DNI) REFERENCES Investigadores (DNI) ON DELETE CASCADE,\r\n"
			+ "  CONSTRAINT Reserva_ibfk_2 FOREIGN KEY (NumSerie) REFERENCES Equipos (NumSerie) ON DELETE CASCADE\r\n" + ")";

	public static String insercionTablaEquipos = "(NumSerie, Nombre, Facultad) values "
			+ "('1111', 'Equipo1', 1), ('2222', 'Equipo2', 2),('3333', 'Equipo3', 3),('4444', 'Equipo4', 4),('5555', 'Equipo5', 5);";

	public static String insercionTablaFacultad = "(Nombre) values "
			+ "('Facultad1'), ('Facultad2'), ('Facultad3'), ('Facultad4'), ('Facultad5');";

	public static String insercionTablaInvestigadores = "(DNI, NomApels, Facultad) values "
			+ "('12345678', 'Raul Garrido', 1)," + "('12345679', 'Abel Jornet', 2)," + "('12345670', 'Edgar Falco', 3),"
			+ "('12345644', 'Paco Sanz', 4)," + "('12345123', 'Manuel Feliz', 5);";

	public static String insercionTablaReserva = "(DNI, NumSerie) values " 
			+ "('12345678', '1111'),"
			+ "('12345679', '2222')," 
			+ "('12345670', '3333')," 
			+ "('12345644', '4444'),"
			+ "('12345123', '5555');";
}