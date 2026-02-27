package P2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callback f4994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.d f4995b;
    public final Timer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4996d;

    public g(Callback callback, S2.f fVar, Timer timer, long j) {
        this.f4994a = callback;
        this.f4995b = new N2.d(fVar);
        this.f4996d = j;
        this.c = timer;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        N2.d dVar = this.f4995b;
        if (request != null) {
            HttpUrl httpUrlUrl = request.url();
            if (httpUrlUrl != null) {
                dVar.j(httpUrlUrl.url().toString());
            }
            if (request.method() != null) {
                dVar.c(request.method());
            }
        }
        dVar.f(this.f4996d);
        AbstractC1414e.l(this.c, dVar, dVar);
        this.f4994a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.a(response, this.f4995b, this.f4996d, this.c.a());
        this.f4994a.onResponse(call, response);
    }
}
