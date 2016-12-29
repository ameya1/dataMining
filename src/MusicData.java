import java.util.HashMap;
import java.util.Map;

/**
 * Created by ameya on 26/12/16.
 */
public class MusicData {
    Map<String, Map<String, Double>> musicData;

    public MusicData(){
        this.musicData = new HashMap<>();
    }

    public void fillData(){
        Map<String, Double> artistRatings = new HashMap<>();
        artistRatings.put("Blues Traveler", 3.5);
        artistRatings.put("Broken Bells", 2.0);
        artistRatings.put("Norah Jones", 4.5);
        artistRatings.put("Phoenix", 5.0);
        artistRatings.put("Slightly Stoopid", 1.5);
        artistRatings.put("The Strokes", 2.5);
        artistRatings.put("Vampire Weekend", 2.0);
        this.musicData.put("Angelica", new HashMap<>(artistRatings));

        // To avoid union of artist data
        artistRatings.clear();

        artistRatings.put("Blues Traveler", 2.0);
        artistRatings.put("Broken Bells", 3.5);
        artistRatings.put("Deadmau5", 4.0);
        artistRatings.put("Phoenix", 2.0);
        artistRatings.put("Slightly Stoopid", 3.5);
        artistRatings.put("Vampire Weekend", 3.0);
        this.musicData.put("Bill", new HashMap<>(artistRatings));
    }

    public Map getMusicData(){
        return this.musicData;
    }
}


