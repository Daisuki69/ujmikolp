package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.work.WorkInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzaki {
    private final zzef zza = new zzef();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    @Nullable
    public final zzcl zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzef zzefVar = this.zza;
        if (zzefVar.zze() == 0 || zzefVar.zzg() != zzefVar.zze() || !this.zzc) {
            return null;
        }
        zzefVar.zzh(0);
        int i4 = this.zzh * this.zzi;
        int[] iArr = new int[i4];
        int i6 = 0;
        while (i6 < i4) {
            int iZzs = zzefVar.zzs();
            if (iZzs != 0) {
                i = i6 + 1;
                iArr[i6] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzefVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzefVar.zzs();
                    }
                    i = iZzs3 + i6;
                    Arrays.fill(iArr, i6, i, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzefVar.zzs()]);
                }
            }
            i6 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzck zzckVar = new zzck();
        zzckVar.zzc(bitmapCreateBitmap);
        zzckVar.zzi(this.zzf / this.zzd);
        zzckVar.zzj(0);
        zzckVar.zzf(this.zzg / this.zze, 0);
        zzckVar.zzg(0);
        zzckVar.zzm(this.zzh / this.zzd);
        zzckVar.zzn(this.zzi / this.zze);
        return zzckVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzef zzefVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i4 = i / 5;
        int i6 = 0;
        while (i6 < i4) {
            int iZzs = zzefVar2.zzs();
            int iZzs2 = zzefVar2.zzs();
            int iZzs3 = zzefVar2.zzs();
            int iZzs4 = zzefVar2.zzs();
            int iZzs5 = zzefVar2.zzs();
            double d10 = iZzs2;
            int i10 = iZzs3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i11 = iZzs4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i12 = iZzs5 << 24;
            String str = zzeo.zza;
            double d11 = i10;
            double d12 = i11;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | i12 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255));
            i6++;
            zzefVar2 = zzefVar;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzef zzefVar, int i) {
        int iZzx;
        if (i < 4) {
            return;
        }
        zzefVar.zzk(3);
        int i4 = i - 4;
        if ((zzefVar.zzs() & 128) != 0) {
            if (i4 < 7 || (iZzx = zzefVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzefVar.zzt();
            this.zzi = zzefVar.zzt();
            this.zza.zza(iZzx - 4);
            i4 = i - 11;
        }
        zzef zzefVar2 = this.zza;
        int iZzg = zzefVar2.zzg();
        int iZze = zzefVar2.zze();
        if (iZzg >= iZze || i4 <= 0) {
            return;
        }
        int iMin = Math.min(i4, iZze - iZzg);
        zzefVar.zzm(zzefVar2.zzi(), iZzg, iMin);
        zzefVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzef zzefVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzefVar.zzt();
        this.zze = zzefVar.zzt();
        zzefVar.zzk(11);
        this.zzf = zzefVar.zzt();
        this.zzg = zzefVar.zzt();
    }
}
