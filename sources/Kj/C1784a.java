package kj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: kj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1784a {

    /* JADX INFO: renamed from: kj.a$a, reason: collision with other inner class name */
    public static final class C0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0095a f18151a = new C0095a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f18152b;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            j.d(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (j.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    j.f(parameterTypes, "getParameterTypes(...)");
                    if (j.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f18152b = method;
            int length2 = methods.length;
            for (int i4 = 0; i4 < length2 && !j.b(methods[i4].getName(), "getSuppressed"); i4++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        j.g(cause, "cause");
        j.g(exception, "exception");
        Method method = C0095a.f18152b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
