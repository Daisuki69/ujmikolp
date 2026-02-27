package u2;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import pg.C2038a;

/* JADX INFO: renamed from: u2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2294b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20259b;

    public C2294b(String str, Map map) {
        this.f20258a = str;
        this.f20259b = map;
    }

    public static C2038a a(String str) {
        return new C2038a(str);
    }

    public static C2294b c(String str) {
        return new C2294b(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f20259b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2294b)) {
            return false;
        }
        C2294b c2294b = (C2294b) obj;
        return this.f20258a.equals(c2294b.f20258a) && this.f20259b.equals(c2294b.f20259b);
    }

    public final int hashCode() {
        return this.f20259b.hashCode() + (this.f20258a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f20258a + ", properties=" + this.f20259b.values() + "}";
    }
}
