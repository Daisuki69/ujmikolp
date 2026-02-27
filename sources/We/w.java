package We;

import android.net.NetworkInfo;
import com.dynatrace.android.callback.OkCallback;
import dOYHB6.tiZVw8.numX49;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f6422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f6423b;

    public w(x xVar, I i) {
        this.f6422a = xVar;
        this.f6423b = i;
    }

    @Override // We.H
    public final boolean b(F f) {
        String scheme = f.f6354a.getScheme();
        return numX49.tnTj78("bkRPv").equals(scheme) || numX49.tnTj78("bkRP7").equals(scheme);
    }

    @Override // We.H
    public final int d() {
        return 2;
    }

    @Override // We.H
    public final Q3.b e(F f, int i) throws Exception {
        CacheControl cacheControlBuild;
        if (i == 0) {
            cacheControlBuild = null;
        } else if ((i & 4) != 0) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if ((i & 1) != 0) {
                builder.noCache();
            }
            if ((i & 2) != 0) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(f.f6354a.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = OkCallback.execute(this.f6422a.f6424a.newCall(builderUrl.build()));
        ResponseBody responseBodyBody = responseExecute.body();
        if (!responseExecute.isSuccessful()) {
            responseBodyBody.close();
            throw new v(s.f(responseExecute.code(), numX49.tnTj78("bkRPY")));
        }
        int i4 = responseExecute.cacheResponse() == null ? 3 : 2;
        if (i4 == 2 && responseBodyBody.contentLength() == 0) {
            responseBodyBody.close();
            throw new u(numX49.tnTj78("bkRPA"));
        }
        if (i4 == 3 && responseBodyBody.contentLength() > 0) {
            long jContentLength = responseBodyBody.contentLength();
            I i6 = this.f6423b;
            Long lValueOf = Long.valueOf(jContentLength);
            HandlerC0609m handlerC0609m = i6.f6363b;
            handlerC0609m.sendMessage(handlerC0609m.obtainMessage(4, lValueOf));
        }
        return new Q3.b(responseBodyBody.source(), i4);
    }

    @Override // We.H
    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
