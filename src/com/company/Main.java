
import java.util.Scanner;
import java.util.Stack;

        public class Main {
            private static Stack<String> input = new Stack<>();
            private static boolean start = true;
            private static String middle =null;
            private static String middle2 =null;

            public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);

                System.out.println("user you welcome to write....");


                while (start && (input.size() <= 10)) {

                    String userInput = scan.nextLine();
                    input.push(userInput);

                    if (userInput.equals("copy")) {
                        input.pop();
                        middle = input.peek();
                        input.push(middle);

                    } else if (userInput.equals("delete")) {
                        input.pop();
                        middle2=input.peek();
                        input.pop();

                    } else if (userInput.equals("undo")) {
                        input.pop();
                        input.push(middle2);

                    } else if (userInput.equals("quit")){
                        input.pop();
                        System.out.println(input);
                        break;
                    }

                    System.out.println(input);
                }

                System.out.println("Apps stop running by the user....");
            }
    }

