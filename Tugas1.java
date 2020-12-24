public class Tugas1 {
    public static void main(String[] args) {
        for (int x=0; x<5; x++) {
            for (int y=0; y<5; y++) {
                if (y==0 || y==2 || y==4){
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
}