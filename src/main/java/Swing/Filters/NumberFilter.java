package Swing.Filters;

import javax.swing.text.*;
import javax.swing.*;

public class NumberFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (isValidInput(fb, string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (isValidInput(fb, text)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isValidInput(FilterBypass fb, String text) throws BadLocationException {
        Document doc = fb.getDocument();
        String currentText = doc.getText(0, doc.getLength());
        int dotCount = currentText.length() - currentText.replace(".", "").length();

        for (char c : text.toCharArray()) {
            if (!Character.isDigit(c) && c != '.') {
                return false;
            }
            if (c == '.' && dotCount >= 1) {
                return false;
            }
        }
        return true;
    }
}