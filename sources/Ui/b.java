package Ui;

import com.dynatrace.android.agent.Global;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5984b;

    public b(k kVar, boolean z4) {
        this.f5983a = z4;
        this.f5984b = kVar;
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        return this.f5983a != this.f5984b.c(obj, map, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5983a != bVar.f5983a) {
            return false;
        }
        return this.f5984b.equals(bVar.f5984b);
    }

    public final int hashCode() {
        return this.f5984b.hashCode() + ((this.f5983a ? 1 : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f5983a) {
            sb2.append(" not");
        }
        sb2.append(Global.BLANK);
        sb2.append(this.f5984b);
        return sb2.toString();
    }
}
