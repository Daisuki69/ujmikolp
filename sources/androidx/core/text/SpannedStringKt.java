package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class SpannedStringKt {
    public static final <T> T[] getSpans(Spanned spanned, int i, int i4) {
        j.m();
        throw null;
    }

    public static Object[] getSpans$default(Spanned spanned, int i, int i4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            spanned.length();
        }
        j.m();
        throw null;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
