package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbe zzbeVar, byte[] bArr) {
        int size = zzbeVar.zzd().size();
        this.zza = (String[]) zzbeVar.zzc().toArray(new String[size]);
        this.zzb = zzc(zzbeVar.zzd());
        this.zzc = zzc(zzbeVar.zze());
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d10) {
        this.zze++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i >= dArr.length) {
                return;
            }
            double d11 = dArr[i];
            if (d11 <= d10 && d10 < this.zzb[i]) {
                int[] iArr = this.zzd;
                iArr[i] = iArr[i] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d10 = dArr[i];
            double d11 = dArr2[i];
            int i4 = iArr[i];
            arrayList.add(new zzbd(str, d10, d11, ((double) i4) / ((double) this.zze), i4));
        }
        return arrayList;
    }
}
