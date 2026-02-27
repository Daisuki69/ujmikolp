package androidx.activity.contextaware;

import Bj.InterfaceC0147j;
import android.content.Context;
import bj.AbstractC1039j;
import bj.C1037h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC0147j $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC0147j interfaceC0147j, Function1<Context, R> function1) {
        this.$co = interfaceC0147j;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objA;
        j.g(context, "context");
        InterfaceC0147j interfaceC0147j = this.$co;
        Function1<Context, R> function1 = this.$onContextAvailable;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = function1.invoke(context);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        interfaceC0147j.resumeWith(objA);
    }
}
