package O2;

import M8.A0;
import U2.r;
import android.content.Context;
import android.content.res.Resources;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M2.a f4626d = M2.a.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f4627b;
    public final Context c;

    public c(r rVar, Context context) {
        this.c = context;
        this.f4627b = rVar;
    }

    @Override // O2.e
    public final boolean a() {
        String str;
        r rVar = this.f4627b;
        String strP = rVar.P();
        boolean zIsEmpty = strP == null ? true : strP.trim().isEmpty();
        M2.a aVar = f4626d;
        if (zIsEmpty) {
            aVar.f("URL is missing:" + rVar.P());
            return false;
        }
        String strP2 = rVar.P();
        URI uriCreate = null;
        if (strP2 != null) {
            try {
                uriCreate = URI.create(strP2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                aVar.g("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uriCreate == null) {
            aVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            M2.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (A0.f3132b == null) {
                A0.f3132b = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                for (String str2 : A0.f3132b) {
                    if (!host.contains(str2)) {
                    }
                }
                aVar.f("URL fails allowlist rule: " + uriCreate);
                return false;
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            aVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme))) {
            aVar.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            aVar.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            aVar.f("URL port is less than or equal to 0");
            return false;
        }
        int iH = rVar.R() ? rVar.H() : 0;
        if (iH == 0 || iH == 1) {
            switch (rVar.H()) {
                case 1:
                    str = "HTTP_METHOD_UNKNOWN";
                    break;
                case 2:
                    str = ShareTarget.METHOD_GET;
                    break;
                case 3:
                    str = "PUT";
                    break;
                case 4:
                    str = ShareTarget.METHOD_POST;
                    break;
                case 5:
                    str = "DELETE";
                    break;
                case 6:
                    str = "HEAD";
                    break;
                case 7:
                    str = "PATCH";
                    break;
                case 8:
                    str = "OPTIONS";
                    break;
                case 9:
                    str = "TRACE";
                    break;
                case 10:
                    str = "CONNECT";
                    break;
                default:
                    str = "null";
                    break;
            }
            aVar.f("HTTP Method is null or invalid: ".concat(str));
            return false;
        }
        if (rVar.S() && rVar.I() <= 0) {
            aVar.f("HTTP ResponseCode is a negative value:" + rVar.I());
            return false;
        }
        if (rVar.T() && rVar.K() < 0) {
            aVar.f("Request Payload is a negative value:" + rVar.K());
            return false;
        }
        if (rVar.U() && rVar.L() < 0) {
            aVar.f("Response Payload is a negative value:" + rVar.L());
            return false;
        }
        if (!rVar.Q() || rVar.F() <= 0) {
            aVar.f("Start time of the request is null, or zero, or a negative value:" + rVar.F());
            return false;
        }
        if (rVar.V() && rVar.M() < 0) {
            aVar.f("Time to complete the request is a negative value:" + rVar.M());
            return false;
        }
        if (rVar.X() && rVar.O() < 0) {
            aVar.f("Time from the start of the request to the start of the response is null or a negative value:" + rVar.O());
            return false;
        }
        if (!rVar.W() || rVar.N() <= 0) {
            aVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + rVar.N());
            return false;
        }
        if (rVar.S()) {
            return true;
        }
        aVar.f("Did not receive a HTTP Response Code");
        return false;
    }
}
