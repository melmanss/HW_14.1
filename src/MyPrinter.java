// Клас, що реалізує інтерфейс Printer
public class ConsolePrinter implements Printer {

    @Override
    public void print(Message message) {
        // Перевірка на пусті поля
        if (message.getText() == null && message.getSender() == null) {
            // Анонімний клас для обробки пустого повідомлення
            Message emptyMessage = new Message(null, null) {
                @Override
                public String toString() {
                    return "Опрацьовується пусте повідомлення від анонімного користувача...";
                }
            };
            System.out.println(emptyMessage);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    // Статичний внутрішній клас Message
    public static class Message {
        private String text;
        private String sender;

        // Конструктор
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Геттер для text
        public String getText() {
            return text;
        }

        // Сеттер для text
        public void setText(String text) {
            this.text = text;
        }

        // Геттер для sender
        public String getSender() {
            return sender;
        }

        // Сеттер для sender
        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}
