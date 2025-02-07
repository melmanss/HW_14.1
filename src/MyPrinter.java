public class MyPrinter implements Printer {
    @Override
    public void print(Message message) {
        if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else if (message.getText() != null && !message.getText().isEmpty()) {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        } else {
            new Runnable() {
                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }.run();
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
    }
}