package dOYHB6.spsrN3;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class q3bEF2 extends wqMfs8 {
    private final int longest;
    private final HashMap<String, String> lookupMap = new HashMap<>();
    private final HashSet<Character> prefixSet = new HashSet<>();
    private final int shortest;

    public q3bEF2(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i4 = 0;
        if (charSequenceArr != null) {
            int i6 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.lookupMap.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.prefixSet.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i = length < i ? length : i;
                if (length > i6) {
                    i6 = length;
                }
            }
            i4 = i6;
        }
        this.shortest = i;
        this.longest = i4;
    }

    @Override // dOYHB6.spsrN3.wqMfs8
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.prefixSet.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.longest;
        if (this.longest + i > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.shortest) {
            String str = this.lookupMap.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
