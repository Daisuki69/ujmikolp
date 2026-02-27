package L9;

import N5.C0453g;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.widget.ScrollableWebView;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.activity.impl.MayaPermissionActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaPermissionFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditTransactionListActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaLicensesBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import o1.AbstractC1955a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: L9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0327e extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2885d;

    public /* synthetic */ C0327e(int i) {
        this.f2885d = i;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        String stringExtra;
        switch (this.f2885d) {
            case 0:
                super.j();
                MayaCreditTransactionListActivity mayaCreditTransactionListActivity = (MayaCreditTransactionListActivity) ((M9.c) this.c.get());
                mayaCreditTransactionListActivity.getClass();
                com.paymaya.common.utility.E.a("MayaCreditTransactionListActivity", "showAllActivities");
                AbstractC1236z.g(mayaCreditTransactionListActivity, R.id.frame_layout_container, new MayaCreditTransactionListFragment());
                return;
            case 1:
                super.j();
                P9.e eVar = (P9.e) this.c.get();
                String str = ((MayaCreditWebContentBottomSheetDialogFragment) ((P9.e) this.c.get())).f13131W;
                if (str == null) {
                    kotlin.jvm.internal.j.n("mContentTitle");
                    throw null;
                }
                MayaCreditWebContentBottomSheetDialogFragment mayaCreditWebContentBottomSheetDialogFragment = (MayaCreditWebContentBottomSheetDialogFragment) eVar;
                mayaCreditWebContentBottomSheetDialogFragment.getClass();
                TextView textView = mayaCreditWebContentBottomSheetDialogFragment.f13128T;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTitleTextView");
                    throw null;
                }
                textView.setText(str);
                P9.e eVar2 = (P9.e) this.c.get();
                String str2 = ((MayaCreditWebContentBottomSheetDialogFragment) ((P9.e) this.c.get())).f13132X;
                if (str2 == null) {
                    kotlin.jvm.internal.j.n("mWebViewContent");
                    throw null;
                }
                MayaCreditWebContentBottomSheetDialogFragment mayaCreditWebContentBottomSheetDialogFragment2 = (MayaCreditWebContentBottomSheetDialogFragment) eVar2;
                mayaCreditWebContentBottomSheetDialogFragment2.getClass();
                String string = mayaCreditWebContentBottomSheetDialogFragment2.getString(R.string.maya_label_maya_credit_html_wrapper, "file:///android_res/font/font_cerebri_sans_pro_book.otf", str2);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                ScrollableWebView scrollableWebView = mayaCreditWebContentBottomSheetDialogFragment2.f13129U;
                if (scrollableWebView != null) {
                    scrollableWebView.loadDataWithBaseURL(null, string, "text/html", "utf-8", null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContentScrollableWebView");
                    throw null;
                }
            case 8:
                super.j();
                MayaDeviceManagementActivity mayaDeviceManagementActivity = (MayaDeviceManagementActivity) ((Mb.b) this.c.get());
                mayaDeviceManagementActivity.getClass();
                AbstractC1236z.g(mayaDeviceManagementActivity, R.id.frame_layout_container, new MayaDeviceManagementMainFragment());
                return;
            case 11:
                super.j();
                C0453g c0453g = ((MayaLicensesBottomSheetDialogFragment) ((Pb.b) this.c.get())).f13863S;
                kotlin.jvm.internal.j.d(c0453g);
                ((ScrollableWebView) c0453g.e).loadUrl("file:///android_asset/maya_licenses.html");
                return;
            case 13:
                super.j();
                R7.d dVar = (R7.d) this.c.get();
                String str3 = ((MayaDataPrivacyWebContentBottomSheetDialogFragment) ((R7.d) this.c.get())).f12307W;
                if (str3 == null) {
                    kotlin.jvm.internal.j.n("mContentTitle");
                    throw null;
                }
                MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = (MayaDataPrivacyWebContentBottomSheetDialogFragment) dVar;
                mayaDataPrivacyWebContentBottomSheetDialogFragment.getClass();
                TextView textView2 = mayaDataPrivacyWebContentBottomSheetDialogFragment.f12304T;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTitleTextView");
                    throw null;
                }
                textView2.setText(str3);
                Bundle arguments = ((MayaDataPrivacyWebContentBottomSheetDialogFragment) ((R7.d) this.c.get())).getArguments();
                if (arguments != null ? arguments.containsKey("web_content_url") : false) {
                    R7.d dVar2 = (R7.d) this.c.get();
                    String str4 = ((MayaDataPrivacyWebContentBottomSheetDialogFragment) ((R7.d) this.c.get())).f12308X;
                    if (str4 == null) {
                        kotlin.jvm.internal.j.n("mContentUrl");
                        throw null;
                    }
                    MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment2 = (MayaDataPrivacyWebContentBottomSheetDialogFragment) dVar2;
                    mayaDataPrivacyWebContentBottomSheetDialogFragment2.getClass();
                    ScrollableWebView scrollableWebView2 = mayaDataPrivacyWebContentBottomSheetDialogFragment2.f12305U;
                    if (scrollableWebView2 != null) {
                        scrollableWebView2.loadUrl(str4);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mContentScrollableWebView");
                        throw null;
                    }
                }
                R7.d dVar3 = (R7.d) this.c.get();
                String str5 = ((MayaDataPrivacyWebContentBottomSheetDialogFragment) ((R7.d) this.c.get())).f12309Y;
                if (str5 == null) {
                    kotlin.jvm.internal.j.n("mWebViewContent");
                    throw null;
                }
                MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment3 = (MayaDataPrivacyWebContentBottomSheetDialogFragment) dVar3;
                mayaDataPrivacyWebContentBottomSheetDialogFragment3.getClass();
                String string2 = mayaDataPrivacyWebContentBottomSheetDialogFragment3.getString(R.string.maya_label_maya_credit_agreement_html_wrapper, "file:///android_res/font/work_sans_medium.ttf", str5);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                ScrollableWebView scrollableWebView3 = mayaDataPrivacyWebContentBottomSheetDialogFragment3.f12305U;
                if (scrollableWebView3 == null) {
                    kotlin.jvm.internal.j.n("mContentScrollableWebView");
                    throw null;
                }
                scrollableWebView3.setBackgroundColor(ContextCompat.getColor(mayaDataPrivacyWebContentBottomSheetDialogFragment3.requireContext(), R.color.maya_shades_of_grey_2));
                ScrollableWebView scrollableWebView4 = mayaDataPrivacyWebContentBottomSheetDialogFragment3.f12305U;
                if (scrollableWebView4 != null) {
                    scrollableWebView4.loadDataWithBaseURL(null, string2, "text/html", "utf-8", null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContentScrollableWebView");
                    throw null;
                }
            case 27:
                super.j();
                S6.d dVar4 = (S6.d) this.c.get();
                Intent intent = ((MayaPermissionActivity) ((S6.d) this.c.get())).getIntent();
                if (intent == null || (stringExtra = intent.getStringExtra("title")) == null) {
                    stringExtra = "";
                }
                MayaPermissionActivity mayaPermissionActivity = (MayaPermissionActivity) dVar4;
                mayaPermissionActivity.getClass();
                mayaPermissionActivity.K1(stringExtra);
                mayaPermissionActivity.r1();
                mayaPermissionActivity.s1();
                mayaPermissionActivity.T1();
                MayaPermissionActivity mayaPermissionActivity2 = (MayaPermissionActivity) ((S6.d) this.c.get());
                mayaPermissionActivity2.getClass();
                AbstractC1236z.g(mayaPermissionActivity2, R.id.frame_layout_fragment_container, new MayaPermissionFragment());
                return;
            case 28:
                super.j();
                m();
                n();
                return;
            default:
                super.j();
                return;
        }
    }

    public void k() {
        if (AbstractC1955a.u(((MayaAllowContactsPermissionFragment) ((X6.a) this.c.get())).getContext(), "android.permission.READ_CONTACTS")) {
            Y6.a aVar = ((MayaAllowContactsPermissionFragment) ((X6.a) this.c.get())).f11899W;
            if (aVar != null) {
                aVar.k();
            }
            Y6.a aVar2 = ((MayaAllowContactsPermissionFragment) ((X6.a) this.c.get())).f11899W;
            if (aVar2 != null) {
                aVar2.g();
            }
        }
    }

    public void l(PayMayaErrorAction payMayaErrorAction) {
        String strMUrl = payMayaErrorAction != null ? payMayaErrorAction.mUrl() : null;
        if (strMUrl != null) {
            if (com.paymaya.common.utility.C.Y(strMUrl)) {
                MayaErrorDialogFragment mayaErrorDialogFragment = (MayaErrorDialogFragment) ((V6.c) this.c.get());
                mayaErrorDialogFragment.getClass();
                FragmentActivity activity = mayaErrorDialogFragment.getActivity();
                if (activity != null) {
                    mayaErrorDialogFragment.q1();
                    B5.i.k(activity, strMUrl);
                    return;
                }
                return;
            }
            if (!kotlin.jvm.internal.j.b(payMayaErrorAction.isExternal(), Boolean.TRUE)) {
                V6.c cVar = (V6.c) this.c.get();
                String strNormalizeUrl = payMayaErrorAction.normalizeUrl();
                kotlin.jvm.internal.j.f(strNormalizeUrl, "normalizeUrl(...)");
                MayaErrorDialogFragment mayaErrorDialogFragment2 = (MayaErrorDialogFragment) cVar;
                mayaErrorDialogFragment2.getClass();
                FragmentActivity activity2 = mayaErrorDialogFragment2.getActivity();
                if (activity2 != null) {
                    mayaErrorDialogFragment2.q1().l0(activity2, strNormalizeUrl);
                    return;
                }
                return;
            }
            V6.c cVar2 = (V6.c) this.c.get();
            String strNormalizeUrl2 = payMayaErrorAction.normalizeUrl();
            kotlin.jvm.internal.j.f(strNormalizeUrl2, "normalizeUrl(...)");
            MayaErrorDialogFragment mayaErrorDialogFragment3 = (MayaErrorDialogFragment) cVar2;
            mayaErrorDialogFragment3.getClass();
            FragmentActivity activity3 = mayaErrorDialogFragment3.getActivity();
            if (activity3 != null) {
                mayaErrorDialogFragment3.q1();
                B5.i.f(activity3, strNormalizeUrl2);
            }
            mayaErrorDialogFragment3.dismiss();
        }
    }

    public void m() {
        if (!((MayaPermissionFragment) ((X6.e) this.c.get())).G1() || PermissionChecker.checkSelfPermission(((MayaPermissionFragment) ((X6.e) this.c.get())).requireContext(), "android.permission.CAMERA") == 0) {
            Group group = ((MayaPermissionFragment) ((X6.e) this.c.get())).f11921V;
            if (group != null) {
                group.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mGroupCameraPermission");
                throw null;
            }
        }
        Group group2 = ((MayaPermissionFragment) ((X6.e) this.c.get())).f11921V;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mGroupCameraPermission");
            throw null;
        }
    }

    public void n() {
        ((X6.e) this.c.get()).getClass();
        Group group = ((MayaPermissionFragment) ((X6.e) this.c.get())).f11922W;
        if (group != null) {
            group.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mGroupStoragePermission");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0327e(Uh.d dVar, int i) {
        super(dVar);
        this.f2885d = i;
    }
}
