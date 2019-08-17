package br.com.mapreduce;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.log4j.Logger;

public class MainDriver extends Configured implements Tool {

    private static Logger logger = Logger.getLogger(MainDriver.class);
    private Job job;
    private FileSystem fs;

    public static void main(String[] args) throws Exception {
        logger.info("=================== BEGIN PROCESS =========================");

        MainDriver driver = new MainDriver();
        int exitCode = ToolRunner.run(driver, args);
        logger.info("Exit code: " + exitCode);
        logger.info("=================== END PROCESS ==========================");
        System.exit(exitCode);


    }

    public int run(String[] strings) throws Exception {
        logger.info("FUNCIONA");

        return 0;
    }
}
