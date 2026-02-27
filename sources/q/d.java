package q;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.a f19718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19719b = -1.0f;

    public d(List list) {
        this.f19718a = (A.a) list.get(0);
    }

    @Override // q.b
    public final boolean a(float f) {
        if (this.f19719b == f) {
            return true;
        }
        this.f19719b = f;
        return false;
    }

    @Override // q.b
    public final A.a b() {
        return this.f19718a;
    }

    @Override // q.b
    public final boolean c(float f) {
        return !this.f19718a.c();
    }

    @Override // q.b
    public final float d() {
        return this.f19718a.b();
    }

    @Override // q.b
    public final float e() {
        return this.f19718a.a();
    }

    @Override // q.b
    public final boolean isEmpty() {
        return false;
    }
}
