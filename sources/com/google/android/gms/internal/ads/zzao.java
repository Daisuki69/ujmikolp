package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao {
    private final zzan[] zza;

    public zzao(long j, zzan... zzanVarArr) {
        this.zza = zzanVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzao.class == obj.getClass() && Arrays.equals(this.zza, ((zzao) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + ((int) (-9223372034707292159L));
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        return We.s.q(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzan zzb(int i) {
        return this.zza[i];
    }

    public final zzao zzc(@Nullable zzao zzaoVar) {
        return zzaoVar == null ? this : zzd(zzaoVar.zza);
    }

    public final zzao zzd(zzan... zzanVarArr) {
        int length = zzanVarArr.length;
        if (length == 0) {
            return this;
        }
        zzan[] zzanVarArr2 = this.zza;
        String str = zzeo.zza;
        int length2 = zzanVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzanVarArr2, length2 + length);
        System.arraycopy(zzanVarArr, 0, objArrCopyOf, length2, length);
        return new zzao(androidx.media3.common.C.TIME_UNSET, (zzan[]) objArrCopyOf);
    }

    public zzao(List list) {
        this.zza = (zzan[]) list.toArray(new zzan[0]);
    }
}
