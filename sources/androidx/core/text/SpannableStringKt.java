package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i4, Object obj) {
        spannable.setSpan(obj, i, i4, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, IntRange intRange, Object obj) {
        spannable.setSpan(obj, intRange.f18201a, intRange.f18202b, 17);
    }
}
