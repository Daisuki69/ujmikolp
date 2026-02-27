package Wf;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6428b;
    public final int c;

    public a(String message, int i) {
        j.h(message, "message");
        this.f6428b = message;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f6428b, aVar.f6428b) && this.c == aVar.c;
    }

    public final int hashCode() {
        String str = this.f6428b;
        return this.c + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(message=");
        sb2.append(this.f6428b);
        sb2.append(", code=");
        return s.o(sb2, ")", this.c);
    }
}
