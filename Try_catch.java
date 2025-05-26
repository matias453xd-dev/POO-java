public class Try_catch {
    public static void main(String[] args){
        try {
            int cociente = 7/0;
        } 
        catch (Exception e) {
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println(":)");
        }

    }
}
