package codecheck;

public class App {
    public static void main(String[] args){

        String[] argSet ;
        int a = 0;
        String s = "";
        String output = "";
        int m = Integer.parseInt(args[args.length - 1]);
        for(int i=0; i<args.length -1; i++){

            argSet = args[i].split(":");
            a = Integer.parseInt(argSet[0]);
            s = argSet[1];

            if(m % a == 0){
                output += s;
            }
        }

        output = output.equals("") ? Integer.toString(m) : output;
        System.out.println(output);

    }
}
