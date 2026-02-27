package Bg;

import M8.A0;
import M8.T2;
import Ng.AbstractC0495c;
import Ng.C0496d;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Jg.c f478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f479b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Charset e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, Charset charset, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.c = str;
        this.e = charset;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        I i = new I(this.c, this.e, (InterfaceC1526a) obj3);
        i.f478a = (Jg.c) obj;
        i.f479b = obj2;
        return i.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        Jg.c cVar = this.f478a;
        Object obj2 = this.f479b;
        ok.b bVar = L.f483a;
        Ng.n nVar = cVar.c;
        List list = Ng.q.f4436a;
        String strN = nVar.n("Accept-Charset");
        Ng.A a8 = cVar.f2520a;
        if (strN == null) {
            StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
            String str = this.c;
            sb2.append(str);
            sb2.append(" to ");
            sb2.append(a8);
            L.f483a.g(sb2.toString());
            Ng.n nVar2 = cVar.c;
            nVar2.getClass();
            nVar2.u(str);
            List listM = nVar2.m("Accept-Charset");
            listM.clear();
            listM.add(str);
        }
        if (!(obj2 instanceof String)) {
            return null;
        }
        C0496d c0496dH = S1.s.h(cVar);
        if (c0496dH != null) {
            if (!kotlin.jvm.internal.j.b(c0496dH.f4425d, AbstractC0495c.f4424a.f4425d)) {
                return null;
            }
        }
        String str2 = (String) obj2;
        C0496d c0496d = c0496dH == null ? AbstractC0495c.f4424a : c0496dH;
        if (c0496dH == null || (charset = T2.b(c0496dH)) == null) {
            charset = this.e;
        }
        L.f483a.g("Sending request body to " + a8 + " as text/plain with charset " + charset);
        kotlin.jvm.internal.j.g(c0496d, "<this>");
        kotlin.jvm.internal.j.g(charset, "charset");
        return new Og.i(str2, c0496d.d(A0.o(charset)));
    }
}
