package com.google.android.gms.internal.ads;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsu extends AbstractC1616j implements Function2 {
    int zza;
    final /* synthetic */ zzftd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsu(zzftd zzftdVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.zzb = zzftdVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new zzfsu(this.zzb, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsu) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.zza;
        AbstractC1039j.b(obj);
        if (i == 0) {
            zzftd zzftdVar = this.zzb;
            this.zza = 1;
            if (zzftdVar.zzn(this) == enumC1578a) {
                return enumC1578a;
            }
        }
        return Unit.f18162a;
    }
}
