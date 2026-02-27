package bj;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bj.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1050u implements InterfaceC1033d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9180b;

    @Override // bj.InterfaceC1033d
    public final Object getValue() {
        if (this.f9180b == C1048s.f9178a) {
            Function0 function0 = this.f9179a;
            kotlin.jvm.internal.j.d(function0);
            this.f9180b = function0.invoke();
            this.f9179a = null;
        }
        return this.f9180b;
    }

    @Override // bj.InterfaceC1033d
    public final boolean isInitialized() {
        return this.f9180b != C1048s.f9178a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
