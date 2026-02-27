package Hd;

import D8.C0214w;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvestPreviewFragment f2163b;

    public /* synthetic */ a(InvestPreviewFragment investPreviewFragment, int i) {
        this.f2162a = i;
        this.f2163b = investPreviewFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2162a) {
            case 0:
                InvestPreviewFragment investPreviewFragment = this.f2163b;
                Callback.onClick_enter(view);
                try {
                    C0214w c0214w = investPreviewFragment.f14617e0;
                    if (c0214w == null) {
                        j.n("mInvestPreviewFragmentPresenter");
                        throw null;
                    }
                    ((InvestPreviewFragment) ((Gd.a) c0214w.c.get())).w1();
                    c0214w.n();
                    c0214w.m();
                    return;
                } finally {
                }
            case 1:
                InvestPreviewFragment investPreviewFragment2 = this.f2163b;
                Callback.onClick_enter(view);
                try {
                    InvestPreviewFragment.B1(investPreviewFragment2);
                    return;
                } finally {
                }
            case 2:
                InvestPreviewFragment investPreviewFragment3 = this.f2163b;
                Callback.onClick_enter(view);
                try {
                    InvestPreviewFragment.C1(investPreviewFragment3);
                    return;
                } finally {
                }
            default:
                InvestPreviewFragment investPreviewFragment4 = this.f2163b;
                Callback.onClick_enter(view);
                try {
                    C0214w c0214w2 = investPreviewFragment4.f14617e0;
                    if (c0214w2 == null) {
                        j.n("mInvestPreviewFragmentPresenter");
                        throw null;
                    }
                    ((InvestPreviewFragment) ((Gd.a) c0214w2.c.get())).w1();
                    c0214w2.n();
                    c0214w2.m();
                    return;
                } finally {
                }
        }
    }
}
