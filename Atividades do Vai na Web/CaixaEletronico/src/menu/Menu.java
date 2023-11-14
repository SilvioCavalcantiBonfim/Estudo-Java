package menu;

import menu.impl.MenuImpl;

public interface Menu<T> {

  void registerAction(T index, String name, Runnable action);

  void execute(T index);

  void registerDefualtAciton(Runnable action);

  String generateMenuString();

  public static <T> Menu<T> builder(){
    return new MenuImpl<T>();
  }

}
