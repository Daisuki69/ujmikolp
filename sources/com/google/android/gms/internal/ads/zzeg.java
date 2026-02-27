package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeg {
    public static final zzeg zza = new zzeg(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzeg(0, 0);
    }

    public zzeg(int i, int i4) {
        boolean z4 = false;
        if ((i == -1 || i >= 0) && (i4 == -1 || i4 >= 0)) {
            z4 = true;
        }
        zzghc.zza(z4);
        this.zzb = i;
        this.zzc = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeg) {
            zzeg zzegVar = (zzeg) obj;
            if (this.zzb == zzegVar.zzb && this.zzc == zzegVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb2.append(i);
        sb2.append("x");
        sb2.append(i4);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
