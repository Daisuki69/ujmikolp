package com.google.android.gms.internal.mlkit_common;

import We.s;
import p3.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzrx extends zzsj {
    private final zzmu zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final i zze;
    private final zzna zzf;
    private final int zzg;

    public /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z4, boolean z5, i iVar, zzna zznaVar, int i, zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = z5;
        this.zze = iVar;
        this.zzf = zznaVar;
        this.zzg = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        zzna zznaVar = this.zzf;
        i iVar = this.zze;
        String string = this.zza.toString();
        String string2 = iVar.toString();
        String string3 = zznaVar.toString();
        StringBuilder sbW = s.w("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=");
        sbW.append(this.zzb);
        sbW.append(", shouldLogRoughDownloadTime=");
        sbW.append(this.zzc);
        sbW.append(", shouldLogExactDownloadTime=");
        sbW.append(this.zzd);
        sbW.append(", modelType=");
        sbW.append(string2);
        sbW.append(", downloadStatus=");
        sbW.append(string3);
        sbW.append(", failureStatusCode=");
        return s.o(sbW, "}", this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final i zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }
}
