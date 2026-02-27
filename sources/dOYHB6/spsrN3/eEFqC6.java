package dOYHB6.spsrN3;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class eEFqC6 extends wqMfs8 {
    private final wqMfs8[] translators;

    public eEFqC6(wqMfs8... wqmfs8Arr) {
        this.translators = (wqMfs8[]) d3kDu6.clone(wqmfs8Arr);
    }

    @Override // dOYHB6.spsrN3.wqMfs8
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (wqMfs8 wqmfs8 : this.translators) {
            int iTranslate = wqmfs8.translate(charSequence, i, writer);
            if (iTranslate != 0) {
                return iTranslate;
            }
        }
        return 0;
    }
}
