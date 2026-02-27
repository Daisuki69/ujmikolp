package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsl extends zzgrg {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgsk zzd;

    public /* synthetic */ zzgsl(int i, int i4, int i6, zzgsk zzgskVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzgskVar;
    }

    public static zzgsj zzb() {
        return new zzgsj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsl)) {
            return false;
        }
        zzgsl zzgslVar = (zzgsl) obj;
        return zzgslVar.zza == this.zza && zzgslVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgsl.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb2 = new StringBuilder(We.s.b(length + 30 + length2 + 10 + length3, 15, String.valueOf(i).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzd != zzgsk.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgsk zzd() {
        return this.zzd;
    }
}
