package Bg;

import Bj.D0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import zg.AbstractC2572g;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f512b;
    public final /* synthetic */ Jg.c c;
    public final /* synthetic */ D0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Long l6, Jg.c cVar, D0 d02, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f512b = l6;
        this.c = cVar;
        this.e = d02;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a0(this.f512b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f511a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            long jLongValue = this.f512b.longValue();
            this.f511a = 1;
            if (Bj.O.b(jLongValue, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        Jg.c request = this.c;
        kotlin.jvm.internal.j.g(request, "request");
        Ng.A a8 = request.f2520a;
        a8.a();
        StringBuilder sb2 = new StringBuilder(256);
        Xh.i.c(a8, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        X x6 = X.f506a;
        Map map = (Map) request.f.e(AbstractC2572g.f21433a);
        Y y7 = (Y) (map != null ? map.get(x6) : null);
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(string, y7 != null ? y7.f507a : null, null);
        b0.f517a.g("Request timeout: " + a8);
        String message = httpRequestTimeoutException.getMessage();
        kotlin.jvm.internal.j.d(message);
        Bj.H.j(this.e, message, httpRequestTimeoutException);
        return Unit.f18162a;
    }
}
