package Jg;

import Ng.m;
import Ng.u;
import Ng.v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f2534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tg.d f2535b;
    public final m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f2536d;
    public final Object e;
    public final CoroutineContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Tg.d f2537g;

    public g(v vVar, Tg.d requestTime, m mVar, u version, Object body, CoroutineContext callContext) {
        j.g(requestTime, "requestTime");
        j.g(version, "version");
        j.g(body, "body");
        j.g(callContext, "callContext");
        this.f2534a = vVar;
        this.f2535b = requestTime;
        this.c = mVar;
        this.f2536d = version;
        this.e = body;
        this.f = callContext;
        this.f2537g = Tg.a.a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f2534a + ')';
    }
}
