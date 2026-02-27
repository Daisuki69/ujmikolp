package bj;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bj.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1037h<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9166b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9167a;

    /* JADX INFO: renamed from: bj.h$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ C1037h(Object obj) {
        this.f9167a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C1038i) {
            return ((C1038i) obj).f9168a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1037h) {
            return kotlin.jvm.internal.j.b(this.f9167a, ((C1037h) obj).f9167a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9167a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9167a;
        if (obj instanceof C1038i) {
            return ((C1038i) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
