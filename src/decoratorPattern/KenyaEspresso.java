package decoratorPattern;

public class KenyaEspresso implements Coffee {
	private String bean;

	@Override
	public String adding() {
		bean = "KenyaEspresso";
		return bean;
	}
}
