public enum Direction {
  EAST(90, 1), //
  NORTH(360, 2), //
  WEST(270, -1), //
  SOUTH(180, -2),
  ;

  private final int angle;
  private final int value;

  private Direction(int angle, int value) {
    this.angle = angle;
    this.value = value;
  }

  public int getAngle() {
    return this.angle;
  }

  public Direction oppsite() {
    for (Direction direction : Direction.values()) {
      if (direction.value == -this.value)
        return direction;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Direction.NORTH);
    System.out.println(Direction.NORTH.getAngle());
    System.out.println(Direction.NORTH.oppsite());
    System.out.println(Direction.EAST.oppsite());
    System.out.println(Direction.SOUTH.oppsite());
    System.out.println(Direction.WEST.oppsite());
  }
}
