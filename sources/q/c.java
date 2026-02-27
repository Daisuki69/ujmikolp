package q;

import We.s;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19715a;
    public A.a c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19717d = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A.a f19716b = f(0.0f);

    public c(List list) {
        this.f19715a = list;
    }

    @Override // q.b
    public final boolean a(float f) {
        A.a aVar = this.c;
        A.a aVar2 = this.f19716b;
        if (aVar == aVar2 && this.f19717d == f) {
            return true;
        }
        this.c = aVar2;
        this.f19717d = f;
        return false;
    }

    @Override // q.b
    public final A.a b() {
        return this.f19716b;
    }

    @Override // q.b
    public final boolean c(float f) {
        A.a aVar = this.f19716b;
        if (f >= aVar.b() && f < aVar.a()) {
            return !this.f19716b.c();
        }
        this.f19716b = f(f);
        return true;
    }

    @Override // q.b
    public final float d() {
        return ((A.a) this.f19715a.get(0)).b();
    }

    @Override // q.b
    public final float e() {
        return ((A.a) s.e(1, this.f19715a)).a();
    }

    public final A.a f(float f) {
        List list = this.f19715a;
        A.a aVar = (A.a) s.e(1, list);
        if (f >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            A.a aVar2 = (A.a) list.get(size);
            if (this.f19716b != aVar2 && f >= aVar2.b() && f < aVar2.a()) {
                return aVar2;
            }
        }
        return (A.a) list.get(0);
    }

    @Override // q.b
    public final boolean isEmpty() {
        return false;
    }
}
