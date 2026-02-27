package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfvx {
    private final Set zza;
    private final Set zzb;
    private final zzgea zzc;
    private S1.y zzd = null;

    public zzfvx(Set set, Set set2, zzgea zzgeaVar) {
        this.zza = set;
        this.zzb = set2;
        this.zzc = zzgeaVar;
    }

    public final synchronized S1.y zza() {
        try {
            S1.y yVar = this.zzd;
            if (yVar != null) {
                return yVar;
            }
            Set set = this.zzb;
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzfvv) it.next()).zza());
            }
            zzgea zzgeaVar = this.zzc;
            S1.y yVarZzk = zzgot.zzk(zzgot.zzl(arrayList), zzfvw.zza, zzgpk.zza());
            zzgeaVar.zze(2, yVarZzk);
            this.zzd = yVarZzk;
            Iterator it2 = this.zza.iterator();
            while (it2.hasNext()) {
                ((zzfvv) it2.next()).zza();
            }
            S1.y yVar2 = this.zzd;
            if (yVar2 != null) {
                return yVar2;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized S1.y zzb() {
        S1.y yVar;
        yVar = this.zzd;
        if (yVar == null) {
            throw null;
        }
        return yVar;
    }
}
