package Wf;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6429b;

    public b(Object obj) {
        this.f6429b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && j.b(this.f6429b, ((b) obj).f6429b);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f6429b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return androidx.camera.core.impl.a.m(new StringBuilder("Success(value="), this.f6429b, ")");
    }
}
