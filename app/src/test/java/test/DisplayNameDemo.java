package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@DisplayName("A special test case")
class DisplayNameDemo {

  @Test
  @DisplayName("Custom test name containing spaces")
  void testWithDisplayNameContainingSpaces() {
    //assertAll()
    //assertTimeout();
  }

  @Test
  @DisplayName("╯°□°）╯")
  void testWithDisplayNameContainingSpecialCharacters() {
  }

  @Test
  @DisplayName("😱")
  void testWithDisplayNameContainingEmoji() {
  }
}

