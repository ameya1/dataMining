/**
 * Created by ameya on 27/12/16.
 */
public class Main{
    public static void main(String[] args){
        CalculateContext c = new CalculateContext(new CosineSimilarity("Angelica", "Bill"));
        c.execute();
    }
}
