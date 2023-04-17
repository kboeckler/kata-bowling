package de.mach.kata.bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GameTest {

  @Test
  void construct() {
    Game game = new Game();

    assertThat(game).isNotNull();
  }
}
