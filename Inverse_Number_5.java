package Assignment2;
class Inverse_Number_5 {
        public static void main(String[] args) {
            int num = 25413, reversed = 0;

            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }}


