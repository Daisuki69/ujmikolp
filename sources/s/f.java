package S;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CTInAppNativeInterstitialFragment f5585b;

    public /* synthetic */ f(CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment, int i) {
        this.f5584a = i;
        this.f5585b = cTInAppNativeInterstitialFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5584a) {
            case 0:
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment = this.f5585b;
                Callback.onClick_enter(view);
                try {
                    CTInAppNativeInterstitialFragment.I1(cTInAppNativeInterstitialFragment);
                    return;
                } finally {
                }
            default:
                CTInAppNativeInterstitialFragment this$0 = this.f5585b;
                Callback.onClick_enter(view);
                try {
                    j.g(this$0, "this$0");
                    this$0.m1(null);
                    GifImageView gifImageView = this$0.f9534W;
                    if (gifImageView != null) {
                        gifImageView.a();
                    }
                    FragmentActivity activity = this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return;
                } finally {
                }
        }
    }
}
