package pefMark;

import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;

public class PerfMarkExample {

    public static void main(String[] args) {
        int sum;
        try (TaskCloseable task = PerfMark.traceTask("sum")) {
            sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
        PerfMark.setEnabled(true);
        PerfMark.event("My Task");
//        TraceEventViewer.writeTraceHtml();
    }

}
