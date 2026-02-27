package androidx.webkit.internal;

import androidx.webkit.WebNavigationClient;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebNavigationClientAdapter implements WebViewNavigationClientBoundaryInterface {
    WebNavigationClient mWebNavigationClient;

    public WebNavigationClientAdapter(WebNavigationClient webNavigationClient) {
        this.mWebNavigationClient = webNavigationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onFirstContentfulPaint$6(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationCompleted$2(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationRedirected$1(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationStarted$0(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageDOMContentLoadedEventFired$5(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageDeleted$3(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageLoadEventFired$4(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.NAVIGATION_CALLBACK_BASIC};
    }

    public WebNavigationClient getWebNavigationClient() {
        return this.mWebNavigationClient;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onFirstContentfulPaint(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) jk.b.c(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onFirstContentfulPaint((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new f(webViewPageBoundaryInterface, 0)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationCompleted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) jk.b.c(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationCompleted((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new g(webViewNavigationBoundaryInterface, 2)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationRedirected(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) jk.b.c(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationRedirected((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new g(webViewNavigationBoundaryInterface, 1)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationStarted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) jk.b.c(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationStarted((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new g(webViewNavigationBoundaryInterface, 0)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) jk.b.c(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageDomContentLoadedEventFired((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new f(webViewPageBoundaryInterface, 3)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDeleted(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) jk.b.c(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageDeleted((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new f(webViewPageBoundaryInterface, 1)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageLoadEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) jk.b.c(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageLoadEventFired((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new f(webViewPageBoundaryInterface, 2)));
    }
}
