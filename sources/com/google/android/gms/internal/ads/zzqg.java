package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class zzqg {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdb zzG;
    boolean zza;
    private final zzqf zzb;
    private final long[] zzc;

    @Nullable
    private AudioTrack zzd;
    private int zze;

    @Nullable
    private zzqe zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Nullable
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqg(zzqf zzqfVar) {
        this.zzb = zzqfVar;
        try {
            this.zzo = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = androidx.media3.common.C.TIME_UNSET;
        this.zzC = androidx.media3.common.C.TIME_UNSET;
        this.zzG = zzdb.zza;
    }

    private final void zzl(long j) {
        if (this.zza) {
            long j6 = this.zzk;
            if (j6 == androidx.media3.common.C.TIME_UNSET || j < j6) {
                return;
            }
            long jZza = this.zzG.zza() - zzeo.zzp(zzeo.zzw(j - j6, this.zzi));
            this.zzk = androidx.media3.common.C.TIME_UNSET;
            this.zzb.zza(jZza);
        }
    }

    private final long zzm(long j) {
        long jMax = Math.max(0L, (this.zzx == 0 ? this.zzy != androidx.media3.common.C.TIME_UNSET ? zzeo.zzr(zzq(), this.zzg) : zzo() : zzeo.zzv(j + this.zzm, this.zzi)) - this.zzp);
        return this.zzy != androidx.media3.common.C.TIME_UNSET ? Math.min(zzeo.zzr(this.zzB, this.zzg), jMax) : jMax;
    }

    private final void zzn() {
        this.zzm = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0L;
        this.zzC = androidx.media3.common.C.TIME_UNSET;
        this.zzD = androidx.media3.common.C.TIME_UNSET;
        this.zzj = false;
    }

    private final long zzo() {
        return zzeo.zzr(zzp(), this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzp() {
        /*
            r12 = this;
            long r0 = r12.zzy
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.zzq()
            long r2 = r12.zzB
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.zzdb r0 = r12.zzG
            long r0 = r0.zzb()
            long r4 = r12.zzt
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L6f
            android.media.AudioTrack r4 = r12.zzd
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L6d
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L5e
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5c
            long r10 = r12.zzu
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r12.zzz
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L6d
            r12.zzz = r0
            goto L6d
        L5c:
            r12.zzz = r2
        L5e:
            long r2 = r12.zzu
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6b
            long r2 = r12.zzv
            r4 = 1
            long r2 = r2 + r4
            r12.zzv = r2
        L6b:
            r12.zzu = r6
        L6d:
            r12.zzt = r0
        L6f:
            long r0 = r12.zzu
            long r2 = r12.zzF
            long r0 = r0 + r2
            long r2 = r12.zzv
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzp():long");
    }

    private final long zzq() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzeo.zzs(zzeo.zzv(zzeo.zzq(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    public final void zza(AudioTrack audioTrack, int i, int i4, int i6, boolean z4) {
        this.zzd = audioTrack;
        this.zze = i6;
        this.zzf = new zzqe(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zZzA = zzeo.zzA(i);
        this.zzr = zZzA;
        this.zzh = zZzA ? zzeo.zzr(i6 / i4, this.zzg) : -9223372036854775807L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzq = false;
        this.zzy = androidx.media3.common.C.TIME_UNSET;
        this.zzz = androidx.media3.common.C.TIME_UNSET;
        this.zzs = 0L;
        this.zzp = 0L;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zza = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:23:0x0075, B:25:0x0079, B:27:0x0099, B:28:0x00a1), top: B:64:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:23:0x0075, B:25:0x0079, B:27:0x0099, B:28:0x00a1), top: B:64:0x0075 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb() {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzb():long");
    }

    public final void zzc() {
        if (this.zzy != androidx.media3.common.C.TIME_UNSET) {
            this.zzy = zzeo.zzq(this.zzG.zzb());
        }
        this.zzk = zzo();
        zzqe zzqeVar = this.zzf;
        zzqeVar.getClass();
        zzqeVar.zzd();
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zze(long j) {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack2 = this.zzd;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            z = underrunCount > this.zzl;
            this.zzl = underrunCount;
        } else {
            boolean z4 = this.zzq;
            boolean zZzh = zzh(j);
            this.zzq = zZzh;
            if (z4 && !zZzh && playState != 1) {
                z = true;
            }
        }
        if (z) {
            this.zzb.zze(this.zze, zzeo.zzp(this.zzh));
        }
        return true;
    }

    public final boolean zzf(long j) {
        return this.zzz != androidx.media3.common.C.TIME_UNSET && j > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final void zzg(long j) {
        this.zzA = zzp();
        this.zzy = zzeo.zzq(this.zzG.zzb());
        this.zzB = j;
    }

    public final boolean zzh(long j) {
        return j > zzeo.zzs(zzb(), this.zzg);
    }

    public final void zzi() {
        zzn();
        if (this.zzy == androidx.media3.common.C.TIME_UNSET) {
            zzqe zzqeVar = this.zzf;
            zzqeVar.getClass();
            zzqeVar.zzd();
        }
        this.zzA = zzp();
    }

    public final void zzj() {
        zzn();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzk(zzdb zzdbVar) {
        this.zzG = zzdbVar;
    }
}
