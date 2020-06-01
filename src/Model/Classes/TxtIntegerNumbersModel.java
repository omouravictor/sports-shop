package Model.Classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TxtIntegerNumbersModel extends PlainDocument {

    private int maxAlgarisms = 10; // A integer number supports 10 algarisms

    public TxtIntegerNumbersModel() {
    }

    public TxtIntegerNumbersModel(int maxNumbers) {
        if (maxNumbers > 0 && maxNumbers <= this.maxAlgarisms) {
            this.maxAlgarisms = maxNumbers;
        }
    }

    @Override
    public void insertString(int i, String txtText, AttributeSet as) throws BadLocationException {
        int txtTextQtd = (getLength() + txtText.length()); // getLength() returns the quantity of the hidden characters
        if (txtTextQtd <= maxAlgarisms) {
            super.insertString(i, txtText.replaceAll("[^0-9]", ""), as); // [^0-9 |^a-z | ^A-Z] sintaxe
        }
    }
}