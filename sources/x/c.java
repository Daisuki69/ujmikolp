package X;

import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6459b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ c(d dVar, Function1 function1, int i) {
        this.f6458a = i;
        this.f6459b = dVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1 = this.c;
        d this$0 = this.f6459b;
        Pair meta = (Pair) obj;
        switch (this.f6458a) {
            case 0:
                j.g(this$0, "this$0");
                j.g(meta, "meta");
                LinkedHashSet linkedHashSet = d.f6460g;
                E1.c.p(meta, new Pair(this$0.f6463d, this$0.c));
                d.c(meta, a.f6454b);
                function1.invoke(meta);
                break;
            default:
                j.g(this$0, "this$0");
                j.g(meta, "meta");
                d.c(meta, a.c);
                function1.invoke(meta);
                break;
        }
        return Unit.f18162a;
    }
}
