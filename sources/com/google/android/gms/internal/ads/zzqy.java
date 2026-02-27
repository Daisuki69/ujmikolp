package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzqy implements zzqf {
    final /* synthetic */ zzrc zza;

    public /* synthetic */ zzqy(zzrc zzrcVar, byte[] bArr) {
        Objects.requireNonNull(zzrcVar);
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(long j) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zzd(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzb(long j, long j6, long j7, long j9) {
        zzrc zzrcVar = this.zza;
        long jZzF = zzrcVar.zzF();
        long jZzG = zzrcVar.zzG();
        int length = String.valueOf(j).length();
        int length2 = String.valueOf(j6).length();
        int length3 = String.valueOf(j7).length();
        int length4 = String.valueOf(j9).length();
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        androidx.media3.datasource.cache.c.z(sb2, "Spurious audio timestamp (frame position mismatch): ", j, ", ");
        sb2.append(j6);
        androidx.media3.datasource.cache.c.z(sb2, ", ", j7, ", ");
        sb2.append(j9);
        androidx.media3.datasource.cache.c.z(sb2, ", ", jZzF, ", ");
        sb2.append(jZzG);
        zzds.zzc("DefaultAudioSink", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzc(long j, long j6, long j7, long j9) {
        zzrc zzrcVar = this.zza;
        long jZzF = zzrcVar.zzF();
        long jZzG = zzrcVar.zzG();
        int length = String.valueOf(j).length();
        int length2 = String.valueOf(j6).length();
        int length3 = String.valueOf(j7).length();
        int length4 = String.valueOf(j9).length();
        StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        androidx.media3.datasource.cache.c.z(sb2, "Spurious audio timestamp (system clock mismatch): ", j, ", ");
        sb2.append(j6);
        androidx.media3.datasource.cache.c.z(sb2, ", ", j7, ", ");
        sb2.append(j9);
        androidx.media3.datasource.cache.c.z(sb2, ", ", jZzF, ", ");
        sb2.append(jZzG);
        zzds.zzc("DefaultAudioSink", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzd(long j) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j);
        zzds.zzc("DefaultAudioSink", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zze(int i, long j) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zze(i, j, SystemClock.elapsedRealtime() - zzrcVar.zzM());
        }
    }
}
