package project.generator.domain;

public enum EDataBase {

	MY_SQL("mysql", "MySQL"),
	MARIA_DB("mariaDB", "MariaDB"),
	POSTGRE_SQL("postgresql", "PostgreSQL"),
	MS_SQL("mssql", "Microsoft SQL Server");

	private final String value;

	private final String name;

	EDataBase(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
