package com.google.android.gms.internal.ads;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class zzfss extends AbstractC1616j implements Function2 {
    int zza;
    final /* synthetic */ zzftd zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfss(zzftd zzftdVar, String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.zzb = zzftdVar;
        this.zzc = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new zzfss(this.zzb, this.zzc, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfss) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.zza;
        AbstractC1039j.b(obj);
        if (i == 0) {
            zzftd zzftdVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzftdVar.zzi(str, this) == enumC1578a) {
                return enumC1578a;
            }
        }
        return Unit.f18162a;
    }
}
