package com.google.android.gms.internal.ads;

import androidx.camera.video.AudioStats;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzch {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzch(int i, int i4, float f, float f3, int i6) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = f;
        this.zzd = f3;
        this.zze = i / i6;
        this.zzf = i / YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR;
        int i10 = i / 65;
        this.zzg = i10;
        int i11 = i10 + i10;
        this.zzh = i11;
        this.zzi = new short[i11];
        int i12 = i11 * i4;
        this.zzj = new short[i12];
        this.zzl = new short[i12];
        this.zzn = new short[i12];
    }

    private final short[] zzg(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i6 = this.zzb;
        int i10 = length / i6;
        return i + i4 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i4) * i6);
    }

    private final void zzh(short[] sArr, int i, int i4) {
        short[] sArrZzg = zzg(this.zzl, this.zzm, i4);
        this.zzl = sArrZzg;
        int i6 = this.zzm;
        int i10 = this.zzb;
        System.arraycopy(sArr, i * i10, sArrZzg, i6 * i10, i4 * i10);
        this.zzm += i4;
    }

    private final void zzi(short[] sArr, int i, int i4) {
        int i6;
        for (int i10 = 0; i10 < this.zzh / i4; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.zzb;
                i6 = i13 * i4;
                if (i11 < i6) {
                    i12 += sArr[(i6 * i10) + (i13 * i) + i11];
                    i11++;
                }
            }
            this.zzi[i10] = (short) (i12 / i6);
        }
    }

    private final int zzj(short[] sArr, int i, int i4, int i6) {
        int i10 = 1;
        int i11 = 255;
        int i12 = 0;
        int i13 = 0;
        while (i4 <= i6) {
            int iAbs = 0;
            for (int i14 = 0; i14 < i4; i14++) {
                int i15 = this.zzb * i;
                iAbs += Math.abs(sArr[i15 + i14] - sArr[(i15 + i4) + i14]);
            }
            int i16 = iAbs * i12;
            int i17 = i10 * i4;
            if (i16 < i17) {
                i10 = iAbs;
            }
            if (i16 < i17) {
                i12 = i4;
            }
            int i18 = iAbs * i11;
            int i19 = i13 * i4;
            if (i18 > i19) {
                i13 = iAbs;
            }
            if (i18 > i19) {
                i11 = i4;
            }
            i4++;
        }
        this.zzu = i10 / i12;
        this.zzv = i13 / i11;
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk() {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzch.zzk():void");
    }

    private static void zzl(int i, int i4, short[] sArr, int i6, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i4; i12++) {
            int i13 = (i10 * i4) + i12;
            int i14 = (i11 * i4) + i12;
            int i15 = (i6 * i4) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i15] = (short) (((sArr3[i14] * i16) + ((i - i16) * sArr2[i13])) / i);
                i15 += i4;
                i13 += i4;
                i14 += i4;
            }
        }
    }

    public final int zza() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i4 = iRemaining / i;
        int i6 = i4 * i;
        short[] sArrZzg = zzg(this.zzj, this.zzk, i4);
        this.zzj = sArrZzg;
        shortBuffer.get(sArrZzg, this.zzk * i, (i6 + i6) / 2);
        this.zzk += i4;
        zzk();
    }

    public final void zzc(ShortBuffer shortBuffer) {
        zzghc.zzh(this.zzm >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int iMin = Math.min(iRemaining / i, this.zzm);
        int i4 = iMin * i;
        shortBuffer.put(this.zzl, 0, i4);
        int i6 = this.zzm - iMin;
        this.zzm = i6;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i4, sArr, 0, i6 * i);
    }

    public final void zzd() {
        int i = this.zzk;
        int i4 = this.zzr;
        int i6 = this.zzm;
        float f = this.zzc;
        float f3 = this.zzd;
        int i10 = i6 + ((int) ((((((((double) (i - i4)) / ((double) (f / f3))) + ((double) i4)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f3))) + 0.5d));
        this.zzw = AudioStats.AUDIO_AMPLITUDE_NONE;
        int i11 = this.zzh;
        int i12 = i11 + i11;
        this.zzj = zzg(this.zzj, i, i + i12);
        int i13 = 0;
        while (true) {
            int i14 = this.zzb;
            if (i13 >= i12 * i14) {
                break;
            }
            this.zzj[(i14 * i) + i13] = 0;
            i13++;
        }
        this.zzk += i12;
        zzk();
        if (this.zzm > i10) {
            this.zzm = Math.max(i10, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zze() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final int zzf() {
        zzghc.zzh(this.zzm >= 0);
        int i = this.zzm * this.zzb;
        return i + i;
    }
}
