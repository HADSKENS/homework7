public class Main {
    public static void main(String[] args) {
        int i =0;
        int m=0;
        while (i<2459000){
            i+=15000;
            m+=1;
        }
        System.out.print("Чтобы накопить 2459000 нам потребуется "+m);
        System.out.print("Месяца");
    }
}