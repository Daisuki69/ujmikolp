package S;

import B5.i;
import Sb.q;
import Y6.k;
import Y6.m;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.A0;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaInfoTextConfirmationBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaSuccessDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaUnderReviewBottomSheetFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAppMaintenanceFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaUpdaterFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebInterstitialFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementDeviceInformationFragment;
import com.paymaya.ui.common.view.dialog.impl.AlertDialogFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.common.view.dialog.impl.SuccessDialogFragment;
import com.paymaya.ui.common.view.dialog.impl.VerifiedSellerInfoDialogFragment;
import com.paymaya.ui.common.view.fragment.impl.UnsupportedWebFragment;
import com.paymaya.ui.common.view.fragment.impl.UpgradePayMayaPlusFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditConsentFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5576b;

    public /* synthetic */ b(Object obj, int i) {
        this.f5575a = i;
        this.f5576b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f5576b;
        switch (this.f5575a) {
            case 0:
                CTInAppBaseFullHtmlFragment this$0 = (CTInAppBaseFullHtmlFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$0, "this$0");
                    this$0.m1(null);
                    return;
                } finally {
                }
            case 1:
                CTInAppNativeCoverFragment this$02 = (CTInAppNativeCoverFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$02, "this$0");
                    this$02.m1(null);
                    FragmentActivity activity = this$02.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return;
                } finally {
                }
            case 2:
                CTInAppNativeCoverImageFragment this$03 = (CTInAppNativeCoverImageFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$03, "this$0");
                    this$03.m1(null);
                    FragmentActivity activity2 = this$03.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    return;
                } finally {
                }
            case 3:
                CTInAppNativeHalfInterstitialFragment this$04 = (CTInAppNativeHalfInterstitialFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$04, "this$0");
                    this$04.m1(null);
                    FragmentActivity activity3 = this$04.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                    }
                    return;
                } finally {
                }
            case 4:
                CTInAppNativeHalfInterstitialImageFragment this$05 = (CTInAppNativeHalfInterstitialImageFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$05, "this$0");
                    this$05.m1(null);
                    FragmentActivity activity4 = this$05.getActivity();
                    if (activity4 != null) {
                        activity4.finish();
                    }
                    return;
                } finally {
                }
            case 5:
                CTInAppNativeInterstitialImageFragment this$06 = (CTInAppNativeInterstitialImageFragment) obj;
                Callback.onClick_enter(view);
                try {
                    j.g(this$06, "this$0");
                    this$06.m1(null);
                    FragmentActivity activity5 = this$06.getActivity();
                    if (activity5 != null) {
                        activity5.finish();
                    }
                    return;
                } finally {
                }
            case 6:
                MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = (MayaDataPrivacyWebContentBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaDataPrivacyWebContentBottomSheetDialogFragment.s1(mayaDataPrivacyWebContentBottomSheetDialogFragment);
                    return;
                } finally {
                }
            case 7:
                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = (MayaAccountRecoveryEmailFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaAccountRecoveryEmailFragment.J1(mayaAccountRecoveryEmailFragment);
                    return;
                } finally {
                }
            case 8:
                MayaChangeMinFormFragment mayaChangeMinFormFragment = (MayaChangeMinFormFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaChangeMinFormFragment.H1(mayaChangeMinFormFragment);
                    return;
                } finally {
                }
            case 9:
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment = (MayaDeviceManagementDeviceInformationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    q qVar = mayaDeviceManagementDeviceInformationFragment.f13963d0;
                    if (qVar != null) {
                        ((MayaDeviceManagementActivity) qVar).V1("change_password", EnumC1216e.DEVICE);
                    }
                    q qVar2 = mayaDeviceManagementDeviceInformationFragment.f13963d0;
                    if (qVar2 != null) {
                        AbstractC1236z.i((MayaDeviceManagementActivity) qVar2, R.id.frame_layout_container, new MayaChangePasswordFragment(), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
                    }
                    return;
                } finally {
                }
            case 10:
                Fragment fragment = (Fragment) obj;
                int i = MayaWebActivity.f11806q;
                Callback.onClick_enter(view);
                try {
                    MayaWebInterstitialFragment mayaWebInterstitialFragment = (MayaWebInterstitialFragment) fragment;
                    C1219h c1219h = new C1219h();
                    c1219h.n(17);
                    c1219h.t(EnumC1217f.BACK);
                    c1219h.i();
                    mayaWebInterstitialFragment.A1(c1219h);
                    mayaWebInterstitialFragment.requireActivity().finish();
                    return;
                } finally {
                }
            case 11:
                m mVar = (m) obj;
                int i4 = MayaWebActivity.f11806q;
                Callback.onClick_enter(view);
                try {
                    mVar.invoke();
                    return;
                } finally {
                }
            case 12:
                T7.a aVar = (T7.a) obj;
                Callback.onClick_enter(view);
                try {
                    T7.a.b(aVar);
                    return;
                } finally {
                }
            case 13:
                MayaCreditActivationFragment mayaCreditActivationFragment = (MayaCreditActivationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaCreditActivationFragment.s1(mayaCreditActivationFragment);
                    return;
                } finally {
                }
            case 14:
                MayaCreditConsentFragment mayaCreditConsentFragment = (MayaCreditConsentFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaCreditConsentFragment.r1(mayaCreditConsentFragment);
                    return;
                } finally {
                }
            case 15:
                AlertDialogFragment alertDialogFragment = (AlertDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    alertDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 16:
                ShareSaveDialogFragment shareSaveDialogFragment = (ShareSaveDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    shareSaveDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 17:
                SuccessDialogFragment successDialogFragment = (SuccessDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    successDialogFragment.dismiss();
                    A0 a02 = successDialogFragment.f14398V;
                    if (a02 != null) {
                        ((DataPrivacyActivity) a02.f11334b).finish();
                    }
                    return;
                } finally {
                }
            case 18:
                VerifiedSellerInfoDialogFragment verifiedSellerInfoDialogFragment = (VerifiedSellerInfoDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    verifiedSellerInfoDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 19:
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = (MayaChoicesBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaChoicesBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 20:
                MayaInfoTextConfirmationBottomSheetDialogFragment mayaInfoTextConfirmationBottomSheetDialogFragment = (MayaInfoTextConfirmationBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    Function1 function1 = mayaInfoTextConfirmationBottomSheetDialogFragment.f11855S;
                    if (function1 != null) {
                        j.d(view);
                        function1.invoke(view);
                    }
                    mayaInfoTextConfirmationBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 21:
                MayaShareSaveDialogFragment mayaShareSaveDialogFragment = (MayaShareSaveDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaShareSaveDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 22:
                MayaSuccessDialogFragment mayaSuccessDialogFragment = (MayaSuccessDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaSuccessDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 23:
                MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment = (MayaUnderReviewBottomSheetFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaUnderReviewBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 24:
                UnsupportedWebFragment unsupportedWebFragment = (UnsupportedWebFragment) obj;
                Callback.onClick_enter(view);
                try {
                    Wc.b bVar = unsupportedWebFragment.f14411V;
                    if (bVar != null) {
                        ((MayaWebActivity) bVar).d2("https://play.google.com/store/apps/details?id=com.android.chrome");
                    }
                    return;
                } finally {
                }
            case 25:
                UpgradePayMayaPlusFragment upgradePayMayaPlusFragment = (UpgradePayMayaPlusFragment) obj;
                Callback.onClick_enter(view);
                try {
                    UpgradePayMayaPlusFragment.s1(upgradePayMayaPlusFragment);
                    return;
                } finally {
                }
            case 26:
                MayaAllowContactsPermissionFragment mayaAllowContactsPermissionFragment = (MayaAllowContactsPermissionFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaAllowContactsPermissionFragment.G1(mayaAllowContactsPermissionFragment);
                    return;
                } finally {
                }
            case 27:
                MayaAppMaintenanceFragment mayaAppMaintenanceFragment = (MayaAppMaintenanceFragment) obj;
                Callback.onClick_enter(view);
                try {
                    C1219h c1219h2 = new C1219h();
                    c1219h2.n(17);
                    c1219h2.t(EnumC1217f.HELP);
                    mayaAppMaintenanceFragment.A1(c1219h2);
                    Y6.c cVar = mayaAppMaintenanceFragment.f11904W;
                    if (cVar != null) {
                        MayaMaintenanceActivity mayaMaintenanceActivity = (MayaMaintenanceActivity) cVar;
                        mayaMaintenanceActivity.n1().x(mayaMaintenanceActivity, "https://support.maya.ph/s/", Boolean.FALSE, true);
                    }
                    return;
                } finally {
                }
            case 28:
                MayaPermissionFragment mayaPermissionFragment = (MayaPermissionFragment) obj;
                Callback.onClick_enter(view);
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", mayaPermissionFragment.requireActivity().getPackageName(), null);
                    j.f(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    mayaPermissionFragment.startActivity(intent);
                    return;
                } finally {
                }
            default:
                MayaUpdaterFragment mayaUpdaterFragment = (MayaUpdaterFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaUpdaterFragment.H1();
                    k kVar = mayaUpdaterFragment.f11946Y;
                    if (kVar != null) {
                        MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) kVar;
                        Uri uri = Uri.parse("market://details?id=" + mayaUpdaterActivity.getPackageName());
                        mayaUpdaterActivity.n1();
                        i.f(mayaUpdaterActivity, uri.toString());
                    }
                    return;
                } finally {
                }
        }
    }
}
