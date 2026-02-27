package io.flutter.plugins.webviewflutter;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class ViewProxyApi extends PigeonApiView {

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.ViewProxyApi$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode;

        static {
            int[] iArr = new int[OverScrollMode.values().length];
            $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode = iArr;
            try {
                iArr[OverScrollMode.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.IF_CONTENT_SCROLLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[OverScrollMode.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    @NonNull
    public WebViewPoint getScrollPosition(@NonNull View view) {
        return new WebViewPoint(view.getScrollX(), view.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void scrollBy(@NonNull View view, long j, long j6) {
        view.scrollBy((int) j, (int) j6);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void scrollTo(@NonNull View view, long j, long j6) {
        view.scrollTo((int) j, (int) j6);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setHorizontalScrollBarEnabled(@NonNull View view, boolean z4) {
        view.setHorizontalScrollBarEnabled(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setOverScrollMode(@NonNull View view, @NonNull OverScrollMode overScrollMode) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[overScrollMode.ordinal()];
        if (i == 1) {
            view.setOverScrollMode(0);
            return;
        }
        if (i == 2) {
            view.setOverScrollMode(1);
        } else if (i == 3) {
            view.setOverScrollMode(2);
        } else if (i == 4) {
            throw getPigeonRegistrar().createUnknownEnumException(OverScrollMode.UNKNOWN);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    public void setVerticalScrollBarEnabled(@NonNull View view, boolean z4) {
        view.setVerticalScrollBarEnabled(z4);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiView
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
