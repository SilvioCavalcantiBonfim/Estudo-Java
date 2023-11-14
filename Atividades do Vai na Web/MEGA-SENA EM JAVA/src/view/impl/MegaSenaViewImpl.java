package view.impl;

import java.util.Arrays;
import java.util.InputMismatchException;

import util.Message;
import view.Input;
import view.MegaSenaView;
import view.Output;

public class MegaSenaViewImpl implements MegaSenaView {
  
  private final Output output;
  private final Input input;

  public MegaSenaViewImpl() {
    output = Output.builder();
    input = Input.builder();
  }

  @Override
  public void WelcomeMessage() {
    output.println(Message.WELCOME);
  }

  @Override
  public int readParticipantNumber() {
    while (true) {
      try {
        output.print(Message.INPUTCHOOSE);
        return input.nextInt();
      } catch (InputMismatchException e) {
        input.clearBuffer();
        output.println(Message.INPUTMISMATCH);
      }
    }
  }

  @Override
  public void displayResult(int result) {
    Message msg = switch(result){
      case 5 -> Message.RESULT_5;
      case 6 -> Message.RESULT_6;
      case 7 -> Message.RESULT_7;
      default -> Message.LOSE;
    };
    output.println(msg);
  }

  @Override
  public void displayChosen(int[] chosen) {
    output.println(Message.CHOSEN+formatArray(chosen)+".");
  }

  @Override
  public void displayChoose(int[] choose) {
    output.println(Message.CHOOSE+formatArray(choose)+".");
  }  

  private String formatArray(int[] array){
    return Arrays.toString(array)
    .replaceAll("\\[|\\]", "")
    .replaceFirst("(.*),", "$1 e");
  }

  @Override
  public void displayError(Exception e) {
    output.println(e.getMessage());
  }

  @Override
  public void close() {
    input.close();
  }
}
