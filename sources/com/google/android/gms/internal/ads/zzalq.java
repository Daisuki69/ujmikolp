package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzalq implements zzajq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalq(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzalg zzalgVar = (zzalg) list.get(i);
            long[] jArr = this.zzb;
            int i4 = i + i;
            jArr[i4] = zzalgVar.zzb;
            jArr[i4 + 1] = zzalgVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final long zzb(int i) {
        zzghc.zza(i >= 0);
        long[] jArr = this.zzc;
        zzghc.zza(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i4 = i + i;
            if (jArr[i4] <= j && j < jArr[i4 + 1]) {
                zzalg zzalgVar = (zzalg) list.get(i);
                zzcl zzclVar = zzalgVar.zza;
                if (zzclVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzalgVar);
                } else {
                    arrayList.add(zzclVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, zzalp.zza);
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            zzck zzckVarZza = ((zzalg) arrayList2.get(i6)).zza.zza();
            zzckVarZza.zzf((-1) - i6, 1);
            arrayList.add(zzckVarZza.zzr());
        }
        return arrayList;
    }
}
