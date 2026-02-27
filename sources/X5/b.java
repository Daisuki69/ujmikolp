package X5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V5.c f6535b;

    public /* synthetic */ b(V5.c cVar, int i) {
        this.f6534a = i;
        this.f6535b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        W5.b initializedClient = (W5.b) obj;
        switch (this.f6534a) {
            case 0:
                j.g(initializedClient, "initializedClient");
                Uh.b bVar = f.f6541d;
                if (bVar != null) {
                    bVar.onNext(U5.a.f5942a);
                }
                W5.e eVar = W5.e.c;
                V5.c cVar = this.f6535b;
                f.C(cVar, initializedClient, eVar);
                W5.b.a(initializedClient, new V5.a(cVar, 4));
                break;
            default:
                j.g(initializedClient, "initializedClient");
                Uh.b bVar2 = f.c;
                if (bVar2 != null) {
                    bVar2.onNext(U5.a.f5942a);
                }
                W5.e eVar2 = W5.e.f6314b;
                V5.c cVar2 = this.f6535b;
                f.C(cVar2, initializedClient, eVar2);
                W5.b.a(initializedClient, new V5.a(cVar2, 3));
                break;
        }
        return Unit.f18162a;
    }
}
