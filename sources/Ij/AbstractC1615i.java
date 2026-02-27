package ij;

import gj.InterfaceC1526a;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.InterfaceC1792g;
import kotlin.jvm.internal.z;

/* JADX INFO: renamed from: ij.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1615i extends AbstractC1614h implements InterfaceC1792g {
    private final int arity;

    public AbstractC1615i(int i, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC1792g
    public int getArity() {
        return this.arity;
    }

    @Override // ij.AbstractC1607a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        z.f18196a.getClass();
        String strA = A.a(this);
        kotlin.jvm.internal.j.f(strA, "renderLambdaToString(...)");
        return strA;
    }
}
