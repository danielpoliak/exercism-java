public class Twofer {
    public String twofer(String name) {
        if(name instanceof String) {
            return String.format("One for %s, one for me.", name);
        } else {
            return "One for you, one for me.";
        }
    }
}
