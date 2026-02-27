package n1;

import java.util.ArrayList;
import s1.C2228c;
import s1.InterfaceC2230e;

/* JADX INFO: renamed from: n1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1908n implements InterfaceC1907m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2228c f18575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18576b;

    public C1908n(InterfaceC2230e interfaceC2230e) {
        this.f18575a = new C2228c(interfaceC2230e);
        new ArrayList();
        this.f18576b = new Object();
    }

    @Override // n1.InterfaceC1907m
    public final AbstractC1894G getTimeline() {
        return this.f18575a.f19995b;
    }

    @Override // n1.InterfaceC1907m
    public final Object getUid() {
        return this.f18576b;
    }
}
