package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzl {
    private static final Comparator zza = zzzk.zza;
    private static final Comparator zzb = zzzj.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzi[] zzd = new zzzi[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzl(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzzi zzziVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i4 = this.zzh;
        if (i4 > 0) {
            zzzi[] zzziVarArr = this.zzd;
            int i6 = i4 - 1;
            this.zzh = i6;
            zzziVar = zzziVarArr[i6];
        } else {
            zzziVar = new zzzi(null);
        }
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        zzziVar.zza = i10;
        zzziVar.zzb = i;
        zzziVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzziVar);
        this.zzg += i;
        while (true) {
            int i11 = this.zzg;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 + androidx.media3.common.C.PRIORITY_PROCESSING_FOREGROUND;
            zzzi zzziVar2 = (zzzi) arrayList.get(0);
            int i13 = zzziVar2.zzb;
            if (i13 <= i12) {
                this.zzg -= i13;
                arrayList.remove(0);
                int i14 = this.zzh;
                if (i14 < 5) {
                    zzzi[] zzziVarArr2 = this.zzd;
                    this.zzh = i14 + 1;
                    zzziVarArr2[i14] = zzziVar2;
                }
            } else {
                zzziVar2.zzb = i13 - i12;
                this.zzg -= i12;
            }
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f3 = this.zzg;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzzi) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f7 = 0.5f * f3;
            zzzi zzziVar = (zzzi) arrayList.get(i);
            i4 += zzziVar.zzb;
            if (i4 >= f7) {
                return zzziVar.zzc;
            }
            i++;
        }
    }
}
