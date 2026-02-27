package androidx.window.core;

import M8.A0;
import android.annotation.SuppressLint;
import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanUncheckedReflection"})
public final class PredicateAdapter {
    private final ClassLoader loader;

    public static abstract class BaseHandler<T> implements InvocationHandler {
        private final InterfaceC2488d clazz;

        public BaseHandler(InterfaceC2488d clazz) {
            j.g(clazz, "clazz");
            this.clazz = clazz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            j.g(obj, "obj");
            j.g(method, "method");
            if (isTest(method, objArr)) {
                InterfaceC2488d interfaceC2488d = this.clazz;
                obj2 = objArr != null ? objArr[0] : null;
                A0.j(interfaceC2488d, obj2);
                return Boolean.valueOf(invokeTest(obj, obj2));
            }
            if (isEquals(method, objArr)) {
                obj2 = objArr != null ? objArr[0] : null;
                j.d(obj2);
                return Boolean.valueOf(obj == obj2);
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(hashCode());
            }
            if (isToString(method, objArr)) {
                return toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public abstract boolean invokeTest(Object obj, T t5);

        public final boolean isEquals(Method method, Object[] objArr) {
            j.g(method, "<this>");
            return j.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean isHashCode(Method method, Object[] objArr) {
            j.g(method, "<this>");
            return j.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean isTest(Method method, Object[] objArr) {
            j.g(method, "<this>");
            return j.b(method.getName(), "test") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean isToString(Method method, Object[] objArr) {
            j.g(method, "<this>");
            return j.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }
    }

    public static final class PairPredicateStubHandler<T, U> extends BaseHandler<Pair<?, ?>> {
        private final InterfaceC2488d clazzT;
        private final InterfaceC2488d clazzU;
        private final Function2<T, U, Boolean> predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PairPredicateStubHandler(InterfaceC2488d clazzT, InterfaceC2488d clazzU, Function2<? super T, ? super U, Boolean> predicate) {
            super(z.a(Pair.class));
            j.g(clazzT, "clazzT");
            j.g(clazzU, "clazzU");
            j.g(predicate, "predicate");
            this.clazzT = clazzT;
            this.clazzU = clazzU;
            this.predicate = predicate;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            return this.predicate.toString();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, Pair<?, ?> parameter) {
            j.g(obj, "obj");
            j.g(parameter, "parameter");
            InterfaceC2488d interfaceC2488d = this.clazzT;
            Object obj2 = parameter.first;
            A0.j(interfaceC2488d, obj2);
            InterfaceC2488d interfaceC2488d2 = this.clazzU;
            Object obj3 = parameter.second;
            A0.j(interfaceC2488d2, obj3);
            return ((Boolean) this.predicate.invoke(obj2, obj3)).booleanValue();
        }
    }

    public static final class PredicateStubHandler<T> extends BaseHandler<T> {
        private final Function1<T, Boolean> predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PredicateStubHandler(InterfaceC2488d clazzT, Function1<? super T, Boolean> predicate) {
            super(clazzT);
            j.g(clazzT, "clazzT");
            j.g(predicate, "predicate");
            this.predicate = predicate;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, T parameter) {
            j.g(obj, "obj");
            j.g(parameter, "parameter");
            return ((Boolean) this.predicate.invoke(parameter)).booleanValue();
        }

        public String toString() {
            return this.predicate.toString();
        }
    }

    public PredicateAdapter(ClassLoader loader) {
        j.g(loader, "loader");
        this.loader = loader;
    }

    private final Class<?> predicateClassOrThrow() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("java.util.function.Predicate");
        j.f(clsLoadClass, "loader.loadClass(\"java.util.function.Predicate\")");
        return clsLoadClass;
    }

    public final <T, U> Object buildPairPredicate(InterfaceC2488d firstClazz, InterfaceC2488d secondClazz, Function2<? super T, ? super U, Boolean> predicate) {
        j.g(firstClazz, "firstClazz");
        j.g(secondClazz, "secondClazz");
        j.g(predicate, "predicate");
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, new PairPredicateStubHandler(firstClazz, secondClazz, predicate));
        j.f(objNewProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return objNewProxyInstance;
    }

    public final <T> Object buildPredicate(InterfaceC2488d clazz, Function1<? super T, Boolean> predicate) {
        j.g(clazz, "clazz");
        j.g(predicate, "predicate");
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, new PredicateStubHandler(clazz, predicate));
        j.f(objNewProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return objNewProxyInstance;
    }

    public final Class<?> predicateClassOrNull$window_release() {
        try {
            return predicateClassOrThrow();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
