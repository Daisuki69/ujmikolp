package q7;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;

/* JADX INFO: renamed from: q7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2167a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCreatorStoreFragment f19749b;

    public /* synthetic */ ViewOnClickListenerC2167a(MayaCreatorStoreFragment mayaCreatorStoreFragment, int i) {
        this.f19748a = i;
        this.f19749b = mayaCreatorStoreFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19748a) {
            case 0:
                MayaCreatorStoreFragment mayaCreatorStoreFragment = this.f19749b;
                Callback.onClick_enter(view);
                try {
                    ((l7.b) mayaCreatorStoreFragment.Q1()).k();
                    return;
                } finally {
                }
            case 1:
                MayaCreatorStoreFragment mayaCreatorStoreFragment2 = this.f19749b;
                Callback.onClick_enter(view);
                try {
                    mayaCreatorStoreFragment2.requireActivity().finish();
                    return;
                } finally {
                }
            default:
                MayaCreatorStoreFragment mayaCreatorStoreFragment3 = this.f19749b;
                Callback.onClick_enter(view);
                try {
                    ((l7.b) mayaCreatorStoreFragment3.Q1()).k();
                    return;
                } finally {
                }
        }
    }
}
