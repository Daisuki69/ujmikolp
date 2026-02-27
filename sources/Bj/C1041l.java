package bj;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bj.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C1041l<T> implements InterfaceC1033d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f9172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f9173b;
    public final Object c;

    public C1041l(Function0 initializer, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        kotlin.jvm.internal.j.g(initializer, "initializer");
        this.f9172a = initializer;
        this.f9173b = C1048s.f9178a;
        this.c = obj == null ? this : obj;
    }

    @Override // bj.InterfaceC1033d
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f9173b;
        C1048s c1048s = C1048s.f9178a;
        if (obj != c1048s) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.f9173b;
            if (objInvoke == c1048s) {
                Function0 function0 = this.f9172a;
                kotlin.jvm.internal.j.d(function0);
                objInvoke = function0.invoke();
                this.f9173b = objInvoke;
                this.f9172a = null;
            }
        }
        return objInvoke;
    }

    @Override // bj.InterfaceC1033d
    public final boolean isInitialized() {
        return this.f9173b != C1048s.f9178a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
