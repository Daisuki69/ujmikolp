package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.BlockingStartUpLocation;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewStartUpCallbackAdapter implements WebViewStartUpCallbackBoundaryInterface {
    private final WebViewCompat.WebViewStartUpCallback mWebViewStartUpCallback;

    public static class BlockingStartUpLocationImpl implements BlockingStartUpLocation {
        private final Throwable mThrowable;

        public BlockingStartUpLocationImpl(Throwable th2) {
            this.mThrowable = th2;
        }

        @Override // androidx.webkit.BlockingStartUpLocation
        public String getStackInformation() {
            StringWriter stringWriter = new StringWriter();
            this.mThrowable.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    public WebViewStartUpCallbackAdapter(@NonNull WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.mWebViewStartUpCallback = webViewStartUpCallback;
    }

    private WebViewStartUpResult webViewStartUpResultFromBoundaryInterface(@NonNull WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        return new WebViewStartUpResult(webViewStartUpResultBoundaryInterface) { // from class: androidx.webkit.internal.WebViewStartUpCallbackAdapter.1
            private final List<BlockingStartUpLocation> mBlockingStartUpLocations;
            final /* synthetic */ WebViewStartUpResultBoundaryInterface val$result;

            {
                this.val$result = webViewStartUpResultBoundaryInterface;
                this.mBlockingStartUpLocations = convertFromThrowables(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations());
            }

            private List<BlockingStartUpLocation> convertFromThrowables(List<Throwable> list) {
                ArrayList arrayList = new ArrayList();
                Iterator<Throwable> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BlockingStartUpLocationImpl(it.next()));
                }
                return arrayList;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public List<BlockingStartUpLocation> getBlockingStartUpLocations() {
                return this.mBlockingStartUpLocations;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public Long getMaxTimePerTaskInUiThreadMillis() {
                return this.val$result.getMaxTimePerTaskInUiThreadMillis();
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public Long getTotalTimeInUiThreadMillis() {
                return this.val$result.getTotalTimeInUiThreadMillis();
            }
        };
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(@NonNull InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) jk.b.c(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        this.mWebViewStartUpCallback.onSuccess(webViewStartUpResultFromBoundaryInterface(webViewStartUpResultBoundaryInterface));
    }
}
