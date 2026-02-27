package dOYHB6.spsrN3;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class u5ODl2 extends wqMfs8 {
    private boolean upxz37(char c) {
        return c >= '0' && c <= '7';
    }

    private boolean vBhwF8(char c) {
        return c >= '0' && c <= '3';
    }

    @Override // dOYHB6.spsrN3.wqMfs8
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb2 = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i4 = i + 1;
        if (!upxz37(charSequence.charAt(i4))) {
            return 0;
        }
        int i6 = i + 2;
        int i10 = i + 3;
        sb2.append(charSequence.charAt(i4));
        if (length > 1 && upxz37(charSequence.charAt(i6))) {
            sb2.append(charSequence.charAt(i6));
            if (length > 2 && vBhwF8(charSequence.charAt(i4)) && upxz37(charSequence.charAt(i10))) {
                sb2.append(charSequence.charAt(i10));
            }
        }
        writer.write(Integer.parseInt(sb2.toString(), 8));
        return sb2.length() + 1;
    }
}
