package J7;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2444b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String event, int i) {
        super(2);
        kotlin.jvm.internal.j.g(event, "event");
        this.f2444b = event;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.j.b(this.f2444b, fVar.f2444b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return (this.f2444b.hashCode() * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselItem(event=");
        sb2.append(this.f2444b);
        sb2.append(", index=");
        return s.o(sb2, ")", this.c);
    }
}
