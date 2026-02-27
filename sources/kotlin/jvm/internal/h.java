package kotlin.jvm.internal;

import xj.InterfaceC2487c;
import xj.InterfaceC2491g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC1788c implements InterfaceC1792g, InterfaceC2491g {
    private final int arity;
    private final int flags;

    public h(Object obj, String str, int i, String str2, int i4, Class cls) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC1788c
    public InterfaceC2487c computeReflected() {
        z.f18196a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.b(getBoundReceiver(), hVar.getBoundReceiver()) && j.b(getOwner(), hVar.getOwner());
        }
        if (obj instanceof InterfaceC2491g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC1792g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // xj.InterfaceC2491g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // xj.InterfaceC2491g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // xj.InterfaceC2491g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // xj.InterfaceC2491g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC1788c, xj.InterfaceC2487c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2487c interfaceC2487cCompute = compute();
        if (interfaceC2487cCompute != this) {
            return interfaceC2487cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC1788c
    public InterfaceC2491g getReflected() {
        return (InterfaceC2491g) super.getReflected();
    }
}
