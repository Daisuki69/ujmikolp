package U2;

import com.google.protobuf.AbstractC1188b;
import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.InterfaceC1204s;
import com.google.protobuf.InterfaceC1205t;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import java.util.Arrays;
import java.util.List;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC1203q {
    private static final w DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC1205t sessionVerbosity_converter_ = new h();
    private int bitField0_;
    private String sessionId_ = "";
    private InterfaceC1204s sessionVerbosity_ = com.google.protobuf.r.f10121d;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        AbstractC1203q.q(w.class, wVar);
    }

    public static void s(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= 1;
        wVar.sessionId_ = str;
    }

    public static void t(w wVar) {
        wVar.getClass();
        List list = wVar.sessionVerbosity_;
        if (!((AbstractC1188b) list).f10078a) {
            int size = list.size();
            int i = size == 0 ? 10 : size * 2;
            com.google.protobuf.r rVar = (com.google.protobuf.r) list;
            if (i < rVar.c) {
                throw new IllegalArgumentException();
            }
            wVar.sessionVerbosity_ = new com.google.protobuf.r(Arrays.copyOf(rVar.f10122b, i), rVar.c, true);
        }
        ((com.google.protobuf.r) wVar.sessionVerbosity_).addInt(AbstractC2217b.c(2));
    }

    public static v w() {
        return (v) DEFAULT_INSTANCE.j();
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", h.f5918d});
            case 3:
                return new w();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (w.class) {
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

    public final int u() {
        int i = 0;
        int i4 = ((com.google.protobuf.r) this.sessionVerbosity_).getInt(0);
        if (i4 == 0) {
            i = 1;
        } else if (i4 == 1) {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int v() {
        return this.sessionVerbosity_.size();
    }
}
