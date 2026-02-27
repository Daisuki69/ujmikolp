package Je;

import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.location.LocationRequest;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean A(View view) {
        return view instanceof SplashScreenView;
    }

    public static /* synthetic */ MultiResolutionStreamInfo b(int i, int i4, String str) {
        return new MultiResolutionStreamInfo(i, i4, str);
    }

    public static /* bridge */ /* synthetic */ LocationRequest c(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver e(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView j(View view) {
        return (SplashScreenView) view;
    }

    public static /* synthetic */ void p() {
    }
}
