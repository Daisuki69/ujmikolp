package androidx.navigation;

import X5.f;
import android.os.Bundle;
import androidx.navigation.NavArgs;
import bj.InterfaceC1033d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC1033d {
    private final Function0<Bundle> argumentProducer;
    private Args cached;
    private final InterfaceC2488d navArgsClass;

    public NavArgsLazy(InterfaceC2488d navArgsClass, Function0<Bundle> argumentProducer) {
        j.g(navArgsClass, "navArgsClass");
        j.g(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // bj.InterfaceC1033d
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // bj.InterfaceC1033d
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsN = f.n(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = clsN.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            j.f(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundle);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }
}
