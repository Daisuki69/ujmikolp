package t;

import Rg.u;
import java.util.List;
import q.f;
import q.j;
import q.n;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2264a extends u {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2264a(List list, int i) {
        super(list, 3);
        this.c = i;
    }

    @Override // t.e
    public final q.e f() {
        switch (this.c) {
            case 0:
                return new f((List) this.f5552b, 0);
            case 1:
                return new j((List) this.f5552b, 0);
            case 2:
                return new f((List) this.f5552b, 1);
            case 3:
                return new j((List) this.f5552b, 1);
            case 4:
                return new j((List) this.f5552b, 2);
            case 5:
                return new n((List) this.f5552b);
            default:
                return new f((List) this.f5552b, 2);
        }
    }
}
