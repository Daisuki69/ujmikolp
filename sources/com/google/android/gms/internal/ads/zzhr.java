package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhr {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i4 = this.zzb;
        int i6 = this.zzc;
        int i10 = this.zzd;
        int i11 = this.zze;
        int i12 = this.zzf;
        int i13 = this.zzg;
        int i14 = this.zzh;
        int i15 = this.zzi;
        int i16 = this.zzj;
        long j = this.zzk;
        int i17 = this.zzl;
        String str = zzeo.zza;
        Locale locale = Locale.US;
        StringBuilder sbU = We.s.u("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i4, "\n queuedInputBuffers=");
        sbU.append(i6);
        sbU.append("\n skippedInputBuffers=");
        sbU.append(i10);
        sbU.append("\n renderedOutputBuffers=");
        sbU.append(i11);
        sbU.append("\n skippedOutputBuffers=");
        sbU.append(i12);
        sbU.append("\n droppedBuffers=");
        sbU.append(i13);
        sbU.append("\n droppedInputBuffers=");
        sbU.append(i14);
        sbU.append("\n maxConsecutiveDroppedBuffers=");
        sbU.append(i15);
        sbU.append("\n droppedToKeyframeEvents=");
        sbU.append(i16);
        sbU.append("\n totalVideoFrameProcessingOffsetUs=");
        sbU.append(j);
        sbU.append("\n videoFrameProcessingOffsetCount=");
        sbU.append(i17);
        sbU.append("\n}");
        return sbU.toString();
    }

    public final synchronized void zza() {
    }
}
