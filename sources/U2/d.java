package U2;

import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC1203q {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final d DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        AbstractC1203q.q(d.class, dVar);
    }

    public static void s(d dVar, long j) {
        dVar.bitField0_ |= 1;
        dVar.clientTimeUs_ = j;
    }

    public static void t(d dVar, int i) {
        dVar.bitField0_ |= 2;
        dVar.usedAppJavaHeapMemoryKb_ = i;
    }

    public static C0596c u() {
        return (C0596c) DEFAULT_INSTANCE.j();
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new d();
            case 4:
                return new C0596c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (d.class) {
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
}
