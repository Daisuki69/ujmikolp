package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgru extends zzgrg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgrt zze;
    private final zzgrs zzf;

    public /* synthetic */ zzgru(int i, int i4, int i6, int i10, zzgrt zzgrtVar, zzgrs zzgrsVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = i10;
        this.zze = zzgrtVar;
        this.zzf = zzgrsVar;
    }

    public static zzgrr zzb() {
        return new zzgrr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgru)) {
            return false;
        }
        zzgru zzgruVar = (zzgru) obj;
        return zzgruVar.zza == this.zza && zzgruVar.zzb == this.zzb && zzgruVar.zzc == this.zzc && zzgruVar.zzd == this.zzd && zzgruVar.zze == this.zze && zzgruVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzgru.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzgrs zzgrsVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzgrsVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i4 = this.zzd;
        int length4 = String.valueOf(i4).length();
        int i6 = this.zza;
        int length5 = String.valueOf(i6).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i10).length() + 15);
        androidx.media3.datasource.cache.c.A(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        androidx.media3.datasource.cache.c.y(sb2, ", ", i, "-byte IV, and ", i4);
        androidx.media3.datasource.cache.c.y(sb2, "-byte tags, and ", i6, "-byte AES key, and ", i10);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zze != zzgrt.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzgrt zzg() {
        return this.zze;
    }

    public final zzgrs zzh() {
        return this.zzf;
    }
}
