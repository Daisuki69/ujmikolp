package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import pj.C2155a;
import xj.InterfaceC2487c;
import xj.InterfaceC2490f;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1788c implements InterfaceC2487c, Serializable {
    public static final Object NO_RECEIVER = C1787b.f18186a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2487c reflected;
    private final String signature;

    public AbstractC1788c() {
        this(NO_RECEIVER, null, null, null, false);
    }

    @Override // xj.InterfaceC2487c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // xj.InterfaceC2487c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2487c compute() {
        InterfaceC2487c interfaceC2487c = this.reflected;
        if (interfaceC2487c != null) {
            return interfaceC2487c;
        }
        InterfaceC2487c interfaceC2487cComputeReflected = computeReflected();
        this.reflected = interfaceC2487cComputeReflected;
        return interfaceC2487cComputeReflected;
    }

    public abstract InterfaceC2487c computeReflected();

    @Override // xj.InterfaceC2486b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC2490f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return z.a(cls);
        }
        z.f18196a.getClass();
        return new o(cls);
    }

    @Override // xj.InterfaceC2487c
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC2487c getReflected() {
        InterfaceC2487c interfaceC2487cCompute = compute();
        if (interfaceC2487cCompute != this) {
            return interfaceC2487cCompute;
        }
        throw new C2155a();
    }

    @Override // xj.InterfaceC2487c
    public xj.o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // xj.InterfaceC2487c
    public List<xj.p> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // xj.InterfaceC2487c
    public xj.s getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // xj.InterfaceC2487c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // xj.InterfaceC2487c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // xj.InterfaceC2487c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // xj.InterfaceC2487c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public AbstractC1788c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }
}
