package zd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;

/* JADX INFO: renamed from: zd.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2561e extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDAccountUsageFragment f21378b;

    public /* synthetic */ C2561e(EDDAccountUsageFragment eDDAccountUsageFragment, int i) {
        this.f21377a = i;
        this.f21378b = eDDAccountUsageFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f21377a) {
            case 0:
                this.f21378b.onPrimaryUseClicked();
                break;
            default:
                this.f21378b.onNextClicked();
                break;
        }
    }
}
