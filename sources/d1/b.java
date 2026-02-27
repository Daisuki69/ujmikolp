package d1;

import We.s;
import android.content.Context;
import l1.InterfaceC1797a;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1797a f16246b;
    public final InterfaceC1797a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16247d;

    public b(Context context, InterfaceC1797a interfaceC1797a, InterfaceC1797a interfaceC1797a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f16245a = context;
        if (interfaceC1797a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f16246b = interfaceC1797a;
        if (interfaceC1797a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC1797a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f16247d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f16245a.equals(((b) cVar).f16245a)) {
                b bVar = (b) cVar;
                if (this.f16246b.equals(bVar.f16246b) && this.c.equals(bVar.c) && this.f16247d.equals(bVar.f16247d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16245a.hashCode() ^ 1000003) * 1000003) ^ this.f16246b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f16247d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16245a);
        sb2.append(", wallClock=");
        sb2.append(this.f16246b);
        sb2.append(", monotonicClock=");
        sb2.append(this.c);
        sb2.append(", backendName=");
        return s.p(sb2, this.f16247d, "}");
    }
}
