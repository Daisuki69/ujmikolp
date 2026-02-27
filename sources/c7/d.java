package C7;

import S1.E;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.shield.android.r.i;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.concurrent.Phaser;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f748b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f749d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(OfflineLicenseHelper offlineLicenseHelper, int i, byte[] bArr, E e, Format format) {
        this.f747a = 2;
        this.c = offlineLicenseHelper;
        this.f748b = i;
        this.f749d = bArr;
        this.e = e;
        this.f = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f;
        Object obj2 = this.e;
        int i = this.f748b;
        Object obj3 = this.f749d;
        Object obj4 = this.c;
        switch (this.f747a) {
            case 0:
                int i4 = MayaDashboardActivity.f12133U;
                RelativeLayout relativeLayout = (RelativeLayout) obj4;
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                j.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] iArr = (int[]) obj2;
                layoutParams2.bottomMargin = (i - iArr[1]) + ((int) (15 * ((MayaDashboardActivity) obj3).getResources().getDisplayMetrics().density));
                layoutParams2.leftMargin = (((ImageView) obj).getWidth() / 2) + (iArr[0] - (relativeLayout.getWidth() / 2));
                relativeLayout.setLayoutParams(layoutParams2);
                break;
            case 1:
                ((i) obj4).a((ByteBuffer) obj3, i, (byte[][]) obj2, (Phaser) obj);
                break;
            case 2:
                ((OfflineLicenseHelper) obj4).lambda$acquireFirstSessionOnHandlerThread$2(i, (byte[]) obj3, (E) obj2, (Format) obj);
                break;
            case 3:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) obj4).lambda$onReceivedError$9((WebView) obj3, i, (String) obj2, (String) obj);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) obj4).lambda$onReceivedError$9((WebView) obj3, i, (String) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i, Serializable serializable, Object obj3, int i4) {
        this.f747a = i4;
        this.c = obj;
        this.f749d = obj2;
        this.f748b = i;
        this.e = serializable;
        this.f = obj3;
    }
}
