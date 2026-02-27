package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zztz implements zzwh {
    private final zzgjz zza;
    private long zzb;

    public zztz(List list, List list2) {
        int i = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzghc.zza(list.size() == list2.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzgjwVar.zzf(new zzty((zzwh) list.get(i4), (List) list2.get(i4)));
        }
        this.zza = zzgjwVar.zzi();
        this.zzb = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return;
            }
            ((zzty) zzgjzVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            zzty zztyVar = (zzty) zzgjzVar.get(i);
            long jZzi = zztyVar.zzi();
            if ((zztyVar.zza().contains(1) || zztyVar.zza().contains(2) || zztyVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != androidx.media3.common.C.TIME_UNSET ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                break;
            }
            long jZzl = ((zzty) zzgjzVar.get(i)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        boolean zZzm;
        boolean z4 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zZzm = false;
            while (true) {
                zzgjz zzgjzVar = this.zza;
                if (i >= zzgjzVar.size()) {
                    break;
                }
                long jZzl2 = ((zzty) zzgjzVar.get(i)).zzl();
                boolean z5 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzklVar.zza;
                if (jZzl2 == jZzl || z5) {
                    zZzm |= ((zzty) zzgjzVar.get(i)).zzm(zzklVar);
                }
                i++;
            }
            z4 |= zZzm;
        } while (zZzm);
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i >= zzgjzVar.size()) {
                return false;
            }
            if (((zzty) zzgjzVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
