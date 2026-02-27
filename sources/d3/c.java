package d3;

import e1.InterfaceC1418b;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC1330b, InterfaceC1418b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16259b;

    public /* synthetic */ c(Object obj, int i) {
        this.f16258a = i;
        this.f16259b = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj, 0);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f16258a) {
        }
        return this.f16259b;
    }
}
