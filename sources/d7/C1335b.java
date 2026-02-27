package d7;

import android.R;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.paymaya.mayaui.common.view.widget.snackbar.MayaSwipeableSnackbarView;

/* JADX INFO: renamed from: d7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1335b extends BaseTransientBottomBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16288b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaSwipeableSnackbarView f16289a;

    public C1335b(ViewGroup viewGroup, MayaSwipeableSnackbarView mayaSwipeableSnackbarView) {
        super(viewGroup, mayaSwipeableSnackbarView, mayaSwipeableSnackbarView);
        this.f16289a = mayaSwipeableSnackbarView;
        getView().setBackgroundColor(ContextCompat.getColor(this.view.getContext(), R.color.transparent));
        getView().setPadding(0, 0, 0, 0);
    }
}
