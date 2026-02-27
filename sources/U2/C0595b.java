package U2;

import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: renamed from: U2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0595b extends AbstractC1203q {
    private static final C0595b DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Q PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        C0595b c0595b = new C0595b();
        DEFAULT_INSTANCE = c0595b;
        AbstractC1203q.q(C0595b.class, c0595b);
    }

    public static void s(C0595b c0595b, String str) {
        c0595b.getClass();
        str.getClass();
        c0595b.bitField0_ |= 1;
        c0595b.packageName_ = str;
    }

    public static void t(C0595b c0595b) {
        c0595b.getClass();
        c0595b.bitField0_ |= 2;
        c0595b.sdkVersion_ = "22.0.2";
    }

    public static void u(C0595b c0595b, String str) {
        c0595b.getClass();
        c0595b.bitField0_ |= 4;
        c0595b.versionName_ = str;
    }

    public static C0595b v() {
        return DEFAULT_INSTANCE;
    }

    public static C0594a y() {
        return (C0594a) DEFAULT_INSTANCE.j();
    }

    @Override // com.google.protobuf.AbstractC1203q
    public final Object k(int i) {
        Q c1202p;
        switch (AbstractC2217b.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new C0595b();
            case 4:
                return new C0594a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (C0595b.class) {
                    try {
                        c1202p = PARSER;
                        if (c1202p == null) {
                            c1202p = new C1202p();
                            PARSER = c1202p;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return c1202p;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }
}
