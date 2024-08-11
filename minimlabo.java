public class Main {
    public static void main(String[] args) {
        handleAction("stop");
    }

    public static void handleAction(String action) {
        switch (action) {
            case "start":
                System.out.println("Starting...");
                break;
            case "pause":
                System.out.println("Pausing...");
                break;
            case "stop": {
                System.out.println("Stopping...");
                // Additional code for stopping can go here
                break;
            }
            default:
                System.out.println("Unknown action");
                break;
        }
    }
}
