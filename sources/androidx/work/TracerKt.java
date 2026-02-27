package androidx.work;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TracerKt {
    public static final <T> T traced(Tracer tracer, String label, Function0<? extends T> block) {
        j.g(tracer, "<this>");
        j.g(label, "label");
        j.g(block, "block");
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(label);
            } catch (Throwable th2) {
                if (zIsEnabled) {
                    tracer.endSection();
                }
                throw th2;
            }
        }
        T t5 = (T) block.invoke();
        if (zIsEnabled) {
            tracer.endSection();
        }
        return t5;
    }
}
