class ResistorColorDuo {

    private String[] resistors = new String[] { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

    int value(String[] colors) {
        int firstResistorIndex = java.util.Arrays.asList(resistors).indexOf(colors[0]);
        int secondResistorIndex = java.util.Arrays.asList(resistors).indexOf(colors[1]);

        String resultNumber = String.format("%s%d", firstResistorIndex, secondResistorIndex);

        return Integer.parseInt(resultNumber);
    }
}
