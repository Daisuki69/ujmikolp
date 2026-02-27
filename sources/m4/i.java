package m4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class i implements C3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3.f f18364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18365b = new ArrayList();

    public i(C3.f fVar) {
        this.f18364a = fVar;
    }

    @Override // C3.m
    public final void a(C3.l lVar) {
        this.f18365b.add(lVar);
    }

    public A7.f b(C3.g gVar) {
        return new A7.f(new K3.e(gVar), 6);
    }
}
