import weka.classifiers.functions.LinearRegression;
import weka.core.*;

public class StockPricePredictor {
    public static void main(String[] args) throws Exception {
        Instances data = new Instances(new BufferedReader(new FileReader("stock_prices.arff")));
        data.setClassIndex(data.numAttributes() - 1);

        LinearRegression model = new LinearRegression();
        model.buildClassifier(data);
        System.out.println(model);
    }
}
