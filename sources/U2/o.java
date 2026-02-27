package U2;

import com.google.protobuf.AbstractC1188b;
import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.InterfaceC1206u;
import com.google.protobuf.Q;
import com.google.protobuf.U;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC1203q {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Q PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private InterfaceC1206u androidMemoryReadings_;
    private int bitField0_;
    private InterfaceC1206u cpuMetricReadings_;
    private m gaugeMetadata_;
    private String sessionId_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        AbstractC1203q.q(o.class, oVar);
    }

    public o() {
        U u3 = U.f10067d;
        this.cpuMetricReadings_ = u3;
        this.androidMemoryReadings_ = u3;
    }

    public static n C() {
        return (n) DEFAULT_INSTANCE.j();
    }

    public static void s(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        oVar.bitField0_ |= 1;
        oVar.sessionId_ = str;
    }

    public static void t(o oVar, d dVar) {
        oVar.getClass();
        dVar.getClass();
        InterfaceC1206u interfaceC1206u = oVar.androidMemoryReadings_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            oVar.androidMemoryReadings_ = AbstractC1203q.p(interfaceC1206u);
        }
        oVar.androidMemoryReadings_.add(dVar);
    }

    public static void u(o oVar, m mVar) {
        oVar.getClass();
        mVar.getClass();
        oVar.gaugeMetadata_ = mVar;
        oVar.bitField0_ |= 2;
    }

    public static void v(o oVar, k kVar) {
        oVar.getClass();
        kVar.getClass();
        InterfaceC1206u interfaceC1206u = oVar.cpuMetricReadings_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            oVar.cpuMetricReadings_ = AbstractC1203q.p(interfaceC1206u);
        }
        oVar.cpuMetricReadings_.add(kVar);
    }

    public static o y() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean B() {
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class});
            case 3:
                return new o();
            case 4:
                return new n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (o.class) {
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

    public final int w() {
        return this.androidMemoryReadings_.size();
    }

    public final int x() {
        return this.cpuMetricReadings_.size();
    }

    public final m z() {
        m mVar = this.gaugeMetadata_;
        return mVar == null ? m.v() : mVar;
    }
}
