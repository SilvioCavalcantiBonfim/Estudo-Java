package view;

import view.impl.MegaSenaViewImpl;

public interface MegaSenaView {

  void WelcomeMessage();

  int readParticipantNumber();

  void displayChosen(int[] chosen);

  void displayChoose(int[] choose);

  void displayResult(int result);

  void displayError(Exception e);

  void close();

  static MegaSenaView builder(){
    return new MegaSenaViewImpl();
  }
}
