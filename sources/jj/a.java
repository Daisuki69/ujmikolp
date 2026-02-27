package Jj;

import Bj.E0;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import ok.e;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends kotlin.coroutines.a implements E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2543b = new d(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a() {
        super(f2543b);
        rk.a aVar = e.f18909a;
        if (aVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapG = aVar.g();
        this.f2544a = mapG;
    }

    public static void t(Map map) {
        if (map == null) {
            rk.a aVar = e.f18909a;
            if (aVar == null) {
                throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            aVar.clear();
            return;
        }
        rk.a aVar2 = e.f18909a;
        if (aVar2 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        aVar2.h(map);
    }

    @Override // Bj.E0
    public final void k(Object obj) {
        t((Map) obj);
    }

    @Override // Bj.E0
    public final Object y(CoroutineContext coroutineContext) {
        rk.a aVar = e.f18909a;
        if (aVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapG = aVar.g();
        t(this.f2544a);
        return mapG;
    }
}
