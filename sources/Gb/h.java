package Gb;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.tencent.could.huiyansdk.overseas.fragment.GuideFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1948a;

    public /* synthetic */ h(int i) {
        this.f1948a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1948a) {
            case 0:
                Callback.onClick_enter(view);
                try {
                    return;
                } finally {
                }
            case 1:
                Callback.onClick_enter(view);
                try {
                    return;
                } finally {
                }
            case 2:
                Callback.onClick_enter(view);
                try {
                    return;
                } finally {
                }
            default:
                GuideFragment.m192xd0e31f79(view);
                return;
        }
    }
}
