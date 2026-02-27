package Cj;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        j.e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
