package com.google.android.gms.internal.mlkit_common;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzru extends zzsb {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzru(String str, boolean z4, int i, zzrt zzrtVar) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsb) {
            zzsb zzsbVar = (zzsb) obj;
            if (this.zza.equals(zzsbVar.zzb()) && this.zzb == zzsbVar.zzc() && this.zzc == zzsbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.zza);
        sb2.append(", enableFirelog=");
        sb2.append(this.zzb);
        sb2.append(", firelogEventType=");
        return s.o(sb2, "}", this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final boolean zzc() {
        return this.zzb;
    }
}
