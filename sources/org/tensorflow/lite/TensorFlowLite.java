package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TensorFlowLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UnsatisfiedLinkError f18924b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean[] f18925d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f18923a = Logger.getLogger(TensorFlowLite.class.getName());
    public static volatile boolean c = false;

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    System.loadLibrary(str);
                    f18923a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    f18923a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        f18924b = unsatisfiedLinkError;
        f18925d = new AtomicBoolean[AbstractC2217b.d(3).length];
        for (int i4 = 0; i4 < AbstractC2217b.d(3).length; i4++) {
            f18925d[i4] = new AtomicBoolean();
        }
    }

    public static void a() {
        if (c) {
            return;
        }
        try {
            nativeDoNothing();
            c = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = f18924b;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            throw unsatisfiedLinkError2;
        }
    }

    private static native void nativeDoNothing();
}
