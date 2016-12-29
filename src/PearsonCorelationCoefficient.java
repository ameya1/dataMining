import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ameya on 29/12/16.
 */
public class PearsonCorelationCoefficient implements Calculate{

    String user1;
    String user2;
    MusicData musicData;

    PearsonCorelationCoefficient(String user1, String user2){
        this.user1 = user1;
        this.user2 = user2;
        this.musicData = new MusicData();
    }

    public void calculate(){
        this.musicData.fillData();
        Map<String, Map<String, Double>> data = this.musicData.getMusicData();
        Map<String, Double> userOneRating = data.get(user1);
        Map<String, Double> userTwoRating = data.get(user2);

        /*
        *
        * The formula is in Programming Guide to data mining page 45 it is divided into 8 parts
        *
        */

        //Get the data
        List<Double> userX = new ArrayList<>();
        List<Double> userY = new ArrayList<>();

        for(String artist : userOneRating.keySet()){
            if(userTwoRating.containsKey(artist)){
                userX.add(userOneRating.get(artist));
                userY.add(userTwoRating.get(artist));
            }
        }

        //1. Multiply x with y and take a sum of them  ∑ 1 to n (x * y)
        double partOne = 0;
        for(int i = 0; i < userX.size(); i++){
            partOne += userX.get(i) * userY.get(i);
        }

        //2. Get the total sum of x and multiply it with total sum of y and divide by n

        double partTwo = 0;

        double x = 0;
        for(int i = 0; i < userX.size(); i++){
            x += userX.get(i);
        }

        double y = 0;
        for(int i = 0; i < userY.size(); i++){
            y += userY.get(i);
        }



    }
}
