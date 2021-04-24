package API;

public class cuentaBancaria {

	public static void main(String[] args) {
		
	System.out.println(maskCC("1234-5678-7241-5900-"));
	System.out.println("Otra prueba actualizar desde repositorio");
	}

	private static String maskCC(String card) {
		String x="XXXX-XXXX-XXX-";
		StringBuilder sb= new StringBuilder(x);
		sb.append(card, 15, 19);
		return sb.toString();
	}

}
