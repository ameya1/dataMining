import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ameya on 30/12/16.
 */
public class CosineSimilarity implements Calculate{
    String user1;
    String user2;
    MusicData musicData;

    public CosineSimilarity(String user1, String user2){
        this.user1 = user1;
        this.user2 = user2;
        this.musicData = new MusicData();
    }

    public void calculate(){
        this.musicData.fillData();
        Map<String, Map<String, Double>> data = musicData.getMusicData();
        Map<String, Double> userOneRating = data.get(this.user1);
        Map<String, Double> userTwoRating = data.get(this.user2);

        List<Double> userX = new ArrayList<>();
        List<Double> userY = new ArrayList<>();

        for(String artist : userOneRating.keySet()){
            if(userTwoRating.containsKey(artist)){
                userX.add(userOneRating.get(artist));
                userY.add(userTwoRating.get(artist));
            }
        }

        double dotProduct = 0;

        for(int i = 0; i < userX.size(); i++){
            dotProduct += userX.get(i) * userY.get(i);
        }

        double x = 0;
        double y = 0;

        for(int i = 0; i < userX.size(); i++){
            x += userX.get(i) * userX.get(i);
            y += userY.get(i) * userY.get(i);
        }

        double vecX = Math.sqrt(x);
        double vecY = Math.sqrt(y);

        double cos = dotProduct / (vecX * vecY);
        System.out.println(cos);
    }
}
