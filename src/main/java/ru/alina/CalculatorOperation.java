package ru.alina;

public enum CalculatorOperation {
    PLUS, MINUS, MULTIPLY, DIVIDE, UNKNOWN, EXIT;

    public static CalculatorOperation parse(String s) {
        if (s == null || "".equals(s)) return UNKNOWN;
        else if ("PLUS".startsWith(s.toUpperCase()) || "+".equals(s)) return PLUS;
        else if ("MINUS".startsWith(s.toUpperCase()) || "-".equals(s)) return MINUS;
        else if ("MULTIPLY".startsWith(s.toUpperCase()) || "*".equals(s)) return MULTIPLY;
        else if ("DIVIDE".startsWith(s.toUpperCase()) || "/".equals(s)) return DIVIDE;
        else if ("EXIT".startsWith(s.toUpperCase()) || "q".equals(s)) return EXIT;
        else return UNKNOWN;
    }
}
