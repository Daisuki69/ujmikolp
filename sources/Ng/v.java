package Ng;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cj.C1132s;
import cj.L;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Comparable {
    public static final v c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f4444d;
    public static final v e;
    public static final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f4445g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4447b;

    static {
        v vVar = new v(100, "Continue");
        v vVar2 = new v(101, "Switching Protocols");
        v vVar3 = new v(102, "Processing");
        v vVar4 = new v(200, "OK");
        v vVar5 = new v(201, "Created");
        v vVar6 = new v(202, "Accepted");
        v vVar7 = new v(203, "Non-Authoritative Information");
        v vVar8 = new v(204, "No Content");
        v vVar9 = new v(205, "Reset Content");
        v vVar10 = new v(206, "Partial Content");
        v vVar11 = new v(207, "Multi-Status");
        v vVar12 = new v(300, "Multiple Choices");
        v vVar13 = new v(301, "Moved Permanently");
        c = vVar13;
        v vVar14 = new v(302, "Found");
        f4444d = vVar14;
        v vVar15 = new v(303, "See Other");
        e = vVar15;
        v vVar16 = new v(304, "Not Modified");
        v vVar17 = new v(305, "Use Proxy");
        v vVar18 = new v(306, "Switch Proxy");
        v vVar19 = new v(307, "Temporary Redirect");
        f = vVar19;
        v vVar20 = new v(308, "Permanent Redirect");
        f4445g = vVar20;
        List listG = C1132s.g(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, new v(YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, "Bad Request"), new v(TypedValues.CycleType.TYPE_CURVE_FIT, "Unauthorized"), new v(TypedValues.CycleType.TYPE_VISIBILITY, "Payment Required"), new v(TypedValues.CycleType.TYPE_ALPHA, "Forbidden"), new v(404, "Not Found"), new v(405, "Method Not Allowed"), new v(406, "Not Acceptable"), new v(407, "Proxy Authentication Required"), new v(408, "Request Timeout"), new v(409, "Conflict"), new v(410, "Gone"), new v(411, "Length Required"), new v(412, "Precondition Failed"), new v(413, "Payload Too Large"), new v(414, "Request-URI Too Long"), new v(415, "Unsupported Media Type"), new v(TypedValues.CycleType.TYPE_PATH_ROTATE, "Requested Range Not Satisfiable"), new v(417, "Expectation Failed"), new v(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity"), new v(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked"), new v(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency"), new v(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early"), new v(426, "Upgrade Required"), new v(429, "Too Many Requests"), new v(431, "Request Header Fields Too Large"), new v(500, "Internal Server Error"), new v(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented"), new v(TypedValues.PositionType.TYPE_DRAWPATH, "Bad Gateway"), new v(TypedValues.PositionType.TYPE_PERCENT_WIDTH, "Service Unavailable"), new v(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout"), new v(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version Not Supported"), new v(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates"), new v(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage"));
        h = listG;
        List list = listG;
        int iB = L.b(cj.t.l(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((v) obj).f4446a), obj);
        }
    }

    public v(int i, String description) {
        kotlin.jvm.internal.j.g(description, "description");
        this.f4446a = i;
        this.f4447b = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v other = (v) obj;
        kotlin.jvm.internal.j.g(other, "other");
        return this.f4446a - other.f4446a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f4446a == this.f4446a;
    }

    public final int hashCode() {
        return this.f4446a;
    }

    public final String toString() {
        return this.f4446a + ' ' + this.f4447b;
    }
}
