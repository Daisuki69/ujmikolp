package androidx.work;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class InputMergerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("InputMerger");
        j.f(strTagWithPrefix, "tagWithPrefix(\"InputMerger\")");
        TAG = strTagWithPrefix;
    }

    public static final InputMerger fromClassName(String className) {
        j.g(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            j.e(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) objNewInstance;
        } catch (Exception e) {
            Logger.get().error(TAG, "Trouble instantiating ".concat(className), e);
            return null;
        }
    }
}
