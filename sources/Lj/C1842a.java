package lj;

import java.lang.reflect.InvocationTargetException;
import kj.C1784a;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: lj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1842a extends C1784a {

    /* JADX INFO: renamed from: lj.a$a, reason: collision with other inner class name */
    public static final class C0098a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0098a f18324a = new C0098a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f18325b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f18325b = num;
        }
    }

    @Override // kj.C1784a
    public final void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        j.g(cause, "cause");
        j.g(exception, "exception");
        Integer num = C0098a.f18325b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
