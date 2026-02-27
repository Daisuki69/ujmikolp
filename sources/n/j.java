package N;

import bj.InterfaceC1031b;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.InterfaceC1791f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC1791f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3471a;

    public j(k kVar) {
        this.f3471a = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j) || ((j) obj) == null) {
            return false;
        }
        return getFunctionDelegate().equals(((InterfaceC1791f) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        return new kotlin.jvm.internal.i(this.f3471a, numX49.tnTj78("PJ28"), 1, numX49.tnTj78("PJ2C"), 0, k.class);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
