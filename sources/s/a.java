package S;

import android.util.SparseArray;
import android.view.View;
import android.widget.CheckedTextView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.dynatrace.android.callback.Callback;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5574b;

    public /* synthetic */ a(Object obj, int i) {
        this.f5573a = i;
        this.f5574b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5573a;
        Callback.onClick_enter(view);
        switch (i) {
            case 0:
                try {
                    j.g(view, "view");
                    Object tag = view.getTag();
                    Integer num = tag instanceof Integer ? (Integer) tag : null;
                    if (num != null) {
                        ((CTInAppBaseFragment) this.f5574b).s1(num.intValue());
                        Callback.onClick_exit();
                        return;
                    }
                    return;
                } finally {
                }
            case 1:
                try {
                    ((CTInboxActivity) this.f5574b).finish();
                    return;
                } finally {
                    Callback.onClick_exit();
                }
            case 2:
                try {
                    TrackSelectionView trackSelectionView = (TrackSelectionView) this.f5574b;
                    SparseArray sparseArray = trackSelectionView.c;
                    boolean z4 = false;
                    CheckedTextView checkedTextView = trackSelectionView.f9696b;
                    CheckedTextView checkedTextView2 = trackSelectionView.f9695a;
                    if (view == checkedTextView2) {
                        trackSelectionView.f = true;
                        sparseArray.clear();
                    } else {
                        if (view != checkedTextView) {
                            trackSelectionView.f = false;
                            view.getTag().getClass();
                            throw new ClassCastException();
                        }
                        trackSelectionView.f = false;
                        sparseArray.clear();
                    }
                    checkedTextView2.setChecked(trackSelectionView.f);
                    if (!trackSelectionView.f && sparseArray.size() == 0) {
                        z4 = true;
                    }
                    checkedTextView.setChecked(z4);
                    throw null;
                } finally {
                }
            default:
                try {
                    View.OnClickListener onClickListener = (View.OnClickListener) this.f5574b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    return;
                } finally {
                }
        }
    }
}
