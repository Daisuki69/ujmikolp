package Bb;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.CustomerAccountProductOffering;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.DisplayName;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.ProfileBadgesConfig;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferPersonalization;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V0;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.s;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC2509a implements Ab.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V0 f397d;
    public final Q e;
    public final Z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1278p0 f398g;
    public final Y h;
    public final E i;
    public final com.paymaya.data.preference.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(V0 v02, Q q9, Z0 z02, C1278p0 c1278p0, Y y7, E e, com.paymaya.data.preference.a mPreference, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f397d = v02;
        this.e = q9;
        this.f = z02;
        this.f398g = c1278p0;
        this.h = y7;
        this.i = e;
        this.j = mPreference;
    }

    public static String l(String str, String signature) {
        kotlin.jvm.internal.j.g(signature, "signature");
        if (!C2576A.z(str, Global.NEWLINE, false, 2)) {
            return z.t(str, signature, "");
        }
        return C2576A.b0(z.t(z.t(str, Global.NEWLINE, ""), s.b("\n                        " + signature + "\n                        "), "")).toString();
    }

    public static String m(Transfer transfer) {
        TransferRecipient transferRecipientMTransferRecipient;
        String strMValue = (transfer == null || (transferRecipientMTransferRecipient = transfer.mTransferRecipient()) == null) ? null : transferRecipientMTransferRecipient.mValue();
        return strMValue != null ? AbstractC1213b.U("@[a-z0-9_](?!.*\\.\\.)[a-z0-9_.]{1,22}[a-z0-9_]", strMValue) : false ? "username" : "mobile_number";
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strMType;
        String mIconUrl;
        TransferPersonalizationMeta meta;
        PersonalizationPayMaya mayaDecoration;
        ProfileBadgesConfig profileBadgesConfigMProfileBadgesConfig;
        List<String> listVerifiedSellerLevelList;
        String pesoSignFormattedValue;
        String pesoSignFormattedValue2;
        super.j();
        Transfer transferH1 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
        if (transferH1 == null) {
            transferH1 = Transfer.sBuilder().build();
        }
        kotlin.jvm.internal.j.d(transferH1);
        TransferRecipient transferRecipientMTransferRecipient = transferH1.mTransferRecipient();
        if (transferRecipientMTransferRecipient == null) {
            transferRecipientMTransferRecipient = TransferRecipient.sBuilder().mType("").mValue("").build();
        }
        String strMRecipientName = transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mRecipientName() : null;
        String strMValue = transferRecipientMTransferRecipient.mValue();
        if (transferRecipientMTransferRecipient.isAccountValueSmartMoney()) {
            Fb.a aVar = (Fb.a) this.c.get();
            kotlin.jvm.internal.j.d(strMValue);
            ((MayaSendMoneyConfirmationFragment) aVar).N1(strMValue);
            TextView textView = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13753Y;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewDestinationSecondary");
                throw null;
            }
            textView.setVisibility(8);
        } else if (transferH1.mDisplayName() != null) {
            Fb.a aVar2 = (Fb.a) this.c.get();
            String displayFullName = transferH1.getDisplayFullName();
            kotlin.jvm.internal.j.f(displayFullName, "getDisplayFullName(...)");
            ((MayaSendMoneyConfirmationFragment) aVar2).N1(displayFullName);
            if (strMRecipientName == null || C2576A.H(strMRecipientName)) {
                Fb.a aVar3 = (Fb.a) this.c.get();
                kotlin.jvm.internal.j.d(strMValue);
                ((MayaSendMoneyConfirmationFragment) aVar3).O1(strMValue);
            } else {
                String recipientNameAndMobileNumber = transferRecipientMTransferRecipient.getRecipientNameAndMobileNumber();
                Fb.a aVar4 = (Fb.a) this.c.get();
                kotlin.jvm.internal.j.d(recipientNameAndMobileNumber);
                ((MayaSendMoneyConfirmationFragment) aVar4).O1(recipientNameAndMobileNumber);
            }
        } else if (strMRecipientName == null || C2576A.H(strMRecipientName)) {
            Fb.a aVar5 = (Fb.a) this.c.get();
            kotlin.jvm.internal.j.d(strMValue);
            ((MayaSendMoneyConfirmationFragment) aVar5).N1(strMValue);
            TextView textView2 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13753Y;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewDestinationSecondary");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).N1(strMRecipientName);
            Fb.a aVar6 = (Fb.a) this.c.get();
            kotlin.jvm.internal.j.d(strMValue);
            ((MayaSendMoneyConfirmationFragment) aVar6).O1(strMValue);
        }
        Amount amountMTransferAmount = transferH1.mTransferAmount();
        if (amountMTransferAmount != null && (pesoSignFormattedValue2 = amountMTransferAmount.getPesoSignFormattedValue()) != null) {
            MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get());
            mayaSendMoneyConfirmationFragment.getClass();
            TextView textView3 = mayaSendMoneyConfirmationFragment.f13750V;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewAmount");
                throw null;
            }
            textView3.setText(pesoSignFormattedValue2);
        }
        Amount amountMTransferFees = transferH1.mTransferFees();
        if (amountMTransferFees != null && (pesoSignFormattedValue = amountMTransferFees.getPesoSignFormattedValue()) != null) {
            MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment2 = (MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get());
            mayaSendMoneyConfirmationFragment2.getClass();
            TextView textView4 = mayaSendMoneyConfirmationFragment2.f13755a0;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mTextViewTransactionFee");
                throw null;
            }
            textView4.setText(pesoSignFormattedValue);
        }
        Fb.a aVar7 = (Fb.a) this.c.get();
        String strS = C.s(this.h.a());
        kotlin.jvm.internal.j.f(strS, "formatPhoneNumberInternational(...)");
        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment3 = (MayaSendMoneyConfirmationFragment) aVar7;
        mayaSendMoneyConfirmationFragment3.getClass();
        TextView textView5 = mayaSendMoneyConfirmationFragment3.f13751W;
        if (textView5 == null) {
            kotlin.jvm.internal.j.n("mTextViewSourceNumber");
            throw null;
        }
        textView5.setText(strS);
        CustomerAccountProductOffering customerAccountProductOfferingMCustomerAccountProductOffering = transferH1.mCustomerAccountProductOffering();
        String level = customerAccountProductOfferingMCustomerAccountProductOffering != null ? customerAccountProductOfferingMCustomerAccountProductOffering.getLevel() : null;
        if (level == null || level.length() == 0 || (profileBadgesConfigMProfileBadgesConfig = this.j.e().mProfileBadgesConfig()) == null || (listVerifiedSellerLevelList = profileBadgesConfigMProfileBadgesConfig.verifiedSellerLevelList()) == null || !listVerifiedSellerLevelList.contains(level)) {
            TextView textView6 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13754Z;
            if (textView6 == null) {
                kotlin.jvm.internal.j.n("mTextViewVerifiedSeller");
                throw null;
            }
            textView6.setVisibility(8);
        } else {
            TextView textView7 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13754Z;
            if (textView7 == null) {
                kotlin.jvm.internal.j.n("mTextViewVerifiedSeller");
                throw null;
            }
            textView7.setVisibility(0);
        }
        TransferRecipient transferRecipientMTransferRecipient2 = transferH1.mTransferRecipient();
        if (transferRecipientMTransferRecipient2 == null || (strMType = transferRecipientMTransferRecipient2.mType()) == null) {
            strMType = "";
        }
        String strMMessage = transferH1.mMessage();
        String str = strMMessage != null ? strMMessage : "";
        String string = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).getString(R.string.maya_label_transfer_include_signature_name);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String strJ = androidx.camera.core.impl.a.j(string, Global.BLANK, this.f.a().mFirstName());
        String strL = l(str, strJ);
        if (!C2576A.H(strL)) {
            Bundle arguments = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).getArguments();
            if (arguments != null ? arguments.getBoolean("transfer_include_signature") : false) {
                ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).M1(s.b("\n                        " + strL + "\n                        " + strJ + "\n                        "));
            } else {
                ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).M1(strL);
            }
        } else if (strMType.equals("PAYMAYA") || strMType.equals("SMARTMONEY") || strMType.equals("PADALA")) {
            Bundle arguments2 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).getArguments();
            if (arguments2 != null ? arguments2.getBoolean("transfer_include_signature") : false) {
                ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).M1(strJ);
            } else {
                TextView textView8 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13756b0;
                if (textView8 == null) {
                    kotlin.jvm.internal.j.n("mTextViewMessage");
                    throw null;
                }
                textView8.setVisibility(8);
            }
        }
        TransferPersonalization transferPersonalizationMPersonalization = transferH1.mPersonalization();
        String payMayaDecorationId = transferPersonalizationMPersonalization != null ? transferPersonalizationMPersonalization.getPayMayaDecorationId() : null;
        if (payMayaDecorationId == null || C2576A.H(payMayaDecorationId)) {
            Group group = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13759e0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mViewDecorationGroup");
                throw null;
            }
            group.setVisibility(8);
        } else {
            Group group2 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13759e0;
            if (group2 == null) {
                kotlin.jvm.internal.j.n("mViewDecorationGroup");
                throw null;
            }
            group2.setVisibility(0);
            TransferPersonalization transferPersonalizationMPersonalization2 = transferH1.mPersonalization();
            String decorationId = (transferPersonalizationMPersonalization2 == null || (meta = transferPersonalizationMPersonalization2.getMeta()) == null || (mayaDecoration = meta.getMayaDecoration()) == null) ? null : mayaDecoration.getDecorationId();
            if (decorationId == null || C2576A.H(decorationId) || decorationId.equals("0")) {
                Group group3 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13759e0;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("mViewDecorationGroup");
                    throw null;
                }
                group3.setVisibility(8);
            } else {
                Decoration decorationB = this.i.b(decorationId);
                if (decorationB == null || (mIconUrl = decorationB.getMIconUrl()) == null || mIconUrl.length() == 0) {
                    Group group4 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13759e0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n("mViewDecorationGroup");
                        throw null;
                    }
                    group4.setVisibility(8);
                } else {
                    Fb.a aVar8 = (Fb.a) this.c.get();
                    String iconUrl = decorationB.getMIconUrl();
                    MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment4 = (MayaSendMoneyConfirmationFragment) aVar8;
                    mayaSendMoneyConfirmationFragment4.getClass();
                    kotlin.jvm.internal.j.g(iconUrl, "iconUrl");
                    mayaSendMoneyConfirmationFragment4.getActivity();
                    ImageView imageView = mayaSendMoneyConfirmationFragment4.f13757c0;
                    if (imageView == null) {
                        kotlin.jvm.internal.j.n("mImageViewDecoration");
                        throw null;
                    }
                    C.g0(imageView, iconUrl);
                }
            }
        }
        String strMMessage2 = transferH1.mMessage();
        if (strMMessage2 == null || C2576A.H(strMMessage2)) {
            Bundle arguments3 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).getArguments();
            if (!(arguments3 != null ? arguments3.getBoolean("transfer_include_signature") : false)) {
                TransferPersonalization transferPersonalizationMPersonalization3 = transferH1.mPersonalization();
                String payMayaDecorationId2 = transferPersonalizationMPersonalization3 != null ? transferPersonalizationMPersonalization3.getPayMayaDecorationId() : null;
                if (payMayaDecorationId2 == null || C2576A.H(payMayaDecorationId2)) {
                    View view = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13758d0;
                    if (view != null) {
                        view.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mViewNotesDecorationBackground");
                        throw null;
                    }
                }
            }
        }
        View view2 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).f13758d0;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mViewNotesDecorationBackground");
            throw null;
        }
    }

    public final String k() {
        TransferRecipient transferRecipientMTransferRecipient;
        String strMType;
        Transfer transferH1 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
        return (transferH1 == null || (transferRecipientMTransferRecipient = transferH1.mTransferRecipient()) == null || (strMType = transferRecipientMTransferRecipient.mType()) == null) ? "" : strMType;
    }

    public final Transfer n(Transfer transfer) {
        Transfer.Builder builderSBuilder;
        TransferRecipient transferRecipientMTransferRecipient;
        TransferRecipient.Builder builder;
        TransferRecipient.Builder builderMRecipientName;
        TransferRecipient transferRecipientMTransferRecipient2;
        Transfer transferH1 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
        TransferRecipient transferRecipientBuild = null;
        String strMRecipientName = (transferH1 == null || (transferRecipientMTransferRecipient2 = transferH1.mTransferRecipient()) == null) ? null : transferRecipientMTransferRecipient2.mRecipientName();
        Transfer transferH12 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
        DisplayName displayNameMDisplayName = transferH12 != null ? transferH12.mDisplayName() : null;
        Transfer transferH13 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
        CustomerAccountProductOffering customerAccountProductOfferingMCustomerAccountProductOffering = transferH13 != null ? transferH13.mCustomerAccountProductOffering() : null;
        if (transfer == null || (builderSBuilder = transfer.toBuilder()) == null) {
            builderSBuilder = Transfer.sBuilder();
        }
        if (strMRecipientName != null) {
            if (transfer != null && (transferRecipientMTransferRecipient = transfer.mTransferRecipient()) != null && (builder = transferRecipientMTransferRecipient.toBuilder()) != null && (builderMRecipientName = builder.mRecipientName(strMRecipientName)) != null) {
                transferRecipientBuild = builderMRecipientName.build();
            }
            builderSBuilder = builderSBuilder.mTransferRecipient(transferRecipientBuild);
        }
        if (displayNameMDisplayName != null) {
            builderSBuilder = builderSBuilder.mDisplayName(displayNameMDisplayName);
        }
        if (customerAccountProductOfferingMCustomerAccountProductOffering != null) {
            builderSBuilder = builderSBuilder.mCustomerAccountProductOffering(customerAccountProductOfferingMCustomerAccountProductOffering);
        }
        Transfer transferBuild = builderSBuilder.build();
        kotlin.jvm.internal.j.f(transferBuild, "build(...)");
        return transferBuild;
    }

    public final void o(String str, EnumC1212a enumC1212a, String str2, Transfer transfer) {
        y5.s sVar = (Fb.a) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.CONFIRMATION);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("recipient_type", m(transfer));
        c1219hH.j.put(Constants.REASON, str);
        c1219hH.j.put(SessionDescription.ATTR_TYPE, k());
        c1219hH.i();
        c1219hH.j.put(enumC1212a.f10691a, str2);
        ((MayaBaseFragment) sVar).z1(c1219hH);
    }

    public final void p(EnumC1212a enumC1212a, String str, Transfer transfer) {
        y5.s sVar = (Fb.a) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.CONFIRMATION);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("recipient_type", m(transfer));
        c1219hH.j.put(SessionDescription.ATTR_TYPE, k());
        c1219hH.j.put("attribution", ((MayaBaseFragment) ((Fb.a) this.c.get())).n1().f10371a);
        c1219hH.i();
        c1219hH.j.put(enumC1212a.f10691a, str);
        ((MayaBaseFragment) sVar).z1(c1219hH);
    }

    public final void q(PayMayaError payMayaError) {
        TransferPersonalization transferPersonalizationMPersonalization;
        if (this.j.e().isAppEventV2SendMoneyEnabled()) {
            ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).J1(payMayaError);
        } else {
            String strMSpiel = payMayaError.mSpiel();
            kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
            Transfer transferH1 = ((MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get())).H1();
            if (transferH1 == null || (transferPersonalizationMPersonalization = transferH1.mPersonalization()) == null) {
                y5.s sVar = (Fb.a) this.c.get();
                C1219h c1219hH = AbstractC2329d.h(12);
                c1219hH.t(EnumC1217f.CONFIRMATION);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("recipient_type", m(transferH1));
                c1219hH.j.put(Constants.REASON, strMSpiel);
                c1219hH.j.put(SessionDescription.ATTR_TYPE, k());
                c1219hH.i();
                ((MayaBaseFragment) sVar).z1(c1219hH);
            } else if (transferPersonalizationMPersonalization.isPayMayaDecoration()) {
                o(strMSpiel, EnumC1212a.THEME_ID, transferPersonalizationMPersonalization.getPayMayaDecorationId(), transferH1);
            } else {
                o(strMSpiel, EnumC1212a.GIF_ID, transferPersonalizationMPersonalization.getGifId(), transferH1);
            }
        }
        ((MayaBaseFragment) ((Fb.a) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) ((Fb.a) this.c.get());
        Gb.b bVar = mayaSendMoneyConfirmationFragment.f13761g0;
        if (bVar != null) {
            ((MayaSendMoneyActivity) bVar).a(payMayaError, mayaSendMoneyConfirmationFragment.getString(R.string.maya_toast_error_title_send_money_error));
        } else {
            kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.paymaya.domain.model.Transfer r12) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.e.r(com.paymaya.domain.model.Transfer):void");
    }
}
