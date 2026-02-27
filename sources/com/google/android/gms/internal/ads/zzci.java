package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzci implements zzcf {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcc zze;
    private zzcc zzf;
    private zzcc zzg;
    private zzcc zzh;
    private boolean zzi;

    @Nullable
    private zzch zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzci() {
        zzcc zzccVar = zzcc.zza;
        this.zze = zzccVar;
        this.zzf = zzccVar;
        this.zzg = zzccVar;
        this.zzh = zzccVar;
        ByteBuffer byteBuffer = zzcf.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final long zza(long j) {
        long j6 = this.zzo;
        if (j6 < 1024) {
            return (long) (j / ((double) this.zzc));
        }
        long j7 = this.zzn;
        zzch zzchVar = this.zzj;
        zzchVar.getClass();
        long jZza = j7 - ((long) zzchVar.zza());
        int i = this.zzh.zzb;
        int i4 = this.zzg.zzb;
        return i == i4 ? zzeo.zzt(j, j6, jZza, RoundingMode.DOWN) : zzeo.zzt(j, j6 * ((long) i4), jZza * ((long) i), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final zzcc zzb(zzcc zzccVar) throws zzce {
        if (zzccVar.zzd != 2) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzccVar.zzb;
        }
        this.zze = zzccVar;
        zzcc zzccVar2 = new zzcc(i, zzccVar.zzc, 2);
        this.zzf = zzccVar2;
        this.zzi = true;
        return zzccVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzch zzchVar = this.zzj;
            zzchVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzchVar.zzb(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zze() {
        zzch zzchVar = this.zzj;
        if (zzchVar != null) {
            zzchVar.zzd();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final ByteBuffer zzf() {
        int iZzf;
        zzch zzchVar = this.zzj;
        if (zzchVar != null && (iZzf = zzchVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzchVar.zzc(this.zzl);
            this.zzo += (long) iZzf;
            this.zzk.limit(iZzf);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcf.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final boolean zzg() {
        if (!this.zzp) {
            return false;
        }
        zzch zzchVar = this.zzj;
        return zzchVar == null || zzchVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final /* synthetic */ void zzh() {
        AbstractC1177k.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzi(zzcd zzcdVar) {
        if (zzc()) {
            zzcc zzccVar = this.zze;
            this.zzg = zzccVar;
            zzcc zzccVar2 = this.zzf;
            this.zzh = zzccVar2;
            if (this.zzi) {
                this.zzj = new zzch(zzccVar.zzb, zzccVar.zzc, this.zzc, this.zzd, zzccVar2.zzb);
            } else {
                zzch zzchVar = this.zzj;
                if (zzchVar != null) {
                    zzchVar.zze();
                }
            }
        }
        this.zzm = zzcf.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcc zzccVar = zzcc.zza;
        this.zze = zzccVar;
        this.zzf = zzccVar;
        this.zzg = zzccVar;
        this.zzh = zzccVar;
        ByteBuffer byteBuffer = zzcf.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzk(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        zzghc.zza(f > 0.0f);
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzl(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f) {
        zzghc.zza(f > 0.0f);
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final long zzm(long j) {
        long j6 = this.zzo;
        if (j6 < 1024) {
            return (long) (((double) this.zzc) * j);
        }
        long j7 = this.zzn;
        zzch zzchVar = this.zzj;
        zzchVar.getClass();
        long jZza = j7 - ((long) zzchVar.zza());
        int i = this.zzh.zzb;
        int i4 = this.zzg.zzb;
        return i == i4 ? zzeo.zzt(j, jZza, j6, RoundingMode.DOWN) : zzeo.zzt(j, jZza * ((long) i), j6 * ((long) i4), RoundingMode.DOWN);
    }
}
