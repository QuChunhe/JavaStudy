package test;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reference.WeakReferenceTest;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

@Slf4j
public class MockTest {
  @Mock
  private LinkedList mockedList;
  //@Rule
  private AutoCloseable closeable;

  @BeforeEach
  void setUp() {
    closeable = MockitoAnnotations.openMocks(this);
  }

  @Test
  void testMock() {

    //MockedStatic<WeakReferenceTest> mockedStatic = Mockito.mockStatic(WeakReferenceTest.class);


    //stubbing
    when(mockedList.get(0)).thenReturn("first");
    when(mockedList.get(1)).thenThrow(new RuntimeException());

    //following prints "first"
    System.out.println(mockedList.get(0));

    try {
      //following throws runtime exception
      System.out.println(mockedList.get(1));
    } catch (Exception e) {
      e.printStackTrace();
    }

    //following prints "null" because get(999) was not stubbed
    System.out.println(mockedList.get(999));

    //Although it is possible to verify a stubbed invocation, usually it's just redundant
    //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
    //If your code doesn't care what get(0) returns, then it should not be stubbed.
    verify(mockedList).get(0);

  }

  @AfterEach
  void tearDown() {
    try {
      closeable.close();
    } catch (Exception e) {
      //log.error("Can not close");
    }
  }
}
