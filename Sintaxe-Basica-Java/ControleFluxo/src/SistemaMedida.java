public class SistemaMedida {
    public static void main(String[] args) {

        String sigla = "P";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
