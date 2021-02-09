package racingcar.domain.car;

import java.util.Objects;

public class Position {
  private final int position;

  public Position(final int position) {
    this.position = position;
  }

  public int get() {
    return position;
  }

  public Position run() {
    return new Position(position + 1);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position1 = (Position) o;
    return position == position1.position;
  }

  @Override
  public int hashCode() {
    return Objects.hash(position);
  }
}
