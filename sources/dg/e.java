package Dg;

import Ng.C0496d;
import Ng.E;
import Ng.m;
import Ng.q;
import S1.r;
import S1.s;
import androidx.webkit.ProxyConfig;
import bj.AbstractC1039j;
import cj.C1110A;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.serialization.ContentConvertException;
import io.ktor.utils.io.n;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import qj.p;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1616j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Kg.c f1143b;
    public /* synthetic */ n c;
    public /* synthetic */ Wg.a e;
    public final /* synthetic */ Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1144g;
    public final /* synthetic */ Cg.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Cg.b bVar, InterfaceC1526a interfaceC1526a, ArrayList arrayList, Set set) {
        super(5, interfaceC1526a);
        this.f = set;
        this.f1144g = arrayList;
        this.h = bVar;
    }

    @Override // qj.p
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        ArrayList arrayList = this.f1144g;
        Set set = this.f;
        e eVar = new e(this.h, (InterfaceC1526a) serializable, arrayList, set);
        eVar.f1143b = (Kg.c) obj2;
        eVar.c = (n) obj3;
        eVar.e = (Wg.a) obj4;
        return eVar.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws ContentConvertException {
        Charset charsetForName;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1142a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        Kg.c cVar = this.f1143b;
        n nVar = this.c;
        Wg.a aVar = this.e;
        C0496d c0496dG = s.g(cVar);
        if (c0496dG == null) {
            return null;
        }
        m mVarA = qk.i.z(cVar).a();
        Charset defaultCharset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(mVarA, "<this>");
        kotlin.jvm.internal.j.g(defaultCharset, "defaultCharset");
        List list = q.f4436a;
        Iterator it = C1110A.Q(new Ng.p(), r.r(mVarA.get("Accept-Charset"))).iterator();
        while (true) {
            if (!it.hasNext()) {
                charsetForName = null;
                break;
            }
            String name = ((Ng.h) it.next()).f4426a;
            if (kotlin.jvm.internal.j.b(name, ProxyConfig.MATCH_ALL_SCHEMES)) {
                charsetForName = defaultCharset;
                break;
            }
            kotlin.jvm.internal.j.g(C2581c.f21467a, "<this>");
            kotlin.jvm.internal.j.g(name, "name");
            if (Charset.isSupported(name)) {
                charsetForName = Charset.forName(name);
                kotlin.jvm.internal.j.f(charsetForName, "forName(...)");
                break;
            }
        }
        Charset charset = charsetForName == null ? defaultCharset : charsetForName;
        E url = qk.i.z(cVar).getUrl();
        this.f1143b = null;
        this.c = null;
        this.f1142a = 1;
        Object objB = h.b(this.f, this.f1144g, url, aVar, nVar, c0496dG, charset, this);
        return objB == enumC1578a ? enumC1578a : objB;
    }
}
