package util;

//   __  __                    ____                   \n
//  |  \/  | ___  __ _  __ _  / ___|  ___ _ __   __ _ \n
//  | |\/| |/ _ \/ _` |/ _` | \___ \ / _ \ '_ \ / _` |\n
//  | |  | |  __/ (_| | (_| |  ___) |  __/ | | | (_| |\n
//  |_|  |_|\___|\__, |\__,_| |____/ \___|_| |_|\__,_|\n
//               |___/                                

public enum Message {
  WELCOME("\n\n\n➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\r\n"+//
      "  __  __                    ____                   " + //
      "\r\n" + //
      " |  \\/  | ___  __ _  __ _  / ___|  ___ _ __   __ _ " + //
      "\r\n" + //
      " | |\\/| |/ _ \\/ _` |/ _` | \\___ \\ / _ \\ '_ \\ / _` |" + //
      "\r\n" + //
      " | |  | |  __/ (_| | (_| |  ___) |  __/ | | | (_| |" + //
      "\r\n" + //
      " |_|  |_|\\___|\\__, |\\__,_| |____/ \\___|_| |_|\\__,_|" + //
      "\r\n" + //
      "              |___/                                \r\n      💸 Bem-vindo ao jogo da Mega Sena!💸\r\n"+ //
      "➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n"),
  INPUTCHOOSE("🎫 Por favor, escolha um número que esteja entre 0 e 100: "),
  RESULT_5("\n💰 Você ganhou premio de 10 mil reais.\n"),
  RESULT_6("\n💰💰 Você ganhou premio de 50 mil reais.\n"),
  RESULT_7("\n💰💰💰 Você ganhou premio de 200 mil reais.\n"),
  LOSE("\n💸 Infelizmente você perdeu.😭\n"),
  CHOSEN("#️⃣  Os números sorteados foram "),
  CHOOSE("#️⃣  Os números escolhidos foram "),
  ILLEGALNUMBER("⚠️  O número já foi escolhido.⚠️\n"),
  OFFBOUND("⚠️  O número não está no intervalo válido.⚠️\n"),
  COMPLETEFILLCHOSEN("⚠️  Nem todos os números foram sorteados ainda.⚠️\n"),
  COMPLETEFILLSELECTED("⚠️  Nem todos os números escolhidos foram informados.⚠️\n"),
  INPUTMISMATCH("⚠️  O valor informado não está no formato correto.⚠️\n");

  private final String message;
  private Message(String msg){
    this.message = msg;
  }

  @Override
  public String toString() {
    return message;
  }
}
