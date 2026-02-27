package Dj;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1176a = new f(2, g.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        m mVar = (m) obj2;
        m mVar2 = g.f1177a;
        e eVar = mVar.e;
        kotlin.jvm.internal.j.d(eVar);
        return new m(jLongValue, mVar, eVar, 0);
    }
}
