package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsu extends zzgrg {
    private final int zza;
    private final zzgst zzb;

    public /* synthetic */ zzgsu(int i, zzgst zzgstVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzgstVar;
    }

    public static zzgss zzb() {
        return new zzgss(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsu)) {
            return false;
        }
        zzgsu zzgsuVar = (zzgsu) obj;
        return zzgsuVar.zza == this.zza && zzgsuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgsu.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzgst.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgst zzd() {
        return this.zzb;
    }
}
