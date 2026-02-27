package androidx.lifecycle;

import bj.InterfaceC1031b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC1791f;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC1791f {
    private final /* synthetic */ Function1 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Function1 function) {
        j.g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1791f)) {
            return j.b(getFunctionDelegate(), ((InterfaceC1791f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
