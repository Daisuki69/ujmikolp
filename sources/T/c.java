package t;

import dOYHB6.tiZVw8.numX49;
import java.util.List;
import q.i;
import q.o;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2265b f20138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2265b f20139b;

    public c(C2265b c2265b, C2265b c2265b2) {
        this.f20138a = c2265b;
        this.f20139b = c2265b2;
    }

    @Override // t.e
    public final q.e f() {
        return new o((i) this.f20138a.f(), (i) this.f20139b.f());
    }

    @Override // t.e
    public final List g() {
        throw new UnsupportedOperationException(numX49.tnTj78("b25P"));
    }

    @Override // t.e
    public final boolean h() {
        return this.f20138a.h() && this.f20139b.h();
    }
}
