package exception;

import util.Message;

public class IllegalNumberException extends IllegalArgumentException {
  public IllegalNumberException(){
    super(Message.ILLEGALNUMBER.toString());
  }
}
