package Bb;

import Bj.C0165x;
import G7.F;
import Kh.B;
import Kh.C0305j;
import Kh.C0310o;
import Kh.I;
import Kh.T;
import Kh.z;
import N5.C0446d1;
import Q6.s;
import ac.C0679c;
import ac.EnumC0678b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.model.TransferPersonalization;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import n3.C1916a;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import yb.C2518b;
import zj.C2576A;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC2509a implements Ab.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f414d;
    public final Z0 e;
    public final C1247a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1286u f415g;
    public final V0 h;
    public final E i;
    public final Q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S5.c f416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.paymaya.data.preference.a mPreference, Z0 z02, C1247a c1247a, C1286u c1286u, V0 v02, E e, Q q9, S5.c mFlagConfigurationService, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f414d = mPreference;
        this.e = z02;
        this.f = c1247a;
        this.f415g = c1286u;
        this.h = v02;
        this.i = e;
        this.j = q9;
        this.f416k = mFlagConfigurationService;
    }

    public final void A() {
        String strQ1 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).Q1();
        if (C.a0(strQ1)) {
            MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment.b2();
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = mayaSendMoneyFragment.f13782G0;
            if (mayaAutoCompleteInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                throw null;
            }
            mayaAutoCompleteInputLayout.getHelperInfoSpielTextView().setText(mayaSendMoneyFragment.getString(R.string.maya_account_type_maya_center));
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13782G0;
            if (mayaAutoCompleteInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                throw null;
            }
            mayaAutoCompleteInputLayout2.getHelperInfoSpielTextView().setVisibility(0);
            MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment2.getClass();
            mayaSendMoneyFragment2.f13802d1 = "PADALA";
            return;
        }
        if (q() || C2576A.H(strQ1)) {
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout3 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13782G0;
            if (mayaAutoCompleteInputLayout3 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                throw null;
            }
            mayaAutoCompleteInputLayout3.getHelperInfoSpielTextView().setVisibility(8);
            MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment3.getClass();
            mayaSendMoneyFragment3.f13802d1 = "";
            return;
        }
        MayaSendMoneyFragment mayaSendMoneyFragment4 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        mayaSendMoneyFragment4.b2();
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout4 = mayaSendMoneyFragment4.f13782G0;
        if (mayaAutoCompleteInputLayout4 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        mayaAutoCompleteInputLayout4.getHelperInfoSpielTextView().setText(mayaSendMoneyFragment4.getString(R.string.maya_account_type_maya));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout5 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13782G0;
        if (mayaAutoCompleteInputLayout5 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        mayaAutoCompleteInputLayout5.getHelperInfoSpielTextView().setVisibility(0);
        MayaSendMoneyFragment mayaSendMoneyFragment5 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        mayaSendMoneyFragment5.getClass();
        mayaSendMoneyFragment5.f13802d1 = "PAYMAYA";
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strMFirstName;
        Intent intent;
        Intent intent2;
        int i = 1;
        int i4 = 3;
        super.j();
        ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).O1();
        v();
        B bE = this.f.c().e(zh.b.a());
        i iVar = new i(this, i4);
        C1916a c1916a = Eh.d.c;
        mg.c cVar = Eh.d.f1365b;
        new C0305j(new C0310o(bE, iVar, c1916a, cVar), new j(this, i4), i).f();
        User userA = this.e.a();
        if (userA == null || (strMFirstName = userA.mFirstName()) == null) {
            strMFirstName = "";
        }
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        mayaSendMoneyFragment.getClass();
        TextView textView = mayaSendMoneyFragment.N0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewIncludedSignatureName");
            throw null;
        }
        textView.setText(mayaSendMoneyFragment.getString(R.string.maya_format_signature_from_name, strMFirstName));
        FragmentActivity activity = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).getActivity();
        String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
        if (dataString == null || C2576A.H(dataString)) {
            Bundle arguments = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).getArguments();
            Favorite favorite = arguments != null ? (Favorite) arguments.getParcelable("favorite") : null;
            if (favorite != null) {
                m(favorite);
            } else {
                Bundle arguments2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).getArguments();
                QRRecipient qRRecipient = arguments2 != null ? (QRRecipient) arguments2.getParcelable("recipient") : null;
                if (qRRecipient != null) {
                    String strMValue = qRRecipient.mValue();
                    qRRecipient.mType();
                    String strMAmount = qRRecipient.mAmount();
                    String strMMessage = qRRecipient.mMessage();
                    kotlin.jvm.internal.j.d(strMValue);
                    u(strMValue);
                    s(strMAmount);
                    t(strMMessage);
                }
            }
        } else if (8 == C.w(dataString)) {
            MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            C1219h c1219hM1 = mayaSendMoneyFragment2.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            FragmentActivity activity2 = mayaSendMoneyFragment2.getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                intent.setData(null);
            }
            String strL = C.L(dataString, TtmlNode.TAG_P);
            TransferAppLink transferAppLink = C.e(strL) ? null : (TransferAppLink) A.f10366a.e(new String(Base64Utils.decodeUrlSafe(Uri.decode(strL))), TransferAppLink.class);
            if (transferAppLink != null) {
                String strMRecipient = transferAppLink.mRecipient();
                kotlin.jvm.internal.j.f(strMRecipient, "mRecipient(...)");
                u(strMRecipient);
                s(transferAppLink.mAmount());
                String strMMessage2 = transferAppLink.mMessage();
                if (strMMessage2 != null && !C2576A.H(strMMessage2) && "PAYMAYA".equalsIgnoreCase(transferAppLink.mAccountType())) {
                    t(transferAppLink.mMessage());
                }
            }
        }
        if (q()) {
            MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            ForcedAutoCompleteTextView forcedAutoCompleteTextView = mayaSendMoneyFragment3.f13783H0;
            if (forcedAutoCompleteTextView == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView.setAdapter(null);
            ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = mayaSendMoneyFragment3.f13783H0;
            if (forcedAutoCompleteTextView2 == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView2.setOnItemClickListener(null);
            MayaSendMoneyFragment mayaSendMoneyFragment4 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            Gb.g gVar = new Gb.g(0);
            ForcedAutoCompleteTextView forcedAutoCompleteTextView3 = mayaSendMoneyFragment4.f13783H0;
            if (forcedAutoCompleteTextView3 == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView3.setInputType(2);
            ForcedAutoCompleteTextView forcedAutoCompleteTextView4 = mayaSendMoneyFragment4.f13783H0;
            if (forcedAutoCompleteTextView4 == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView4.setFilters(new InputFilter[]{gVar});
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = mayaSendMoneyFragment4.f13782G0;
            if (mayaAutoCompleteInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                throw null;
            }
            mayaAutoCompleteInputLayout.setHint(mayaSendMoneyFragment4.getString(R.string.pma_hint_account_number));
            ImageView imageView = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).I0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewShowAllContacts");
                throw null;
            }
            imageView.setVisibility(8);
        } else {
            MayaSendMoneyFragment mayaSendMoneyFragment5 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            C0679c c0679c = mayaSendMoneyFragment5.f13805o0;
            if (c0679c == null) {
                kotlin.jvm.internal.j.n("mMayaRecipientAdapter");
                throw null;
            }
            c0679c.c = EnumC0678b.f7093b;
            ForcedAutoCompleteTextView forcedAutoCompleteTextView5 = mayaSendMoneyFragment5.f13783H0;
            if (forcedAutoCompleteTextView5 == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView5.post(new B5.g(5, forcedAutoCompleteTextView5, mayaSendMoneyFragment5));
            ImageView imageView2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).I0;
            if (imageView2 == null) {
                kotlin.jvm.internal.j.n("mImageViewShowAllContacts");
                throw null;
            }
            imageView2.setVisibility(0);
        }
        if (q()) {
            ConstraintLayout constraintLayout = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13788O0;
            if (constraintLayout == null) {
                kotlin.jvm.internal.j.n("mConstraintLayoutDecorationPersonalization");
                throw null;
            }
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13788O0;
            if (constraintLayout2 == null) {
                kotlin.jvm.internal.j.n("mConstraintLayoutDecorationPersonalization");
                throw null;
            }
            constraintLayout2.setVisibility(0);
            I i6 = new I(7);
            com.paymaya.data.database.repository.n nVar = this.i.c;
            nVar.getClass();
            new C0305j(new C0310o(new z(nVar.f11316a.d("decoration", i6), new s(nVar, 29), 0).e(zh.b.a()), new k(this, i4), c1916a, cVar), new l(this, 3), i).f();
            l();
            w();
        }
        z();
        if (!S5.c.b(this.f416k, A5.b.f136t1)) {
            C0446d1 c0446d1 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13808r0;
            if (c0446d1 != null) {
                c0446d1.f4077b.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mViewBannerAds");
                throw null;
            }
        }
        MayaSendMoneyFragment mayaSendMoneyFragment6 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        if (mayaSendMoneyFragment6.t0) {
            return;
        }
        BannerAdCarousel bannerAdCarousel = mayaSendMoneyFragment6.f13809s0;
        if (bannerAdCarousel == null) {
            kotlin.jvm.internal.j.n("mViewBannerAdCarousel");
            throw null;
        }
        f5.f fVar = new f5.f(bannerAdCarousel);
        fVar.f16717b = s5.d.f20009d;
        LifecycleOwner viewLifecycleOwner = mayaSendMoneyFragment6.getViewLifecycleOwner();
        kotlin.jvm.internal.j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fVar.c = viewLifecycleOwner;
        FragmentActivity fragmentActivityRequireActivity = mayaSendMoneyFragment6.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.f16718d = fragmentActivityRequireActivity;
        fVar.h = Integer.valueOf(bannerAdCarousel.getResources().getDimensionPixelSize(R.dimen.maya_margin_24));
        fVar.f = 5000L;
        fVar.j = new F(5);
        fVar.f16720k = new Ag.d(mayaSendMoneyFragment6, 18);
        fVar.f16721l = new C0165x(13);
        fVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.TransferRecipient k() {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.n.k():com.paymaya.domain.model.TransferRecipient");
    }

    public final void l() {
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        LottieAnimationView lottieAnimationView = mayaSendMoneyFragment.f13792T0;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationViewThemeLoading");
            throw null;
        }
        lottieAnimationView.setVisibility(0);
        Group group = mayaSendMoneyFragment.f13790Q0;
        if (group == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupThemeDesignSelection");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = mayaSendMoneyFragment.R0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mConstraintGroupThemePreviewFailed");
            throw null;
        }
        group2.setVisibility(8);
        new Lh.d(new Lh.d(new Lh.h(this.i.c(), zh.b.a(), 0), new h(this, 1), 0), new i(this, 1), 1).e();
    }

    public final void m(Favorite favorite) {
        kotlin.jvm.internal.j.g(favorite, "favorite");
        ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).O1();
        new Lh.d(new Lh.d(new Lh.d(new Lh.h(this.j.b(favorite.mId()), zh.b.a(), 0), new k(this, 2), 2), new l(this, 2), 0), new m(this, 2), 1).e();
    }

    public final String n() {
        MayaInputLayout mayaInputLayout = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13784J0;
        if (mayaInputLayout != null) {
            return C2576A.b0(zj.z.t(zj.z.t(C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString(), (String) ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).g1.getValue(), ""), ",", "")).toString();
        }
        kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
        throw null;
    }

    public final String o() {
        MayaInputLayout mayaInputLayout = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13786L0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutOptionalNote");
            throw null;
        }
        String string = C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString();
        if (zj.z.w(string, 2, "\"", false) && zj.z.n(string, 2, "\"", false)) {
            string = string.substring(1, string.length() - 1);
            kotlin.jvm.internal.j.f(string, "substring(...)");
        }
        if (!((MayaSendMoneyFragment) ((Fb.c) this.c.get())).T1()) {
            return string;
        }
        String string2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).getString(R.string.maya_label_from);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        String signature = androidx.camera.core.impl.a.j(string2, Global.BLANK, this.e.a().mFirstName());
        TextView textView = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).N0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewIncludedSignatureName");
            throw null;
        }
        String messageWithSignature = textView.getText().toString();
        kotlin.jvm.internal.j.g(messageWithSignature, "messageWithSignature");
        kotlin.jvm.internal.j.g(signature, "signature");
        String strJ = androidx.camera.core.impl.a.j(zj.z.t(messageWithSignature, signature, ""), "- ", signature);
        if (C2576A.H(string)) {
            return strJ;
        }
        return zj.s.b(string + Global.NEWLINE + strJ);
    }

    public final Amount p() {
        Amount amountBuild = Amount.sBuilder().mCurrency("PHP").mValue(n()).build();
        kotlin.jvm.internal.j.f(amountBuild, "build(...)");
        return amountBuild;
    }

    public final boolean q() {
        return !"kyc1".equalsIgnoreCase(this.f414d.l());
    }

    public final void r(Decoration decoration) {
        Gb.k kVar = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13810v0;
        if (kVar != null) {
            ((MayaSendMoneyActivity) kVar).f13743t = decoration;
        }
        C2518b c2518b = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13806p0;
        if (c2518b == null) {
            kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
            throw null;
        }
        c2518b.e(decoration);
        w();
    }

    public final void s(String str) {
        if (str == null || C2576A.H(str)) {
            ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).X1(AudioStats.AUDIO_AMPLITUDE_NONE);
            return;
        }
        ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).X1(C.q0(str).doubleValue());
    }

    public final void t(String str) {
        if (str == null || C2576A.H(str)) {
            return;
        }
        Fb.c cVar = (Fb.c) this.c.get();
        String strT = zj.z.t(str, Global.NEWLINE, "<br/>");
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) cVar;
        mayaSendMoneyFragment.getClass();
        MayaInputLayout mayaInputLayout = mayaSendMoneyFragment.f13786L0;
        if (mayaInputLayout != null) {
            mayaInputLayout.getInputEditText().setText(HtmlCompat.fromHtml(strT, 0).toString());
        } else {
            kotlin.jvm.internal.j.n("mMayaInputLayoutOptionalNote");
            throw null;
        }
    }

    public final void u(String str) {
        Contact contactA = this.f415g.a(str);
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        mayaSendMoneyFragment.getClass();
        mayaSendMoneyFragment.f13800b1 = "";
        MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        mayaSendMoneyFragment2.getClass();
        mayaSendMoneyFragment2.f13801c1 = "";
        if (contactA != null) {
            String strMName = contactA.mName();
            String strMNumber = contactA.mNumber();
            Fb.c cVar = (Fb.c) this.c.get();
            kotlin.jvm.internal.j.d(strMName);
            kotlin.jvm.internal.j.d(strMNumber);
            ((MayaSendMoneyFragment) cVar).a2(strMName, strMNumber);
            MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment3.getClass();
            mayaSendMoneyFragment3.f13800b1 = strMName;
            MayaSendMoneyFragment mayaSendMoneyFragment4 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment4.getClass();
            mayaSendMoneyFragment4.f13801c1 = strMNumber;
        } else {
            MayaSendMoneyFragment mayaSendMoneyFragment5 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment5.getClass();
            ForcedAutoCompleteTextView forcedAutoCompleteTextView = mayaSendMoneyFragment5.f13783H0;
            if (forcedAutoCompleteTextView == null) {
                kotlin.jvm.internal.j.n("mAutoCompleteTextViewRecipient");
                throw null;
            }
            forcedAutoCompleteTextView.setText(str);
        }
        A();
    }

    public final void v() {
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        TextView textView = mayaSendMoneyFragment.y0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
        textView.setText(mayaSendMoneyFragment.getString(R.string.maya_label_my_favorites));
        TextView textView2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).y0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
        textView2.setVisibility(0);
        ConstraintLayout constraintLayout = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13778C0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesLoading");
            throw null;
        }
        constraintLayout.setVisibility(0);
        AppCompatTextView appCompatTextView = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13777B0;
        if (appCompatTextView == null) {
            kotlin.jvm.internal.j.n("mTextViewEmptyFavoritesMessage");
            throw null;
        }
        appCompatTextView.setVisibility(8);
        RecyclerView recyclerView = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13812z0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView.setVisibility(8);
        TextView textView3 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13776A0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewFavoritesSeeAll");
            throw null;
        }
        textView3.setVisibility(8);
        ConstraintLayout constraintLayout2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13779D0;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesMaintenance");
            throw null;
        }
        constraintLayout2.setVisibility(8);
        ConstraintLayout constraintLayout3 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13780E0;
        if (constraintLayout3 == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesError");
            throw null;
        }
        constraintLayout3.setVisibility(8);
        if (this.f414d.e().isFavoritesServiceAvailable()) {
            if (((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13798Z0) {
                return;
            }
            ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13798Z0 = true;
            new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(this.j.c("moneysend").d(new m(this, 1)), zh.b.a(), 0), new h(this, 2), 2), new i(this, 2), 0), new g(this, 3)), new j(this, 2), 1).e();
            new Lh.d(new Lh.d(new Lh.d(new Lh.h(this.j.a("moneysend"), zh.b.a(), 0), new j(this, 1), 2), new k(this, 1), 0), new l(this, 1), 1).e();
            return;
        }
        ConstraintLayout constraintLayout4 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13779D0;
        if (constraintLayout4 == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesMaintenance");
            throw null;
        }
        constraintLayout4.setVisibility(0);
        AppCompatTextView appCompatTextView2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13777B0;
        if (appCompatTextView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewEmptyFavoritesMessage");
            throw null;
        }
        appCompatTextView2.setVisibility(8);
        ConstraintLayout constraintLayout5 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13780E0;
        if (constraintLayout5 == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesError");
            throw null;
        }
        constraintLayout5.setVisibility(8);
        TextView textView4 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).y0;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
        textView4.setVisibility(8);
        RecyclerView recyclerView2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13812z0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView2.setVisibility(8);
        ConstraintLayout constraintLayout6 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13778C0;
        if (constraintLayout6 == null) {
            kotlin.jvm.internal.j.n("mConstraintLayoutFavoritesLoading");
            throw null;
        }
        constraintLayout6.setVisibility(8);
        TextView textView5 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13776A0;
        if (textView5 != null) {
            textView5.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mTextViewFavoritesSeeAll");
            throw null;
        }
    }

    public final void w() {
        Decoration decorationR1;
        String mId;
        if (((MayaSendMoneyFragment) ((Fb.c) this.c.get())).R1() == null || !((decorationR1 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).R1()) == null || (mId = decorationR1.getMId()) == null || !mId.equals("0"))) {
            ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).S1();
            return;
        }
        MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
        Button button = mayaSendMoneyFragment.f13793U0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonShowThemePreview");
            throw null;
        }
        button.setVisibility(0);
        TextView textView = mayaSendMoneyFragment.f13794V0;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mTextViewClearTheme");
            throw null;
        }
    }

    public final void x(PayMayaError payMayaError) {
        MayaSendMoneyFragment mayaSendMoneyFragment;
        Gb.k kVar;
        if (this.f414d.e().isAppEventV2SendMoneyEnabled()) {
            MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((Fb.c) this.c.get());
            mayaSendMoneyFragment2.getClass();
            C1220i c1220iO1 = mayaSendMoneyFragment2.o1();
            C1219h c1219hE = C1219h.e("SEND_MONEY_SCREEN_".concat(AbstractC1173g.G(27)));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            Gb.k kVar2 = mayaSendMoneyFragment2.f13810v0;
            String str = kVar2 != null ? ((MayaSendMoneyActivity) kVar2).f13744u : null;
            HashMap map = c1219hE.j;
            map.put("source_page", str);
            map.put("error_reason", payMayaError.mSpiel());
            map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
            c1220iO1.b(c1219hE);
        } else {
            y5.s sVar = (Fb.c) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.CREATE);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
            c1219hH.j.put(SessionDescription.ATTR_TYPE, ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13802d1);
            ((MayaBaseFragment) sVar).A1(c1219hH);
        }
        if (payMayaError.isSessionTimeout() || (kVar = (mayaSendMoneyFragment = (MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13810v0) == null) {
            return;
        }
        ((MayaSendMoneyActivity) kVar).a(payMayaError, mayaSendMoneyFragment.getString(R.string.pma_toast_error_title_send_money_error));
    }

    public final void y(Transfer transfer) {
        Transfer transferBuild;
        kotlin.jvm.internal.j.g(transfer, "transfer");
        y5.s sVar = (Fb.c) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.CREATE);
        ((MayaBaseFragment) sVar).A1(c1219hH);
        Decoration decorationR1 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).R1();
        if (decorationR1 != null && (transferBuild = transfer.toBuilder().mPersonalization(new TransferPersonalization(null, new TransferPersonalizationMeta(new PersonalizationPayMaya(decorationR1.getMId()), null))).build()) != null) {
            transfer = transferBuild;
        }
        Fb.c cVar = (Fb.c) this.c.get();
        boolean zT1 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).T1();
        FavoriteDetails favoriteDetails = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13799a1;
        Gb.k kVar = ((MayaSendMoneyFragment) cVar).f13810v0;
        if (kVar != null) {
            MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
            MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = new MayaSendMoneyConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("transfer_confirmation", transfer);
            bundle.putBoolean("transfer_include_signature", zT1);
            bundle.putParcelable("transfer_favorite_details", favoriteDetails);
            mayaSendMoneyConfirmationFragment.setArguments(bundle);
            AbstractC1236z.i(mayaSendMoneyActivity, R.id.fragment_container_frame_layout, mayaSendMoneyConfirmationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public final void z() {
        Amount amountMAvailableBalance;
        Double valueAsDouble;
        if (!C2576A.H(((MayaSendMoneyFragment) ((Fb.c) this.c.get())).Q1()) || !C2576A.H(((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13801c1)) {
            Double dE = x.e(n());
            double dDoubleValue = dE != null ? dE.doubleValue() : 0.0d;
            AccountBalance accountBalanceB = this.f.b();
            double dDoubleValue2 = (accountBalanceB == null || (amountMAvailableBalance = accountBalanceB.mAvailableBalance()) == null || (valueAsDouble = amountMAvailableBalance.getValueAsDouble()) == null) ? 0.0d : valueAsDouble.doubleValue();
            if (dDoubleValue > AudioStats.AUDIO_AMPLITUDE_NONE && dDoubleValue <= dDoubleValue2) {
                Button button = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13796X0;
                if (button != null) {
                    button.setEnabled(true);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mButtonContinue");
                    throw null;
                }
            }
        }
        Button button2 = ((MayaSendMoneyFragment) ((Fb.c) this.c.get())).f13796X0;
        if (button2 != null) {
            button2.setEnabled(false);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }
}
