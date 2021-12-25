package task3.test.partition;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EnginePartitionTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                EngineTestPartitionHorsepower.class,
                EngineTestPartitionSpeed.class,
                EngineTestPartitionMaxSpeed.class,
                EngineTestPartitionStarted.class
        );
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

        System.out.println(
                "\n" +
                result.getFailureCount() + " tests fallidos de " +
                result.getRunCount() + " ejecutados."
        );

    }
}
