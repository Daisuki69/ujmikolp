package b2;

import com.google.firebase.components.DependencyException;
import java.util.Set;
import y2.C2499a;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.c f8376b;

    public o(Set set, y2.c cVar) {
        this.f8375a = set;
        this.f8376b = cVar;
    }

    @Override // y2.c
    public final void a(C2499a c2499a) {
        if (this.f8375a.contains(U1.b.class)) {
            this.f8376b.a(c2499a);
            return;
        }
        throw new DependencyException("Attempting to publish an undeclared event " + c2499a + ".");
    }
}
