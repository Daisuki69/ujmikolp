package Wc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C;
import com.paymaya.ui.common.view.fragment.impl.WebFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebFragment f6338b;

    public /* synthetic */ d(WebFragment webFragment, int i) {
        this.f6337a = i;
        this.f6338b = webFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6337a) {
            case 0:
                WebFragment webFragment = this.f6338b;
                Callback.onClick_enter(view);
                try {
                    webFragment.w1();
                    webFragment.A1().n(webFragment.f14427h0, webFragment.f14428i0, C.W(webFragment.getActivity()), webFragment.f14431l0);
                    return;
                } finally {
                }
            default:
                WebFragment webFragment2 = this.f6338b;
                Callback.onClick_enter(view);
                try {
                    webFragment2.w1();
                    webFragment2.A1().n(webFragment2.f14427h0, webFragment2.f14428i0, C.W(webFragment2.getActivity()), webFragment2.f14431l0);
                    return;
                } finally {
                }
        }
    }
}
