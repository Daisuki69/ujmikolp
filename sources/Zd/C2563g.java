package zd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationDetailsFragment;

/* JADX INFO: renamed from: zd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2563g extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDApplicationDetailsFragment f21380b;

    public /* synthetic */ C2563g(EDDApplicationDetailsFragment eDDApplicationDetailsFragment, int i) {
        this.f21379a = i;
        this.f21380b = eDDApplicationDetailsFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f21379a) {
            case 0:
                this.f21380b.onFirstIdClicked();
                break;
            case 1:
                this.f21380b.onFirstIdBackClicked();
                break;
            case 2:
                this.f21380b.onSecondIdClicked();
                break;
            case 3:
                this.f21380b.onSecondIdBackClicked();
                break;
            case 4:
                this.f21380b.onViewBirthCertificate();
                break;
            case 5:
                this.f21380b.onViewParentId();
                break;
            case 6:
                this.f21380b.onViewParentalConsent();
                break;
            case 7:
                this.f21380b.onAccountUpgradeDetailsArrowClick();
                break;
            default:
                this.f21380b.onApplicationDetailsArrowClick();
                break;
        }
    }
}
