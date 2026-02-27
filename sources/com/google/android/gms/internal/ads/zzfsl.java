package com.google.android.gms.internal.ads;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsl extends AbstractC1609c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzftd zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsl(zzftd zzftdVar, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.zzc = zzftdVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzt(this);
    }
}
