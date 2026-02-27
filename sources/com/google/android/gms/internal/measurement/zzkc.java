package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l6, boolean z4) {
        super(zzkgVar, str, l6, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", androidx.camera.core.impl.a.p(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
        return null;
    }
}
