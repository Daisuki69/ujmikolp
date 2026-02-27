package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6457b;

    public /* synthetic */ b(d dVar, int i) {
        this.f6456a = i;
        this.f6457b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6456a) {
            case 0:
                String url = (String) obj;
                d this$0 = this.f6457b;
                j.g(this$0, "this$0");
                j.g(url, "url");
                this$0.f6463d.f6701a.c(url);
                this$0.c.f6703a.c(url);
                break;
            default:
                Pair meta = (Pair) obj;
                j.g(this.f6457b, "this$0");
                j.g(meta, "meta");
                d.c(meta, a.f6453a);
                break;
        }
        return Unit.f18162a;
    }
}
