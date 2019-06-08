package com.github.hcsp.controlflow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.stream.IntStream;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

public class MainTest {
  @Test
  @CaptureSystemOutput
  public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
    int n = new Random().nextInt();
    capture.expect(containsStringIgnoringCase(
      IntStream.range(-n, n+1).filter(i -> i % 2 != 0).mapToObj(Integer::toString).collect(Collectors.joining(","))
    );
    Main.printOddNumbersBetween(-n, n);
  }
}
