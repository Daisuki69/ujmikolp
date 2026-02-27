package P2;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler f4992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f4993b;
    public final N2.d c;

    public f(ResponseHandler responseHandler, Timer timer, N2.d dVar) {
        this.f4992a = responseHandler;
        this.f4993b = timer;
        this.c = dVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.i(this.f4993b.a());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = h.a(httpResponse);
        if (lA != null) {
            this.c.h(lA.longValue());
        }
        String strB = h.b(httpResponse);
        if (strB != null) {
            this.c.g(strB);
        }
        this.c.b();
        return this.f4992a.handleResponse(httpResponse);
    }
}
