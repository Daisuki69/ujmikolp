package com.google.android.gms.internal.auth;

import We.s;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l6, boolean z4) {
        super(zzczVar, str, l6, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbW = s.w("Invalid long value for ", zzc(), ": ");
            sbW.append((String) obj);
            Log.e("PhenotypeFlag", sbW.toString());
            return null;
        }
    }
}
