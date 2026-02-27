package com.google.android.gms.internal.ads;

import java.util.Map;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhlq implements Map.Entry, InterfaceC2210a {
    private final /* synthetic */ Map.Entry zza;

    public zzhlq(Map.Entry delegate) {
        kotlin.jvm.internal.j.g(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
