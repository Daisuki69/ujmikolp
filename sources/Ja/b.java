package Ja;

import Ah.p;
import B5.i;
import G6.v;
import G6.w;
import Kh.B;
import N5.C0441c;
import android.content.Intent;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.C1129o;
import cj.L;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.exception.MayaQRErrorException;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.T;
import com.paymaya.common.utility.V;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.a0;
import com.paymaya.common.utility.b0;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.domain.model.QRAdditionalData;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRPHAdditionalData;
import com.paymaya.domain.model.QRPHDetails;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;
import com.paymaya.mayaui.qr.view.widget.MayaCameraSourcePreview;
import com.paymaya.mayaui.qr.view.widget.MayaQrScannerMaskView;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.s;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a implements Ia.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2498d;
    public final C1268k0 e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2499g;

    public b(com.paymaya.data.preference.a mPreference, C1268k0 c1268k0) {
        j.g(mPreference, "mPreference");
        this.f2498d = mPreference;
        this.e = c1268k0;
    }

    public static void q(b bVar, int i, String str, String str2, MayaQRErrorException mayaQRErrorException) {
        String strJ;
        T t5;
        T t10;
        if (!bVar.f2498d.e().isQREventsV2Enabled()) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            bVar.u(i, str2);
            return;
        }
        Pair pair = new Pair(EnumC1212a.ERROR_CODE, str);
        Pair pair2 = new Pair(EnumC1212a.ERROR_REASON, str2);
        Pair pair3 = new Pair(EnumC1212a.QR_TYPE, null);
        Pair pair4 = new Pair(EnumC1212a.MERCHANT_TYPE, null);
        Pair pair5 = new Pair(EnumC1212a.MERCHANT_NAME, null);
        Pair pair6 = new Pair(EnumC1212a.PAGE, "Pay with QR");
        Pair pair7 = new Pair(EnumC1212a.QR_ERROR_CODE, String.valueOf(mayaQRErrorException != null ? -400 : null));
        Pair pair8 = new Pair(EnumC1212a.QR_ERROR_REASON, mayaQRErrorException != null ? mayaQRErrorException.f10360a : null);
        EnumC1212a enumC1212a2 = EnumC1212a.QR_FIELD_TAG;
        if (mayaQRErrorException == null || (t10 = mayaQRErrorException.c) == null) {
            strJ = null;
        } else {
            String str3 = t10.f10435b;
            int length = str3.length();
            strJ = t10.f10434a;
            if (length != 0) {
                strJ = androidx.camera.core.impl.a.j(strJ, ".", str3);
            }
        }
        bVar.s(M.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(enumC1212a2, strJ), new Pair(EnumC1212a.QR_FIELD_NAME, (mayaQRErrorException == null || (t5 = mayaQRErrorException.c) == null) ? null : t5.c), new Pair(EnumC1212a.QR_FIELD_VALUE, mayaQRErrorException != null ? mayaQRErrorException.f10361b : null), new Pair(EnumC1212a.RECEIVER_BIC, mayaQRErrorException != null ? mayaQRErrorException.f10362d : null)));
    }

    public static void v(b bVar, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if (bVar.f2498d.e().isQREventsV2Enabled()) {
            bVar.s(M.h(new Pair(EnumC1212a.ERROR_CODE, str), new Pair(EnumC1212a.ERROR_REASON, str2), new Pair(EnumC1212a.QR_TYPE, str3), new Pair(EnumC1212a.MERCHANT_TYPE, str4), new Pair(EnumC1212a.MERCHANT_NAME, str5), new Pair(EnumC1212a.PAGE, "Pay with QR"), new Pair(EnumC1212a.QR_ERROR_CODE, String.valueOf((Object) null)), new Pair(EnumC1212a.QR_ERROR_REASON, null), new Pair(EnumC1212a.QR_FIELD_TAG, null), new Pair(EnumC1212a.QR_FIELD_NAME, null), new Pair(EnumC1212a.QR_FIELD_VALUE, null), new Pair(EnumC1212a.RECEIVER_BIC, null)));
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        r();
        if (this.f2498d.e().isQRScreensUpdateEnabled()) {
            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
            C0441c c0441c = mayaMLKitQRScannerFragment.f13583b0;
            if (c0441c == null) {
                j.n("mViewScanQRHeaderDefault");
                throw null;
            }
            ((ConstraintLayout) c0441c.f4066b).setVisibility(8);
            MayaCameraHeaderQRPH mayaCameraHeaderQRPH = mayaMLKitQRScannerFragment.f13585d0;
            if (mayaCameraHeaderQRPH == null) {
                j.n("mViewCameraHeaderQRPH");
                throw null;
            }
            mayaCameraHeaderQRPH.setVisibility(0);
            MayaButtonWithIcon mayaButtonWithIcon = mayaMLKitQRScannerFragment.f13587f0;
            if (mayaButtonWithIcon == null) {
                j.n("mUploadQrButton");
                throw null;
            }
            mayaButtonWithIcon.setIconDrawable(R.drawable.maya_ic_upload_qr);
            MayaCameraHeaderQRPH mayaCameraHeaderQRPH2 = mayaMLKitQRScannerFragment.f13585d0;
            if (mayaCameraHeaderQRPH2 != null) {
                mayaCameraHeaderQRPH2.b(mayaMLKitQRScannerFragment.v1());
                return;
            } else {
                j.n("mViewCameraHeaderQRPH");
                throw null;
            }
        }
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
        C0441c c0441c2 = mayaMLKitQRScannerFragment2.f13583b0;
        if (c0441c2 == null) {
            j.n("mViewScanQRHeaderDefault");
            throw null;
        }
        ((ConstraintLayout) c0441c2.f4066b).setVisibility(0);
        MayaCameraHeaderQRPH mayaCameraHeaderQRPH3 = mayaMLKitQRScannerFragment2.f13585d0;
        if (mayaCameraHeaderQRPH3 == null) {
            j.n("mViewCameraHeaderQRPH");
            throw null;
        }
        mayaCameraHeaderQRPH3.setVisibility(8);
        TextView textView = mayaMLKitQRScannerFragment2.f13582a0;
        if (textView == null) {
            j.n("mTextViewToolbar");
            throw null;
        }
        textView.setVisibility(0);
        MayaButtonWithIcon mayaButtonWithIcon2 = mayaMLKitQRScannerFragment2.f13587f0;
        if (mayaButtonWithIcon2 == null) {
            j.n("mUploadQrButton");
            throw null;
        }
        mayaButtonWithIcon2.setIconDrawable(R.drawable.maya_ic_resources);
        MayaButtonWithIcon mayaButtonWithIcon3 = mayaMLKitQRScannerFragment2.f13588g0;
        if (mayaButtonWithIcon3 != null) {
            mayaButtonWithIcon3.setVisibility(8);
        } else {
            j.n("mButtonShowMyQR");
            throw null;
        }
    }

    public final void k(int i, String str) {
        final int i4 = 0;
        final int i6 = 1;
        if (this.f2499g) {
            return;
        }
        ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).S1();
        this.f2499g = true;
        if (i != 0) {
            a0[] a0VarArr = a0.f10692a;
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).M1(j.b(str, "qrPHTypeNotAllowed") ? Integer.valueOf(R.string.maya_label_qr_not_supported) : null);
            return;
        }
        if (this.f2498d.e().isQRScreensUpdateEnabled()) {
            Ma.a aVar = (Ma.a) this.c.get();
            if (str == null) {
                a0[] a0VarArr2 = a0.f10692a;
                str = "parsingError";
            }
            final MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) aVar;
            mayaMLKitQRScannerFragment.getClass();
            MayaCameraSourcePreview mayaCameraSourcePreview = mayaMLKitQRScannerFragment.f13577V;
            if (mayaCameraSourcePreview == null) {
                j.n("mCameraSourcePreview");
                throw null;
            }
            Oa.d dVar = mayaCameraSourcePreview.e;
            if (dVar != null) {
                dVar.g();
            }
            MayaQrScannerMaskView mayaQrScannerMaskView = mayaMLKitQRScannerFragment.f13579X;
            if (mayaQrScannerMaskView == null) {
                j.n("mScanQrMask");
                throw null;
            }
            mayaQrScannerMaskView.setErrorState(true);
            a0[] a0VarArr3 = a0.f10692a;
            if (str.equals("qrPHTypeNotAllowed")) {
                AppCompatTextView appCompatTextView = mayaMLKitQRScannerFragment.f13586e0;
                if (appCompatTextView == null) {
                    j.n("mTextViewCameraHeaderQRPHError");
                    throw null;
                }
                appCompatTextView.setText(mayaMLKitQRScannerFragment.getString(R.string.maya_label_qr_not_supported));
            } else if (str.equals(C.f10389Q.c)) {
                AppCompatTextView appCompatTextView2 = mayaMLKitQRScannerFragment.f13586e0;
                if (appCompatTextView2 == null) {
                    j.n("mTextViewCameraHeaderQRPHError");
                    throw null;
                }
                appCompatTextView2.setText(mayaMLKitQRScannerFragment.getString(R.string.maya_label_qr_bills_not_supported));
            } else {
                AppCompatTextView appCompatTextView3 = mayaMLKitQRScannerFragment.f13586e0;
                if (appCompatTextView3 == null) {
                    j.n("mTextViewCameraHeaderQRPHError");
                    throw null;
                }
                appCompatTextView3.setText(mayaMLKitQRScannerFragment.getString(R.string.maya_label_please_scan_another_code));
            }
            AppCompatTextView appCompatTextView4 = mayaMLKitQRScannerFragment.f13586e0;
            if (appCompatTextView4 == null) {
                j.n("mTextViewCameraHeaderQRPHError");
                throw null;
            }
            appCompatTextView4.setVisibility(0);
            MayaQrScannerMaskView mayaQrScannerMaskView2 = mayaMLKitQRScannerFragment.f13579X;
            if (mayaQrScannerMaskView2 == null) {
                j.n("mScanQrMask");
                throw null;
            }
            mayaQrScannerMaskView2.postDelayed(new Runnable() { // from class: Na.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = mayaMLKitQRScannerFragment;
                            if (mayaMLKitQRScannerFragment2.isAdded()) {
                                mayaMLKitQRScannerFragment2.G1();
                                AppCompatTextView appCompatTextView5 = mayaMLKitQRScannerFragment2.f13584c0;
                                if (appCompatTextView5 != null) {
                                    appCompatTextView5.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVH"));
                                    throw null;
                                }
                            }
                            return;
                        default:
                            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = mayaMLKitQRScannerFragment;
                            if (mayaMLKitQRScannerFragment3.isAdded()) {
                                mayaMLKitQRScannerFragment3.G1();
                                AppCompatTextView appCompatTextView6 = mayaMLKitQRScannerFragment3.f13586e0;
                                if (appCompatTextView6 != null) {
                                    appCompatTextView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVF"));
                                    throw null;
                                }
                            }
                            return;
                    }
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            final MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
            MayaCameraSourcePreview mayaCameraSourcePreview2 = mayaMLKitQRScannerFragment2.f13577V;
            if (mayaCameraSourcePreview2 == null) {
                j.n("mCameraSourcePreview");
                throw null;
            }
            Oa.d dVar2 = mayaCameraSourcePreview2.e;
            if (dVar2 != null) {
                dVar2.g();
            }
            MayaQrScannerMaskView mayaQrScannerMaskView3 = mayaMLKitQRScannerFragment2.f13579X;
            if (mayaQrScannerMaskView3 == null) {
                j.n("mScanQrMask");
                throw null;
            }
            mayaQrScannerMaskView3.setErrorState(true);
            AppCompatTextView appCompatTextView5 = mayaMLKitQRScannerFragment2.f13584c0;
            if (appCompatTextView5 == null) {
                j.n("mTextViewScanErrorDefault");
                throw null;
            }
            appCompatTextView5.setVisibility(0);
            new Handler().postDelayed(new Runnable() { // from class: Na.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment22 = mayaMLKitQRScannerFragment2;
                            if (mayaMLKitQRScannerFragment22.isAdded()) {
                                mayaMLKitQRScannerFragment22.G1();
                                AppCompatTextView appCompatTextView52 = mayaMLKitQRScannerFragment22.f13584c0;
                                if (appCompatTextView52 != null) {
                                    appCompatTextView52.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVH"));
                                    throw null;
                                }
                            }
                            return;
                        default:
                            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment3 = mayaMLKitQRScannerFragment2;
                            if (mayaMLKitQRScannerFragment3.isAdded()) {
                                mayaMLKitQRScannerFragment3.G1();
                                AppCompatTextView appCompatTextView6 = mayaMLKitQRScannerFragment3.f13586e0;
                                if (appCompatTextView6 != null) {
                                    appCompatTextView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVF"));
                                    throw null;
                                }
                            }
                            return;
                    }
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
    }

    public final void l() {
        if (g()) {
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).M1(null);
            if (this.f2498d.e().isQREventsV2Enabled()) {
                s(M.h(new Pair(EnumC1212a.ERROR_REASON, "No qr detected"), new Pair(EnumC1212a.PAGE, "Pay with QR")));
            } else {
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                u(1, "No qr detected");
            }
        }
    }

    public final void m(QRPHDetails qRPHDetails, int i) {
        if (!j.b(this.f2498d.l(), "kyc1")) {
            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
            mayaMLKitQRScannerFragment.getClass();
            Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
            if (eVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                mayaQRActivity.setResult(10, new Intent().putExtra("module_name", EnumC1215d.BANK_TRANSFER));
                mayaQRActivity.finish();
                return;
            }
            return;
        }
        if (this.f) {
            return;
        }
        try {
            b0.f10693a.p(qRPHDetails);
            this.f = true;
            String acquirerId = qRPHDetails.getAcquirerId();
            String creditAccountNumber = qRPHDetails.getCreditAccountNumber();
            String transactionAmount = qRPHDetails.getTransactionAmount();
            QRBankTransferRecipient.Builder builderMAccountName = Z.c(transactionAmount != null ? Double.valueOf(Double.parseDouble(transactionAmount)) : null, acquirerId, creditAccountNumber).toBuilder().mAccountName(qRPHDetails.getMerchantName());
            QRAdditionalData additionalData = qRPHDetails.getAdditionalData();
            QRBankTransferRecipient qRBankTransferRecipientBuild = builderMAccountName.mQRPHAdditionalData(additionalData != null ? new QRPHAdditionalData(qRPHDetails.getGlobalUniqueIdentifier(), qRPHDetails.getPaymentType(), qRPHDetails.getMerchantMobileNumber(), additionalData.getLoyaltyNumber(), qRPHDetails.getMerchantCategoryCode(), qRPHDetails.getMerchantCity(), qRPHDetails.getMerchantPostalCode(), additionalData.getBillNumber(), additionalData.getStoreName(), additionalData.getReferenceId(), additionalData.getTerminalId(), additionalData.getAdditionalRequestData(), additionalData.getAdditionalMobileNumber(), additionalData.getCustomerLabel()) : null).build();
            if (this.f2498d.e().isQREventsV2Enabled()) {
                t(L.c(new Pair(EnumC1212a.QR_CLASS, "Instapay")));
            } else {
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                x(i, "SEND_MONEY_INSTAPAY_QR_BANK");
            }
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).R1();
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).S1();
            Ma.a aVar = (Ma.a) this.c.get();
            j.d(qRBankTransferRecipientBuild);
            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) aVar;
            mayaMLKitQRScannerFragment2.getClass();
            Na.e eVar2 = mayaMLKitQRScannerFragment2.f13591j0;
            if (eVar2 != null) {
                MayaQRActivity mayaQRActivity2 = (MayaQRActivity) eVar2;
                mayaQRActivity2.n1();
                i.d(mayaQRActivity2, qRBankTransferRecipientBuild);
            }
        } catch (Exception e) {
            MayaQRErrorException mayaQRErrorException = e instanceof MayaQRErrorException ? (MayaQRErrorException) e : null;
            q(this, i, String.valueOf(mayaQRErrorException != null ? -400 : null), e.getMessage(), mayaQRErrorException);
            k(i, null);
            yk.a.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0007, B:5:0x001a, B:9:0x0024, B:11:0x006a, B:13:0x0070, B:15:0x0076, B:17:0x007c, B:19:0x0086, B:21:0x008c, B:25:0x009b, B:40:0x00c3, B:42:0x00d5, B:44:0x00f3, B:46:0x0101, B:48:0x0105, B:50:0x011f, B:52:0x012c, B:54:0x0140, B:55:0x0144, B:57:0x0168, B:66:0x019c, B:60:0x0174, B:62:0x0188, B:64:0x018e, B:68:0x01a0, B:69:0x01a7), top: B:79:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0007, B:5:0x001a, B:9:0x0024, B:11:0x006a, B:13:0x0070, B:15:0x0076, B:17:0x007c, B:19:0x0086, B:21:0x008c, B:25:0x009b, B:40:0x00c3, B:42:0x00d5, B:44:0x00f3, B:46:0x0101, B:48:0x0105, B:50:0x011f, B:52:0x012c, B:54:0x0140, B:55:0x0144, B:57:0x0168, B:66:0x019c, B:60:0x0174, B:62:0x0188, B:64:0x018e, B:68:0x01a0, B:69:0x01a7), top: B:79:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.paymaya.common.utility.V r17, com.paymaya.domain.model.QRPHDetails r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ja.b.n(com.paymaya.common.utility.V, com.paymaya.domain.model.QRPHDetails, int, java.lang.String):void");
    }

    public final void o(String str, int i, V[] vArr) {
        T t5;
        T t10 = C.f10389Q;
        if (g()) {
            try {
                if (!C2576A.z(str, "000201", false, 2)) {
                    a0[] a0VarArr = a0.f10692a;
                    throw new MayaQRErrorException(C.f10392b, "parsingError", "", "");
                }
                b0.a(str);
                QRPHDetails qRPHDetailsF = b0.f(str);
                V vD = b0.d(qRPHDetailsF);
                String acquirerId = qRPHDetailsF.getAcquirerId();
                if (acquirerId == null) {
                    acquirerId = "";
                }
                if (!E1.c.t(str)) {
                    a0[] a0VarArr2 = a0.f10692a;
                    throw new MayaQRErrorException(C.f10383K, "tamperedQR", "", acquirerId);
                }
                if (!C1129o.p(vArr, vD)) {
                    a0[] a0VarArr3 = a0.f10692a;
                    throw new MayaQRErrorException(C.f10390R, "qrPHTypeNotAllowed", "", "");
                }
                int iOrdinal = vD.ordinal();
                if (iOrdinal == 0) {
                    p(qRPHDetailsF, i);
                    return;
                }
                if (iOrdinal == 1) {
                    m(qRPHDetailsF, i);
                    return;
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    n(vD, qRPHDetailsF, i, str);
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a0[] a0VarArr4 = a0.f10692a;
                    throw new MayaQRErrorException(t10, "parsingError", "", "");
                }
            } catch (Exception e) {
                MayaQRErrorException mayaQRErrorException = e instanceof MayaQRErrorException ? (MayaQRErrorException) e : null;
                String str2 = j.b((mayaQRErrorException == null || (t5 = mayaQRErrorException.c) == null) ? null : t5.c, t10.c) ? t10.c : mayaQRErrorException != null ? mayaQRErrorException.f10360a : null;
                q(this, i, String.valueOf(mayaQRErrorException != null ? -400 : null), e.getMessage(), mayaQRErrorException);
                k(i, str2);
                yk.a.b();
            }
        }
    }

    public final void p(QRPHDetails qRPHDetails, int i) {
        String purpose;
        if (this.f) {
            return;
        }
        try {
            b0.f10693a.p(qRPHDetails);
            this.f = true;
            String creditAccountNumber = qRPHDetails.getCreditAccountNumber();
            String transactionAmount = qRPHDetails.getTransactionAmount();
            QRAdditionalData additionalData = qRPHDetails.getAdditionalData();
            if (additionalData == null || (purpose = additionalData.getPurpose()) == null) {
                purpose = "";
            }
            QRRecipient qRRecipientE = Z.e(creditAccountNumber, transactionAmount, purpose);
            if (this.f2498d.e().isQREventsV2Enabled()) {
                t(L.c(new Pair(EnumC1212a.QR_CLASS, "P2P")));
            } else {
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                x(i, "SEND_MONEY_INSTAPAY_QR");
            }
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).R1();
            ((MayaMLKitQRScannerFragment) ((Ma.a) this.c.get())).S1();
            Ma.a aVar = (Ma.a) this.c.get();
            j.d(qRRecipientE);
            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) aVar;
            mayaMLKitQRScannerFragment.getClass();
            Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
            if (eVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                mayaQRActivity.n1().T(mayaQRActivity, qRRecipientE);
            }
        } catch (Exception e) {
            MayaQRErrorException mayaQRErrorException = e instanceof MayaQRErrorException ? (MayaQRErrorException) e : null;
            q(this, i, String.valueOf(mayaQRErrorException != null ? -400 : null), e.getMessage(), mayaQRErrorException);
            k(i, null);
            yk.a.b();
        }
    }

    public final void r() {
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
        mayaMLKitQRScannerFragment.getClass();
        B bE = AbstractC1955a.k(mayaMLKitQRScannerFragment).e(zh.b.a());
        Gh.f fVar = new Gh.f(new w(this, 3), Eh.d.f1366d);
        bE.g(fVar);
        e(fVar);
    }

    public final void s(Map map) {
        C1219h c1219hE = C1219h.e(AbstractC1213b.a(5));
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
        mayaMLKitQRScannerFragment.o1().c(mayaMLKitQRScannerFragment.getActivity(), c1219hE);
    }

    public final void t(Map map) {
        C1219h c1219hE = C1219h.e(AbstractC1213b.C(2).concat("_SCANNED"));
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
        mayaMLKitQRScannerFragment.o1().c(mayaMLKitQRScannerFragment.getActivity(), c1219hE);
    }

    public final void u(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            s sVar = (Ma.a) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(Constants.REASON, str);
            ((MayaBaseFragment) sVar).A1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        s sVar2 = (Ma.a) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(Constants.REASON, str);
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
    }

    public final void w(String qrType, String str, String merchantName) {
        j.g(qrType, "qrType");
        j.g(merchantName, "merchantName");
        if (this.f2498d.e().isQREventsV2Enabled()) {
            t(M.h(new Pair(EnumC1212a.QR_TYPE, qrType), new Pair(EnumC1212a.QR_CLASS, "P2M"), new Pair(EnumC1212a.MERCHANT_TYPE, str), new Pair(EnumC1212a.MERCHANT_NAME, merchantName), new Pair(EnumC1212a.PAGE, "Pay with QR")));
        }
    }

    public final void x(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            s sVar = (Ma.a) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(14);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(SessionDescription.ATTR_TYPE, str);
            ((MayaBaseFragment) sVar).A1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        s sVar2 = (Ma.a) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(14);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(SessionDescription.ATTR_TYPE, str);
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
    }

    public final void y(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        int i = 0;
        if (!this.f) {
            this.f = true;
            if (!this.f2498d.e().isMerchantPaymentAvailable()) {
                String strMMessage = this.f2498d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
                String strAnalyticsEventQRType = qRPHMerchantPaymentRequest.analyticsEventQRType();
                String type = qRPHMerchantPaymentRequest.getType();
                v(this, null, strMMessage, strAnalyticsEventQRType, type == null ? "" : type, qRPHMerchantPaymentRequest.getMerchantDetails().getName(), 33);
                Ma.a aVar = (Ma.a) this.c.get();
                j.d(strMMessage);
                MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) aVar;
                mayaMLKitQRScannerFragment.getClass();
                Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                if (eVar != null) {
                    MayaQRActivity mayaQRActivity = (MayaQRActivity) eVar;
                    mayaQRActivity.n1();
                    i.U(mayaQRActivity, mayaQRActivity.getString(R.string.pma_label_pay), strMMessage);
                    return;
                }
                return;
            }
            if (this.f2498d.e().isQrWithCheckoutFlowEnabled() && qRPHMerchantPaymentRequest.isDynamicPointOfInitiation()) {
                ((MayaBaseFragment) ((Ma.a) this.c.get())).D1();
                p pVarB = this.e.b(qRPHMerchantPaymentRequest);
                e(new Kh.T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new v(this, 4), 2), new A7.f(22, this, qRPHMerchantPaymentRequest), i), new a(this, 0)).e());
                return;
            }
            String strAnalyticsEventQRType2 = qRPHMerchantPaymentRequest.analyticsEventQRType();
            String type2 = qRPHMerchantPaymentRequest.getType();
            w(strAnalyticsEventQRType2, type2 != null ? type2 : "", qRPHMerchantPaymentRequest.getMerchantDetails().getName());
            MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment2 = (MayaMLKitQRScannerFragment) ((Ma.a) this.c.get());
            mayaMLKitQRScannerFragment2.getClass();
            Na.e eVar2 = mayaMLKitQRScannerFragment2.f13591j0;
            if (eVar2 != null) {
                MayaQRActivity mayaQRActivity2 = (MayaQRActivity) eVar2;
                mayaQRActivity2.n1();
                i.P(mayaQRActivity2, qRPHMerchantPaymentRequest, true);
            }
        }
    }
}
