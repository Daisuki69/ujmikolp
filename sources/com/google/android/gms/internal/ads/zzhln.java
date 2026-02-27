package com.google.android.gms.internal.ads;

import java.util.Iterator;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhln implements Iterator, InterfaceC2210a {
    private final /* synthetic */ Iterator zza;

    public zzhln(Iterator delegate) {
        kotlin.jvm.internal.j.g(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
