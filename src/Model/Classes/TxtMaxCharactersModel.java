package Model.Classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TxtMaxCharactersModel extends PlainDocument {

    private int maxCharacters = 255; // A Bank has a String length 255 by default

    public TxtMaxCharactersModel() {
    }

    public TxtMaxCharactersModel(int maxCharacters) {
        if (maxCharacters > 0 && maxCharacters <= this.maxCharacters) {
            this.maxCharacters = maxCharacters;
        }
    }

    @Override
    public void insertString(int i, String txtText, AttributeSet as) throws BadLocationException {
        int txtTextQtd = (getLength() + txtText.length()); // getLength() returns the quantity of the hidden characters
        if (txtTextQtd <= maxCharacters) {
            super.insertString(i, txtText, as); // [^0-9 |^a-z | ^A-Z] sintaxe
        }
    }
}