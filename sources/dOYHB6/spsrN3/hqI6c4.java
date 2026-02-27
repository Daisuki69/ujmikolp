package dOYHB6.spsrN3;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class hqI6c4 extends wqMfs8 {
    @Override // dOYHB6.spsrN3.wqMfs8
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i4;
        int i6;
        if (charSequence.charAt(i) != '\\' || (i4 = i + 1) >= charSequence.length() || charSequence.charAt(i4) != 'u') {
            return 0;
        }
        int i10 = 2;
        while (true) {
            i6 = i + i10;
            if (i6 >= charSequence.length() || charSequence.charAt(i6) != 'u') {
                break;
            }
            i10++;
        }
        if (i6 < charSequence.length() && charSequence.charAt(i6) == '+') {
            i10++;
        }
        int i11 = i + i10;
        int i12 = i11 + 4;
        if (i12 > charSequence.length()) {
            throw new IllegalArgumentException(numX49.tnTj78("bH0b") + ((Object) charSequence.subSequence(i, charSequence.length())) + numX49.tnTj78("bH02"));
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i11, i12);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i10 + 4;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(numX49.tnTj78("bH0P") + ((Object) charSequenceSubSequence), e);
        }
    }
}
