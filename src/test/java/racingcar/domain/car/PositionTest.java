package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

  @Test
  void run() {
    Position position = new Position(0);
    position = position.run();
    assertThat(position.get()).isEqualTo(1);
  }
}