package xi;

import D.S;
import Ff.f;
import Xh.g;
import bi.AbstractRunnableC1025c;
import bi.InterfaceC1027e;
import bi.i;
import io.split.android.client.service.sseclient.notifications.InstantUpdateChangeNotification;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.e;
import o6.C1967a;
import s.AbstractC2217b;

/* JADX INFO: renamed from: xi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2483b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21008b;
    public final Object c;

    public /* synthetic */ C2483b(int i, Object obj, Object obj2) {
        this.f21007a = i;
        this.c = obj;
        this.f21008b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [bi.c, bi.e] */
    @Override // ki.e
    public final void b(f fVar) {
        switch (this.f21007a) {
            case 0:
                if (fVar.c == 2) {
                    ((C2484c) this.c).v((InstantUpdateChangeNotification) this.f21008b);
                }
                break;
            case 1:
                if (fVar.c != 1) {
                    Boolean boolF = fVar.f();
                    g gVar = (g) this.c;
                    gVar.getClass();
                    if (Boolean.TRUE.equals(boolF)) {
                        ((AtomicBoolean) gVar.j).compareAndSet(true, false);
                        ((C1781b) gVar.f6641b).k((String) gVar.f);
                    }
                } else {
                    ((C1967a) this.f21008b).b(new S(7));
                }
                break;
            default:
                if (AbstractC2217b.b(fVar.c, 1)) {
                    ((AbstractRunnableC1025c) this.f21008b).a((i) this.c);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2483b(InterfaceC1027e interfaceC1027e, i iVar) {
        this.f21007a = 2;
        this.f21008b = (AbstractRunnableC1025c) interfaceC1027e;
        this.c = iVar;
    }
}
