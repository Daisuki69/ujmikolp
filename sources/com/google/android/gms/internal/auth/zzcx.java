package com.google.android.gms.internal.auth;

import We.s;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z4) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbW = s.w("Invalid double value for ", zzc(), ": ");
            sbW.append((String) obj);
            Log.e("PhenotypeFlag", sbW.toString());
            return null;
        }
    }
}
