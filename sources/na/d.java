package Na;

import G5.t;
import L9.I;
import N5.k1;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentResultListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import com.paymaya.mayaui.pay.view.impl.MayaPayActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.settings.view.fragment.MayaFlutterAdsInternalOnlyFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import dOYHB6.tiZVw8.numX49;
import db.InterfaceC1348a;
import java.util.Locale;
import pg.s;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements OnFailureListener, SplashScreen.KeepOnScreenCondition, OnSuccessListener, SwipeRefreshLayout.OnRefreshListener, FragmentResultListener, Ch.a, s, NestedScrollView.OnScrollChangeListener, t, ActivityResultCallback, OnCompleteListener, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4358b;

    public /* synthetic */ d(Object obj, int i) {
        this.f4357a = i;
        this.f4358b = obj;
    }

    @Override // G5.t
    public void m(String str, View view) {
        switch (this.f4357a) {
            case 16:
                EnumC1217f enumC1217f = EnumC1217f.UPDATE_NOW;
                BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) this.f4358b;
                baseMayaSettingsFragment.J1(enumC1217f);
                baseMayaSettingsFragment.O1();
                break;
            default:
                MayaErrorDialogFragment mayaErrorDialogFragment = (MayaErrorDialogFragment) this.f4358b;
                W6.f fVar = mayaErrorDialogFragment.f11849b0;
                if (fVar != null) {
                    fVar.E(str, mayaErrorDialogFragment.getDialog());
                }
                break;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        Object obj2 = this.f4358b;
        ActivityResult activityResult = (ActivityResult) obj;
        switch (this.f4357a) {
            case 20:
                int i = MayaAnimatedFullScreenActivity.f11784o;
                kotlin.jvm.internal.j.g(activityResult, numX49.tnTj78("bdVQ"));
                MayaAnimatedFullScreenActivity mayaAnimatedFullScreenActivity = (MayaAnimatedFullScreenActivity) obj2;
                mayaAnimatedFullScreenActivity.setResult(activityResult.getResultCode(), activityResult.getData());
                mayaAnimatedFullScreenActivity.finish();
                break;
            default:
                int i4 = MayaPayActivity.f13326w;
                kotlin.jvm.internal.j.g(activityResult, numX49.tnTj78("bdVO"));
                ((MayaPayActivity) obj2).f13329r.invoke(activityResult);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = PayMayaApplication.f10200l;
        PayMayaApplication payMayaApplication = (PayMayaApplication) this.f4358b;
        if (!task.isSuccessful() || C.e((String) task.getResult())) {
            task.getException();
            yk.a.d();
        } else {
            androidx.media3.datasource.cache.c.u(payMayaApplication.f10202b.f11330b, numX49.tnTj78("bdVt"), (String) task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f4357a) {
            case 0:
                yk.a.c();
                ((Ja.b) ((MayaMLKitQRScannerFragment) this.f4358b).H1()).l();
                break;
            default:
                kotlin.jvm.internal.j.g(exc, numX49.tnTj78("bdVU"));
                ((Hh.b) this.f4358b).onError(exc);
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bdVe"));
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bdV8"));
        I iG1 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) this.f4358b).G1();
        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle.getParcelable(numX49.tnTj78("bdVC"));
        if (mayaChoicesAdapterItem != null) {
            String itemAsString = mayaChoicesAdapterItem.getItemAsString();
            kotlin.jvm.internal.j.g(itemAsString, numX49.tnTj78("bdV4"));
            String lowerCase = itemAsString.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, numX49.tnTj78("bdVo"));
            if (lowerCase.equals(numX49.tnTj78("bdVK")) || lowerCase.equals(numX49.tnTj78("bdVw"))) {
                iG1.u(itemAsString);
            } else {
                iG1.v(itemAsString);
            }
        }
    }

    @Override // pg.s
    public void onMethodCall(pg.r rVar, pg.t tVar) {
        String strTnTj78 = numX49.tnTj78("bdVc");
        String strTnTj782 = numX49.tnTj78("bdVm");
        Object obj = this.f4358b;
        switch (this.f4357a) {
            case 12:
                kotlin.jvm.internal.j.g(rVar, strTnTj782);
                kotlin.jvm.internal.j.g(tVar, strTnTj78);
                MayaFlutterAdsInternalOnlyFragment mayaFlutterAdsInternalOnlyFragment = (MayaFlutterAdsInternalOnlyFragment) obj;
                mayaFlutterAdsInternalOnlyFragment.getClass();
                new Handler(Looper.getMainLooper()).post(new I6.a(rVar, tVar, mayaFlutterAdsInternalOnlyFragment));
                break;
            case 19:
                new Handler(Looper.getMainLooper()).post(new I6.a(11, rVar, (T6.a) obj, tVar));
                break;
            case 21:
                kotlin.jvm.internal.j.g(rVar, strTnTj782);
                kotlin.jvm.internal.j.g(tVar, strTnTj78);
                T6.b bVar = (T6.b) obj;
                bVar.getClass();
                new Handler(Looper.getMainLooper()).post(new I6.a(12, rVar, bVar, tVar));
                break;
            default:
                int i = MayaLoansCreditCardActivity.f12712u;
                kotlin.jvm.internal.j.g(rVar, strTnTj782);
                kotlin.jvm.internal.j.g(tVar, strTnTj78);
                MayaLoansCreditCardActivity mayaLoansCreditCardActivity = (MayaLoansCreditCardActivity) obj;
                mayaLoansCreditCardActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new I6.a(14, rVar, mayaLoansCreditCardActivity, tVar));
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) this.f4358b;
        Callback.onRefresh_enter();
        try {
            newMayaCreditSummaryFragment.Q1().q();
        } finally {
            Callback.onRefresh_exit();
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i4, int i6, int i10) {
        switch (this.f4357a) {
            case 13:
                kotlin.jvm.internal.j.g(nestedScrollView, numX49.tnTj78("bdVM"));
                int height = nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight();
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) this.f4358b;
                TextView textView = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                String strTnTj78 = numX49.tnTj78("bdVN");
                if (textView == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                int height2 = textView.getHeight();
                TextView textView2 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i11 = height2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                TextView textView3 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                if (height <= textView3.getPaddingTop() + i11) {
                    TextView textView4 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    textView4.setAlpha(1.0f);
                    TextView textView5 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                    if (textView5 == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    textView5.setVisibility(0);
                    S7.f fVar = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                    if (fVar != null) {
                        fVar.B0(1.0f);
                        return;
                    }
                    return;
                }
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextView textView6 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView6 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                textView6.getGlobalVisibleRect(rect);
                nestedScrollView.getGlobalVisibleRect(rect2);
                float f = rect.bottom - rect2.top;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                TextView textView7 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView7 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                float height3 = textView7.getHeight();
                if (f > height3) {
                    f = height3;
                }
                if (mayaDataPrivacyDataPersonalizationFragment.f12282X == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                float height4 = f / r9.getHeight();
                TextView textView8 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView8 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                textView8.setAlpha(height4);
                TextView textView9 = mayaDataPrivacyDataPersonalizationFragment.f12282X;
                if (textView9 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                textView9.setVisibility(height4 <= 0.0f ? 4 : 0);
                S7.f fVar2 = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                if (fVar2 != null) {
                    fVar2.B0(height4);
                    return;
                }
                return;
            case 22:
                kotlin.jvm.internal.j.g(nestedScrollView, numX49.tnTj78("bdVh"));
                ShareSaveDialogFragment shareSaveDialogFragment = (ShareSaveDialogFragment) this.f4358b;
                if (i4 > 0) {
                    k1 k1Var = shareSaveDialogFragment.f14390R;
                    kotlin.jvm.internal.j.d(k1Var);
                    ((TextView) k1Var.f4139d).setBackgroundResource(R.drawable.pma_background_white_round_corner_bottom_sheet);
                    return;
                } else {
                    k1 k1Var2 = shareSaveDialogFragment.f14390R;
                    kotlin.jvm.internal.j.d(k1Var2);
                    ((TextView) k1Var2.f4139d).setBackground(null);
                    return;
                }
            default:
                kotlin.jvm.internal.j.g(nestedScrollView, numX49.tnTj78("bdVD"));
                MayaShareSaveDialogFragment mayaShareSaveDialogFragment = (MayaShareSaveDialogFragment) this.f4358b;
                if (i4 > 0) {
                    k1 k1Var3 = mayaShareSaveDialogFragment.f11886T;
                    kotlin.jvm.internal.j.d(k1Var3);
                    ((TextView) k1Var3.f4139d).setBackgroundResource(R.drawable.pma_background_white_round_corner_bottom_sheet);
                    return;
                } else {
                    k1 k1Var4 = mayaShareSaveDialogFragment.f11886T;
                    kotlin.jvm.internal.j.d(k1Var4);
                    ((TextView) k1Var4.f4139d).setBackground(null);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f4357a) {
            case 4:
                ((C7.g) this.f4358b).invoke(obj);
                break;
            case 6:
                ((N9.f) this.f4358b).invoke(obj);
                break;
            case 7:
                ((N9.f) this.f4358b).invoke(obj);
                break;
            case 11:
                ((R4.g) this.f4358b).invoke(obj);
                break;
            case 14:
                ((Sb.c) this.f4358b).invoke(obj);
                break;
            case 15:
                ((Sb.c) this.f4358b).invoke(obj);
                break;
            case 17:
                ((Sb.c) this.f4358b).invoke(obj);
                break;
            default:
                ((N9.f) this.f4358b).invoke(obj);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f4357a) {
            case 10:
                A7.j jVar = (A7.j) this.f4358b;
                ((BaseFragment) ((Sd.b) jVar.c.get())).n1();
                ((Sd.b) jVar.c.get()).getClass();
                break;
            default:
                ((MayaBaseFragment) ((InterfaceC1348a) ((Xa.b) this.f4358b).c.get())).w1();
                break;
        }
    }

    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        switch (this.f4357a) {
            case 1:
                return ((DeepLinkActivity) this.f4358b).f14620n;
            default:
                return ((LauncherActivity) this.f4358b).f14623n;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((X2.i) this.f4358b);
    }
}
