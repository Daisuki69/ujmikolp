package androidx.tracing;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TraceKt {

    /* JADX INFO: renamed from: androidx.tracing.TraceKt$traceAsync$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.tracing.TraceKt", f = "Trace.kt", l = {76}, m = "traceAsync")
    public static final class AnonymousClass1<T> extends AbstractC1609c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(String label, Function0<? extends T> block) {
        j.g(label, "label");
        j.g(block, "block");
        Trace.beginSection(label);
        try {
            return (T) block.invoke();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r4, int r5, kotlin.jvm.functions.Function1<? super gj.InterfaceC1526a<? super T>, ? extends java.lang.Object> r6, gj.InterfaceC1526a<? super T> r7) {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.TraceKt$traceAsync$1 r0 = new androidx.tracing.TraceKt$traceAsync$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r6 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            bj.AbstractC1039j.b(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L4a
            return r1
        L4a:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            return r7
        L4e:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, kotlin.jvm.functions.Function1, gj.a):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i, Function1<? super InterfaceC1526a<? super T>, ? extends Object> function1, InterfaceC1526a<? super T> interfaceC1526a) {
        Trace.beginAsyncSection(str, i);
        try {
            return function1.invoke(interfaceC1526a);
        } finally {
            Trace.endAsyncSection(str, i);
        }
    }

    public static final <T> T trace(Function0<String> lazyLabel, Function0<? extends T> block) {
        j.g(lazyLabel, "lazyLabel");
        j.g(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection((String) lazyLabel.invoke());
        }
        try {
            return (T) block.invoke();
        } finally {
            if (zIsEnabled) {
                Trace.endSection();
            }
        }
    }

    public static final <T> T traceAsync(Function0<String> lazyMethodName, Function0<Integer> lazyCookie, Function0<? extends T> block) {
        String str;
        int iIntValue;
        j.g(lazyMethodName, "lazyMethodName");
        j.g(lazyCookie, "lazyCookie");
        j.g(block, "block");
        if (Trace.isEnabled()) {
            str = (String) lazyMethodName.invoke();
            iIntValue = ((Number) lazyCookie.invoke()).intValue();
            Trace.beginAsyncSection(str, iIntValue);
        } else {
            str = null;
            iIntValue = 0;
        }
        try {
            return (T) block.invoke();
        } finally {
            if (str != null) {
                Trace.endAsyncSection(str, iIntValue);
            }
        }
    }
}
