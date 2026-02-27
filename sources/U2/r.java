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
import java.util.List;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1203q {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final r DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Q PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private H customAttributes_ = H.f10050b;
    private String url_ = "";
    private String responseContentType_ = "";
    private InterfaceC1206u perfSessions_ = U.f10067d;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC1203q.q(r.class, rVar);
    }

    public static void A(r rVar, long j) {
        rVar.bitField0_ |= 1024;
        rVar.timeToResponseCompletedUs_ = j;
    }

    public static void B(r rVar, List list) {
        InterfaceC1206u interfaceC1206u = rVar.perfSessions_;
        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
            rVar.perfSessions_ = AbstractC1203q.p(interfaceC1206u);
        }
        AbstractC1187a.g(list, rVar.perfSessions_);
    }

    public static void C(r rVar, int i) {
        rVar.getClass();
        rVar.httpMethod_ = AbstractC2217b.c(i);
        rVar.bitField0_ |= 2;
    }

    public static void D(r rVar, long j) {
        rVar.bitField0_ |= 4;
        rVar.requestPayloadBytes_ = j;
    }

    public static void E(r rVar, long j) {
        rVar.bitField0_ |= 8;
        rVar.responsePayloadBytes_ = j;
    }

    public static r G() {
        return DEFAULT_INSTANCE;
    }

    public static p Y() {
        return (p) DEFAULT_INSTANCE.j();
    }

    public static void s(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 1;
        rVar.url_ = str;
    }

    public static void t(r rVar) {
        rVar.getClass();
        rVar.networkClientErrorReason_ = AbstractC2217b.c(2);
        rVar.bitField0_ |= 16;
    }

    public static void u(r rVar, int i) {
        rVar.bitField0_ |= 32;
        rVar.httpResponseCode_ = i;
    }

    public static void v(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 64;
        rVar.responseContentType_ = str;
    }

    public static void w(r rVar) {
        rVar.bitField0_ &= -65;
        rVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void x(r rVar, long j) {
        rVar.bitField0_ |= 128;
        rVar.clientStartTimeUs_ = j;
    }

    public static void y(r rVar, long j) {
        rVar.bitField0_ |= 256;
        rVar.timeToRequestCompletedUs_ = j;
    }

    public static void z(r rVar, long j) {
        rVar.bitField0_ |= 512;
        rVar.timeToResponseInitiatedUs_ = j;
    }

    public final long F() {
        return this.clientStartTimeUs_;
    }

    public final int H() {
        int i;
        switch (this.httpMethod_) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int I() {
        return this.httpResponseCode_;
    }

    public final InterfaceC1206u J() {
        return this.perfSessions_;
    }

    public final long K() {
        return this.requestPayloadBytes_;
    }

    public final long L() {
        return this.responsePayloadBytes_;
    }

    public final long M() {
        return this.timeToRequestCompletedUs_;
    }

    public final long N() {
        return this.timeToResponseCompletedUs_;
    }

    public final long O() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String P() {
        return this.url_;
    }

    public final boolean Q() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean R() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean S() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean T() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 512) != 0;
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
                return new V(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", h.f5917b, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", h.c, "customAttributes_", q.f5922a, "perfSessions_", w.class});
            case 3:
                return new r();
            case 4:
                return new p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (r.class) {
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
