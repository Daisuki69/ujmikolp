package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzap {
    private final String zza;
    private final zzao zzb;
    private zzao zzc;

    public /* synthetic */ zzap(String str, zzam zzamVar) {
        zzao zzaoVar = new zzao(null);
        this.zzb = zzaoVar;
        this.zzc = zzaoVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzao zzaoVar = this.zzb.zzc;
        String str = "";
        while (zzaoVar != null) {
            Object obj = zzaoVar.zzb;
            boolean z4 = zzaoVar instanceof zzan;
            sb2.append(str);
            String str2 = zzaoVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzaoVar = zzaoVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzap zza(String str, int i) {
        String strValueOf = String.valueOf(i);
        zzan zzanVar = new zzan(null);
        this.zzc.zzc = zzanVar;
        this.zzc = zzanVar;
        zzanVar.zzb = strValueOf;
        zzanVar.zza = "errorCode";
        return this;
    }

    public final zzap zzb(String str, Object obj) {
        zzao zzaoVar = new zzao(null);
        this.zzc.zzc = zzaoVar;
        this.zzc = zzaoVar;
        zzaoVar.zzb = obj;
        zzaoVar.zza = str;
        return this;
    }
}
