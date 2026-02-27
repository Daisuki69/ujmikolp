package com.google.android.gms.internal.auth;

import We.s;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z4) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbW = s.w("Invalid boolean value for ", zzc(), ": ");
        sbW.append((String) obj);
        Log.e("PhenotypeFlag", sbW.toString());
        return null;
    }
}
