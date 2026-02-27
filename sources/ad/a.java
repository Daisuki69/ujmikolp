package Ad;

import D8.C0217z;
import G6.p;
import H8.b;
import I7.h;
import I7.i;
import I7.k;
import M6.d;
import M6.g;
import N5.C0466m;
import Q6.n;
import Q9.G;
import Sb.s;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.common.widget.MayaRadioGroupView;
import com.paymaya.common.widget.MayaRadioOptionView;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.model.Recommendation;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaUnderReviewBottomSheetFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaUpdaterFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditTransactionListActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import com.paymaya.ui.ekyc.view.viewholder.impl.EDDSearchViewHolder;
import com.paymaya.ui.ekyc.view.widget.FinancialDocumentPhoto;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f259a = i;
        this.f260b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [Bd.i, com.paymaya.common.base.BaseFragment] */
    /* JADX WARN: Type inference failed for: r11v31, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
    /* JADX WARN: Type inference failed for: r11v5, types: [Bd.i, com.paymaya.common.base.BaseFragment] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        String strMName;
        int i = 0;
        String strTnTj78 = numX49.tnTj78("buRP");
        String strTnTj782 = numX49.tnTj78("buRb");
        String strTnTj783 = numX49.tnTj78("buR2");
        Object obj = this.c;
        Object obj2 = this.f260b;
        switch (this.f259a) {
            case 0:
                EDDSearchViewHolder eDDSearchViewHolder = (EDDSearchViewHolder) obj2;
                String str = (String) obj;
                int i4 = EDDSearchViewHolder.c;
                Callback.onClick_enter(view);
                try {
                    EDDSearchViewHolder.D(eDDSearchViewHolder, str);
                    return;
                } finally {
                }
            case 1:
                FinancialDocumentPhoto financialDocumentPhoto = (FinancialDocumentPhoto) obj2;
                File file = (File) obj;
                int i6 = FinancialDocumentPhoto.e;
                Callback.onClick_enter(view);
                try {
                    ?? r11 = financialDocumentPhoto.f14611d;
                    if (r11 != 0) {
                        r11.h(file, null);
                    }
                    return;
                } finally {
                }
            case 2:
                FinancialDocumentPhoto financialDocumentPhoto2 = (FinancialDocumentPhoto) obj2;
                String str2 = (String) obj;
                int i10 = FinancialDocumentPhoto.e;
                Callback.onClick_enter(view);
                try {
                    ?? r112 = financialDocumentPhoto2.f14611d;
                    if (r112 != 0) {
                        r112.h(null, str2);
                    }
                    return;
                } finally {
                }
            case 3:
                MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) obj2;
                Aa.a aVar = (Aa.a) obj;
                Callback.onClick_enter(view);
                try {
                    C1219h c1219h = new C1219h();
                    c1219h.n(17);
                    c1219h.t(EnumC1217f.RETURN);
                    c1219h.i();
                    mayaPushApprovalListFragment.A1(c1219h);
                    ((MayaPushApprovalActivity) aVar).finish();
                    return;
                } finally {
                }
            case 4:
                ItemSlideLayoutView itemSlideLayoutView = (ItemSlideLayoutView) obj2;
                int i11 = ItemSlideLayoutView.f11272r;
                Callback.onClick_enter(view);
                try {
                    if (itemSlideLayoutView.f11278o && itemSlideLayoutView.f11275k == 0 && (onClickListener = (View.OnClickListener) obj) != null) {
                        onClickListener.onClick(view);
                    }
                    return;
                } finally {
                }
            case 5:
                MayaRadioGroupView mayaRadioGroupView = (MayaRadioGroupView) obj2;
                MayaRadioOptionView mayaRadioOptionView = (MayaRadioOptionView) obj;
                int i12 = MayaRadioGroupView.c;
                Callback.onClick_enter(view);
                try {
                    if (!j.b(mayaRadioGroupView.f11282a, mayaRadioOptionView)) {
                        MayaRadioOptionView mayaRadioOptionView2 = mayaRadioGroupView.f11282a;
                        if (mayaRadioOptionView2 != null) {
                            mayaRadioOptionView2.setChecked(false);
                        }
                        mayaRadioOptionView.setChecked(true);
                        mayaRadioGroupView.f11282a = mayaRadioOptionView;
                        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = mayaRadioGroupView.f11283b;
                        if (onCheckedChangeListener != null) {
                            onCheckedChangeListener.onCheckedChanged(mayaRadioGroupView, mayaRadioOptionView.getId());
                        }
                    }
                    return;
                } finally {
                }
            case 6:
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) obj2;
                Recommendation recommendation = (Recommendation) obj;
                Callback.onClick_enter(view);
                try {
                    MayaWalletFragment.Z1(mayaWalletFragment, recommendation);
                    return;
                } finally {
                }
            case 7:
                Ga.a aVar2 = (Ga.a) obj2;
                PushApprovalPendingRequest pushApprovalPendingRequest = (PushApprovalPendingRequest) obj;
                Callback.onClick_enter(view);
                try {
                    Ga.a.D(aVar2, pushApprovalPendingRequest);
                    return;
                } finally {
                }
            case 8:
                InvestPreviewFragment investPreviewFragment = (InvestPreviewFragment) obj2;
                OnlinePayment onlinePayment = (OnlinePayment) obj;
                Callback.onClick_enter(view);
                try {
                    InvestPreviewFragment.A1(investPreviewFragment, onlinePayment);
                    return;
                } finally {
                }
            case 9:
                h hVar = (h) obj2;
                UserActivity userActivity = (UserActivity) obj;
                Callback.onClick_enter(view);
                try {
                    hVar.f2238a.e(userActivity);
                    return;
                } finally {
                }
            case 10:
                i iVar = (i) obj2;
                UserActivity userActivity2 = (UserActivity) obj;
                Callback.onClick_enter(view);
                try {
                    iVar.f2244a.e(userActivity2);
                    return;
                } finally {
                }
            case 11:
                I7.j jVar = (I7.j) obj2;
                UserActivity userActivity3 = (UserActivity) obj;
                Callback.onClick_enter(view);
                try {
                    jVar.f2250a.e(userActivity3);
                    return;
                } finally {
                }
            case 12:
                k kVar = (k) obj2;
                UserActivity userActivity4 = (UserActivity) obj;
                Callback.onClick_enter(view);
                try {
                    kVar.f2254a.e(userActivity4);
                    return;
                } finally {
                }
            case 13:
                G6.k kVar2 = (G6.k) obj2;
                Double d10 = (Double) obj;
                Callback.onClick_enter(view);
                try {
                    G6.k.k(kVar2, d10);
                    return;
                } finally {
                }
            case 14:
                d dVar = (d) obj2;
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) obj;
                Callback.onClick_enter(view);
                try {
                    d.F(dVar, bankPullPaymentOption);
                    return;
                } finally {
                }
            case 15:
                g gVar = (g) obj2;
                LoadUpPartner loadUpPartner = (LoadUpPartner) obj;
                Callback.onClick_enter(view);
                try {
                    MayaCashInFragment mayaCashInFragment = gVar.f3106a;
                    mayaCashInFragment.getClass();
                    p pVarP1 = mayaCashInFragment.P1();
                    if (((com.paymaya.data.preference.a) pVarP1.e).e().isAppEventsV2CashInEnabled() && (strMName = loadUpPartner.mName()) != null) {
                        pVarP1.p(strMName);
                    }
                    mayaCashInFragment.P1().k(loadUpPartner);
                    return;
                } finally {
                }
            case 16:
                M6.k kVar3 = (M6.k) obj2;
                List list = (List) obj;
                Callback.onClick_enter(view);
                try {
                    kVar3.f3117a.B(((BankPullPaymentOption) C1110A.A(list)).getName(), list);
                    return;
                } finally {
                }
            case 17:
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) obj2;
                b bVar = (b) obj;
                Callback.onClick_enter(view);
                try {
                    File cacheDir = mayaKycAdditionalDocumentsFragment.requireContext().getCacheDir();
                    j.f(cacheDir, strTnTj78);
                    com.paymaya.mayaui.kyczoloz.utils.d.c(cacheDir);
                    ((MayaKycActivity) bVar).i2(true);
                    return;
                } finally {
                }
            case 18:
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) obj2;
                C0466m c0466m = (C0466m) obj;
                Callback.onClick_enter(view);
                try {
                    mayaKycDosriFragment.Q1(((TextView) c0466m.i).getText().toString(), "");
                    ConstraintLayout constraintLayout = (ConstraintLayout) c0466m.f4150b;
                    j.f(constraintLayout, "getRoot(...)");
                    mayaKycDosriFragment.L1().removeView(constraintLayout);
                    TextView textViewN1 = mayaKycDosriFragment.N1();
                    if (mayaKycDosriFragment.L1().getChildCount() >= ((Number) mayaKycDosriFragment.f12524b0.getValue()).intValue()) {
                        i = 8;
                    }
                    textViewN1.setVisibility(i);
                    ((C0217z) mayaKycDosriFragment.M1()).p();
                    return;
                } finally {
                }
            case 19:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) obj2;
                b bVar2 = (b) obj;
                Callback.onClick_enter(view);
                try {
                    File cacheDir2 = mayaKycUploadPhilsysIdFragment.requireContext().getCacheDir();
                    j.f(cacheDir2, strTnTj78);
                    E8.k.d(cacheDir2, mayaKycUploadPhilsysIdFragment.N1());
                    MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar2;
                    mayaKycActivity.f12455w = null;
                    mayaKycActivity.f12456x = null;
                    mayaKycActivity.f12457y = null;
                    mayaKycActivity.i2(true);
                    mayaKycActivity.g2();
                    return;
                } finally {
                }
            case 20:
                MayaErrorDialogFragment mayaErrorDialogFragment = (MayaErrorDialogFragment) obj2;
                NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) obj;
                int i13 = NewMayaCreditActivity.f13081x;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditActivity.e2(mayaErrorDialogFragment, newMayaCreditActivity);
                    return;
                } finally {
                }
            case 21:
                AlertDialog alertDialog = (AlertDialog) obj2;
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) obj;
                Callback.onClick_enter(view);
                try {
                    alertDialog.dismiss();
                    Intent intent = new Intent(strTnTj783);
                    intent.setData(Uri.fromParts(strTnTj782, mayaMLKitQRScannerFragment.requireContext().getPackageName(), null));
                    mayaMLKitQRScannerFragment.startActivityForResult(intent, 2);
                    return;
                } finally {
                }
            case 22:
                AlertDialog alertDialog2 = (AlertDialog) obj2;
                MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) obj;
                Callback.onClick_enter(view);
                try {
                    alertDialog2.dismiss();
                    Intent intent2 = new Intent(strTnTj783);
                    intent2.setData(Uri.fromParts(strTnTj782, mayaQRScannerFragment.requireContext().getPackageName(), null));
                    mayaQRScannerFragment.startActivityForResult(intent2, 2);
                    return;
                } finally {
                }
            case 23:
                NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) obj2;
                String accountId = (String) obj;
                Callback.onClick_enter(view);
                try {
                    G g8 = newMayaCreditFragment.D1;
                    if (g8 != null) {
                        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                        j.g(accountId, "accountId");
                        mayaDashboardActivity.n1();
                        Intent intent3 = new Intent(mayaDashboardActivity, (Class<?>) MayaCreditTransactionListActivity.class);
                        intent3.putExtra("account_id", accountId);
                        mayaDashboardActivity.startActivity(intent3);
                    }
                    return;
                } finally {
                }
            case 24:
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment = (MayaDeviceManagementMainFragment) obj2;
                DeviceInformation deviceInformation = (DeviceInformation) obj;
                Callback.onClick_enter(view);
                try {
                    mayaDeviceManagementMainFragment.Q1(1, deviceInformation);
                    s sVar = mayaDeviceManagementMainFragment.f13975z0;
                    if (sVar != null) {
                        ((MayaDeviceManagementActivity) sVar).Y1(deviceInformation);
                    }
                    return;
                } finally {
                }
            case 25:
                MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment = (MayaUnderReviewBottomSheetFragment) obj2;
                View view2 = (View) obj;
                Callback.onClick_enter(view);
                try {
                    Function1 function1 = mayaUnderReviewBottomSheetFragment.f11896S;
                    if (function1 != null) {
                        function1.invoke(view2);
                    }
                    mayaUnderReviewBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 26:
                MayaUpdaterFragment mayaUpdaterFragment = (MayaUpdaterFragment) obj2;
                String str3 = (String) obj;
                Callback.onClick_enter(view);
                try {
                    mayaUpdaterFragment.H1();
                    Y6.k kVar4 = mayaUpdaterFragment.f11946Y;
                    if (kVar4 != null) {
                        MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) kVar4;
                        Uri uri = Uri.parse(str3);
                        mayaUpdaterActivity.n1();
                        B5.i.f(mayaUpdaterActivity, uri.toString());
                    }
                    return;
                } finally {
                }
            case 27:
                Z.k kVar5 = (Z.k) obj2;
                Ag.k kVar6 = (Ag.k) obj;
                Callback.onClick_enter(view);
                try {
                    Z.k.K(kVar5.f6835l, kVar5.f6830a, ((Float) kVar6.invoke()).floatValue());
                    return;
                } finally {
                }
            case 28:
                Z6.a aVar3 = (Z6.a) obj2;
                String text = (String) obj;
                Callback.onClick_enter(view);
                try {
                    n nVar = aVar3.f6891a;
                    nVar.getClass();
                    j.g(text, "text");
                    ((MayaChoicesBottomSheetDialogFragment) nVar.f5284b).getClass();
                    return;
                } finally {
                }
            default:
                Z6.b bVar3 = (Z6.b) obj2;
                MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) obj;
                Callback.onClick_enter(view);
                try {
                    n nVar2 = bVar3.f6893a;
                    nVar2.getClass();
                    MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = (MayaChoicesBottomSheetDialogFragment) nVar2.f5284b;
                    Bundle bundle = new Bundle();
                    String str4 = "model_values";
                    bundle.putParcelable("model_values", mayaChoicesAdapterItem);
                    FragmentManager parentFragmentManager = mayaChoicesBottomSheetDialogFragment.getParentFragmentManager();
                    String str5 = mayaChoicesBottomSheetDialogFragment.f11830V;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    parentFragmentManager.setFragmentResult(str4, bundle);
                    mayaChoicesBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(RecyclerView.ViewHolder viewHolder, Object obj, int i, int i4) {
        this.f259a = i4;
        this.f260b = viewHolder;
        this.c = obj;
    }
}
