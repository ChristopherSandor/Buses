public class Buses {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        int total = 0;

        for(int i = 0; i < 4; i++){
            int num1 = input%10;
            total += num1;
            input = input/10;
        }
        if(total <= 0){
            System.out.println("ERROR");
        }
        else if(total % 2 == 0){
            System.out.println("LX");
        }
        else{
            System.out.println("H");
        }
    }
}
