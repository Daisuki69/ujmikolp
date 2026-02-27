package ij;

import bj.AbstractC1039j;
import bj.C1037h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: ij.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1607a implements InterfaceC1526a, InterfaceC1610d, Serializable {
    private final InterfaceC1526a<Object> completion;

    public AbstractC1607a(InterfaceC1526a interfaceC1526a) {
        this.completion = interfaceC1526a;
    }

    public InterfaceC1526a<Unit> create(InterfaceC1526a<?> completion) {
        kotlin.jvm.internal.j.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC1610d getCallerFrame() {
        InterfaceC1526a<Object> interfaceC1526a = this.completion;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    public final InterfaceC1526a<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC1611e interfaceC1611e = (InterfaceC1611e) getClass().getAnnotation(InterfaceC1611e.class);
        String str = null;
        if (interfaceC1611e == null) {
            return null;
        }
        int iV = interfaceC1611e.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC1611e.l()[iIntValue] : -1;
        C1613g.f17154a.getClass();
        C1612f c1612f = C1613g.c;
        C1612f c1612f2 = C1613g.f17155b;
        if (c1612f == null) {
            try {
                C1612f c1612f3 = new C1612f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                C1613g.c = c1612f3;
                c1612f = c1612f3;
            } catch (Exception unused2) {
                C1613g.c = c1612f2;
                c1612f = c1612f2;
            }
        }
        if (c1612f != c1612f2 && (method = c1612f.f17152a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = c1612f.f17153b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c1612f.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = interfaceC1611e.c();
        } else {
            strC = str + '/' + interfaceC1611e.c();
        }
        return new StackTraceElement(strC, interfaceC1611e.m(), interfaceC1611e.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        InterfaceC1526a<Object> interfaceC1526a = this;
        while (true) {
            AbstractC1607a abstractC1607a = (AbstractC1607a) interfaceC1526a;
            InterfaceC1526a<Object> interfaceC1526a2 = abstractC1607a.completion;
            kotlin.jvm.internal.j.d(interfaceC1526a2);
            try {
                obj = abstractC1607a.invokeSuspend(obj);
            } catch (Throwable th2) {
                C1037h.a aVar = C1037h.f9166b;
                obj = AbstractC1039j.a(th2);
            }
            if (obj == EnumC1578a.f17050a) {
                return;
            }
            C1037h.a aVar2 = C1037h.f9166b;
            abstractC1607a.releaseIntercepted();
            if (!(interfaceC1526a2 instanceof AbstractC1607a)) {
                interfaceC1526a2.resumeWith(obj);
                return;
            }
            interfaceC1526a = interfaceC1526a2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> completion) {
        kotlin.jvm.internal.j.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
