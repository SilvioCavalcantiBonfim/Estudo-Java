package menu.impl;

class Action {
  private String name;
  private Runnable action;
  
  public Action(String name, Runnable action) {
    this.name = name;
    this.action = action;
  }

  public String getName() {
    return name;
  }

  public Runnable getAction() {
    return action;
  }
  
}
