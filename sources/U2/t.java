package U2;

import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1203q implements u {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Q PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private g applicationInfo_;
    private int bitField0_;
    private o gaugeMetric_;
    private r networkRequestMetric_;
    private A traceMetric_;
    private C transportInfo_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        AbstractC1203q.q(t.class, tVar);
    }

    public static void s(t tVar, g gVar) {
        tVar.getClass();
        tVar.applicationInfo_ = gVar;
        tVar.bitField0_ |= 1;
    }

    public static void t(t tVar, o oVar) {
        tVar.getClass();
        tVar.gaugeMetric_ = oVar;
        tVar.bitField0_ |= 8;
    }

    public static void u(t tVar, A a8) {
        tVar.getClass();
        tVar.traceMetric_ = a8;
        tVar.bitField0_ |= 2;
    }

    public static void v(t tVar, r rVar) {
        tVar.getClass();
        tVar.networkRequestMetric_ = rVar;
        tVar.bitField0_ |= 4;
    }

    public static s y() {
        return (s) DEFAULT_INSTANCE.j();
    }

    @Override // U2.u
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // U2.u
    public final boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // U2.u
    public final r c() {
        r rVar = this.networkRequestMetric_;
        return rVar == null ? r.G() : rVar;
    }

    @Override // U2.u
    public final boolean d() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // U2.u
    public final A e() {
        A a8 = this.traceMetric_;
        return a8 == null ? A.F() : a8;
    }

    @Override // U2.u
    public final o f() {
        o oVar = this.gaugeMetric_;
        return oVar == null ? o.y() : oVar;
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new t();
            case 4:
                return new s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (t.class) {
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

    public final g w() {
        g gVar = this.applicationInfo_;
        return gVar == null ? g.y() : gVar;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }
}
