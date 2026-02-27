package com.google.android.gms.internal.ads;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsj extends AbstractC1616j implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsj(String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.zzb = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        zzfsj zzfsjVar = new zzfsj(this.zzb, interfaceC1526a);
        zzfsjVar.zza = obj;
        return zzfsjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsj) create((zzfrz) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        zzfsb zzfsbVarZza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zzfsbVarZza.zzd(zzfsbVarZza.zzb(), this.zzb);
        return zzfsbVarZza.zza();
    }
}
