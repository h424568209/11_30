import java.util.*;

public class Main_11_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        while(in.hasNext()) {
            String boss = in.nextLine();
            String want = in.nextLine();
            List<Character> list = new LinkedList<>();
            for(int i =0 ; i < boss.length() ; i++){
                list.add(boss.charAt(i));
            }
            int count = 0;
            for(int j = 0 ; j <want.length() ; j++){
                char c = want.charAt(j);
                for(int i =0 ; i < list.size(); i++){
                    if(c == list.get(i)){
                        ((LinkedList<Character>) list).remove(i);
                        count++;
                        break;
                    }
                }
            }
            if(count == want.length()){
                System.out.println("Yes"+" "+(boss.length() -count));
            }else {
                System.out.println("No" +" " + (want.length() - count));
            }
        }
    }
}
