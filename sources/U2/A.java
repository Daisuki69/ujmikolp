package U2;

import com.google.protobuf.AbstractC1187a;
import com.google.protobuf.AbstractC1188b;
import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1206u;
import com.google.protobuf.Q;
import com.google.protobuf.U;
import com.google.protobuf.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC1203q {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final A DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Q PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private H counters_;
    private H customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private InterfaceC1206u perfSessions_;
    private InterfaceC1206u subtraces_;

    static {
        A a8 = new A();
        DEFAULT_INSTANCE = a8;
        AbstractC1203q.q(A.class, a8);
    }

    public A() {
        H h = H.f10050b;
        this.counters_ = h;
        this.customAttributes_ = h;
        this.name_ = "";
        U u3 = U.f10067d;
        this.subtraces_ = u3;
        this.perfSessions_ = u3;
    }

    public static void A(A a8, long j) {
        a8.bitField0_ |= 8;
        a8.durationUs_ = j;
    }

    public static A F() {
        return DEFAULT_INSTANCE;
    }

    public static x L() {
        return (x) DEFAULT_INSTANCE.j();
    }

    public static void s(A a8, String str) {
        a8.getClass();
        str.getClass();
        a8.bitField0_ |= 1;
        a8.name_ = str;
    }

    public static H t(A a8) {
        H h = a8.counters_;
        if (!h.f10051a) {
            a8.counters_ = h.c();
        }
        return a8.counters_;
    }

    public static void u(A a8, A a10) {
        a8.getClass();
        a10.getClass();
        InterfaceC1206u interfaceC1206u = a8.subtraces_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            a8.subtraces_ = AbstractC1203q.p(interfaceC1206u);
        }
        a8.subtraces_.add(a10);
    }

    public static void v(A a8, ArrayList arrayList) {
        InterfaceC1206u interfaceC1206u = a8.subtraces_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            a8.subtraces_ = AbstractC1203q.p(interfaceC1206u);
        }
        AbstractC1187a.g(arrayList, a8.subtraces_);
    }

    public static H w(A a8) {
        H h = a8.customAttributes_;
        if (!h.f10051a) {
            a8.customAttributes_ = h.c();
        }
        return a8.customAttributes_;
    }

    public static void x(A a8, w wVar) {
        a8.getClass();
        InterfaceC1206u interfaceC1206u = a8.perfSessions_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            a8.perfSessions_ = AbstractC1203q.p(interfaceC1206u);
        }
        a8.perfSessions_.add(wVar);
    }

    public static void y(A a8, List list) {
        InterfaceC1206u interfaceC1206u = a8.perfSessions_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            a8.perfSessions_ = AbstractC1203q.p(interfaceC1206u);
        }
        AbstractC1187a.g(list, a8.perfSessions_);
    }

    public static void z(A a8, long j) {
        a8.bitField0_ |= 4;
        a8.clientStartTimeUs_ = j;
    }

    public final boolean B() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int C() {
        return this.counters_.size();
    }

    public final Map D() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map E() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long G() {
        return this.durationUs_;
    }

    public final String H() {
        return this.name_;
    }

    public final InterfaceC1206u I() {
        return this.perfSessions_;
    }

    public final InterfaceC1206u J() {
        return this.subtraces_;
    }

    public final boolean K() {
        return (this.bitField0_ & 4) != 0;
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
                return new V(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", y.f5923a, "subtraces_", A.class, "customAttributes_", z.f5924a, "perfSessions_", w.class});
            case 3:
                return new A();
            case 4:
                return new x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (A.class) {
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
