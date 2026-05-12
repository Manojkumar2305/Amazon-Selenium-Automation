package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "reports/AmazonReport.html");

            spark.config().setReportName(
                    "Amazon Shoes Automation Report");

            spark.config().setDocumentTitle(
                    "Automation Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);
        }

        return extent;
    }
}