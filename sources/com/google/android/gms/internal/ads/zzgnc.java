package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnc implements Serializable {
    private static final zzgnc zza = new zzgnc(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgnc(int[] iArr, int i, int i4) {
        this.zzb = iArr;
        this.zzc = i4;
    }

    public static zzgnc zza() {
        return zza;
    }

    public static zzgnc zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgnc(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgncVar = (zzgnc) obj;
        int i = this.zzc;
        if (i != zzgncVar.zzc) {
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (zzd(i4) != zzgncVar.zzd(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            i = (i * 31) + this.zzb[i4];
        }
        return i;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i * 5);
        sb2.append('[');
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb2.append(", ");
            sb2.append(iArr[i4]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i) {
        zzghc.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
