package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhlo implements Iterator, InterfaceC2210a {
    final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    public zzhlo(Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzhlq((Map.Entry) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
