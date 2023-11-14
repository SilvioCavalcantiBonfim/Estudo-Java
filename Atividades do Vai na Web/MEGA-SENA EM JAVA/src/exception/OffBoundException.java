package exception;

import util.Message;

public class OffBoundException extends IllegalArgumentException {
  public OffBoundException(){
    super(Message.OFFBOUND.toString());
  }
}
