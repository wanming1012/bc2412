public class BusinessRuntimeException extends RuntimeException {
  public static BusinessRuntimeException of(SysError sysError) {
    return new BusinessRuntimeException(sysError);
  }

  private BusinessRuntimeException(SysError sysErr) {
    super(sysErr.getDesc());
  }
}

