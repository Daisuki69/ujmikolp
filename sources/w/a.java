package W;

import Bj.E;
import N9.f;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f6153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f6154b;
    public final /* synthetic */ X.b c;
    public final /* synthetic */ LinkedHashMap e;
    public final /* synthetic */ f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.c f6155g;
    public final /* synthetic */ X.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Pair pair, X.b bVar, LinkedHashMap linkedHashMap, f fVar, X.c cVar, X.c cVar2, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f6153a = eVar;
        this.f6154b = pair;
        this.c = bVar;
        this.e = linkedHashMap;
        this.f = fVar;
        this.f6155g = cVar;
        this.h = cVar2;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        X.c cVar = this.f6155g;
        X.c cVar2 = this.h;
        return new a(this.f6153a, this.f6154b, this.c, this.e, this.f, cVar, cVar2, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        X.b bVar = this.c;
        Pair pair = this.f6154b;
        bVar.invoke(pair);
        u uVar = new u();
        System.currentTimeMillis();
        if (this.f.invoke(pair) != null) {
            this.f6155g.invoke(pair);
            uVar.f18191a = true;
        } else {
            this.h.invoke(pair);
            uVar.f18191a = false;
        }
        System.currentTimeMillis();
        this.e.put(pair.f18160a, Boolean.valueOf(uVar.f18191a));
        return new Pair(pair.f18160a, Boolean.valueOf(uVar.f18191a));
    }
}
