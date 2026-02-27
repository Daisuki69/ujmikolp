package dOYHB6.spsrN3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wqMfs8 {
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String hex(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    public abstract int translate(CharSequence charSequence, int i, Writer writer) throws IOException;

    public final String translate(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            int length = charSequence.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iTranslate = translate(charSequence, iCharCount, stringWriter);
                if (iTranslate == 0) {
                    char cCharAt = charSequence.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    iCharCount++;
                    if (Character.isHighSurrogate(cCharAt) && iCharCount < length) {
                        char cCharAt2 = charSequence.charAt(iCharCount);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount++;
                        }
                    }
                } else {
                    for (int i = 0; i < iTranslate; i++) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final wqMfs8 with(wqMfs8... wqmfs8Arr) {
        wqMfs8[] wqmfs8Arr2 = new wqMfs8[wqmfs8Arr.length + 1];
        wqmfs8Arr2[0] = this;
        System.arraycopy(wqmfs8Arr, 0, wqmfs8Arr2, 1, wqmfs8Arr.length);
        return new eEFqC6(wqmfs8Arr2);
    }
}
