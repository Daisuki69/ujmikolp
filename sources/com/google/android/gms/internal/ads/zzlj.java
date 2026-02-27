package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzlj extends zzhh {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbe[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzlj(Collection collection, zzwi zzwiVar) {
        zzbe[] zzbeVarArr = new zzbe[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i4 = 0;
        while (it.hasNext()) {
            zzbeVarArr[i4] = ((zzkr) it.next()).zzb();
            i4++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzkr) it2.next()).zza();
            i++;
        }
        this(zzbeVarArr, objArr, zzwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzp(int i) {
        return zzeo.zzl(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzq(int i) {
        return zzeo.zzl(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzbe zzs(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzt(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final int zzu(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlj zzx(zzwi zzwiVar) {
        zzbe[] zzbeVarArr = this.zzg;
        zzbe[] zzbeVarArr2 = new zzbe[zzbeVarArr.length];
        for (int i = 0; i < zzbeVarArr.length; i++) {
            zzbeVarArr2[i] = new zzli(this, zzbeVarArr[i]);
        }
        return new zzlj(zzbeVarArr2, this.zzh, zzwiVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlj(zzbe[] zzbeVarArr, Object[] objArr, zzwi zzwiVar) {
        super(false, zzwiVar);
        int i = 0;
        this.zzg = zzbeVarArr;
        int length = zzbeVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i4 = 0;
        while (i < zzbeVarArr.length) {
            zzbe zzbeVar = zzbeVarArr[i];
            this.zzg[i4] = zzbeVar;
            this.zzf[i4] = iZza;
            this.zze[i4] = iZzc;
            iZza += zzbeVar.zza();
            iZzc += this.zzg[i4].zzc();
            this.zzi.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}
