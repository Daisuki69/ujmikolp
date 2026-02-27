package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import k2.v0;

/* JADX INFO: loaded from: classes2.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i4, int i6, int i10, int i11) {
        this.startTimeIndex = i;
        this.endTimeIndex = i4;
        this.styleIndex = i6;
        this.textIndex = i10;
        this.length = i11;
    }

    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i4 = -1;
        int i6 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strH = v0.H(strArrSplit[i11].trim());
            strH.getClass();
            switch (strH) {
                case "end":
                    i4 = i11;
                    break;
                case "text":
                    i10 = i11;
                    break;
                case "start":
                    i = i11;
                    break;
                case "style":
                    i6 = i11;
                    break;
            }
        }
        if (i == -1 || i4 == -1 || i10 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i4, i6, i10, strArrSplit.length);
    }
}
