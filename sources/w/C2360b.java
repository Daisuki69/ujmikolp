package w;

import A7.o;
import B9.d;
import Bb.e;
import Ch.f;
import D.C0190x;
import D7.h;
import D8.C0196d;
import D8.C0200h;
import D8.C0217z;
import D8.E;
import D8.T;
import E8.C;
import Fg.g;
import G5.t;
import G6.k;
import G6.p;
import G6.s;
import K6.l;
import K8.InterfaceC0277b;
import K8.InterfaceC0279d;
import K8.InterfaceC0290o;
import K8.O;
import L6.q;
import M8.G;
import M8.J0;
import N5.U;
import Ng.C0496d;
import Ng.InterfaceC0497e;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ViewKt;
import com.dynatrace.android.callback.Callback;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ComplianceUpdateProfileData;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Transfer;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.ui.support.view.activity.impl.SupportActivity;
import com.paymaya.ui.support.view.fragment.impl.SupportFragment;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import qk.i;
import v.AbstractC2329d;
import v5.C2342a;

/* JADX INFO: renamed from: w.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2360b implements Ch.c, t, InterfaceC0497e, F1.c, f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20516b;

    public /* synthetic */ C2360b(Object obj, int i) {
        this.f20515a = i;
        this.f20516b = obj;
    }

    public static String b(String str, EnumC2359a enumC2359a, boolean z4) {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bbmPE"));
        sb2.append(str.replaceAll(numX49.tnTj78("bbmPF"), numX49.tnTj78("bbmPH")));
        String strConcat = enumC2359a.f20514a;
        if (z4) {
            strConcat = numX49.tnTj78("bbmPO").concat(strConcat);
        }
        sb2.append(strConcat);
        return sb2.toString();
    }

    @Override // Ng.InterfaceC0497e
    public boolean a(C0496d c0496d) {
        j.g(c0496d, numX49.tnTj78("bbmPQ"));
        return c0496d.c((C0496d) this.f20516b);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        G g8;
        int i = 2;
        String strTnTj78 = numX49.tnTj78("bbmPt");
        String strTnTj782 = numX49.tnTj78("bbmPU");
        String strTnTj783 = numX49.tnTj78("bbmPe");
        int i4 = 12;
        String strTnTj784 = numX49.tnTj78("bbmP8");
        String strTnTj785 = numX49.tnTj78("bbmPC");
        final int i6 = 0;
        final int i10 = 1;
        switch (this.f20515a) {
            case 1:
                ((A7.b) this.f20516b).getClass();
                return;
            case 2:
            case 4:
            case 10:
            case 18:
            case 19:
            case 20:
            case 22:
            case 26:
            default:
                CreatePullFunds createPullFunds = (CreatePullFunds) obj;
                j.g(createPullFunds, numX49.tnTj78("bbmP4"));
                s sVar = (s) this.f20516b;
                sVar.getClass();
                ((MayaBaseFragment) ((l) sVar.c.get())).w1();
                ((MayaCashInViaCardFormFragment) ((l) sVar.c.get())).J1(createPullFunds, 3);
                return;
            case 3:
                o oVar = (o) this.f20516b;
                PayMayaError payMayaErrorF = oVar.f((Throwable) obj, true);
                j.f(payMayaErrorF, strTnTj785);
                ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).Q1(true);
                int i11 = oVar.j;
                if (i11 >= 2) {
                    oVar.j = i11 - 1;
                    if (payMayaErrorF.mErrorCode() == -1) {
                        oVar.f229k = true;
                        h hVar = ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).t0;
                        if (hVar != null) {
                            hVar.notifyDataSetChanged();
                        }
                        ((MayaTransactionsFragment) ((F7.c) oVar.c.get())).Q1(false);
                        return;
                    }
                    if (payMayaErrorF.isSessionTimeout()) {
                        return;
                    }
                    MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) ((F7.c) oVar.c.get());
                    FragmentActivity fragmentActivityRequireActivity = mayaTransactionsFragment.requireActivity();
                    SpringView springView = mayaTransactionsFragment.f12202p0;
                    if (springView != null) {
                        b0.e(fragmentActivityRequireActivity, springView, null, R.string.maya_label_transactions_load_more_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 596);
                        return;
                    } else {
                        j.n(numX49.tnTj78("bbmPY"));
                        throw null;
                    }
                }
                return;
            case 5:
                ((B9.c) this.f20516b).f((Throwable) obj, false);
                return;
            case 6:
                d dVar = (d) this.f20516b;
                PayMayaError payMayaErrorF2 = dVar.f((Throwable) obj, false);
                j.f(payMayaErrorF2, strTnTj78);
                SpringView springView2 = ((MayaMissionsHomeFragment) ((F9.f) dVar.c.get())).t0;
                if (springView2 == null) {
                    j.n(numX49.tnTj78("bbmPA"));
                    throw null;
                }
                springView2.i();
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                y5.s sVar2 = (F9.f) dVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.APPEAR);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(strTnTj782, payMayaErrorF2.mSpiel());
                ((MayaBaseFragment) sVar2).A1(c1219hH);
                if (payMayaErrorF2.isNetworkError()) {
                    MayaMissionsHomeFragment mayaMissionsHomeFragment = (MayaMissionsHomeFragment) ((F9.f) dVar.c.get());
                    mayaMissionsHomeFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsHomeFragment, 100, null, null, new G9.h(mayaMissionsHomeFragment, i10), 30);
                    return;
                } else {
                    MayaMissionsHomeFragment mayaMissionsHomeFragment2 = (MayaMissionsHomeFragment) ((F9.f) dVar.c.get());
                    mayaMissionsHomeFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaMissionsHomeFragment2, 200, null, null, new G9.h(mayaMissionsHomeFragment2, i), 30);
                    return;
                }
            case 7:
                OTP otp = (OTP) obj;
                j.g(otp, numX49.tnTj78("bbmPv"));
                e eVar = (e) this.f20516b;
                Transfer transferN = eVar.n(((MayaSendMoneyConfirmationFragment) ((Fb.a) eVar.c.get())).H1());
                Fb.a aVar = (Fb.a) eVar.c.get();
                String strMOtpId = otp.mOtpId();
                Gb.b bVar = ((MayaSendMoneyConfirmationFragment) aVar).f13761g0;
                if (bVar != null) {
                    ((MayaSendMoneyActivity) bVar).c2(transferN, strMOtpId);
                    return;
                } else {
                    j.n(numX49.tnTj78("bbmP7"));
                    throw null;
                }
            case 8:
                j.g((Throwable) obj, strTnTj784);
                ((MayaSendMoneyDecorationPreviewFragment) ((Fb.b) ((Bb.f) this.f20516b).c.get())).H1();
                return;
            case 9:
                Bb.o oVar2 = (Bb.o) this.f20516b;
                PayMayaError payMayaErrorF3 = oVar2.f((Throwable) obj, true);
                j.f(payMayaErrorF3, strTnTj785);
                oVar2.k(payMayaErrorF3);
                return;
            case 11:
                Pair pair = (Pair) obj;
                j.g(pair, strTnTj783);
                C0196d c0196d = (C0196d) this.f20516b;
                ((InterfaceC0277b) c0196d.c.get()).L((KycCmsContent) pair.f18161b);
                c0196d.q((KycLatestSubmissionContentData) pair.f18160a);
                return;
            case 12:
                C0200h c0200h = (C0200h) this.f20516b;
                c0200h.getClass();
                C.b((KycAdditionalDocsUploadResponse) obj, numX49.tnTj78("bbmPX"));
                String strTnTj786 = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).f12475a0;
                if (strTnTj786 == null) {
                    strTnTj786 = numX49.tnTj78("bbmPG");
                }
                C.b(strTnTj786, numX49.tnTj78("bbmP3"));
                ConstraintLayout constraintLayout = ((U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) c0200h.c.get())).G1()).f3938a;
                j.f(constraintLayout, numX49.tnTj78("bbmPy"));
                E1.c.l(ViewKt.findNavController(constraintLayout), R.id.maya_kyc_amlc_certificate_fragment, R.id.action_maya_kyc_amlc_certificate_fragment_to_maya_kyc_complete_personal_information_fragment, null);
                return;
            case 13:
                j.g((ComplianceUpdateProfileData) obj, strTnTj784);
                ((MayaBaseFragment) ((InterfaceC0290o) ((C0217z) this.f20516b).c.get())).w1();
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) ((InterfaceC0290o) ((C0217z) this.f20516b).c.get());
                KeyEventDispatcher.Component componentRequireActivity = mayaKycDosriFragment.requireActivity();
                String strTnTj787 = numX49.tnTj78("bbmPa");
                j.e(componentRequireActivity, strTnTj787);
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f1046o = true;
                KeyEventDispatcher.Component activity = mayaKycDosriFragment.getActivity();
                j.e(activity, strTnTj787);
                mayaKycDosriFragment.getParentFragmentManager().popBackStackImmediate(((MayaKycActivity) ((H8.b) activity)).Z1().f1045n, 0);
                J0 j02 = mayaKycDosriFragment.f12525c0;
                if (j02 == null || (g8 = ((MayaKycActivity) j02).f12452t) == null) {
                    return;
                }
                g8.invoke();
                return;
            case 14:
                Throwable th2 = (Throwable) obj;
                j.g(th2, strTnTj784);
                E e = (E) this.f20516b;
                e.getClass();
                e.l(th2, null, null, new Ag.d(e, i4));
                return;
            case 15:
                ((Ag.f) this.f20516b).invoke(((C2342a) obj).f20476a);
                return;
            case 16:
                Throwable th3 = (Throwable) obj;
                j.g(th3, strTnTj783);
                T t5 = (T) this.f20516b;
                ((MayaKycUploadPhilsysIdFragment) ((O) t5.c.get())).S1();
                t5.l(th3, new C0190x(0, t5.c.get(), O.class, "showPreSubmissionIdInvalidError", "showPreSubmissionIdInvalidError()V", 0, 14), null, new Ag.d(t5, 14));
                return;
            case 17:
                Dc.d dVar2 = (Dc.d) this.f20516b;
                PayMayaError payMayaErrorF4 = dVar2.f((Throwable) obj, false);
                j.f(payMayaErrorF4, strTnTj78);
                dVar2.l(payMayaErrorF4);
                return;
            case 21:
                Objects.requireNonNull(obj, "value is null");
                ((Ch.c) this.f20516b).accept(new Ah.g(obj));
                return;
            case 23:
                Throwable th4 = (Throwable) obj;
                j.g(th4, strTnTj784);
                G6.c cVar = (G6.c) this.f20516b;
                PayMayaError payMayaErrorF5 = cVar.f(th4, true);
                j.f(payMayaErrorF5, strTnTj785);
                if (payMayaErrorF5.isSessionTimeout()) {
                    return;
                }
                if (payMayaErrorF5.isNetworkError()) {
                    final MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) ((K6.c) cVar.c.get());
                    mayaBankPullFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaBankPullFragment, 100, null, null, new View.OnClickListener() { // from class: L6.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    MayaBankPullFragment mayaBankPullFragment2 = mayaBankPullFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaBankPullFragment2.Q1();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaBankPullFragment mayaBankPullFragment3 = mayaBankPullFragment;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaBankPullFragment3.Q1();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                } else {
                    K6.c cVar2 = (K6.c) cVar.c.get();
                    j.f(payMayaErrorF5.mSpiel(), numX49.tnTj78("bbmP6"));
                    final MayaBankPullFragment mayaBankPullFragment2 = (MayaBankPullFragment) cVar2;
                    mayaBankPullFragment2.getClass();
                    MayaBaseLoadingFragment.N1(mayaBankPullFragment2, 200, null, null, new View.OnClickListener() { // from class: L6.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    MayaBankPullFragment mayaBankPullFragment22 = mayaBankPullFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaBankPullFragment22.Q1();
                                        return;
                                    } finally {
                                    }
                                default:
                                    MayaBankPullFragment mayaBankPullFragment3 = mayaBankPullFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        mayaBankPullFragment3.Q1();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    }, 30);
                    return;
                }
            case 24:
                Pair pair2 = (Pair) obj;
                j.g(pair2, strTnTj783);
                G6.g gVar = (G6.g) this.f20516b;
                gVar.getClass();
                gVar.f = pair2;
                gVar.k(pair2);
                ((MayaBaseLoadingFragment) ((K6.e) gVar.c.get())).f10359n0 = true;
                return;
            case 25:
                k kVar = (k) this.f20516b;
                PayMayaError payMayaErrorF6 = kVar.f((Throwable) obj, true);
                j.f(payMayaErrorF6, strTnTj785);
                if (((com.paymaya.data.preference.a) kVar.f1794g).e().isAppEventsV2CashInEnabled()) {
                    K6.f fVar = (K6.f) kVar.c.get();
                    String strValueOf = String.valueOf(payMayaErrorF6.mErrorCode());
                    MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) fVar;
                    mayaCashInCodeFormFragment.getClass();
                    j.g(strValueOf, numX49.tnTj78("bbmPh"));
                    C1219h c1219hE = C1219h.e(numX49.tnTj78("bbmPM"));
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put(numX49.tnTj78("bbmPN"), strValueOf);
                    mayaCashInCodeFormFragment.o1().b(c1219hE);
                } else {
                    y5.s sVar3 = (K6.f) kVar.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put(strTnTj782, payMayaErrorF6.mSpiel());
                    ((MayaBaseFragment) sVar3).A1(c1219hH2);
                }
                ((MayaBaseFragment) ((K6.f) kVar.c.get())).w1();
                if (payMayaErrorF6.isSessionTimeout()) {
                    return;
                }
                MayaCashInCodeFormFragment mayaCashInCodeFormFragment2 = (MayaCashInCodeFormFragment) ((K6.f) kVar.c.get());
                mayaCashInCodeFormFragment2.getClass();
                L6.k kVar2 = mayaCashInCodeFormFragment2.f11658x0;
                if (kVar2 != null) {
                    ((MayaCashInActivity) kVar2).a(payMayaErrorF6, mayaCashInCodeFormFragment2.getString(R.string.pma_toast_error_title_money_in_code_error));
                    return;
                }
                return;
            case 27:
                LoadUpPartner loadUpPartner = (LoadUpPartner) obj;
                j.g(loadUpPartner, numX49.tnTj78("bbmPo"));
                p pVar = (p) this.f20516b;
                ((MayaBaseFragment) ((K6.h) pVar.c.get())).w1();
                K6.h hVar2 = (K6.h) pVar.c.get();
                String string = ((MayaCashInFragment) ((K6.h) pVar.c.get())).getString(R.string.maya_label_maya_center);
                j.f(string, numX49.tnTj78("bbmPK"));
                MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) hVar2;
                mayaCashInFragment.getClass();
                q qVar = mayaCashInFragment.f11690G0;
                if (qVar != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                    mayaCashInActivity.getIntent().putExtra(numX49.tnTj78("bbmPw"), numX49.tnTj78("bbmPc"));
                    MayaCashInCodeFormFragment mayaCashInCodeFormFragment3 = new MayaCashInCodeFormFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(numX49.tnTj78("bbmPm"), loadUpPartner);
                    bundle.putString(numX49.tnTj78("bbmPD"), string);
                    mayaCashInCodeFormFragment3.setArguments(bundle);
                    AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInCodeFormFragment3, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    return;
                }
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return ((Ch.b) this.f20516b).a(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bbmPT") + objArr.length);
    }

    public File c() {
        E1.e eVar = (E1.e) this.f20516b;
        eVar.getClass();
        File file = new File(eVar.f1229a.getCacheDir(), numX49.tnTj78("bbmPR"));
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void d(BankPullPaymentOption bankPullPaymentOption) {
        j.g(bankPullPaymentOption, numX49.tnTj78("bbmPp"));
        ImageUrlUnfiltered iconUrl = bankPullPaymentOption.getIconUrl();
        MaintenanceDate maintenanceDate = bankPullPaymentOption.getMaintenanceDate();
        M6.k kVar = (M6.k) this.f20516b;
        boolean z4 = kVar.f3120g;
        TextView textView = kVar.c;
        ImageView imageView = kVar.f3118b;
        TextView textView2 = kVar.f3119d;
        if (maintenanceDate != null && !maintenanceDate.isAvailable()) {
            imageView.setAlpha(0.4f);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Tertiary);
            kVar.itemView.setClickable(false);
            kVar.itemView.setEnabled(false);
            textView2.setVisibility(0);
            textView2.setText(maintenanceDate.mMessage());
        } else if (z4) {
            imageView.setAlpha(0.4f);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Tertiary);
            kVar.itemView.setClickable(false);
            kVar.itemView.setEnabled(false);
            textView2.setVisibility(0);
            textView2.setText(kVar.itemView.getContext().getString(R.string.maya_label_bank_pull_maximum_limit_reached));
        } else {
            imageView.setAlpha(1.0f);
            TextViewCompat.setTextAppearance(textView, R.style.JekoSemiBoldTextBody_Primary);
            kVar.itemView.setClickable(true);
            kVar.itemView.setEnabled(true);
            textView2.setVisibility(8);
        }
        String strO = iconUrl != null ? com.paymaya.common.utility.C.O(iconUrl.mAndroidImageUrl()) : null;
        int dimensionPixelSize = kVar.itemView.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_bank_pull_logo_size);
        com.paymaya.common.utility.C.c0(strO, R.drawable.maya_ic_bank_placeholder, kVar.f3118b, dimensionPixelSize, dimensionPixelSize, kVar.itemView.getResources().getDimensionPixelSize(R.dimen.pma_stroke_width_normal));
    }

    public File e(String str, InputStream inputStream, EnumC2359a enumC2359a) throws IOException {
        File file = new File(c(), b(str, enumC2359a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // Fg.g
    public void log(String str) {
        j.g(str, numX49.tnTj78("bbmP0"));
        ((ok.b) this.f20516b).f(str);
    }

    @Override // G5.t
    public void m(String str, View view) {
        SupportActivity supportActivity = (SupportActivity) ((SupportFragment) this.f20516b).f14928T;
        supportActivity.e.getClass();
        supportActivity.startActivity(Intent.createChooser(new Intent(numX49.tnTj78("bbmPf"), Uri.fromParts(numX49.tnTj78("bbmPg"), "support@paymaya.com", null)), numX49.tnTj78("bbmP1")));
    }

    @Override // F1.c
    public Object zza() {
        com.google.android.play.core.appupdate.a aVar = (com.google.android.play.core.appupdate.a) ((F1.c) this.f20516b).zza();
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException(numX49.tnTj78("bbmPn"));
    }

    public C2360b() {
        int i;
        this.f20515a = 22;
        int i4 = 0;
        int i6 = ok.d.f18906a;
        ok.b bVarA = ok.d.b().a().a(wg.c.class.getName());
        if (ok.d.f18908d) {
            qk.h hVar = i.f19820a;
            Class cls = null;
            if (hVar == null) {
                if (i.f19821b) {
                    hVar = null;
                } else {
                    try {
                        hVar = new qk.h();
                    } catch (SecurityException unused) {
                        hVar = null;
                    }
                    i.f19820a = hVar;
                    i.f19821b = true;
                }
            }
            if (hVar != null) {
                Class[] classContext = hVar.getClassContext();
                String name = i.class.getName();
                while (i4 < classContext.length && !name.equals(classContext[i4].getName())) {
                    i4++;
                }
                if (i4 >= classContext.length || (i = i4 + 2) >= classContext.length) {
                    throw new IllegalStateException(numX49.tnTj78("bbmPi"));
                }
                cls = classContext[i];
            }
            if (cls != null && !cls.isAssignableFrom(wg.c.class)) {
                qk.e.d(numX49.tnTj78("bbmPV") + bVarA.getName() + numX49.tnTj78("bbmPS") + cls.getName() + numX49.tnTj78("bbmPj"));
                qk.e.d(numX49.tnTj78("bbmPd"));
            }
        }
        this.f20516b = bVarA;
    }
}
