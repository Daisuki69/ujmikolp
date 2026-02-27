package Ze;

import Kh.I;
import ch.l;
import java.util.List;
import p3.C2011b;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6934b;
    public final boolean c;

    public a(String str, boolean z4, boolean z5) {
        this.f6933a = str;
        this.f6934b = z4;
        this.c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f6934b == aVar.f6934b && this.c == aVar.c) {
            return this.f6933a.equals(aVar.f6933a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f6933a.hashCode() * 31) + (this.f6934b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Permission{name='");
        sb2.append(this.f6933a);
        sb2.append("', granted=");
        sb2.append(this.f6934b);
        sb2.append(", shouldShowRequestPermissionRationale=");
        return androidx.camera.core.impl.a.q(sb2, this.c, '}');
    }

    public a(List list) {
        this.f6933a = ((StringBuilder) l.fromIterable(list).map(new d(19)).collectInto(new StringBuilder(), new C2011b(19)).b()).toString();
        this.f6934b = ((Boolean) l.fromIterable(list).all(new I(20)).b()).booleanValue();
        this.c = ((Boolean) l.fromIterable(list).any(new M2.b(20)).b()).booleanValue();
    }
}
