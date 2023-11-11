package menu.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import exception.IllegalIndexException;
import menu.Menu;

public class MenuImpl<T extends Object> implements Menu<T> {

  private final Map<T, Action> actions;

  public MenuImpl() {
    this.actions = new HashMap<T, Action>();

    Runnable defualtExecution = () -> {
      System.err.println("Execução defualt não definida.");
    };

    this.registerDefualtAciton(defualtExecution);
  }

  @Override
  public void registerAction(T index, String name, Runnable action) {
    if (index.equals(null)) {
      new IllegalIndexException("Não é possivel registrar uma ação para esse objeto.");
    }

    actions.put(index, new Action(name, action));
  }

  @Override
  public void execute(T index) {
    try {
      Action action = actions.get(index);
      action.getAction().run();
    } catch (NullPointerException e) {
      Action action = actions.get(null);
      action.getAction().run();
    }
  }

  @Override
  public void registerDefualtAciton(Runnable action) {
    actions.put(null, new Action(null, action));
  }

  @Override
  public String generateMenuString() {
    String textMenu = actions
      .entrySet()
      .stream()
      .map((action) -> {
        if (action.getKey() == null) {
          return null;
        }else{
          return String.format("%d - %s", action.getKey(), action.getValue().getName());
        }
      })
      .filter((text) -> text!=null)
      .collect(Collectors.joining("\n"));
    return textMenu;
  }

}
