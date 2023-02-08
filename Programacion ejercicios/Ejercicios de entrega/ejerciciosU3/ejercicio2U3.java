public class ejercicio2U3 {
    public static void main(String[] args) {
        int x = 30;
		int counter = 0;
        int acumulador = 0;

        System.out.print("x" + "=" + x + " ");
        System.out.print("=" + numeroCount(x, counter, acumulador));
	}

    public static int numeroCount(int y, int count, int acumula){
        while (acumula < y) {
			count ++;
            acumula = acumula + count;

            if(acumula < y){
                System.out.print(count + "+");
            }else{
                System.out.print(count); 
            }
		}
        return acumula;
    }
}
