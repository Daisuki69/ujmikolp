package p3;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends PhantomReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eh.b f19040b;

    public /* synthetic */ l(C2010a c2010a, ReferenceQueue referenceQueue, Set set, Eh.b bVar) {
        super(c2010a, referenceQueue);
        this.f19039a = set;
        this.f19040b = bVar;
    }
}
