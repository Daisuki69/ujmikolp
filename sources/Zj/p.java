package zj;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f21493a = new p();

    public p() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p02 = (MatchResult) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        return p02.next();
    }
}
