public class MessageSenderDemo {

    // MessageSender class with synchronized sendMessage method
    static class MessageSender {
        public synchronized void sendMessage(String msg) {
            System.out.print("[Sending] ");
            for (char ch : msg.toCharArray()) {
                System.out.print(ch);
                try {
                    Thread.sleep(50); // Small delay between characters
                } catch (InterruptedException e) {
                    System.out.println("[ERROR] Message interrupted.");
                    e.printStackTrace();
                }
            }
            System.out.println(" [Done]");
        }
    }

    // Thread class to send a message
    static class SenderThread extends Thread {
        private MessageSender sender;
        private String message;

        public SenderThread(MessageSender sender, String message) {
            this.sender = sender;
            this.message = message;
        }

        @Override
        public void run() {
            sender.sendMessage(message);
        }
    }

    // Main method
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();

        SenderThread thread1 = new SenderThread(sender, "Hello from Alice!");
        SenderThread thread2 = new SenderThread(sender, "Greetings from Bob!");

        thread1.start();
        thread2.start();
    }
}
