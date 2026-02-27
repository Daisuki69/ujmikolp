package androidx.datastore.core;

import Bj.W;
import Dj.r;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
public final class MulticastFileObserver$Companion$observe$1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Unit> {
        final /* synthetic */ W $disposeListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(W w6) {
            super(0);
            this.$disposeListener = w6;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m84invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m84invoke() {
            this.$disposeListener.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, InterfaceC1526a<? super MulticastFileObserver$Companion$observe$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$file = file;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, interfaceC1526a);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((MulticastFileObserver$Companion$observe$1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (x3.d.b(r3, r7, r6) == r0) goto L16;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            bj.AbstractC1039j.b(r7)
            goto L69
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$1
            Bj.W r1 = (Bj.W) r1
            java.lang.Object r3 = r6.L$0
            Dj.r r3 = (Dj.r) r3
            bj.AbstractC1039j.b(r7)
            goto L56
        L24:
            bj.AbstractC1039j.b(r7)
            java.lang.Object r7 = r6.L$0
            Dj.r r7 = (Dj.r) r7
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r6.$file
            r1.<init>(r4, r7)
            androidx.datastore.core.MulticastFileObserver$Companion r4 = androidx.datastore.core.MulticastFileObserver.Companion
            java.io.File r5 = r6.$file
            java.io.File r5 = r5.getParentFile()
            kotlin.jvm.internal.j.d(r5)
            Bj.W r1 = androidx.datastore.core.MulticastFileObserver.Companion.access$observe(r4, r5, r1)
            kotlin.Unit r4 = kotlin.Unit.f18162a
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            r3 = r7
            Dj.q r3 = (Dj.q) r3
            Dj.e r3 = r3.f1200d
            java.lang.Object r3 = r3.m(r6, r4)
            if (r3 != r0) goto L55
            goto L68
        L55:
            r3 = r7
        L56:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r7 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r7.<init>(r1)
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = x3.d.b(r3, r7, r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
