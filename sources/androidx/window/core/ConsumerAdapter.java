package androidx.window.core;

import M8.A0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanUncheckedReflection"})
public final class ConsumerAdapter {
    private final ClassLoader loader;

    public static final class ConsumerHandler<T> implements InvocationHandler {
        private final InterfaceC2488d clazz;
        private final Function1<T, Unit> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ConsumerHandler(InterfaceC2488d clazz, Function1<? super T, Unit> consumer) {
            j.g(clazz, "clazz");
            j.g(consumer, "consumer");
            this.clazz = clazz;
            this.consumer = consumer;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            return j.b(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            return j.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return j.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return j.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            j.g(obj, "obj");
            j.g(method, "method");
            if (isAccept(method, objArr)) {
                InterfaceC2488d interfaceC2488d = this.clazz;
                Object obj2 = objArr != null ? objArr[0] : null;
                A0.j(interfaceC2488d, obj2);
                invokeAccept(obj2);
                return Unit.f18162a;
            }
            if (isEquals(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (isToString(method, objArr)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public final void invokeAccept(T parameter) {
            j.g(parameter, "parameter");
            this.consumer.invoke(parameter);
        }
    }

    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(ClassLoader loader) {
        j.g(loader, "loader");
        this.loader = loader;
    }

    private final <T> Object buildConsumer(InterfaceC2488d interfaceC2488d, Function1<? super T, Unit> function1) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, new ConsumerHandler(interfaceC2488d, function1));
        j.f(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.JAVA_CONSUMER);
        j.f(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public final <T> void addConsumer(Object obj, InterfaceC2488d clazz, String methodName, Function1<? super T, Unit> consumer) {
        j.g(obj, "obj");
        j.g(clazz, "clazz");
        j.g(methodName, "methodName");
        j.g(consumer, "consumer");
        obj.getClass().getMethod(methodName, unsafeConsumerClass()).invoke(obj, buildConsumer(clazz, consumer));
    }

    public final Class<?> consumerClassOrNull$window_release() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> void createConsumer(Object obj, InterfaceC2488d clazz, String addMethodName, Activity activity, Function1<? super T, Unit> consumer) throws IllegalAccessException, InvocationTargetException {
        j.g(obj, "obj");
        j.g(clazz, "clazz");
        j.g(addMethodName, "addMethodName");
        j.g(activity, "activity");
        j.g(consumer, "consumer");
        obj.getClass().getMethod(addMethodName, Activity.class, unsafeConsumerClass()).invoke(obj, activity, buildConsumer(clazz, consumer));
    }

    @CheckResult
    public final <T> Subscription createSubscription(final Object obj, InterfaceC2488d clazz, String addMethodName, String removeMethodName, Activity activity, Function1<? super T, Unit> consumer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        j.g(obj, "obj");
        j.g(clazz, "clazz");
        j.g(addMethodName, "addMethodName");
        j.g(removeMethodName, "removeMethodName");
        j.g(activity, "activity");
        j.g(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, unsafeConsumerClass()).invoke(obj, activity, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    @CheckResult
    public final <T> Subscription createSubscriptionNoActivity(final Object obj, InterfaceC2488d clazz, String addMethodName, String removeMethodName, Function1<? super T, Unit> consumer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        j.g(obj, "obj");
        j.g(clazz, "clazz");
        j.g(addMethodName, "addMethodName");
        j.g(removeMethodName, "removeMethodName");
        j.g(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, unsafeConsumerClass()).invoke(obj, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscriptionNoActivity.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    @CheckResult
    public final <T> Subscription createSubscription(final Object obj, InterfaceC2488d clazz, String addMethodName, String removeMethodName, Context context, Function1<? super T, Unit> consumer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        j.g(obj, "obj");
        j.g(clazz, "clazz");
        j.g(addMethodName, "addMethodName");
        j.g(removeMethodName, "removeMethodName");
        j.g(context, "context");
        j.g(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Context.class, unsafeConsumerClass()).invoke(obj, context, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.2
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }
}
