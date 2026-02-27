package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzalb {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;

    @Nullable
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzf(int i, int i4) {
        return (i & 16777215) | ((i4 * 17) << 24);
    }

    private final void zzg(zzee zzeeVar, boolean z4, Rect rect, int[] iArr) {
        int i;
        int i4;
        int i6 = !z4 ? 1 : 0;
        int iWidth = rect.width();
        int i10 = i6 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int iZzj = 0;
                for (int i12 = 1; iZzj < i12 && i12 <= 64; i12 <<= 2) {
                    if (zzeeVar.zzc() < 4) {
                        i = -1;
                        i4 = 0;
                        break;
                    }
                    iZzj = (iZzj << 4) | zzeeVar.zzj(4);
                }
                i = iZzj & 3;
                i4 = iZzj < 4 ? iWidth : iZzj >> 2;
                int iMin = Math.min(i4, iWidth - i11);
                if (iMin > 0) {
                    int i13 = i10 + iMin;
                    Arrays.fill(iArr, i10, i13, this.zza[i]);
                    i11 += iMin;
                    i10 = i13;
                }
            } while (i11 < iWidth);
            i6 += 2;
            if (i6 >= iHeight) {
                return;
            }
            i10 = i6 * iWidth;
            zzeeVar.zzm();
        }
    }

    public final void zza(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = zzeo.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzd = new int[strArrSplit.length];
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    int[] iArr = this.zzd;
                    try {
                        i = Integer.parseInt(strArrSplit[i4].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i4] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(strArrSplit2[0]);
                        this.zzf = Integer.parseInt(strArrSplit2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e) {
                        zzds.zzd("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public final void zzb(zzef zzefVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzefVar.zzk(zzefVar.zzt() - 2);
        int iZzt = zzefVar.zzt();
        while (zzefVar.zzg() < iZzt && zzefVar.zzd() > 0) {
            switch (zzefVar.zzs()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (zzefVar.zzd() < 2) {
                        return;
                    }
                    int iZzs = zzefVar.zzs();
                    int iZzs2 = zzefVar.zzs();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zze(iArr, iZzs >> 4);
                    iArr2[2] = zze(iArr, iZzs & 15);
                    iArr2[1] = zze(iArr, iZzs2 >> 4);
                    iArr2[0] = zze(iArr, iZzs2 & 15);
                    this.zzc = true;
                    break;
                case 4:
                    if (zzefVar.zzd() < 2 || !this.zzc) {
                        return;
                    }
                    int iZzs3 = zzefVar.zzs();
                    int iZzs4 = zzefVar.zzs();
                    int[] iArr3 = this.zza;
                    iArr3[3] = zzf(iArr3[3], iZzs3 >> 4);
                    iArr3[2] = zzf(iArr3[2], iZzs3 & 15);
                    iArr3[1] = zzf(iArr3[1], iZzs4 >> 4);
                    iArr3[0] = zzf(iArr3[0], iZzs4 & 15);
                    break;
                case 5:
                    if (zzefVar.zzd() < 6) {
                        return;
                    }
                    int iZzs5 = zzefVar.zzs();
                    int iZzs6 = zzefVar.zzs();
                    int i = iZzs6 >> 4;
                    int iZzs7 = ((iZzs6 & 15) << 8) | zzefVar.zzs();
                    int iZzs8 = zzefVar.zzs();
                    int iZzs9 = zzefVar.zzs();
                    this.zzg = new Rect((iZzs5 << 4) | i, (iZzs8 << 4) | (iZzs9 >> 4), iZzs7 + 1, (((iZzs9 & 15) << 8) | zzefVar.zzs()) + 1);
                    break;
                case 6:
                    if (zzefVar.zzd() < 4) {
                        return;
                    }
                    this.zzh = zzefVar.zzt();
                    this.zzi = zzefVar.zzt();
                    break;
                default:
                    return;
            }
        }
    }

    @Nullable
    public final zzcl zzc(zzef zzefVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.height() * rect2.width()];
        zzee zzeeVar = new zzee();
        zzefVar.zzh(this.zzh);
        zzeeVar.zza(zzefVar);
        zzg(zzeeVar, true, rect2, iArr);
        zzefVar.zzh(this.zzi);
        zzeeVar.zza(zzefVar);
        zzg(zzeeVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzck zzckVar = new zzck();
        zzckVar.zzc(bitmapCreateBitmap);
        zzckVar.zzi(rect2.left / this.zze);
        zzckVar.zzj(0);
        zzckVar.zzf(rect2.top / this.zzf, 0);
        zzckVar.zzg(0);
        zzckVar.zzm(rect2.width() / this.zze);
        zzckVar.zzn(rect2.height() / this.zzf);
        return zzckVar.zzr();
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
