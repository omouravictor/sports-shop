package Model.Classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TxtIntegerNumbersModel extends PlainDocument {

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(i, string.replaceAll("[^0-9]", ""), as); // [^0-9 |^a-z | ^A-Z] sintaxe
    }
}
