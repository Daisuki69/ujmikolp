package bj;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bj.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C1040k<T> implements InterfaceC1033d, Serializable {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9169d = AtomicReferenceFieldUpdater.newUpdater(C1040k.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f9170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f9171b;

    /* JADX INFO: renamed from: bj.k$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // bj.InterfaceC1033d
    public final Object getValue() {
        Object obj = this.f9171b;
        C1048s c1048s = C1048s.f9178a;
        if (obj != c1048s) {
            return obj;
        }
        Function0 function0 = this.f9170a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9169d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1048s, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1048s) {
                }
            }
            this.f9170a = null;
            return objInvoke;
        }
        return this.f9171b;
    }

    @Override // bj.InterfaceC1033d
    public final boolean isInitialized() {
        return this.f9171b != C1048s.f9178a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
