package D8;

import K8.InterfaceC0277b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: D8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0194b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0196d f1036b;

    public /* synthetic */ C0194b(C0196d c0196d, int i) {
        this.f1035a = i;
        this.f1036b = c0196d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1035a) {
            case 0:
                C0196d c0196d = this.f1036b;
                ((InterfaceC0277b) c0196d.c.get()).G0(((Integer) obj).intValue());
                break;
            default:
                C0196d c0196d2 = this.f1036b;
                ((InterfaceC0277b) c0196d2.c.get()).b0(((Integer) obj).intValue());
                break;
        }
        return Unit.f18162a;
    }
}
