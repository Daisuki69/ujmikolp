package Zd;

import B5.i;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.a0;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import k2.v0;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import x4.EnumC2464a;
import y4.C2506b;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6927d;
    public boolean e;
    public boolean f;

    public d(com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.f6927d = mPreference;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (AbstractC1955a.u(((MLKitQRScannerFragment) ((ce.c) this.c.get())).getContext(), "android.permission.CAMERA")) {
            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).w1();
        } else {
            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).u1();
        }
        ((MLKitQRScannerFragment) ((ce.c) this.c.get())).t1();
    }

    public final void k(int i) {
        if (this.f) {
            return;
        }
        ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
        this.f = true;
        if (i == 0) {
            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).v1();
        } else {
            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).s1();
        }
    }

    public final void l(int i, String str) {
        QRBankTransferRecipient qRBankTransferRecipientC;
        if (g()) {
            int i4 = c.f6926a[(this.f6927d.e().isQrphEnhancementsEnabled() ? Z.k(str) : Z.j(str)).ordinal()];
            if (i4 == 1) {
                QRRecipient qRRecipientI = Z.i(str);
                ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                if (qRRecipientI == null || this.e) {
                    if (this.f) {
                        return;
                    }
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    m(i, "Invalid Send Money Code");
                    k(i);
                    return;
                }
                this.e = true;
                ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                o(i, "SEND_MONEY");
                QRActivity qRActivity = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
                qRActivity.e.T(qRActivity, qRRecipientI);
                return;
            }
            if (i4 == 2) {
                if (this.f6927d.e().isInstaPayQREnabled()) {
                    try {
                        y4.f fVarZ = v0.z(str);
                        String strB = fVarZ.o("27").b("01");
                        if (z.o(strB, "PAPHPHM1XXX", true) && !this.e) {
                            fVarZ.j();
                            this.e = true;
                            String strB2 = fVarZ.o("27").b("04");
                            String strP = fVarZ.p();
                            String string = strP != null ? strP.toString() : null;
                            C2506b c2506bN = fVarZ.n();
                            QRRecipient qRRecipientE = Z.e(strB2, string, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_08_PURPOSE) : null);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            o(i, "SEND_MONEY_INSTAPAY_QR");
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                            QRActivity qRActivity2 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
                            qRActivity2.e.T(qRActivity2, qRRecipientE);
                            return;
                        }
                        if (strB != null && !C2576A.H(strB) && !this.e) {
                            this.e = true;
                            String strB3 = fVarZ.o("27").b("04");
                            String strP2 = fVarZ.p();
                            Double dValueOf = strP2 != null ? Double.valueOf(Double.parseDouble(strP2)) : null;
                            if (dValueOf == null) {
                                qRBankTransferRecipientC = QRBankTransferRecipient.sBuilder().mBankBic(strB).mAccountNumber(strB3).build();
                                j.d(qRBankTransferRecipientC);
                            } else {
                                qRBankTransferRecipientC = Z.c(dValueOf, strB, strB3);
                                j.d(qRBankTransferRecipientC);
                            }
                            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                            o(i, "SEND_MONEY_INSTAPAY_QR_BANK");
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                            QRActivity qRActivity3 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
                            qRActivity3.e.getClass();
                            i.d(qRActivity3, qRBankTransferRecipientC);
                            return;
                        }
                        if (this.f) {
                            return;
                        }
                        EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                        m(i, "Invalid InstaPay Code");
                        k(i);
                        return;
                    } catch (Exception unused) {
                        EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                        m(i, "Invalid InstaPay Code");
                        k(i);
                        yk.a.b();
                        return;
                    }
                }
                return;
            }
            if (i4 == 3) {
                try {
                    y4.f fVarZ2 = v0.z(str);
                    String strB4 = fVarZ2.b("01");
                    if (j.b(strB4, "11")) {
                        if (fVarZ2.n() != null && fVarZ2.n().b("05") != null) {
                            QRMerchant qRMerchantBuild = QRMerchant.sBuilder().mMerchantId(fVarZ2.n().b("05")).mName(fVarZ2.b("59")).build();
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                            ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                            q(qRMerchantBuild);
                        } else if (!this.f) {
                            EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
                            m(i, "Invalid InstaPay Code");
                            k(i);
                        }
                    } else if (j.b(strB4, "12")) {
                        QRMerchant qRMerchantD = Z.d(fVarZ2.o("28").b("03"), fVarZ2.b("59"), fVarZ2.b("54"), fVarZ2.n().b("05"));
                        ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                        ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                        p(qRMerchantD);
                    } else if (!this.f) {
                        EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
                        m(i, "Invalid InstaPay Code");
                        k(i);
                    }
                    return;
                } catch (Exception unused2) {
                    yk.a.b();
                    EnumC1212a enumC1212a9 = EnumC1212a.ACCOUNT_NUMBER;
                    m(i, "Invalid InstaPay Code");
                    k(i);
                    return;
                }
            }
            if (i4 != 4) {
                if (i4 != 5) {
                    if (this.f) {
                        return;
                    }
                    n();
                    k(i);
                    return;
                }
                if (this.f) {
                    return;
                }
                n();
                k(i);
                return;
            }
            try {
                QRPHMerchantPaymentRequest qRPHMerchantPaymentRequestN = Z.n(v0.z(str), null, Boolean.FALSE);
                if (qRPHMerchantPaymentRequestN != null) {
                    ((MLKitQRScannerFragment) ((ce.c) this.c.get())).y1();
                    ((MLKitQRScannerFragment) ((ce.c) this.c.get())).z1();
                    if (j.b(this.f6927d.l(), "kyc1")) {
                        r(qRPHMerchantPaymentRequestN);
                    } else if (!this.e) {
                        this.e = true;
                        QRActivity qRActivity4 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
                        qRActivity4.e.getClass();
                        i.P(qRActivity4, null, false);
                    }
                } else if (!this.f) {
                    EnumC1212a enumC1212a10 = EnumC1212a.ACCOUNT_NUMBER;
                    m(i, "Invalid P2M Code");
                    k(i);
                }
            } catch (Exception unused3) {
                yk.a.b();
                EnumC1212a enumC1212a11 = EnumC1212a.ACCOUNT_NUMBER;
                m(i, "Invalid P2M Code");
                k(i);
            }
        }
    }

    public final void m(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            Object obj = (ce.c) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(Constants.REASON, str);
            ((BaseFragment) obj).o1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        Object obj2 = (ce.c) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(Constants.REASON, str);
        ((BaseFragment) obj2).o1(c1219hH2);
    }

    public final void n() {
        Object obj = (ce.c) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.SCAN);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, "Not Supported");
        c1219hH.j.put("qr_error_code", "-400");
        a0[] a0VarArr = a0.f10692a;
        c1219hH.j.put("qr_error_reason", "invalidValue");
        c1219hH.j.put("qr_field_name", C.f10388P.c);
        ((BaseFragment) obj).o1(c1219hH);
    }

    public final void o(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            Object obj = (ce.c) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(14);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(SessionDescription.ATTR_TYPE, str);
            ((BaseFragment) obj).o1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        Object obj2 = (ce.c) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(14);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(SessionDescription.ATTR_TYPE, str);
        ((BaseFragment) obj2).o1(c1219hH2);
    }

    public final void p(QRMerchant qRMerchant) {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.f6927d.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            qRActivity.e.getClass();
            i.m(qRActivity, qRMerchant, true);
        } else {
            String strMMessage = this.f6927d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            i.U(qRActivity2, string, strMMessage);
        }
    }

    public final void q(QRMerchant qRMerchant) {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.f6927d.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            qRActivity.e.getClass();
            i.I(qRActivity, qRMerchant, true);
        } else {
            String strMMessage = this.f6927d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            i.U(qRActivity2, string, strMMessage);
        }
    }

    public final void r(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.f6927d.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            qRActivity.e.getClass();
            i.P(qRActivity, qRPHMerchantPaymentRequest, true);
        } else {
            String strMMessage = this.f6927d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((MLKitQRScannerFragment) ((ce.c) this.c.get())).f14677U;
            i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            i.U(qRActivity2, string, strMMessage);
        }
    }
}
