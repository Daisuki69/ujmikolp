package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzlc {
    private final zzox zza;
    private final zzlb zze;
    private final zzmd zzh;
    private final zzdl zzi;
    private boolean zzj;

    @Nullable
    private zzgy zzk;
    private zzwi zzl = new zzwi(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlc(zzlb zzlbVar, zzmd zzmdVar, zzdl zzdlVar, zzox zzoxVar) {
        this.zza = zzoxVar;
        this.zze = zzlbVar;
        this.zzh = zzmdVar;
        this.zzi = zzdlVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzkz zzkzVar = (zzkz) it.next();
            if (zzkzVar.zzc.isEmpty()) {
                zzs(zzkzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzkz zzkzVar) {
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzr(zzkyVar.zzb);
        }
    }

    private final void zzt(int i, int i4) {
        while (true) {
            i4--;
            if (i4 < i) {
                return;
            }
            zzkz zzkzVar = (zzkz) this.zzb.remove(i4);
            this.zzd.remove(zzkzVar.zzb);
            zzu(i4, -zzkzVar.zza.zzz().zza());
            zzkzVar.zze = true;
            if (this.zzj) {
                zzw(zzkzVar);
            }
        }
    }

    private final void zzu(int i, int i4) {
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            ((zzkz) list.get(i)).zzd += i4;
            i++;
        }
    }

    private final void zzv(zzkz zzkzVar) {
        zzuk zzukVar = zzkzVar.zza;
        zzuq zzuqVar = new zzuq() { // from class: com.google.android.gms.internal.ads.zzla
            @Override // com.google.android.gms.internal.ads.zzuq
            public final /* synthetic */ void zza(zzur zzurVar, zzbe zzbeVar) {
                this.zza.zzh(zzurVar, zzbeVar);
            }
        };
        zzkx zzkxVar = new zzkx(this, zzkzVar);
        this.zzf.put(zzkzVar, new zzky(zzukVar, zzuqVar, zzkxVar));
        zzukVar.zzl(new Handler(zzeo.zze(), null), zzkxVar);
        zzukVar.zzn(new Handler(zzeo.zze(), null), zzkxVar);
        zzukVar.zzp(zzuqVar, this.zzk, this.zza);
    }

    private final void zzw(zzkz zzkzVar) {
        if (zzkzVar.zze && zzkzVar.zzc.isEmpty()) {
            zzky zzkyVar = (zzky) this.zzf.remove(zzkzVar);
            zzkyVar.getClass();
            zzur zzurVar = zzkyVar.zza;
            zzurVar.zzs(zzkyVar.zzb);
            zzkx zzkxVar = zzkyVar.zzc;
            zzurVar.zzm(zzkxVar);
            zzurVar.zzo(zzkxVar);
            this.zzg.remove(zzkzVar);
        }
    }

    public final zzbe zza(int i, int i4, List list) {
        zzghc.zza(i >= 0 && i <= i4 && i4 <= zzc());
        zzghc.zza(list.size() == i4 - i);
        for (int i6 = i; i6 < i4; i6++) {
            ((zzkz) this.zzb.get(i6)).zza.zzA((zzaj) list.get(i6 - i));
        }
        return zzg();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(@Nullable zzgy zzgyVar) {
        zzghc.zzh(!this.zzj);
        this.zzk = zzgyVar;
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                this.zzj = true;
                return;
            }
            zzkz zzkzVar = (zzkz) list.get(i);
            zzv(zzkzVar);
            this.zzg.add(zzkzVar);
            i++;
        }
    }

    public final void zze(zzun zzunVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzkz zzkzVar = (zzkz) identityHashMap.remove(zzunVar);
        zzkzVar.getClass();
        zzkzVar.zza.zzC(zzunVar);
        zzkzVar.zzc.remove(((zzuh) zzunVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzkzVar);
    }

    public final void zzf() {
        for (zzky zzkyVar : this.zzf.values()) {
            try {
                zzkyVar.zza.zzs(zzkyVar.zzb);
            } catch (RuntimeException e) {
                zzds.zzf("MediaSourceList", "Failed to release child source.", e);
            }
            zzur zzurVar = zzkyVar.zza;
            zzkx zzkxVar = zzkyVar.zzc;
            zzurVar.zzm(zzkxVar);
            zzurVar.zzo(zzkxVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbe zzg() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbe.zza;
        }
        int iZza = 0;
        for (int i = 0; i < list.size(); i++) {
            zzkz zzkzVar = (zzkz) list.get(i);
            zzkzVar.zzd = iZza;
            iZza += zzkzVar.zza.zzz().zza();
        }
        return new zzlj(list, this.zzl);
    }

    public final /* synthetic */ void zzh(zzur zzurVar, zzbe zzbeVar) {
        this.zze.zzo();
    }

    public final /* synthetic */ zzmd zzi() {
        return this.zzh;
    }

    public final /* synthetic */ zzdl zzj() {
        return this.zzi;
    }

    public final zzbe zzk(List list, zzwi zzwiVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzl(list2.size(), list, zzwiVar);
    }

    public final zzbe zzl(int i, List list, zzwi zzwiVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwiVar;
            for (int i4 = i; i4 < list.size() + i; i4++) {
                zzkz zzkzVar = (zzkz) list.get(i4 - i);
                if (i4 > 0) {
                    zzkz zzkzVar2 = (zzkz) this.zzb.get(i4 - 1);
                    zzkzVar.zzc(zzkzVar2.zza.zzz().zza() + zzkzVar2.zzd);
                } else {
                    zzkzVar.zzc(0);
                }
                zzu(i4, zzkzVar.zza.zzz().zza());
                this.zzb.add(i4, zzkzVar);
                this.zzd.put(zzkzVar.zzb, zzkzVar);
                if (this.zzj) {
                    zzv(zzkzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkzVar);
                    } else {
                        zzs(zzkzVar);
                    }
                }
            }
        }
        return zzg();
    }

    public final zzbe zzm(int i, int i4, zzwi zzwiVar) {
        boolean z4 = false;
        if (i >= 0 && i <= i4 && i4 <= zzc()) {
            z4 = true;
        }
        zzghc.zza(z4);
        this.zzl = zzwiVar;
        zzt(i, i4);
        return zzg();
    }

    public final zzbe zzn(int i, int i4, int i6, zzwi zzwiVar) {
        zzghc.zza(zzc() >= 0);
        this.zzl = null;
        return zzg();
    }

    public final zzbe zzo(zzwi zzwiVar) {
        int iZzc = zzc();
        if (zzwiVar.zza() != iZzc) {
            zzwiVar = zzwiVar.zzh().zzf(0, iZzc);
        }
        this.zzl = zzwiVar;
        return zzg();
    }

    public final zzun zzp(zzup zzupVar, zzyv zzyvVar, long j) {
        int i = zzlj.zzb;
        Pair pair = (Pair) zzupVar.zza;
        Object obj = pair.first;
        zzup zzupVarZza = zzupVar.zza(pair.second);
        zzkz zzkzVar = (zzkz) this.zzd.get(obj);
        zzkzVar.getClass();
        this.zzg.add(zzkzVar);
        zzky zzkyVar = (zzky) this.zzf.get(zzkzVar);
        if (zzkyVar != null) {
            zzkyVar.zza.zzq(zzkyVar.zzb);
        }
        zzkzVar.zzc.add(zzupVarZza);
        zzuh zzuhVarZzF = zzkzVar.zza.zzG(zzupVarZza, zzyvVar, j);
        this.zzc.put(zzuhVarZzF, zzkzVar);
        zzr();
        return zzuhVarZzF;
    }

    public final zzwi zzq() {
        return this.zzl;
    }
}
