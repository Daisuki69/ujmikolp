package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahm implements zzadz {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzahm(int i, long j, int i4) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i4;
    }

    public final String toString() {
        String strZzx = zzeo.zzx(this.zza);
        int length = strZzx.length();
        long j = this.zzb;
        int length2 = String.valueOf(j).length();
        int i = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
        androidx.camera.core.impl.a.C(sb2, "AtomSizeTooSmall{type=", strZzx, ", size=");
        sb2.append(j);
        sb2.append(", minHeaderSize=");
        sb2.append(i);
        sb2.append("}");
        return sb2.toString();
    }
}
