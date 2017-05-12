public class Main {

    public static void main(String[] args) {
	char B = 79;
	char[][] g = new char[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                g[i][j] = B;

            }

        }

     g[2][3] = '.';


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(g[i][j]);

            }
            System.out.println();

        }
    }

}
