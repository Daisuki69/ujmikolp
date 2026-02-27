package com.paymaya.mayaui.cashin.view.fragment.impl;

import B5.i;
import G5.t;
import G6.l;
import G6.m;
import G6.r;
import K6.g;
import Kh.C0310o;
import L6.n;
import L6.o;
import M2.b;
import N5.N;
import O5.a;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.B;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.S;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.SevenElevenPushNotification;
import com.paymaya.domain.store.C1274n0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import java.util.Date;
import java.util.Timer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import z2.d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInCodeFragment extends MayaBaseFragment implements g, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public N f11660U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11661V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f11662W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11663X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f11664Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f11665Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f11666a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Group f11667b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f11668c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Group f11669d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f11670e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f11671f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f11672g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f11673h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Group f11674i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View f11675j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Group f11676k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Button f11677l0;
    public HtmlTextView m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Group f11678n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public m f11679o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public n f11680p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Timer f11681q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Date f11682r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f11683s0;

    public final m G1() {
        m mVar = this.f11679o0;
        if (mVar != null) {
            return mVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void H1() {
        final int i = 1;
        m mVarG1 = G1();
        if (mVarG1.e.e().isAppEventsV2CashInEnabled()) {
            MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) ((g) mVarG1.c.get());
            mayaCashInCodeFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.r(1));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", "Cash In Code");
            mayaCashInCodeFragment.o1().b(c1219hE);
        }
        n nVar = this.f11680p0;
        if (nVar != null) {
            final MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) nVar;
            final String string = mayaCashInActivity.getString(R.string.maya_label_done);
            j.f(string, "getString(...)");
            final String string2 = mayaCashInActivity.getString(R.string.maya_label_cancel);
            j.f(string2, "getString(...)");
            String string3 = mayaCashInActivity.getString(R.string.maya_label_cash_in_code_cancel_title);
            j.f(string3, "getString(...)");
            final int i4 = 0;
            d.n(2131231407, string3, null, new Pair(string, new Function1() { // from class: I6.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = string;
                    MayaCashInActivity mayaCashInActivity2 = mayaCashInActivity;
                    View it = (View) obj;
                    switch (i4) {
                        case 0:
                            int i6 = MayaCashInActivity.f11609r;
                            j.g(it, "it");
                            mayaCashInActivity2.getSupportFragmentManager().popBackStack((String) null, 1);
                            mayaCashInActivity2.W1().x(str);
                            break;
                        default:
                            int i10 = MayaCashInActivity.f11609r;
                            j.g(it, "it");
                            mayaCashInActivity2.W1().x(str);
                            break;
                    }
                    return Unit.f18162a;
                }
            }), new Pair(string2, new Function1() { // from class: I6.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = string2;
                    MayaCashInActivity mayaCashInActivity2 = mayaCashInActivity;
                    View it = (View) obj;
                    switch (i) {
                        case 0:
                            int i6 = MayaCashInActivity.f11609r;
                            j.g(it, "it");
                            mayaCashInActivity2.getSupportFragmentManager().popBackStack((String) null, 1);
                            mayaCashInActivity2.W1().x(str);
                            break;
                        default:
                            int i10 = MayaCashInActivity.f11609r;
                            j.g(it, "it");
                            mayaCashInActivity2.W1().x(str);
                            break;
                    }
                    return Unit.f18162a;
                }
            }), null, 96).show(mayaCashInActivity.getSupportFragmentManager(), "alert_dialog");
        }
    }

    public final void I1(String str) {
        n nVar = this.f11680p0;
        if (nVar != null) {
            getString(R.string.pma_toast_error_title_code_generation_error);
            String string = getString(R.string.maya_label_try_again);
            L6.m mVar = new L6.m(this, 3);
            String string2 = getString(R.string.maya_label_back_to_cash_in);
            r rVar = new r(this, 8);
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(0, null, str, string, string2, false, null, mVar, false, 355);
            mayaErrorDialogFragmentZ.f11851d0 = rVar;
            mayaErrorDialogFragmentZ.show(((MayaCashInActivity) nVar).getSupportFragmentManager(), "error_dialog");
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        G1().n("Back");
        H1();
        return true;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        m mVarG1 = G1();
        if (!C.Y(str)) {
            n nVar = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11680p0;
            if (nVar != null) {
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) nVar;
                mayaCashInActivity.n1().t(mayaCashInActivity, str);
                return;
            }
            return;
        }
        n nVar2 = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11680p0;
        if (nVar2 != null) {
            MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) nVar2;
            mayaCashInActivity2.n1();
            i.k(mayaCashInActivity2, str);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().r(EnumC1216e.CODE);
        this.f11680p0 = (n) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        C1274n0 c1274n0 = new C1274n0();
        c1274n0.f11465b = payMayaClientApi;
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        Uh.d pushNotificationSubject = (Uh.d) aVar.f4717g0.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        j.g(pushNotificationSubject, "pushNotificationSubject");
        this.f11679o0 = new m(preference, c1274n0, sessionSubject, pushNotificationSubject);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_cash_in_code, viewGroup, false);
        int i = R.id.amount_due_label_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_due_label_text_view)) != null) {
            i = R.id.amount_due_value_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_due_value_text_view);
            if (textView != null) {
                i = R.id.amount_label_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_label_text_view);
                if (textView2 != null) {
                    i = R.id.amount_value_text_view;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_value_text_view);
                    if (textView3 != null) {
                        i = R.id.barrier_amount;
                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_amount)) != null) {
                            i = R.id.barrier_amount_due;
                            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_amount_due)) != null) {
                                i = R.id.barrier_cash_in_how_to_instruction;
                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_cash_in_how_to_instruction)) != null) {
                                    i = R.id.barrier_padala_content;
                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_padala_content)) != null) {
                                        i = R.id.barrier_service_fee;
                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_service_fee)) != null) {
                                            i = R.id.barrier_valid_until;
                                            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_valid_until)) != null) {
                                                i = R.id.button_edit_amount;
                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_edit_amount);
                                                if (button != null) {
                                                    i = R.id.group_cash_in_barcode;
                                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_cash_in_barcode);
                                                    if (group != null) {
                                                        i = R.id.group_cash_in_code;
                                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_cash_in_code);
                                                        if (group2 != null) {
                                                            i = R.id.group_instruction;
                                                            Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_instruction);
                                                            if (group3 != null) {
                                                                i = R.id.group_padala_content;
                                                                Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_padala_content);
                                                                if (group4 != null) {
                                                                    i = R.id.group_service_fee;
                                                                    Group group5 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_service_fee);
                                                                    if (group5 != null) {
                                                                        i = R.id.guide_line_labels;
                                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_labels)) != null) {
                                                                            i = R.id.image_view_barcode_image;
                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_barcode_image);
                                                                            if (imageView != null) {
                                                                                i = R.id.image_view_cash_in_barcode;
                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_cash_in_barcode)) != null) {
                                                                                    i = R.id.image_view_cash_in_information;
                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_cash_in_information)) != null) {
                                                                                        i = R.id.image_view_close;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_close);
                                                                                        if (imageView2 != null) {
                                                                                            i = R.id.image_view_padala_arrow;
                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_padala_arrow)) != null) {
                                                                                                i = R.id.image_view_padala_icon;
                                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_padala_icon);
                                                                                                if (imageView3 != null) {
                                                                                                    i = R.id.labels_amount_due_view;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.labels_amount_due_view);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.scroll_view;
                                                                                                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view)) != null) {
                                                                                                            i = R.id.text_view_barcode_text;
                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_barcode_text);
                                                                                                            if (textView4 != null) {
                                                                                                                i = R.id.text_view_cash_in_barcode_title;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_barcode_title)) != null) {
                                                                                                                    i = R.id.text_view_cash_in_code_title;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_code_title)) != null) {
                                                                                                                        i = R.id.text_view_cash_in_code_value;
                                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_code_value);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i = R.id.text_view_cash_in_how_to_instruction;
                                                                                                                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_how_to_instruction);
                                                                                                                            if (htmlTextView != null) {
                                                                                                                                i = R.id.text_view_cash_in_how_to_title;
                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_how_to_title)) != null) {
                                                                                                                                    i = R.id.text_view_padala_message;
                                                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_padala_message);
                                                                                                                                    if (textView6 != null) {
                                                                                                                                        i = R.id.text_view_service_fee_label;
                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_service_fee_label)) != null) {
                                                                                                                                            i = R.id.text_view_service_fee_value;
                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_service_fee_value);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                i = R.id.text_view_title_header;
                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    i = R.id.text_view_valid_until_label;
                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_valid_until_label)) != null) {
                                                                                                                                                        i = R.id.text_view_valid_until_value;
                                                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_valid_until_value);
                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                            i = R.id.total_amount_group;
                                                                                                                                                            Group group6 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.total_amount_group);
                                                                                                                                                            if (group6 != null) {
                                                                                                                                                                i = R.id.view_amount_due_content_bottom_space;
                                                                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_amount_due_content_bottom_space);
                                                                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                                                                    i = R.id.view_content;
                                                                                                                                                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_content)) != null) {
                                                                                                                                                                        i = R.id.view_how_to_content;
                                                                                                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_how_to_content);
                                                                                                                                                                        if (viewFindChildViewById3 != null) {
                                                                                                                                                                            i = R.id.view_labels_content;
                                                                                                                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content);
                                                                                                                                                                            if (viewFindChildViewById4 != null) {
                                                                                                                                                                                i = R.id.view_labels_content_bottom_space;
                                                                                                                                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content_bottom_space);
                                                                                                                                                                                if (viewFindChildViewById5 != null) {
                                                                                                                                                                                    i = R.id.view_padala_content;
                                                                                                                                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_padala_content);
                                                                                                                                                                                    if (viewFindChildViewById6 != null) {
                                                                                                                                                                                        i = R.id.view_padala_content_bottom_space;
                                                                                                                                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_padala_content_bottom_space);
                                                                                                                                                                                        if (viewFindChildViewById7 != null) {
                                                                                                                                                                                            i = R.id.view_text_view_amount_divider;
                                                                                                                                                                                            View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.view_text_view_amount_divider);
                                                                                                                                                                                            if (viewFindChildViewById8 != null) {
                                                                                                                                                                                                i = R.id.view_text_view_valid_until_divider;
                                                                                                                                                                                                View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, R.id.view_text_view_valid_until_divider);
                                                                                                                                                                                                if (viewFindChildViewById9 != null) {
                                                                                                                                                                                                    i = R.id.view_view_how_to_content_bottom_space;
                                                                                                                                                                                                    View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, R.id.view_view_how_to_content_bottom_space);
                                                                                                                                                                                                    if (viewFindChildViewById10 != null) {
                                                                                                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                                                                                                        this.f11660U = new N(constraintLayout, textView, textView2, textView3, button, group, group2, group3, group4, group5, imageView, imageView2, imageView3, viewFindChildViewById, textView4, textView5, htmlTextView, textView6, textView7, textView8, textView9, group6, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10);
                                                                                                                                                                                                        j.f(constraintLayout, "getRoot(...)");
                                                                                                                                                                                                        return constraintLayout;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11660U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Timer timer = this.f11681q0;
        if (timer != null) {
            timer.cancel();
        }
        super.onPause();
        m mVarG1 = G1();
        if (mVarG1.e.e().isAppEventsV2CashInEnabled()) {
            g gVar = (g) mVarG1.c.get();
            LoadUpPartner loadUpPartner = (LoadUpPartner) mVarG1.h;
            String strMName = loadUpPartner != null ? loadUpPartner.mName() : null;
            MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) gVar;
            mayaCashInCodeFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.r(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            if (strMName != null) {
                c1219hE.j.put("partner", strMName);
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            n nVar = mayaCashInCodeFragment.f11680p0;
            String stringExtra = nVar != null ? ((MayaCashInActivity) nVar).getIntent().getStringExtra("analytics_source_page") : null;
            if (stringExtra != null) {
                c1219hE.j.put("source_page", stringExtra);
            }
            mayaCashInCodeFragment.o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        n nVar = this.f11680p0;
        if (nVar != null) {
            ((MayaCashInActivity) nVar).Q(this);
        }
        Timer timer = this.f11681q0;
        if (timer != null) {
            timer.cancel();
            Date date = this.f11682r0;
            this.f11681q0 = new Timer();
            o oVar = new o(this);
            Timer timer2 = this.f11681q0;
            if (timer2 != null) {
                timer2.schedule(oVar, date);
            }
        }
        m mVarG1 = G1();
        SevenElevenPushNotification sevenElevenPushNotification = (SevenElevenPushNotification) mVarG1.f1802k;
        if (sevenElevenPushNotification != null) {
            mVarG1.m(sevenElevenPushNotification);
            mVarG1.f1802k = null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 1;
        int i4 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        N n7 = this.f11660U;
        j.d(n7);
        this.f11661V = n7.f3786r;
        N n10 = this.f11660U;
        j.d(n10);
        this.f11662W = n10.f3781l;
        N n11 = this.f11660U;
        j.d(n11);
        this.f11663X = n11.f3783o;
        N n12 = this.f11660U;
        j.d(n12);
        this.f11664Y = n12.f3779g;
        N n13 = this.f11660U;
        j.d(n13);
        this.f11665Z = n13.f3780k;
        N n14 = this.f11660U;
        j.d(n14);
        this.f11666a0 = n14.f3782n;
        N n15 = this.f11660U;
        j.d(n15);
        this.f11667b0 = n15.f;
        N n16 = this.f11660U;
        j.d(n16);
        this.f11668c0 = n16.f3777b;
        N n17 = this.f11660U;
        j.d(n17);
        this.f11669d0 = n17.f3788t;
        N n18 = this.f11660U;
        j.d(n18);
        this.f11670e0 = n18.c;
        N n19 = this.f11660U;
        j.d(n19);
        this.f11671f0 = n19.f3778d;
        N n20 = this.f11660U;
        j.d(n20);
        this.f11672g0 = n20.f3785q;
        N n21 = this.f11660U;
        j.d(n21);
        this.f11673h0 = n21.f3787s;
        N n22 = this.f11660U;
        j.d(n22);
        this.f11674i0 = n22.j;
        N n23 = this.f11660U;
        j.d(n23);
        this.f11675j0 = n23.f3793y;
        N n24 = this.f11660U;
        j.d(n24);
        this.f11676k0 = n24.i;
        j.d(this.f11660U);
        j.d(this.f11660U);
        N n25 = this.f11660U;
        j.d(n25);
        this.f11677l0 = n25.e;
        N n26 = this.f11660U;
        j.d(n26);
        this.m0 = n26.f3784p;
        N n27 = this.f11660U;
        j.d(n27);
        this.f11678n0 = n27.h;
        Bundle arguments = getArguments();
        if (arguments != null) {
            MoneyInTopUpCode moneyInTopUpCode = (MoneyInTopUpCode) arguments.getParcelable("moneyIn");
            LoadUpPartner loadUpPartner = (LoadUpPartner) arguments.getParcelable("loadUpPartner");
            m mVarG1 = G1();
            mVarG1.j();
            mVarG1.i = loadUpPartner != null ? loadUpPartner.mChannel() : null;
            mVarG1.h = loadUpPartner;
            mVarG1.j = moneyInTopUpCode != null ? moneyInTopUpCode.mOriginalAmount() : null;
            g gVar = (g) mVarG1.c.get();
            String strMName = loadUpPartner != null ? loadUpPartner.mName() : null;
            TextView textView = ((MayaCashInCodeFragment) gVar).f11661V;
            if (textView == null) {
                j.n("mTextViewName");
                throw null;
            }
            textView.setText(strMName);
            mVarG1.p(moneyInTopUpCode, loadUpPartner);
            String strMSteps = loadUpPartner != null ? loadUpPartner.mSteps() : null;
            if (strMSteps == null || C2576A.H(strMSteps)) {
                Group group = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11678n0;
                if (group == null) {
                    j.n("mGroupInstruction");
                    throw null;
                }
                group.setVisibility(8);
            } else {
                Group group2 = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11678n0;
                if (group2 == null) {
                    j.n("mGroupInstruction");
                    throw null;
                }
                group2.setVisibility(0);
                MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) ((g) mVarG1.c.get());
                Context context = mayaCashInCodeFragment.getContext();
                HtmlTextView htmlTextView = mayaCashInCodeFragment.m0;
                if (htmlTextView == null) {
                    j.n("mHtmlTextViewInstruction");
                    throw null;
                }
                S s9 = new S(context, htmlTextView);
                HtmlTextView htmlTextView2 = mayaCashInCodeFragment.m0;
                if (htmlTextView2 == null) {
                    j.n("mHtmlTextViewInstruction");
                    throw null;
                }
                B b8 = new B();
                if (!TextUtils.isEmpty(strMSteps)) {
                    htmlTextView2.setText(htmlTextView2.a(strMSteps, b8, s9));
                }
                HtmlTextView htmlTextView3 = mayaCashInCodeFragment.m0;
                if (htmlTextView3 == null) {
                    j.n("mHtmlTextViewInstruction");
                    throw null;
                }
                htmlTextView3.setOnLinkClickListener(mayaCashInCodeFragment);
            }
            if ("smart-padala-code".equalsIgnoreCase(loadUpPartner != null ? loadUpPartner.mSlug() : null)) {
                Group group3 = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11676k0;
                if (group3 == null) {
                    j.n("mGroupPadalaContent");
                    throw null;
                }
                group3.setVisibility(0);
            } else {
                Group group4 = ((MayaCashInCodeFragment) ((g) mVarG1.c.get())).f11676k0;
                if (group4 == null) {
                    j.n("mGroupPadalaContent");
                    throw null;
                }
                group4.setVisibility(8);
            }
            mVarG1.e(new C0310o(((Uh.d) mVarG1.f1801g).e(zh.b.a()).c(l.f1797b), new A5.l(mVarG1, 23), Eh.d.c, Eh.d.f1365b).f());
        }
        ImageView imageView = this.f11662W;
        if (imageView == null) {
            j.n("mImageViewClose");
            throw null;
        }
        imageView.setOnClickListener(new L6.m(this, i4));
        View view2 = this.f11675j0;
        if (view2 == null) {
            j.n("mViewPadalaContent");
            throw null;
        }
        view2.setOnClickListener(new L6.m(this, i));
        Button button = this.f11677l0;
        if (button != null) {
            button.setOnClickListener(new L6.m(this, 2));
        } else {
            j.n("mButtonEditAmount");
            throw null;
        }
    }
}
