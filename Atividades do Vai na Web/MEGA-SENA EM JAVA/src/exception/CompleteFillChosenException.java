package exception;

import util.Message;

public class CompleteFillChosenException extends RuntimeException {
  public CompleteFillChosenException(){
    super(Message.COMPLETEFILLCHOSEN.toString());
  }
}
