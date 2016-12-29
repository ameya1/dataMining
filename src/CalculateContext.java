/**
 * Created by ameya on 29/12/16.
 */
public class CalculateContext {
    Calculate calculate;

    CalculateContext(Calculate calculate){
        this.calculate = calculate;
    }

    public void execute(){
        this.calculate.calculate();
    }
}
