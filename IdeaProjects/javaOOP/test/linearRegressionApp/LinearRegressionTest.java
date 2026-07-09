package linearRegressionApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {

    @Test
    public void dataSetHasNoValue_checkDataSetMeanTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {};
        int[] yValues = {};

        dataSet.mean(xValues);

        double xValuesMean = dataSet.getDataSetMean(xValues);

        assertEquals(0.0, xValuesMean);

        dataSet.mean(yValues);

        double yValuesMean = dataSet.getDataSetMean(yValues);

        assertEquals(0.0,yValuesMean);
    }

    @Test
    public void dataSetHasXandYValues_givesMeanOfXandYTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};
        int[] yValues = {2,4,5,4,5};

        dataSet.mean(xValues);

        double xValuesMean = dataSet.getDataSetMean(xValues);

        assertEquals(3.0, xValuesMean);

        dataSet.mean(yValues);

        double yValuesMean = dataSet.getDataSetMean(yValues);

        assertEquals(4.0,yValuesMean);

    }

    @Test
    public void dataSetHasXandYValues_givesCovarianceOfXandYTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};
        int[] yValues = {2,4,5,4,5};

        dataSet.covariance(xValues, yValues);

        double covariance = dataSet.getCovariance(xValues, yValues);

        assertEquals(6.0, covariance);
    }

    @Test
    public void dataSetHasXandYValues_givesVarianceOfXSquareTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};

        dataSet.xVarianceSquared(xValues);

        double xVarianceSquared = dataSet.getXVarianceSquared(xValues);

        assertEquals(10.0, xVarianceSquared);
    }

    @Test
    public void dataSetHasXandYValues_givesSlopeOfXandYTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};
        int[] yValues = {2,4,5,4,5};

        dataSet.slope(xValues, yValues);

        double slope = dataSet.getSlope(xValues, yValues);

        assertEquals(0.6, slope);
    }

    @Test
    public void dataSetHasXandYValues_givesInterceptOfXandYTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};
        int[] yValues = {2,4,5,4,5};

        dataSet.intercept(xValues, yValues);

        double intercept = dataSet.getIntercept(xValues, yValues);

        assertEquals(2.2, intercept);
    }

    @Test
    public void dataSetHasXandYValues_givesRegressionLineTest(){

        LinearRegression dataSet = new LinearRegression();

        int[] xValues = {1,2,3,4,5};
        int[] yValues = {2,4,5,4,5};

        double predictValue = 6;

        dataSet.regressionLine(xValues, yValues, predictValue);

        double regressionLne = dataSet.getDataSetRegressionLine(xValues, yValues,predictValue);

        assertEquals(5.8, regressionLne);
    }
}