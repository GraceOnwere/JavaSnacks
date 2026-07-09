package linearRegressionApp;

public class LinearRegression {

    private double dataSetMean ;

    private double dataSetSlope;

    private double dataSetCovariance;

    private double dataSetXVarianceSquared;

    private double dataSetIntercept;

    private double dataSetRegressionLine;

    private int checkDataSetLength(int [] dataset){

        return dataset.length;
    }

    public double getDataSetMean(int [] dataset){

        boolean isDatasetLengthLessThanZero = checkDataSetLength(dataset) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetMean;

    }

    public double getCovariance(int[] xValues, int[] yValues) {

        boolean isDatasetLengthLessThanZero = checkDataSetLength(xValues) < 0 && checkDataSetLength(yValues) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetCovariance;
    }

    public double getXVarianceSquared(int[] xValues) {

        boolean isDatasetLengthLessThanZero = checkDataSetLength(xValues) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetXVarianceSquared;
    }

    public double getSlope(int[] xValues, int[] yValues) {

        boolean isDatasetLengthLessThanZero = checkDataSetLength(xValues) < 0 && checkDataSetLength(yValues) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetSlope;
    }

    public double getIntercept(int[] xValues, int[] yValues){

        boolean isDatasetLengthLessThanZero = checkDataSetLength(xValues) < 0 && checkDataSetLength(yValues) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetIntercept;
    }

    public double getDataSetRegressionLine(int[] xValues, int[] yValues, double predictValue){

        boolean isDatasetLengthLessThanZero = checkDataSetLength(xValues) < 0 && checkDataSetLength(yValues) < 0;
        if (isDatasetLengthLessThanZero){
            return 0.0;
        }
        return dataSetRegressionLine;
    }

    public void mean(int[] dataset) {

        boolean isDatasetLengthGreaterThanZero = checkDataSetLength(dataset) > 0;

        int datasetLength = checkDataSetLength(dataset);
        int dataSetSum = 0;
        if (isDatasetLengthGreaterThanZero){

            for(int element : dataset){
                dataSetSum = dataSetSum + element;
            }
            dataSetMean = (double)dataSetSum/datasetLength;
        }
    }

    public void covariance(int[] xValues, int[] yValues) {

        mean(xValues);

        double xValuesMean = getDataSetMean(xValues);

        mean(yValues);

        double yValuesMean = getDataSetMean(yValues);

        for (int index = 0; index < xValues.length; index++) {

            dataSetCovariance += ((xValues[index] - xValuesMean) * (yValues[index] - yValuesMean));
        }
    }

    public void xVarianceSquared(int[] xValues) {

        mean(xValues);

        double xValuesMean = getDataSetMean(xValues);

        for (int xValue : xValues) {

            dataSetXVarianceSquared += Math.pow((xValue - xValuesMean), 2);
        }

    }

    public void slope(int[] xValues, int[] yValues) {

        covariance(xValues,yValues);

        double numerator = getCovariance(xValues,yValues);

        xVarianceSquared(xValues);

        double denominator = getXVarianceSquared(xValues);

        dataSetSlope = numerator/denominator;
    }


    public void intercept(int[] xValues, int[] yValues) {

        mean(yValues);

        double yValuesMean = getDataSetMean(yValues);

        slope(xValues,yValues);

        double slope = getSlope(xValues, yValues);

        mean(xValues);

        double xValuesMean = getDataSetMean(xValues);

        dataSetIntercept = yValuesMean - (slope * xValuesMean);

    }

    public void regressionLine(int[] xValues, int[] yValues, double predictValue) {

        slope(xValues,yValues);

        double slope = getSlope(xValues,yValues);

        intercept(xValues,yValues);

        double intercept = getIntercept(xValues,yValues);

        dataSetRegressionLine = (slope * predictValue)  +  intercept;
    }
}