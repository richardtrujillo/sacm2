package Sourse;


import javax.swing.text.*;

public class DataTextFieldLimit extends PlainDocument
{
    private int limit;
    // optional uppercase conversion
    private boolean toUppercase = false;

    DataTextFieldLimit(int limit) {
    super();
    this.limit = limit;
    }

    DataTextFieldLimit(int limit, boolean upper) {
    super();
    this.limit = limit;
    toUppercase = upper;
    }

    @Override
    public void insertString
    (int offset, String  str, AttributeSet attr)
    throws BadLocationException {
    if (str == null) return;

    if ((getLength() + str.length()) <= limit) {
    if (toUppercase) str = str.toUpperCase();
    super.insertString(offset, str, attr);
    }
    }
}
