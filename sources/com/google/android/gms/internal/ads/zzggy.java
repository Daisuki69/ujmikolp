package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggy {
    private final String zza;
    private final zzggx zzb;
    private zzggx zzc;

    public /* synthetic */ zzggy(String str, byte[] bArr) {
        zzggx zzggxVar = new zzggx();
        this.zzb = zzggxVar;
        this.zzc = zzggxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzggx zzggxVar = this.zzb.zzb;
        String str = "";
        while (zzggxVar != null) {
            Object obj = zzggxVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzggxVar = zzggxVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzggy zza(Object obj) {
        zzggx zzggxVar = new zzggx();
        this.zzc.zzb = zzggxVar;
        this.zzc = zzggxVar;
        zzggxVar.zza = obj;
        return this;
    }
}
