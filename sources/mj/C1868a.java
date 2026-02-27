package mj;

import lj.C1842a;
import uj.AbstractC2324c;
import uj.C2323b;
import vj.C2357a;

/* JADX INFO: renamed from: mj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1868a extends C1842a {

    /* JADX INFO: renamed from: mj.a$a, reason: collision with other inner class name */
    public static final class C0099a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0099a f18440a = new C0099a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f18441b;

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
            f18441b = num;
        }
    }

    public final AbstractC2324c b() {
        Integer num = C0099a.f18441b;
        return (num == null || num.intValue() >= 34) ? new C2357a() : new C2323b();
    }
}
