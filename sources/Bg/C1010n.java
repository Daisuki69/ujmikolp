package bg;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: bg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1010n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wf.c f9099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9100b;
    public final LinkedHashMap c;

    public C1010n(Wf.c context, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.j.h(context, "context");
        this.f9099a = context;
        this.f9100b = arrayList;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1010n)) {
            return false;
        }
        C1010n c1010n = (C1010n) obj;
        return kotlin.jvm.internal.j.b(this.f9099a, c1010n.f9099a) && this.f9100b.equals(c1010n.f9100b) && this.c.equals(c1010n.c);
    }

    public final int hashCode() {
        Wf.c cVar = this.f9099a;
        return this.c.hashCode() + ((this.f9100b.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31)) * 31);
    }

    public final String toString() {
        return "ModuleDiscoveryEntity(context=" + this.f9099a + ", _modules=" + this.f9100b + ", _modulesExtraData=" + this.c + ")";
    }
}
