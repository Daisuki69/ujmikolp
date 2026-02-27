package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgoe extends zzgnv {
    private List zza;

    public zzgoe(zzgjv zzgjvVar, boolean z4) {
        super(zzgjvVar, z4, true);
        List listZzb = zzgjvVar.isEmpty() ? Collections.EMPTY_LIST : zzgkp.zzb(zzgjvVar.size());
        for (int i = 0; i < zzgjvVar.size(); i++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgod(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
