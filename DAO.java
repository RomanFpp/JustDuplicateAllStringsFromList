import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DAO {

        public static void main(String[] args) throws Exception{

            ArrayList<String> arrList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0; i < 10; i ++){
                arrList.add(reader.readLine());
            }
            ArrayList<String> targetList = doubledList(arrList);
            targetList.forEach(System.out::println);
        }


        public static ArrayList<String> doubledList(ArrayList<String> arrList) {
            ArrayList<String> tmList = new ArrayList<>();
            for(int y = 0; y < 10; y ++){
                tmList.add(arrList.get(y));
                tmList.add(arrList.get(y));
            }
            return tmList;

    }
}
