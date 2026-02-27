package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcr {
    public static void zza(Spannable spannable, Object obj, int i, int i4, int i6) {
        for (Object obj2 : spannable.getSpans(i, i4, obj.getClass())) {
            zzc(spannable, obj2, i, i4, 33);
        }
        spannable.setSpan(obj, i, i4, 33);
    }

    public static void zzb(Spannable spannable, float f, int i, int i4, int i6) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i4, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i4) {
                f = relativeSizeSpan.getSizeChange() * f;
            }
            zzc(spannable, relativeSizeSpan, i, i4, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i, i4, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i, int i4, int i6) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i4 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
