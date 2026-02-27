package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtk extends zzgrg {
    private final String zza;
    private final zzgtj zzb;

    private zzgtk(String str, zzgtj zzgtjVar) {
        this.zza = str;
        this.zzb = zzgtjVar;
    }

    public static zzgtk zzb(String str, zzgtj zzgtjVar) {
        return new zzgtk(str, zzgtjVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtk)) {
            return false;
        }
        zzgtk zzgtkVar = (zzgtk) obj;
        return zzgtkVar.zza.equals(this.zza) && zzgtkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgtk.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzgtj.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzgtj zzd() {
        return this.zzb;
    }
}
