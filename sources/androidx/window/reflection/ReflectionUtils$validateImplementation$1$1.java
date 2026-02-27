package androidx.window.reflection;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionUtils$validateImplementation$1$1 extends k implements Function0<Boolean> {
    final /* synthetic */ Class<?> $implementation;
    final /* synthetic */ Method $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionUtils$validateImplementation$1$1(Class<?> cls, Method method) {
        super(0);
        this.$implementation = cls;
        this.$it = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
        /*
            r4 = this;
            java.lang.Class<?> r0 = r4.$implementation
            java.lang.reflect.Method r1 = r4.$it
            java.lang.String r1 = r1.getName()
            java.lang.reflect.Method r2 = r4.$it
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.Class[] r2 = (java.lang.Class[]) r2
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            androidx.window.reflection.ReflectionUtils r1 = androidx.window.reflection.ReflectionUtils.INSTANCE
            java.lang.String r2 = "implementedMethod"
            kotlin.jvm.internal.j.f(r0, r2)
            boolean r2 = r1.isPublic$window_release(r0)
            if (r2 == 0) goto L39
            java.lang.reflect.Method r2 = r4.$it
            java.lang.Class r2 = r2.getReturnType()
            java.lang.String r3 = "it.returnType"
            kotlin.jvm.internal.j.f(r2, r3)
            boolean r0 = r1.doesReturn$window_release(r0, r2)
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.reflection.ReflectionUtils$validateImplementation$1$1.invoke():java.lang.Boolean");
    }
}
