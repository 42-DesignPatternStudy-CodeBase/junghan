package decoratorPattern;

public class EthiopiaEspresso implements Coffee {
	private String bean;

	@Override
	public String adding() {
		bean = "EthiopiaEspresso";
		return bean;
	}
}
