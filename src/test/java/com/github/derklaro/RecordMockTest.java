package com.github.derklaro;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RecordMockTest {

  @Test
  void test() {
    TestRecord record = Mockito.mock(TestRecord.class);
    System.out.println(record);
  }
}
