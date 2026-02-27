package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzeo extends zzfa {
    private boolean zza;
    private final /* synthetic */ Object zzb;

    public zzeo(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
