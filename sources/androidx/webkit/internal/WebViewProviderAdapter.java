package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.UiThread;
import androidx.webkit.PrerenderException;
import androidx.webkit.PrerenderOperationCallback;
import androidx.webkit.Profile;
import androidx.webkit.SpeculativeLoadingParameters;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebNavigationClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewProviderAdapter {
    final WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.mImpl = webViewProviderBoundaryInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prerenderUrlAsync$1(PrerenderOperationCallback prerenderOperationCallback, Throwable th2) {
        prerenderOperationCallback.onError(new PrerenderException("Prerender operation failed", th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prerenderUrlAsync$3(PrerenderOperationCallback prerenderOperationCallback, Throwable th2) {
        prerenderOperationCallback.onError(new PrerenderException("Prerender operation failed", th2));
    }

    public ScriptHandlerImpl addDocumentStartJavaScript(String str, String[] strArr) {
        return ScriptHandlerImpl.toScriptHandler(this.mImpl.addDocumentStartJavaScript(str, strArr));
    }

    public void addWebMessageListener(String str, String[] strArr, WebViewCompat.WebMessageListener webMessageListener) {
        this.mImpl.addWebMessageListener(str, strArr, new jk.a(new WebMessageListenerAdapter(webMessageListener)));
    }

    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.mImpl.createWebMessageChannel();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i = 0; i < invocationHandlerArrCreateWebMessageChannel.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(invocationHandlerArrCreateWebMessageChannel[i]);
        }
        return webMessagePortCompatArr;
    }

    public Profile getProfile() {
        return new ProfileImpl((ProfileBoundaryInterface) jk.b.c(ProfileBoundaryInterface.class, this.mImpl.getProfile()));
    }

    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    @UiThread
    public WebNavigationClient getWebNavigationClient() {
        InvocationHandler webViewNavigationClient = this.mImpl.getWebViewNavigationClient();
        if (webViewNavigationClient == null) {
            return null;
        }
        return ((WebNavigationClientAdapter) ((jk.a) webViewNavigationClient).f17823a).getWebNavigationClient();
    }

    public WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.mImpl.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((WebViewRenderProcessClientAdapter) ((jk.a) webViewRendererClient).f17823a).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long j, WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mImpl.insertVisualStateCallback(j, new jk.a(new VisualStateCallbackAdapter(visualStateCallback)));
    }

    public boolean isAudioMuted() {
        return this.mImpl.isAudioMuted();
    }

    public void postWebMessage(WebMessageCompat webMessageCompat, Uri uri) {
        this.mImpl.postMessageToMainFrame(new jk.a(new WebMessageAdapter(webMessageCompat)), uri);
    }

    public void prerenderUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, PrerenderOperationCallback prerenderOperationCallback) {
        this.mImpl.prerenderUrl(str, cancellationSignal, executor, new h(prerenderOperationCallback, 2), new h(prerenderOperationCallback, 3));
    }

    public void removeWebMessageListener(String str) {
        this.mImpl.removeWebMessageListener(str);
    }

    @UiThread
    public void saveState(Bundle bundle, int i, boolean z4) {
        this.mImpl.saveState(bundle, i, z4);
    }

    public void setAudioMuted(boolean z4) {
        this.mImpl.setAudioMuted(z4);
    }

    public void setProfileWithName(String str) {
        this.mImpl.setProfile(str);
    }

    @UiThread
    public void setWebNavigationClient(WebNavigationClient webNavigationClient) {
        this.mImpl.setWebViewNavigationClient(new jk.a(new WebNavigationClientAdapter(webNavigationClient)));
    }

    @SuppressLint({"LambdaLast"})
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mImpl.setWebViewRendererClient(webViewRenderProcessClient != null ? new jk.a(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }

    public void prerenderUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, SpeculativeLoadingParameters speculativeLoadingParameters, PrerenderOperationCallback prerenderOperationCallback) {
        this.mImpl.prerenderUrl(str, cancellationSignal, executor, new jk.a(new SpeculativeLoadingParametersAdapter(speculativeLoadingParameters)), new h(prerenderOperationCallback, 0), new h(prerenderOperationCallback, 1));
    }
}
