
class Program {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World");

        /*
            result : Hello World
                     Hello World
         */
        // println sudah include dengan \n sehingga menciptakan baris baru
        int maxScore = 400;
        int userScore = 100;

        double percentage = (double) userScore / maxScore * 100;
        // type casting dari int ke double agar menghasilkan nilai yang lebih presisi

        System.out.print(percentage);
    }
}
