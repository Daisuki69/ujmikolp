package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f, int i, int i4, int i6) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i4, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i4) {
                f = relativeSizeSpan.getSizeChange() * f;
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i, i4, i6);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i4, i6);
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i, int i4, int i6) {
        for (Object obj2 : spannable.getSpans(i, i4, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i, i4, i6);
        }
        spannable.setSpan(obj, i, i4, i6);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int i, int i4, int i6) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i4 && spannable.getSpanFlags(obj) == i6) {
            spannable.removeSpan(obj);
        }
    }
}
