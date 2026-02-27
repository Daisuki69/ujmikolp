package d7;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.paymaya.mayaui.common.view.widget.snackbar.MayaSwipeableSnackbarView;
import com.tencent.could.huiyansdk.activitys.BaseActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: d7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnApplyWindowInsetsListenerC1334a implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f16287b;

    public /* synthetic */ ViewOnApplyWindowInsetsListenerC1334a(KeyEvent.Callback callback, int i) {
        this.f16286a = i;
        this.f16287b = callback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
        switch (this.f16286a) {
            case 0:
                j.g(insets, "insets");
                int systemWindowInsetBottom = insets.getSystemWindowInsetBottom();
                MayaSwipeableSnackbarView mayaSwipeableSnackbarView = (MayaSwipeableSnackbarView) this.f16287b;
                ViewGroup.LayoutParams layoutParams = mayaSwipeableSnackbarView.getLayoutParams();
                j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin + systemWindowInsetBottom);
                mayaSwipeableSnackbarView.setLayoutParams(marginLayoutParams);
                if (view != null) {
                    view.setOnApplyWindowInsetsListener(null);
                }
                return insets.consumeSystemWindowInsets();
            default:
                return ((BaseActivity) this.f16287b).a(view, insets);
        }
    }
}
