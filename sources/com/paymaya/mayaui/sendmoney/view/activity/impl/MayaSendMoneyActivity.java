package com.paymaya.mayaui.sendmoney.view.activity.impl;

import B5.i;
import Bb.p;
import Cb.a;
import D.C0187u;
import Fb.e;
import Gb.b;
import Gb.c;
import Gb.k;
import Gb.o;
import N5.C0444d;
import N5.C0491z;
import Y6.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.SendMoneyCard;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyOTPFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyReceiptFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import y5.InterfaceC2511c;
import y5.g;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSendMoneyActivity extends l implements a, g, k, d, c, b, W6.k, Gb.l, o, Y6.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f13736B = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f13737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f13738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MayaPostTransactionBottomSheetDialogFragment f13739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Transfer f13740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FavoriteDetails f13741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FavoriteCount f13742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Decoration f13743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f13744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bb.a f13745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActivityResultLauncher f13746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f13747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ActivityResultLauncher f13748y;

    public MayaSendMoneyActivity() {
        final int i = 0;
        this.f13746w = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyActivity f1111b;

            {
                this.f1111b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment;
                TransferRecipient.Builder builder;
                TransferRecipient.Builder builderMRecipientName;
                TransferRecipient transferRecipientBuild = null;
                switch (i) {
                    case 0:
                        ActivityResult result = (ActivityResult) obj;
                        int i4 = MayaSendMoneyActivity.f13736B;
                        j.g(result, "result");
                        int resultCode = result.getResultCode();
                        MayaSendMoneyActivity mayaSendMoneyActivity = this.f1111b;
                        if (resultCode == 6) {
                            mayaSendMoneyActivity.f13741r = null;
                            MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = mayaSendMoneyActivity.f13739p;
                            if (mayaPostTransactionBottomSheetDialogFragment2 != null) {
                                mayaPostTransactionBottomSheetDialogFragment2.s1();
                            }
                            break;
                        } else if (result.getResultCode() == 7 && (mayaPostTransactionBottomSheetDialogFragment = mayaSendMoneyActivity.f13739p) != null) {
                            mayaPostTransactionBottomSheetDialogFragment.t1();
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult it = (ActivityResult) obj;
                        int i6 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (it.getResultCode() == 6) {
                            this.f1111b.f();
                        }
                        break;
                    default:
                        MayaSendMoneyActivity mayaSendMoneyActivity2 = this.f1111b;
                        ActivityResult it2 = (ActivityResult) obj;
                        int i10 = MayaSendMoneyActivity.f13736B;
                        j.g(it2, "it");
                        if (it2.getResultCode() == -1 && it2.getData() != null) {
                            Fragment fragment = mayaSendMoneyActivity2.f13738o;
                            if (fragment instanceof MayaSendMoneyReceiptFragment) {
                                p pVar = (p) ((MayaSendMoneyReceiptFragment) fragment).m2();
                                Transfer transferN2 = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2();
                                TransferRecipient transferRecipientMTransferRecipient = transferN2.mTransferRecipient();
                                Contact contactA = pVar.e.a(transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mValue() : null);
                                if (contactA != null) {
                                    Transfer.Builder builder2 = transferN2.toBuilder();
                                    TransferRecipient transferRecipientMTransferRecipient2 = transferN2.mTransferRecipient();
                                    if (transferRecipientMTransferRecipient2 != null && (builder = transferRecipientMTransferRecipient2.toBuilder()) != null && (builderMRecipientName = builder.mRecipientName(contactA.mName())) != null) {
                                        transferRecipientBuild = builderMRecipientName.build();
                                    }
                                    Transfer transferBuild = builder2.mTransferRecipient(transferRecipientBuild).build();
                                    e eVar = (e) pVar.c.get();
                                    j.d(transferBuild);
                                    MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) eVar;
                                    mayaSendMoneyReceiptFragment.getClass();
                                    mayaSendMoneyReceiptFragment.f13826M0 = transferBuild;
                                    pVar.C(transferBuild);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f13747x = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyActivity f1111b;

            {
                this.f1111b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment;
                TransferRecipient.Builder builder;
                TransferRecipient.Builder builderMRecipientName;
                TransferRecipient transferRecipientBuild = null;
                switch (i4) {
                    case 0:
                        ActivityResult result = (ActivityResult) obj;
                        int i42 = MayaSendMoneyActivity.f13736B;
                        j.g(result, "result");
                        int resultCode = result.getResultCode();
                        MayaSendMoneyActivity mayaSendMoneyActivity = this.f1111b;
                        if (resultCode == 6) {
                            mayaSendMoneyActivity.f13741r = null;
                            MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = mayaSendMoneyActivity.f13739p;
                            if (mayaPostTransactionBottomSheetDialogFragment2 != null) {
                                mayaPostTransactionBottomSheetDialogFragment2.s1();
                            }
                            break;
                        } else if (result.getResultCode() == 7 && (mayaPostTransactionBottomSheetDialogFragment = mayaSendMoneyActivity.f13739p) != null) {
                            mayaPostTransactionBottomSheetDialogFragment.t1();
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult it = (ActivityResult) obj;
                        int i6 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (it.getResultCode() == 6) {
                            this.f1111b.f();
                        }
                        break;
                    default:
                        MayaSendMoneyActivity mayaSendMoneyActivity2 = this.f1111b;
                        ActivityResult it2 = (ActivityResult) obj;
                        int i10 = MayaSendMoneyActivity.f13736B;
                        j.g(it2, "it");
                        if (it2.getResultCode() == -1 && it2.getData() != null) {
                            Fragment fragment = mayaSendMoneyActivity2.f13738o;
                            if (fragment instanceof MayaSendMoneyReceiptFragment) {
                                p pVar = (p) ((MayaSendMoneyReceiptFragment) fragment).m2();
                                Transfer transferN2 = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2();
                                TransferRecipient transferRecipientMTransferRecipient = transferN2.mTransferRecipient();
                                Contact contactA = pVar.e.a(transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mValue() : null);
                                if (contactA != null) {
                                    Transfer.Builder builder2 = transferN2.toBuilder();
                                    TransferRecipient transferRecipientMTransferRecipient2 = transferN2.mTransferRecipient();
                                    if (transferRecipientMTransferRecipient2 != null && (builder = transferRecipientMTransferRecipient2.toBuilder()) != null && (builderMRecipientName = builder.mRecipientName(contactA.mName())) != null) {
                                        transferRecipientBuild = builderMRecipientName.build();
                                    }
                                    Transfer transferBuild = builder2.mTransferRecipient(transferRecipientBuild).build();
                                    e eVar = (e) pVar.c.get();
                                    j.d(transferBuild);
                                    MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) eVar;
                                    mayaSendMoneyReceiptFragment.getClass();
                                    mayaSendMoneyReceiptFragment.f13826M0 = transferBuild;
                                    pVar.C(transferBuild);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 2;
        this.f13748y = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: Db.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyActivity f1111b;

            {
                this.f1111b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment;
                TransferRecipient.Builder builder;
                TransferRecipient.Builder builderMRecipientName;
                TransferRecipient transferRecipientBuild = null;
                switch (i6) {
                    case 0:
                        ActivityResult result = (ActivityResult) obj;
                        int i42 = MayaSendMoneyActivity.f13736B;
                        j.g(result, "result");
                        int resultCode = result.getResultCode();
                        MayaSendMoneyActivity mayaSendMoneyActivity = this.f1111b;
                        if (resultCode == 6) {
                            mayaSendMoneyActivity.f13741r = null;
                            MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = mayaSendMoneyActivity.f13739p;
                            if (mayaPostTransactionBottomSheetDialogFragment2 != null) {
                                mayaPostTransactionBottomSheetDialogFragment2.s1();
                            }
                            break;
                        } else if (result.getResultCode() == 7 && (mayaPostTransactionBottomSheetDialogFragment = mayaSendMoneyActivity.f13739p) != null) {
                            mayaPostTransactionBottomSheetDialogFragment.t1();
                            break;
                        }
                        break;
                    case 1:
                        ActivityResult it = (ActivityResult) obj;
                        int i62 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (it.getResultCode() == 6) {
                            this.f1111b.f();
                        }
                        break;
                    default:
                        MayaSendMoneyActivity mayaSendMoneyActivity2 = this.f1111b;
                        ActivityResult it2 = (ActivityResult) obj;
                        int i10 = MayaSendMoneyActivity.f13736B;
                        j.g(it2, "it");
                        if (it2.getResultCode() == -1 && it2.getData() != null) {
                            Fragment fragment = mayaSendMoneyActivity2.f13738o;
                            if (fragment instanceof MayaSendMoneyReceiptFragment) {
                                p pVar = (p) ((MayaSendMoneyReceiptFragment) fragment).m2();
                                Transfer transferN2 = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2();
                                TransferRecipient transferRecipientMTransferRecipient = transferN2.mTransferRecipient();
                                Contact contactA = pVar.e.a(transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mValue() : null);
                                if (contactA != null) {
                                    Transfer.Builder builder2 = transferN2.toBuilder();
                                    TransferRecipient transferRecipientMTransferRecipient2 = transferN2.mTransferRecipient();
                                    if (transferRecipientMTransferRecipient2 != null && (builder = transferRecipientMTransferRecipient2.toBuilder()) != null && (builderMRecipientName = builder.mRecipientName(contactA.mName())) != null) {
                                        transferRecipientBuild = builderMRecipientName.build();
                                    }
                                    Transfer transferBuild = builder2.mTransferRecipient(transferRecipientBuild).build();
                                    e eVar = (e) pVar.c.get();
                                    j.d(transferBuild);
                                    MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) eVar;
                                    mayaSendMoneyReceiptFragment.getClass();
                                    mayaSendMoneyReceiptFragment.f13826M0 = transferBuild;
                                    pVar.C(transferBuild);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        Fragment fragment2 = this.f13738o;
        this.f13744u = fragment2 instanceof MayaSendMoneyFragment ? numX49.tnTj78("bjgP") : fragment2 instanceof MayaSendMoneyConfirmationFragment ? numX49.tnTj78("bjgb") : fragment2 instanceof MayaSendMoneyOTPFragment ? numX49.tnTj78("bjg2") : fragment2 instanceof MayaContactsSelectionFragment ? numX49.tnTj78("bjgL") : Y1();
        this.f13738o = fragment;
        w1(true);
        x1(true);
        y1(true);
        if (fragment instanceof MayaSendMoneyFragment) {
            T1();
            K1(getString(R.string.maya_label_send_money));
            return;
        }
        if (fragment instanceof MayaContactsSelectionFragment) {
            K1(getString(R.string.maya_label_all_contacts_title));
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (fragment instanceof MayaSendMoneyDecorationPreviewFragment) {
            K1(getString(R.string.maya_label_preview));
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (fragment instanceof MayaSendMoneyConfirmationFragment) {
            t1();
            return;
        }
        if (fragment instanceof MayaSendMoneyOTPFragment) {
            K1(getString(R.string.maya_label_one_time_pin));
            t1();
            r1();
            s1();
            return;
        }
        if (fragment instanceof MayaSendMoneyReceiptFragment) {
            w1(false);
            return;
        }
        if (fragment instanceof MayaAllowContactsPermissionFragment) {
            K1(getString(R.string.maya_label_all_contacts_title));
            T1();
            r1();
            s1();
            U1();
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        j.g(str, numX49.tnTj78("bjgr"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    @Override // Y6.d
    public final void U() {
        AbstractC1236z.f(this);
    }

    public final Bb.a X1() {
        Bb.a aVar = this.f13745v;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjgZ"));
        throw null;
    }

    public final String Y1() {
        String string;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (string = extras.getString(numX49.tnTj78("bjgk"))) == null) ? numX49.tnTj78("bjgB") : string;
    }

    public final void Z1() {
        if (p1().e().isAppEventV2SendMoneyEnabled()) {
            String strTnTj78 = this.f13744u;
            if (strTnTj78 == null) {
                strTnTj78 = numX49.tnTj78("bjgu");
            }
            C1220i c1220iK1 = k1();
            C1219h c1219hE = C1219h.e(numX49.tnTj78("bjgV").concat(AbstractC1173g.G(2)));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put(numX49.tnTj78("bjgS"), strTnTj78);
            c1220iK1.b(c1219hE);
        }
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, str, null, null, null, false, payMayaError, null, false, 445).show(getSupportFragmentManager(), numX49.tnTj78("bjgj"));
    }

    public final void a2(String str, String str2) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("bjgd") + EnumC1212a.BUTTON + numX49.tnTj78("bjgi") + AbstractC1173g.G(18));
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("bjgE"), numX49.tnTj78("bjgF"));
        map.put(numX49.tnTj78("bjgH"), str);
        map.put(numX49.tnTj78("bjgO"), str2);
        c1220iK1.b(c1219hE);
    }

    public final void b2(Decoration decoration, Amount amount, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjgQ"), decoration);
        bundle.putParcelable(numX49.tnTj78("bjgt"), amount);
        bundle.putString(numX49.tnTj78("bjgU"), str);
        bundle.putBoolean(numX49.tnTj78("bjge"), false);
        MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
        mayaSendMoneyDecorationPreviewFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container_frame_layout, mayaSendMoneyDecorationPreviewFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    public final void c2(Transfer transfer, String str) {
        MayaSendMoneyOTPFragment mayaSendMoneyOTPFragment = new MayaSendMoneyOTPFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjg8"), str);
        bundle.putParcelable(numX49.tnTj78("bjgC"), transfer);
        mayaSendMoneyOTPFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container_frame_layout, mayaSendMoneyOTPFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    public final void d2(Transfer transfer, FavoriteDetails favoriteDetails, FavoriteStatus favoriteStatus) {
        final int i = 0;
        final int i4 = 1;
        j.g(transfer, numX49.tnTj78("bjg4"));
        j.g(favoriteStatus, numX49.tnTj78("bjgo"));
        this.f13740q = transfer;
        this.f13741r = favoriteDetails;
        Z1();
        Amount amountMTransferAmount = transfer.mTransferAmount();
        String string = getString(R.string.maya_format_youve_successfully_sent_amount, getString(R.string.maya_format_php_currency_amount_with_new_line, amountMTransferAmount != null ? amountMTransferAmount.getValueAsDouble() : null));
        j.f(string, numX49.tnTj78("bjgK"));
        final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragmentC = N4.d.c(R.drawable.maya_ic_success, string, getString(R.string.maya_format_success_dialog_description_from_wallet_to_recipient, transfer.mRecipientPrimaryDestination()), getString(R.string.maya_label_done), getString(R.string.maya_label_view_receipt), favoriteStatus);
        Z1();
        EnumC1215d enumC1215d = EnumC1215d.SEND_MONEY;
        mayaPostTransactionBottomSheetDialogFragmentC.f11877b0 = true;
        mayaPostTransactionBottomSheetDialogFragmentC.f11878c0 = enumC1215d;
        mayaPostTransactionBottomSheetDialogFragmentC.f11879d0 = EnumC1216e.SUCCESS;
        mayaPostTransactionBottomSheetDialogFragmentC.f11880e0 = new Function1(this) { // from class: Db.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyActivity f1113b;

            {
                this.f1113b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = mayaPostTransactionBottomSheetDialogFragmentC;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                EnumC1215d enumC1215d2 = EnumC1215d.SEND_MONEY;
                MayaSendMoneyActivity mayaSendMoneyActivity = this.f1113b;
                View it = (View) obj;
                switch (i) {
                    case 0:
                        int i6 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (mayaSendMoneyActivity.p1().e().isAppEventV2SendMoneyEnabled()) {
                            EnumC1217f enumC1217f = EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL;
                            mayaSendMoneyActivity.a2(Ke.d.a("DONE"), "Dashboard");
                        } else {
                            C1220i c1220iK1 = mayaSendMoneyActivity.k1();
                            C1219h c1219hD = C1219h.d(enumC1215d2);
                            c1219hD.r(enumC1216e);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.DONE);
                            c1219hD.i();
                            c1220iK1.c(mayaSendMoneyActivity, c1219hD);
                        }
                        mayaSendMoneyActivity.X1().p();
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaSendMoneyActivity.f13739p = null;
                        break;
                    default:
                        int i10 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (mayaSendMoneyActivity.p1().e().isAppEventV2SendMoneyEnabled()) {
                            mayaSendMoneyActivity.a2("View receipt", "Send Money Transaction Receipt");
                        } else {
                            C1220i c1220iK12 = mayaSendMoneyActivity.k1();
                            C1219h c1219hD2 = C1219h.d(enumC1215d2);
                            c1219hD2.r(enumC1216e);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.RECEIPT);
                            c1219hD2.i();
                            c1220iK12.c(mayaSendMoneyActivity, c1219hD2);
                        }
                        Transfer transfer2 = mayaSendMoneyActivity.f13740q;
                        FavoriteDetails favoriteDetails2 = mayaSendMoneyActivity.f13741r;
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = new MayaSendMoneyReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("transfer", transfer2);
                        bundle.putParcelable("favorite_details", favoriteDetails2);
                        mayaSendMoneyReceiptFragment.setArguments(bundle);
                        AbstractC1236z.h(mayaSendMoneyActivity, R.id.fragment_container_frame_layout, mayaSendMoneyReceiptFragment);
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaSendMoneyActivity.f13739p = null;
                        break;
                }
                return Unit.f18162a;
            }
        };
        mayaPostTransactionBottomSheetDialogFragmentC.f11881f0 = new Function1(this) { // from class: Db.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyActivity f1113b;

            {
                this.f1113b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = mayaPostTransactionBottomSheetDialogFragmentC;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                EnumC1215d enumC1215d2 = EnumC1215d.SEND_MONEY;
                MayaSendMoneyActivity mayaSendMoneyActivity = this.f1113b;
                View it = (View) obj;
                switch (i4) {
                    case 0:
                        int i6 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (mayaSendMoneyActivity.p1().e().isAppEventV2SendMoneyEnabled()) {
                            EnumC1217f enumC1217f = EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL;
                            mayaSendMoneyActivity.a2(Ke.d.a("DONE"), "Dashboard");
                        } else {
                            C1220i c1220iK1 = mayaSendMoneyActivity.k1();
                            C1219h c1219hD = C1219h.d(enumC1215d2);
                            c1219hD.r(enumC1216e);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.DONE);
                            c1219hD.i();
                            c1220iK1.c(mayaSendMoneyActivity, c1219hD);
                        }
                        mayaSendMoneyActivity.X1().p();
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaSendMoneyActivity.f13739p = null;
                        break;
                    default:
                        int i10 = MayaSendMoneyActivity.f13736B;
                        j.g(it, "it");
                        if (mayaSendMoneyActivity.p1().e().isAppEventV2SendMoneyEnabled()) {
                            mayaSendMoneyActivity.a2("View receipt", "Send Money Transaction Receipt");
                        } else {
                            C1220i c1220iK12 = mayaSendMoneyActivity.k1();
                            C1219h c1219hD2 = C1219h.d(enumC1215d2);
                            c1219hD2.r(enumC1216e);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.RECEIPT);
                            c1219hD2.i();
                            c1220iK12.c(mayaSendMoneyActivity, c1219hD2);
                        }
                        Transfer transfer2 = mayaSendMoneyActivity.f13740q;
                        FavoriteDetails favoriteDetails2 = mayaSendMoneyActivity.f13741r;
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = new MayaSendMoneyReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("transfer", transfer2);
                        bundle.putParcelable("favorite_details", favoriteDetails2);
                        mayaSendMoneyReceiptFragment.setArguments(bundle);
                        AbstractC1236z.h(mayaSendMoneyActivity, R.id.fragment_container_frame_layout, mayaSendMoneyReceiptFragment);
                        mayaPostTransactionBottomSheetDialogFragment.dismiss();
                        mayaSendMoneyActivity.f13739p = null;
                        break;
                }
                return Unit.f18162a;
            }
        };
        mayaPostTransactionBottomSheetDialogFragmentC.f11882g0 = new C7.g(i4, this, transfer, favoriteDetails);
        this.f13739p = mayaPostTransactionBottomSheetDialogFragmentC;
        mayaPostTransactionBottomSheetDialogFragmentC.show(getSupportFragmentManager(), numX49.tnTj78("bjgw"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        X1().p();
    }

    @Override // Y6.a
    public final void g() {
        AbstractC1236z.h(this, R.id.fragment_container_frame_layout, new MayaContactsSelectionFragment());
    }

    @Override // Y6.a
    public final void k() {
        if (this.f13738o instanceof MayaAllowContactsPermissionFragment) {
            AbstractC1236z.e(this, MayaAllowContactsPermissionFragment.class, true);
        }
    }

    @Override // W6.k
    public final void k0() {
    }

    @Override // y5.n
    public final void l(String str) {
        j.g(str, numX49.tnTj78("bjgc"));
        n1().k0(this, str);
    }

    @Override // y5.j
    public final void o(String str, String str2) {
        M2.b.Z(0, str, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(getSupportFragmentManager(), numX49.tnTj78("bjgm"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f13738o;
        if (activityResultCaller instanceof InterfaceC2511c) {
            j.e(activityResultCaller, numX49.tnTj78("bjgD"));
            if (((InterfaceC2511c) activityResultCaller).e0()) {
                return;
            }
        }
        Fragment fragment = this.f13738o;
        boolean z4 = fragment instanceof MayaSendMoneyFragment;
        String strTnTj78 = numX49.tnTj78("bjgh");
        String strTnTj782 = numX49.tnTj78("bjgM");
        String strTnTj783 = numX49.tnTj78("bjgN");
        String strTnTj784 = numX49.tnTj78("bjg6");
        String strTnTj785 = numX49.tnTj78("bjga");
        if (!z4) {
            if (!(fragment instanceof MayaSendMoneyConfirmationFragment)) {
                super.onBackPressed();
                return;
            }
            if (p1().e().isAppEventV2BankTransferEnabled()) {
                C1220i c1220iK1 = k1();
                C1219h c1219hE = C1219h.e(numX49.tnTj78("bjgv") + EnumC1212a.BUTTON + strTnTj785 + AbstractC1173g.G(18));
                HashMap map = c1219hE.j;
                map.put(strTnTj784, numX49.tnTj78("bjg7"));
                map.put(strTnTj783, strTnTj782);
                map.put(strTnTj78, Y1());
                c1220iK1.b(c1219hE);
            }
            super.onBackPressed();
            return;
        }
        if (p1().e().isAppEventV2BankTransferEnabled()) {
            Fragment fragment2 = this.f13738o;
            MayaSendMoneyFragment mayaSendMoneyFragment = fragment2 instanceof MayaSendMoneyFragment ? (MayaSendMoneyFragment) fragment2 : null;
            String strValueOf = mayaSendMoneyFragment != null ? String.valueOf(mayaSendMoneyFragment.T1()) : numX49.tnTj78("bjgX");
            C1220i c1220iK12 = k1();
            C1219h c1219hE2 = C1219h.e(numX49.tnTj78("bjgG") + EnumC1212a.BUTTON + strTnTj785 + AbstractC1173g.G(18));
            HashMap map2 = c1219hE2.j;
            map2.put(strTnTj784, numX49.tnTj78("bjg3"));
            map2.put(strTnTj783, strTnTj782);
            map2.put(strTnTj78, Y1());
            map2.put(numX49.tnTj78("bjgy"), strValueOf);
            c1220iK12.b(c1219hE2);
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment;
        String message;
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().x().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13745v = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), 0);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_send_money, (ViewGroup) null, false);
        int i = R.id.fragment_container_frame_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container_frame_layout);
        if (frameLayout != null) {
            int i4 = R.id.guideline_bottom;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_bottom)) != null) {
                i4 = R.id.toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
                if (viewFindChildViewById != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f13737n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 22);
                    setContentView(constraintLayout);
                    C0444d c0444d = this.f13737n;
                    j.d(c0444d);
                    Q1(c0444d.f4073d);
                    X1().h(this);
                    if (bundle == null) {
                        if (!getIntent().getBooleanExtra(numX49.tnTj78("bjgA"), false)) {
                            X1().j();
                            return;
                        }
                        Intent intent = getIntent();
                        String strTnTj78 = numX49.tnTj78("bjgY");
                        UserActivity userActivity = (UserActivity) intent.getParcelableExtra(strTnTj78);
                        if (userActivity == null) {
                            SendMoneyCard sendMoneyCard = (SendMoneyCard) getIntent().getParcelableExtra(numX49.tnTj78("bjgT"));
                            String decorationId = sendMoneyCard != null ? sendMoneyCard.getDecorationId() : null;
                            String amount = sendMoneyCard != null ? sendMoneyCard.getAmount() : null;
                            String strTnTj782 = numX49.tnTj78("bjgR");
                            if (sendMoneyCard == null || (message = sendMoneyCard.getMessage()) == null) {
                                message = strTnTj782;
                            }
                            Amount.Builder builderSBuilder = Amount.sBuilder();
                            if (amount == null) {
                                amount = numX49.tnTj78("bjgp");
                            }
                            Amount amountBuild = builderSBuilder.mValue(amount).build();
                            Decoration.Builder builder = new Decoration.Builder();
                            if (decorationId == null) {
                                decorationId = strTnTj782;
                            }
                            Decoration decorationBuild = builder.mId(decorationId).build();
                            j.d(amountBuild);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable(numX49.tnTj78("bjg0"), decorationBuild);
                            bundle2.putParcelable(numX49.tnTj78("bjgg"), amountBuild);
                            bundle2.putString(numX49.tnTj78("bjgf"), message);
                            bundle2.putBoolean(numX49.tnTj78("bjg1"), false);
                            mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
                            mayaSendMoneyDecorationPreviewFragment.setArguments(bundle2);
                        } else {
                            Intent intent2 = getIntent();
                            String strTnTj783 = numX49.tnTj78("bjgn");
                            boolean booleanExtra = intent2.getBooleanExtra(strTnTj783, true);
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable(strTnTj78, userActivity);
                            bundle3.putBoolean(strTnTj783, booleanExtra);
                            mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
                            mayaSendMoneyDecorationPreviewFragment.setArguments(bundle3);
                        }
                        AbstractC1236z.g(this, R.id.fragment_container_frame_layout, mayaSendMoneyDecorationPreviewFragment);
                        return;
                    }
                    return;
                }
            }
            i = i4;
        }
        throw new NullPointerException(numX49.tnTj78("bjgx").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6275k = null;
        X1().i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.SEND_MONEY;
    }

    @Override // Gb.c
    public final void y0(Decoration decoration) {
        this.f13743t = decoration;
    }
}
