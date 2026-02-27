package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzhpn implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhpo zzb;

    public zzhpn(zzhpo zzhpoVar) {
        this.zzb = zzhpoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        zzhpo zzhpoVar = this.zzb;
        return i < zzhpoVar.zza.size() || zzhpoVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zza;
        zzhpo zzhpoVar = this.zzb;
        List list = zzhpoVar.zza;
        if (i >= list.size()) {
            list.add(zzhpoVar.zzb.next());
            return next();
        }
        int i4 = this.zza;
        this.zza = i4 + 1;
        return list.get(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
