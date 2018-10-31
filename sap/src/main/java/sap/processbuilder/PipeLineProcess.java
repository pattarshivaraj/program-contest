package sap.processbuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PipeLineProcess {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> command1 = new ArrayList<>();
        command1.add("ps");
        command1.add("-ef");
        List<String> command2 = new ArrayList<>();
        command2.add("grep");
        command2.add("-v");
        command2.add("-e");
        command2.add("grep");
        command2.add("-e");
        command2.add("check");

        List<String> command3 = new ArrayList<>();
        command3.add("grep");
        command3.add("-q");
        command3.add("collectl");

        ProcessBuilder pb1 = new ProcessBuilder();
        pb1.command(command1);
        //pb1.redirectOutput(new File("/home/shivaraj/test/testOp.txt"));
        ProcessBuilder pb2 = new ProcessBuilder();
        pb2.command(command2);
        ProcessBuilder pb3 = new ProcessBuilder();
        pb3.command(command3);

        pb2.redirectInput(pb1.redirectOutput());
        //pb3.redirectInput(pb2.redirectOutput());

        try {
            Process p1 = pb1.start();
            //p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
            //Process p3 = pb3.start();
            //p3.waitFor();
                System.out.println("p1.exitvalue: " + p1.exitValue());
                System.out.println("p2.exitvalue: " + p2.exitValue());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
