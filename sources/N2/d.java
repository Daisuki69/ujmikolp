package N2;

import P2.h;
import S2.f;
import U2.p;
import U2.r;
import U2.w;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends J2.d implements Q2.a {
    public static final M2.a h = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GaugeManager f3517b;
    public final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f3518d;
    public final WeakReference e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3519g;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(f fVar) {
        J2.c cVarA = J2.c.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(cVarA);
        this.f3518d = r.Y();
        this.e = new WeakReference(this);
        this.c = fVar;
        this.f3517b = gaugeManager;
        this.f3516a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // Q2.a
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            h.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        p pVar = this.f3518d;
        if (!((r) pVar.f10116b).Q() || ((r) pVar.f10116b).W()) {
            return;
        }
        this.f3516a.add(perfSession);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.f3516a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f3516a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w[] wVarArrB = PerfSession.b(listUnmodifiableList);
        if (wVarArrB != null) {
            p pVar = this.f3518d;
            List listAsList = Arrays.asList(wVarArrB);
            pVar.i();
            r.B((r) pVar.f10116b, listAsList);
        }
        r rVar = (r) this.f3518d.g();
        String str = this.f;
        if (str == null) {
            Pattern pattern = h.f4997a;
        } else if (h.f4997a.matcher(str).matches()) {
            h.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.f3519g) {
            return;
        }
        f fVar = this.c;
        fVar.i.execute(new I6.a(10, fVar, rVar, getAppState()));
        this.f3519g = true;
    }

    public final void c(String str) {
        int i = 8;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    break;
                case "GET":
                    i = 2;
                    break;
                case "PUT":
                    i = 3;
                    break;
                case "HEAD":
                    i = 6;
                    break;
                case "POST":
                    i = 4;
                    break;
                case "PATCH":
                    i = 7;
                    break;
                case "TRACE":
                    i = 9;
                    break;
                case "CONNECT":
                    i = 10;
                    break;
                case "DELETE":
                    i = 5;
                    break;
                default:
                    i = 1;
                    break;
            }
            p pVar = this.f3518d;
            pVar.i();
            r.C((r) pVar.f10116b, i);
        }
    }

    public final void d(int i) {
        p pVar = this.f3518d;
        pVar.i();
        r.u((r) pVar.f10116b, i);
    }

    public final void e(long j) {
        p pVar = this.f3518d;
        pVar.i();
        r.D((r) pVar.f10116b, j);
    }

    public final void f(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        p pVar = this.f3518d;
        pVar.i();
        r.x((r) pVar.f10116b, j);
        a(perfSession);
        if (perfSession.c) {
            this.f3517b.collectGaugeMetricOnce(perfSession.f9857b);
        }
    }

    public final void g(String str) {
        p pVar = this.f3518d;
        if (str == null) {
            pVar.i();
            r.w((r) pVar.f10116b);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            pVar.i();
            r.v((r) pVar.f10116b, str);
            return;
        }
        h.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j) {
        p pVar = this.f3518d;
        pVar.i();
        r.E((r) pVar.f10116b, j);
    }

    public final void i(long j) {
        p pVar = this.f3518d;
        pVar.i();
        r.A((r) pVar.f10116b, j);
        if (SessionManager.getInstance().perfSession().c) {
            this.f3517b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f9857b);
        }
    }

    public final void j(String str) {
        HttpUrl httpUrl;
        int iLastIndexOf;
        if (str != null) {
            HttpUrl httpUrl2 = HttpUrl.parse(str);
            if (httpUrl2 != null) {
                str = httpUrl2.newBuilder().username("").password("").query(null).fragment(null).toString();
            }
            if (str.length() > 2000) {
                str = (str.charAt(2000) != '/' && (httpUrl = HttpUrl.parse(str)) != null && httpUrl.encodedPath().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
            }
            p pVar = this.f3518d;
            pVar.i();
            r.s((r) pVar.f10116b, str);
        }
    }
}
