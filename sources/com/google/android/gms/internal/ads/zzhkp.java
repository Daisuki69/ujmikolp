package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzhkp implements Iterator {
    final /* synthetic */ zzhkr zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhkp(zzhkr zzhkrVar, byte[] bArr) {
        Objects.requireNonNull(zzhkrVar);
        this.zza = zzhkrVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhkr zzhkrVar = this.zza;
        if (i >= zzhkrVar.zzj()) {
            return !zzhkrVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhkr zzhkrVar = this.zza;
        return i < zzhkrVar.zzj() ? (zzhko) zzhkrVar.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhkr zzhkrVar = this.zza;
        zzhkrVar.zzh();
        int i = this.zzb;
        if (i >= zzhkrVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhkrVar.zzg(i);
        }
    }
}
