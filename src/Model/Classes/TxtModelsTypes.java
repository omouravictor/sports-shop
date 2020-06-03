package Model.Classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TxtModelsTypes extends PlainDocument {

    private TxtTypes txtType;
    private int maxCharacters;

    public TxtModelsTypes(TxtTypes txtType) {
        if (txtType != null) {
            switch (txtType) {
                case Integer:
                    this.txtType = txtType;
                    this.maxCharacters = 9;
                    // A integer number supports 10 algarisms
                    break;
                case String:
                    this.txtType = txtType;
                    this.maxCharacters = 255;
                    // A Bank has a String length 255 by default
                    break;
                case CPF:
                    this.txtType = txtType;
                    this.maxCharacters = 11;
                    // A CPF has 11 numbers
                    break;
            }
        }
    }

    @Override
    public void insertString(int i, String txtText, AttributeSet as) throws BadLocationException {
        int txtTextQtd = (getLength() + txtText.length());
        // getLength() returns the quantity of the hidden characters
        if (txtType != null) {
            switch (txtType) {
                case Integer:
                    if (txtTextQtd <= maxCharacters) {
                        super.insertString(i, txtText.replaceAll("[^0-9]", ""), as);
                        // [^0-9 |^a-z | ^A-Z] sintaxe
                    }
                    break;
                case String:
                    if (txtTextQtd <= maxCharacters) {
                        super.insertString(i, txtText, as);
                    }
                    break;
                case CPF:
                    if (txtTextQtd <= maxCharacters) {
                        super.insertString(i, txtText.replaceAll("[^0-9]", ""), as);
                    }
                    break;
            }
        }
    }
}
