package controller.impl;

import controller.MegaSenaController;
import model.Chosen;
import model.MegaSena;
import view.MegaSenaView;

public class MegaSenaControllerImpl implements MegaSenaController {

  private final int MAX_RANGE = 100;
  private final int MIN_RANGE = 0;
  private final int TOTAL_NUMBER = 7;

  private final MegaSena megaSena;
  private final MegaSenaView megaSenaView;
  private final Chosen chosen;

  public MegaSenaControllerImpl(){
    megaSena = MegaSena.builder(MIN_RANGE, MAX_RANGE, TOTAL_NUMBER);
    megaSenaView = MegaSenaView.builder();
    chosen = Chosen.builder(MIN_RANGE, MAX_RANGE);
  }

  @Override
  public void run() {
    megaSenaView.WelcomeMessage();

    while (!megaSena.isCompleteFill()){
      try {
        int readParticipantNumber = megaSenaView.readParticipantNumber();
        megaSena.addInSelected(readParticipantNumber);
      } catch (Exception e) {
        megaSenaView.displayError(e);
      }
    }

    for(int c : chosen.nextChosen(TOTAL_NUMBER)){
      megaSena.addInChosen(c);
    }
    
    megaSenaView.displayResult(megaSena.result());
    
    megaSenaView.displayChosen(megaSena.getChosen());
    megaSenaView.displayChoose(megaSena.getChose());

    megaSenaView.close();
  }
}
