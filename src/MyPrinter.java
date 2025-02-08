public class MyPrinter implements Printer {
    @Override
    public void print(String sender, String text) {
        if (sender == null || sender.isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + text);
        } else if (text != null && !text.isEmpty()) {
            System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
        } else {
            System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
        }
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "text='" + text + '\'' +
                    ", sender='" + sender + '\'' +
                    '}';
        }
    }
}
