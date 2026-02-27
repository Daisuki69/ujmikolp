package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzkd extends zzkm {
    public zzkd(zzkg zzkgVar, String str, Boolean bool, boolean z4) {
        super(zzkgVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjg.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjg.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", androidx.camera.core.impl.a.p(new StringBuilder(str2.length() + 28 + string.length()), "Invalid boolean value for ", str2, ": ", string));
        return null;
    }
}
