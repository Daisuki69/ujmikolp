package Bd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.common.view.fragment.impl.ServiceUnavailableFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDBankInformationFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIncomeSourceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmittedFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInput;
import com.paymaya.ui.qr.view.dialog.impl.MeralcoBillDialogFragment;
import com.paymaya.ui.qr.view.dialog.impl.RequestMoneyInstructionDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFragment;
import com.paymaya.ui.support.view.fragment.impl.SupportFragment;
import com.paymaya.ui.travel.view.fragment.impl.ImageViewerFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f424b;

    public /* synthetic */ e(Object obj, int i) {
        this.f423a = i;
        this.f424b = obj;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f423a) {
            case 0:
                ((EDDInput) this.f424b).onRemove();
                break;
            case 1:
                ((SupportFragment) this.f424b).onMessageSupportClick();
                break;
            case 2:
                ((ImageViewerFragment) this.f424b).onClickBackIcon();
                break;
            case 3:
                ((ServiceUnavailableFragment) this.f424b).onShopNowClicked();
                break;
            case 4:
                ((MeralcoBillDialogFragment) this.f424b).onDismissClick();
                break;
            case 5:
                ((RequestMoneyInstructionDialogFragment) this.f424b).onCloseClick();
                break;
            case 6:
                ((RequestMoneyFragment) this.f424b).onContinueClicked();
                break;
            case 7:
                ((UserActivityFragment) this.f424b).onMessageClicked();
                break;
            case 8:
                ((EDDApplicationStatusFragment) this.f424b).onViewSubmittedDetailsClick();
                break;
            case 9:
                ((EDDBankInformationFragment) this.f424b).onAddIncomeSourceClicked();
                break;
            case 10:
                ((EDDFinancialDocumentsFragment) this.f424b).onAddCompanyClick();
                break;
            case 11:
                ((EDDIncomeSourceFragment) this.f424b).onAddIncomeSourceClicked();
                break;
            case 12:
                ((EDDIntroFragment) this.f424b).onProceedClick();
                break;
            case 13:
                ((EDDRelatedCompaniesFragment) this.f424b).onAddCompanyClick();
                break;
            case 14:
                ((EDDSubmissionReviewFragment) this.f424b).onNextClicked();
                break;
            default:
                ((EDDSubmittedFragment) this.f424b).onBackToHome();
                break;
        }
    }
}
