package U2;

import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.H;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC1203q {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final g DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Q PARSER;
    private C0595b androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private H customAttributes_ = H.f10050b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1203q.q(g.class, gVar);
    }

    public static e D() {
        return (e) DEFAULT_INSTANCE.j();
    }

    public static void s(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 1;
        gVar.googleAppId_ = str;
    }

    public static void t(g gVar, i iVar) {
        gVar.getClass();
        gVar.applicationProcessState_ = iVar.f5921a;
        gVar.bitField0_ |= 8;
    }

    public static H u(g gVar) {
        H h = gVar.customAttributes_;
        if (!h.f10051a) {
            gVar.customAttributes_ = h.c();
        }
        return gVar.customAttributes_;
    }

    public static void v(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 2;
        gVar.appInstanceId_ = str;
    }

    public static void w(g gVar, C0595b c0595b) {
        gVar.getClass();
        gVar.androidAppInfo_ = c0595b;
        gVar.bitField0_ |= 4;
    }

    public static g y() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 1) != 0;
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", h.f5916a, "customAttributes_", f.f5915a});
            case 3:
                return new g();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (g.class) {
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

    public final C0595b x() {
        C0595b c0595b = this.androidAppInfo_;
        return c0595b == null ? C0595b.v() : c0595b;
    }

    public final boolean z() {
        return (this.bitField0_ & 4) != 0;
    }
}
