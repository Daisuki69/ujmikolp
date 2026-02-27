package H4;

import Bj.E;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f2126b = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        i iVar = new i(this.f2126b, interfaceC1526a);
        iVar.f2125a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        String str = this.f2126b;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = R4.j.a(str);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            return null;
        }
        return objA;
    }
}
