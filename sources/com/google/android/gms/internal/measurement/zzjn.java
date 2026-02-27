package com.google.android.gms.internal.measurement;

import N1.o;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final o zzb;

    public zzjn(Context context, o oVar) {
        this.zza = context;
        this.zzb = oVar;
    }

    public final boolean equals(Object obj) {
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((oVar = this.zzb) != null ? oVar.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        o oVar = this.zzb;
        return (iHashCode * 1000003) ^ (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final o zzb() {
        return this.zzb;
    }
}
