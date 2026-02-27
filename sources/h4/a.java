package H4;

import Bj.C0137e;
import Bj.E;
import Bj.H;
import Bj.K;
import Bj.L;
import Bj.r;
import K4.C0271b;
import bj.AbstractC1039j;
import bj.C1037h;
import com.paymaya.domain.store.I;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f2098b;
    public final /* synthetic */ r c;
    public final /* synthetic */ m e;
    public final /* synthetic */ I f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(L l6, r rVar, m mVar, I i, long j, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f2098b = l6;
        this.c = rVar;
        this.e = mVar;
        this.f = i;
        this.f2099g = j;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a(this.f2098b, this.c, this.e, this.f, this.f2099g, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f2097a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            K[] kArr = {this.f2098b, this.c};
            this.f2097a = 1;
            obj = new C0137e(kArr).a(this);
            if (obj == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        List list = (List) obj;
        Object obj2 = ((C1037h) list.get(0)).f9167a;
        Throwable thA = C1037h.a(obj2);
        I i4 = this.f;
        m mVar = this.e;
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to get challenge! Aborting extraction.";
            }
            m.c(mVar, i4, m.a(mVar, thA, message));
            return Unit.f18162a;
        }
        String str = (String) obj2;
        Object obj3 = ((C1037h) list.get(1)).f9167a;
        Throwable thA2 = C1037h.a(obj3);
        if (thA2 == null) {
            H.w(mVar.f2139d, null, null, new l(mVar, str, (String) obj3, i4, true, this.f2099g, null), 3);
            return Unit.f18162a;
        }
        String message2 = thA2.getMessage();
        if (message2 == null) {
            message2 = "Extraction error! Aborting extraction.";
        }
        m.c(mVar, i4, new C0271b(message2));
        return Unit.f18162a;
    }
}
