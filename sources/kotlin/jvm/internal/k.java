package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements InterfaceC1792g, Serializable {
    private final int arity;

    public k(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC1792g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        z.f18196a.getClass();
        String strA = A.a(this);
        j.f(strA, "renderLambdaToString(...)");
        return strA;
    }
}
