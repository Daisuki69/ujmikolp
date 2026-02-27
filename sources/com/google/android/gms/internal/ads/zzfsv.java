package com.google.android.gms.internal.ads;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsv extends AbstractC1609c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzftd zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsv(zzftd zzftdVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.zzd = zzftdVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzl(this);
    }
}
