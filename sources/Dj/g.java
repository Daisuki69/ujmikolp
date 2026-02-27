package Dj;

import Bj.InterfaceC0147j;
import com.paymaya.domain.model.ConfidenceThreshold;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f1177a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1178b = Gj.a.i(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = Gj.a.i(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Gj.t f1179d = new Gj.t("BUFFERED", 0);
    public static final Gj.t e = new Gj.t("SHOULD_BUFFER", 0);
    public static final Gj.t f = new Gj.t("S_RESUMING_BY_RCV", 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Gj.t f1180g = new Gj.t("RESUMING_BY_EB", 0);
    public static final Gj.t h = new Gj.t("POISONED", 0);
    public static final Gj.t i = new Gj.t("DONE_RCV", 0);
    public static final Gj.t j = new Gj.t("INTERRUPTED_SEND", 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Gj.t f1181k = new Gj.t("INTERRUPTED_RCV", 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Gj.t f1182l = new Gj.t("CHANNEL_CLOSED", 0);
    public static final Gj.t m = new Gj.t("SUSPEND", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Gj.t f1183n = new Gj.t("SUSPEND_NO_WAITER", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Gj.t f1184o = new Gj.t(ConfidenceThreshold.DECISION_FAILED, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Gj.t f1185p = new Gj.t("NO_RECEIVE_RESULT", 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Gj.t f1186q = new Gj.t("CLOSE_HANDLER_CLOSED", 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Gj.t f1187r = new Gj.t("CLOSE_HANDLER_INVOKED", 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Gj.t f1188s = new Gj.t("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0147j interfaceC0147j, Object obj, qj.n nVar) {
        Gj.t tVarL = interfaceC0147j.l(obj, nVar);
        if (tVarL == null) {
            return false;
        }
        interfaceC0147j.u(tVarL);
        return true;
    }
}
