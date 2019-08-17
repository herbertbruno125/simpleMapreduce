package br.com.mapreduce;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SimpleMapper <T extends Writable> extends Mapper<T, Text, SimpleKey, SimpleValue> {

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {

    }

    @Override
    protected void map(T key, Text value, Context context) throws IOException, InterruptedException {

    }
}
