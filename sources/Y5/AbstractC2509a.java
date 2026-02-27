package y5;

import M8.T2;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.common.retrofit.RetrofitException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import java.io.IOException;
import java.lang.ref.WeakReference;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: renamed from: y5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2509a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dh.c f21057a = new Dh.c(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uh.d f21058b;
    public volatile WeakReference c;

    public AbstractC2509a() {
    }

    public final void e(io.reactivex.rxjava3.disposables.b... bVarArr) {
        for (io.reactivex.rxjava3.disposables.b bVar : bVarArr) {
            this.f21057a.a(bVar);
        }
    }

    public final PayMayaError f(Throwable th2, boolean z4) {
        RetrofitException retrofitException;
        PayMayaError payMayaErrorBuild;
        PayMayaErrorAction payMayaErrorActionBuild;
        com.google.gson.q qVarG;
        if (th2 instanceof HttpException) {
            Response<?> response = ((HttpException) th2).response();
            response.raw().request().url().toString();
            int i = RetrofitException.c;
            retrofitException = new RetrofitException(response.raw().code() + Global.BLANK + response.raw().message(), response, 2, null);
        } else if (th2 instanceof IOException) {
            IOException iOException = (IOException) th2;
            retrofitException = new RetrofitException(iOException.getMessage(), null, 1, iOException);
        } else {
            retrofitException = new RetrofitException(th2.getMessage(), null, 3, th2);
        }
        Response response2 = retrofitException.f10364a;
        try {
            JSONObject jSONObject = new JSONObject(response2.errorBody().string());
            String str = z4 ? "Let’s try that again." : "We did not get a response from the server, please try again in a bit.";
            if (jSONObject.has(MediaRouteProviderProtocol.SERVICE_DATA_ERROR)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
                com.google.gson.q qVarG2 = jSONObject2.has("details") ? T2.x(jSONObject2.getJSONObject("details").toString()).g() : null;
                if (jSONObject2.has("action")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("action");
                    payMayaErrorActionBuild = PayMayaErrorAction.sBuilder().mTitle(jSONObject3.getString("title")).mUrl(jSONObject3.getString(ImagesContract.URL)).isExternal(Boolean.valueOf(jSONObject3.optBoolean("is_external"))).build();
                } else {
                    payMayaErrorActionBuild = null;
                }
                String str2 = response2.raw().headers().get("error-code");
                int iOptInt = str2 == null ? jSONObject2.optInt("code", Integer.MIN_VALUE) : Integer.parseInt(str2);
                if (jSONObject.has("meta")) {
                    String str3 = response2.raw().headers().get("x-has-min-changed");
                    if (str3 != null) {
                        jSONObject.getJSONObject("meta").put("has_min_changed", Boolean.valueOf(str3));
                    }
                    qVarG = T2.x(jSONObject.getJSONObject("meta").toString()).g();
                } else {
                    qVarG = null;
                }
                payMayaErrorBuild = PayMayaError.sBuilder().mStatusCode(response2.raw().code()).mErrorCode(iOptInt).mSpiel(jSONObject2.optString("spiel", str)).mMessage(jSONObject2.optString("msg", str)).mAction(payMayaErrorActionBuild).mDetails(qVarG2 == null ? "" : qVarG2.toString()).mMeta(qVarG == null ? "" : qVarG.toString()).isNetworkError(false).isDefault(!jSONObject2.has("spiel")).build();
            } else {
                String str4 = response2.raw().headers().get("error-code");
                payMayaErrorBuild = PayMayaError.sBuilder().isDefault(true).mErrorCode(str4 != null ? Integer.parseInt(str4) : Integer.MIN_VALUE).mStatusCode(response2.raw().code()).mJsonObject(jSONObject.toString()).mSpiel(str).mMessage(str).build();
            }
        } catch (Exception unused) {
            yk.a.e();
            PayMayaError.Builder builderIsDefault = PayMayaError.sBuilder().mErrorCode(Integer.MIN_VALUE).isDefault(true);
            if (retrofitException.f10365b == 1) {
                String str5 = z4 ? "We ran into a connection issue. Please try again in a bit." : "Uh-oh! Looks like you have slow or no internet connection. Please make sure you're online and try again.";
                builderIsDefault.isNetworkError(true).mSpiel(str5).mMessage(str5);
            } else {
                String str6 = z4 ? "Let’s try that again." : "We did not get a response from the server, please try again in a bit.";
                builderIsDefault.mSpiel(str6).mMessage(str6);
            }
            payMayaErrorBuild = builderIsDefault.build();
        }
        String message = th2.getMessage();
        PayMayaError payMayaErrorBuild2 = payMayaErrorBuild.toBuilder().mThrowableMessage(message != null ? message : "").build();
        Uh.d dVar = this.f21058b;
        if (!C.e(dVar) && payMayaErrorBuild2.isSessionTimeout()) {
            dVar.onNext(payMayaErrorBuild2);
        }
        return payMayaErrorBuild2;
    }

    public final boolean g() {
        return (this.c == null || this.c.get() == null) ? false : true;
    }

    public void h(Object obj) {
        if (!g()) {
            this.c = new WeakReference(obj);
            return;
        }
        throw new IllegalStateException("View " + this.c + " is already attached. Cannot attach " + obj);
    }

    public void i() {
        if (this.c == null || this.c.get() == null) {
            throw new IllegalStateException("View is already detached or not yet attached.");
        }
        this.f21057a.d();
        this.c.clear();
    }

    public void j() {
        this.f21057a.d();
    }

    public AbstractC2509a(Uh.d dVar) {
        this.f21058b = dVar;
    }
}
