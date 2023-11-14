package exception;

import util.Message;

public class CompleteFillChooseException extends RuntimeException {
  public CompleteFillChooseException(){
    super(Message.COMPLETEFILLSELECTED.toString());
  }
}
