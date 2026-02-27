package l9;

import Kh.T;
import android.widget.Button;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import d4.AbstractC1331a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import k9.InterfaceC1768a;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC2021f;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.s;
import zj.C2576A;

/* JADX INFO: renamed from: l9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1809g extends AbstractC2509a implements InterfaceC1768a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f18264d;
    public final C1268k0 e;
    public final C1247a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public QRMerchant f18265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1809g(com.paymaya.data.preference.a mPreference, C1268k0 c1268k0, C1247a c1247a, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f18264d = mPreference;
        this.e = c1268k0;
        this.f = c1247a;
    }

    public final void k(String currency) {
        int i = 5;
        int i4 = 2;
        int i6 = 0;
        kotlin.jvm.internal.j.g(currency, "currency");
        ((MayaBaseFragment) ((o9.d) this.c.get())).D1();
        Amount amountBuild = Amount.sBuilder().mCurrency(currency).mValue(((MayaMerchantPaymentFragment) ((o9.d) this.c.get())).P1()).build();
        QRMerchant qRMerchant = this.f18265g;
        kotlin.jvm.internal.j.d(qRMerchant);
        this.f18265g = qRMerchant.toBuilder().mAmount(amountBuild).build();
        if (!this.f18264d.e().isQrWithCheckoutFlowEnabled()) {
            C1268k0 c1268k0 = this.e;
            QRMerchant qRMerchant2 = this.f18265g;
            kotlin.jvm.internal.j.d(qRMerchant2);
            String strMMerchantId = qRMerchant2.mMerchantId();
            String strP1 = ((MayaMerchantPaymentFragment) ((o9.d) this.c.get())).P1();
            c1268k0.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("value", strMMerchantId);
            } catch (JSONException unused) {
                yk.a.e();
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("currency", currency);
            } catch (JSONException unused2) {
                yk.a.e();
            }
            try {
                jSONObject3.put("value", strP1);
            } catch (JSONException unused3) {
                yk.a.e();
            }
            try {
                jSONObject.put("merchant", jSONObject2);
            } catch (JSONException unused4) {
                yk.a.e();
            }
            try {
                jSONObject.put("amount", jSONObject3);
            } catch (JSONException unused5) {
                yk.a.e();
            }
            byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
            boolean zIsMerchantV3EndpointEnabled = c1268k0.f11456d.e().isMerchantV3EndpointEnabled();
            MediaType mediaType = C1268k0.e;
            PayMayaCardApi payMayaCardApi = c1268k0.f11455b;
            Ah.p<MerchantPayment> pVarCreateMerchantPaymentV3 = zIsMerchantV3EndpointEnabled ? payMayaCardApi.createMerchantPaymentV3(RequestBody.create(mediaType, bytes)) : payMayaCardApi.createMerchantPayment(RequestBody.create(mediaType, bytes));
            e(new T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateMerchantPaymentV3, pVarCreateMerchantPaymentV3, zh.b.a()), new A0(this, 19), i4), new C1258f0(this, 20), i6), new C1806d(this, 1)).e());
            return;
        }
        C1268k0 c1268k02 = this.e;
        QRMerchant qRMerchant3 = this.f18265g;
        c1268k02.getClass();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        try {
            jSONObject5.put("claim_id", qRMerchant3.mPaymentId());
        } catch (JSONException unused6) {
            yk.a.e();
        }
        try {
            jSONObject5.put(TtmlNode.ATTR_ID, qRMerchant3.mMerchantId());
        } catch (JSONException unused7) {
            yk.a.e();
        }
        try {
            jSONObject5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, qRMerchant3.mName());
        } catch (JSONException unused8) {
            yk.a.e();
        }
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("currency", qRMerchant3.mAmount().mCurrency());
        } catch (JSONException unused9) {
            yk.a.e();
        }
        try {
            jSONObject6.put("value", qRMerchant3.mAmount().mValue());
        } catch (JSONException unused10) {
            yk.a.e();
        }
        try {
            jSONObject4.put("merchant", jSONObject5);
        } catch (JSONException unused11) {
            yk.a.e();
        }
        try {
            jSONObject4.put("amount", jSONObject6);
        } catch (JSONException unused12) {
            yk.a.e();
        }
        try {
            jSONObject4.put(SessionDescription.ATTR_TYPE, qRMerchant3.mType());
        } catch (JSONException unused13) {
            yk.a.e();
        }
        try {
            jSONObject4.put("qr_payload", qRMerchant3.mQrPayload());
        } catch (JSONException unused14) {
            yk.a.e();
        }
        Ah.p<MerchantPaymentV2> pVarCreateMerchantPayment = c1268k02.c.createMerchantPayment(RequestBody.create(C1268k0.e, jSONObject4.toString().getBytes(Charset.forName("UTF-8"))));
        e(new T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateMerchantPayment, pVarCreateMerchantPayment, zh.b.a()), new C1807e(this, i6), i4), new C1808f(this, 0), i6), new C1806d(this, 0)).e());
    }

    public final double l(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = kotlin.jvm.internal.j.i(str.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (string != null && new zj.o("[^\\d.]").f("", string).length() == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int length2 = str.length() - 1;
        int i4 = 0;
        boolean z8 = false;
        while (i4 <= length2) {
            boolean z9 = kotlin.jvm.internal.j.i(str.charAt(!z8 ? i4 : length2), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                }
                length2--;
            } else if (z9) {
                i4++;
            } else {
                z8 = true;
            }
        }
        return Double.parseDouble(new zj.o("[^\\d.]").f("", str.subSequence(i4, length2 + 1).toString()));
    }

    public final void m() {
        ((MayaMerchantPaymentFragment) ((o9.d) this.c.get())).O1();
        e(new Lh.d(new Lh.d(new Lh.h(this.f.a(), zh.b.a(), 0), new com.paymaya.domain.store.T(this, 22), 2), new L(this, 23), 0).e());
    }

    public final void n(String str) {
        if (C2576A.H(str) || Double.parseDouble(str) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            Button button = ((MayaMerchantPaymentFragment) ((o9.d) this.c.get())).f12878q0;
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                kotlin.jvm.internal.j.n("mContinueButton");
                throw null;
            }
        }
        Button button2 = ((MayaMerchantPaymentFragment) ((o9.d) this.c.get())).f12878q0;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
    }

    public final void o(PayMayaError payMayaError) {
        MayaMerchantPaymentFragment mayaMerchantPaymentFragment;
        InterfaceC2021f interfaceC2021f;
        s sVar = (o9.d) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
        if (payMayaError.isSessionTimeout() || (interfaceC2021f = (mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) ((o9.d) this.c.get())).t0) == null) {
            return;
        }
        M2.b.Z(0, mayaMerchantPaymentFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), null, null, null, false, payMayaError, null, false, 445).show(((MayaMerchantActivity) interfaceC2021f).getSupportFragmentManager(), "error_dialog");
    }
}
