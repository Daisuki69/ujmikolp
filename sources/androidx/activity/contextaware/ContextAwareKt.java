package androidx.activity.contextaware;

import Bj.C0151l;
import android.content.Context;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1<Context, R> function1, InterfaceC1526a<R> interfaceC1526a) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c0151l, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c0151l.t(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, Function1<Context, R> function1, InterfaceC1526a<R> interfaceC1526a) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c0151l, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c0151l.t(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Unit unit = Unit.f18162a;
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }
}
