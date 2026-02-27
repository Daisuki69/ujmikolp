package p2;

import D.S;
import Kh.I;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;
import q2.InterfaceC2160a;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2005a implements InterfaceC2008d, InterfaceC2160a {
    public static C2007c a(I i) {
        return new C2007c(System.currentTimeMillis() + ((long) DateTimeConstants.MILLIS_PER_HOUR), new S(8), new C2006b(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // p2.InterfaceC2008d
    public C2007c b(I i, JSONObject jSONObject) {
        return a(i);
    }

    @Override // q2.InterfaceC2160a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }
}
