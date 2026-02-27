package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhad extends zzhau {
    private final int zza;
    private final int zzb;
    private final zzhac zzc;

    public /* synthetic */ zzhad(int i, int i4, zzhac zzhacVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = zzhacVar;
    }

    public static zzhab zzb() {
        return new zzhab(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhad)) {
            return false;
        }
        zzhad zzhadVar = (zzhad) obj;
        return zzhadVar.zza == this.zza && zzhadVar.zze() == zze() && zzhadVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhad.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i4 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i4).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i);
        return androidx.media3.datasource.cache.c.m(sb2, "-byte tags, and ", i4, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzc != zzhac.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhac zzhacVar = this.zzc;
        if (zzhacVar == zzhac.zzd) {
            return this.zzb;
        }
        if (zzhacVar == zzhac.zza || zzhacVar == zzhac.zzb || zzhacVar == zzhac.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhac zzf() {
        return this.zzc;
    }
}
