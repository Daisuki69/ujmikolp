package androidx.media3.extractor.text.ttml;

import O1.AbstractC0505d0;
import O1.G0;
import O1.z0;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import k2.v0;

/* JADX INFO: loaded from: classes2.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final AbstractC0505d0 SINGLE_STYLE_VALUES = AbstractC0505d0.j(2, TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final AbstractC0505d0 MARK_SHAPE_VALUES = AbstractC0505d0.j(3, "dot", TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final AbstractC0505d0 MARK_FILL_VALUES = AbstractC0505d0.j(2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final AbstractC0505d0 POSITION_VALUES = AbstractC0505d0.j(3, TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i4, int i6) {
        this.markShape = i;
        this.markFill = i4;
        this.position = i6;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strH = v0.H(str.trim());
        if (strH.isEmpty()) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(strH, WHITESPACE_PATTERN);
        int length = strArrSplit.length;
        return parseWords(length != 0 ? length != 1 ? AbstractC0505d0.j(strArrSplit.length, (Object[]) strArrSplit.clone()) : new G0(strArrSplit[0]) : z0.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(O1.AbstractC0505d0 r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TextEmphasis.parseWords(O1.d0):androidx.media3.extractor.text.ttml.TextEmphasis");
    }
}
