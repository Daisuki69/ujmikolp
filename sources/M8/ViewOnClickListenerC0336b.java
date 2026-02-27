package M8;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: M8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0336b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H8.b f3270b;

    public /* synthetic */ ViewOnClickListenerC0336b(int i, H8.b bVar) {
        this.f3269a = i;
        this.f3270b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        H8.b bVar = this.f3270b;
        switch (this.f3269a) {
            case 0:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).finish();
                    return;
                } finally {
                }
            case 1:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).finish();
                    ((MayaKycActivity) bVar).g2();
                    return;
                } finally {
                }
            case 2:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).finish();
                    ((MayaKycActivity) bVar).g2();
                    return;
                } finally {
                }
            case 3:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).i2(true);
                    return;
                } finally {
                }
            case 4:
                KProperty[] kPropertyArr = MayaKycLivenessCaptureFragment.f12558d0;
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).i2(true);
                    return;
                } finally {
                }
            case 5:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).finish();
                    return;
                } finally {
                }
            case 6:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).i2(true);
                    return;
                } finally {
                }
            default:
                Callback.onClick_enter(view);
                try {
                    ((MayaKycActivity) bVar).i2(true);
                    ((MayaKycActivity) bVar).g2();
                    return;
                } finally {
                }
        }
    }
}
