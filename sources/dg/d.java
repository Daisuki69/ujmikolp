package Dg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.client.plugins.contentnegotiation.ContentConverterException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import qj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1616j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Jg.c f1140b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Cg.b f1141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Cg.b bVar, InterfaceC1526a interfaceC1526a, ArrayList arrayList, Set set) {
        super(5, interfaceC1526a);
        this.e = arrayList;
        this.f = set;
        this.f1141g = bVar;
    }

    @Override // qj.p
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        ArrayList arrayList = this.e;
        Set set = this.f;
        d dVar = new d(this.f1141g, (InterfaceC1526a) serializable, arrayList, set);
        dVar.f1140b = (Jg.c) obj2;
        dVar.c = obj3;
        return dVar.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws ContentConverterException {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1139a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        Jg.c cVar = this.f1140b;
        Object obj2 = this.c;
        this.f1140b = null;
        this.f1139a = 1;
        Object objA = h.a(this.e, this.f, cVar, obj2, this);
        return objA == enumC1578a ? enumC1578a : objA;
    }
}
