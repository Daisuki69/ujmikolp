package com.paymaya.mayaui.paybills.view.fragment.impl;

import D.C0187u;
import Kh.T;
import L9.C0323a;
import Lh.h;
import N5.C0435a;
import N5.C0450f;
import N5.C0453g;
import N5.F;
import N5.G0;
import O5.a;
import S5.c;
import Sb.i;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import ba.C0930a;
import ba.C0931b;
import ba.C0932c;
import ba.o;
import bg.AbstractC0983W;
import ca.InterfaceC1085a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.firebase.messaging.n;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.store.C1277p;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import da.C1346b;
import defpackage.AbstractC1414e;
import ea.j;
import ea.k;
import f5.f;
import ga.InterfaceC1514a;
import ha.InterfaceC1549b;
import ha.ViewOnClickListenerC1548a;
import java.util.HashMap;
import kotlin.Pair;
import v.AbstractC2329d;
import z2.d;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBillersCategoryFragment extends MayaBaseLoadingFragment implements InterfaceC1514a, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Button f13351A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public AppCompatEditText f13352B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C0453g f13353C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public Button f13354D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public MayaInputLayout f13355E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Button f13356F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public MayaCarousel f13357G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public BannerAdCarousel f13358H0;
    public C0323a I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C0187u f13359J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public InterfaceC1549b f13360K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public j f13361L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public k f13362M0;
    public String N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f13363O0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0450f f13364o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0435a f13365p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f13366q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public F f13367r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f13368s0;
    public TextView t0;
    public RecyclerView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public LinearLayout f13369v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LinearLayoutCompat f13370x0;
    public LinearLayoutCompat y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ConstraintLayout f13371z0;

    public static final void V1(MayaBillersCategoryFragment mayaBillersCategoryFragment) {
        InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment.f13360K0;
        if (interfaceC1549b != null) {
            AbstractC1236z.h((MayaPayBillsActivity) interfaceC1549b, R.id.fragment_container, new MayaPayBillsSearchFragment());
        }
        if (mayaBillersCategoryFragment.t1().e().isBillsPayEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1173g.a(13));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", "Pay Bills");
            mayaBillersCategoryFragment.o1().b(c1219hE);
            return;
        }
        C1220i c1220iO1 = mayaBillersCategoryFragment.o1();
        FragmentActivity activity = mayaBillersCategoryFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.PAY_BILLS);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.SEARCH, c1220iO1, activity, c1219hD);
    }

    public static final void W1(MayaBillersCategoryFragment mayaBillersCategoryFragment) {
        String string;
        InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment.f13360K0;
        if (interfaceC1549b != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1549b;
            o oVar = (o) mayaPayBillsActivity.V1();
            if (oVar.f8596d.e().isPayWithMayaCreditSoonEnabled()) {
                string = ((MayaPayBillsActivity) ((InterfaceC1085a) oVar.c.get())).getString(R.string.maya_label_pay_bills_with_maya_credit_dialog_soon_spiel);
                kotlin.jvm.internal.j.f(string, "getString(...)");
            } else {
                string = ((MayaPayBillsActivity) ((InterfaceC1085a) oVar.c.get())).getString(R.string.maya_label_pay_bills_with_maya_credit_dialog_spiel);
                kotlin.jvm.internal.j.f(string, "getString(...)");
            }
            String str = string;
            String string2 = mayaPayBillsActivity.getString(R.string.maya_label_pay_bills_with_maya_credit_dialog_title);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            d.n(2131231697, string2, str, new Pair(mayaPayBillsActivity.getString(R.string.maya_label_pay_bills_with_maya_credit_dialog_button_apply_now), new C1346b(mayaPayBillsActivity, 0)), new Pair(mayaPayBillsActivity.getString(R.string.maya_label_pay_bills_with_maya_credit_dialog_button_close), new C1346b(mayaPayBillsActivity, 1)), null, 96).show(mayaPayBillsActivity.getSupportFragmentManager(), "pay_with_maya_credit");
        }
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.MCCLBANNER);
        c1219hH.i();
        mayaBillersCategoryFragment.z1(c1219hH);
    }

    public static final void X1(MayaBillersCategoryFragment mayaBillersCategoryFragment) {
        MayaInputLayout mayaInputLayout = mayaBillersCategoryFragment.f13355E0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mInitialReceiptEntrypoint");
            throw null;
        }
        String strG = AbstractC1414e.g(mayaInputLayout);
        C0323a c0323aP1 = mayaBillersCategoryFragment.P1();
        ((MayaBaseFragment) ((InterfaceC1514a) c0323aP1.c.get())).E1();
        new Lh.d(new T(5, new Lh.d(new h(((C1277p) c0323aP1.f2878g).c.getBillsPaymentV3(strG).d(new n(21)), b.a(), 0), new C0931b(c0323aP1, 0), 2), new C0930a(c0323aP1, 1)), new C0932c(c0323aP1, 0), 1).e();
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_billers_category_inner_contents, viewGroup, false);
        int i = R.id.barrier_ad_carousel;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_ad_carousel)) != null) {
            i = R.id.billers_categories_recycler;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.billers_categories_recycler);
            if (recyclerView != null) {
                i = R.id.billers_categories_title_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billers_categories_title_text_view)) != null) {
                    i = R.id.billers_category_ad_banner;
                    BannerAdCarousel bannerAdCarousel = (BannerAdCarousel) ViewBindings.findChildViewById(viewInflate, R.id.billers_category_ad_banner);
                    if (bannerAdCarousel != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                        i = R.id.billers_favorite_container;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.billers_favorite_container);
                        if (viewFindChildViewById != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById;
                            int i4 = R.id.favorite_billers_empty_container_linear;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_empty_container_linear);
                            if (linearLayout != null) {
                                i4 = R.id.favorite_billers_empty_title_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_empty_title_text_view)) != null) {
                                    i4 = R.id.favorite_billers_error_button;
                                    Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_error_button);
                                    if (button != null) {
                                        i4 = R.id.favorite_billers_error_card_view;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_error_card_view);
                                        if (linearLayoutCompat != null) {
                                            i4 = R.id.favorite_billers_error_title_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_error_title_text_view)) != null) {
                                                i4 = R.id.favorite_billers_favorite_recycler_view;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_favorite_recycler_view);
                                                if (recyclerView2 != null) {
                                                    i4 = R.id.favorite_billers_loading;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_loading);
                                                    if (viewFindChildViewById2 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById2;
                                                        int i6 = R.id.favourite_loading_first_box;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.favourite_loading_first_box);
                                                        if (viewFindChildViewById3 != null) {
                                                            i6 = R.id.favourite_loading_second_box;
                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.favourite_loading_second_box);
                                                            if (viewFindChildViewById4 != null) {
                                                                i6 = R.id.favourite_loading_third_box;
                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.favourite_loading_third_box);
                                                                if (viewFindChildViewById5 != null) {
                                                                    i6 = R.id.favourite_loading_title;
                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.favourite_loading_title);
                                                                    if (viewFindChildViewById6 != null) {
                                                                        i6 = R.id.favourite_loading_view_all;
                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.favourite_loading_view_all);
                                                                        if (viewFindChildViewById7 != null) {
                                                                            G0 g02 = new G0(constraintLayout2, 16);
                                                                            i4 = R.id.favorite_billers_maintenance_linear;
                                                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_maintenance_linear);
                                                                            if (linearLayoutCompat2 != null) {
                                                                                i4 = R.id.favorite_billers_see_all_text_view;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_see_all_text_view);
                                                                                if (textView != null) {
                                                                                    i4 = R.id.favorite_billers_title_text_view;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.favorite_billers_title_text_view);
                                                                                    if (textView2 != null) {
                                                                                        F f = new F(constraintLayout, linearLayout, button, linearLayoutCompat, recyclerView2, g02, linearLayoutCompat2, textView, textView2, 7);
                                                                                        i = R.id.billers_maya_carousel_banner;
                                                                                        MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.billers_maya_carousel_banner);
                                                                                        if (mayaCarousel != null) {
                                                                                            i = R.id.billers_pay_with_maya_credit_container;
                                                                                            View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.billers_pay_with_maya_credit_container);
                                                                                            if (viewFindChildViewById8 != null) {
                                                                                                int i10 = R.id.billers_pay_with_maya_credit_button;
                                                                                                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById8, R.id.billers_pay_with_maya_credit_button);
                                                                                                if (button2 != null) {
                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindChildViewById8;
                                                                                                    i10 = R.id.button_billers_pay_with_maya_credit_entrypoint;
                                                                                                    Button button3 = (Button) ViewBindings.findChildViewById(viewFindChildViewById8, R.id.button_billers_pay_with_maya_credit_entrypoint);
                                                                                                    if (button3 != null) {
                                                                                                        i10 = R.id.text_input_layout_billers_pay_with_maya_credit_entrypoint;
                                                                                                        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById8, R.id.text_input_layout_billers_pay_with_maya_credit_entrypoint);
                                                                                                        if (mayaInputLayout != null) {
                                                                                                            this.f13365p0 = new C0435a(nestedScrollView, recyclerView, bannerAdCarousel, f, mayaCarousel, new C0453g(7, constraintLayout3, button2, button3, mayaInputLayout), 9);
                                                                                                            kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                                                                                                            return nestedScrollView;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById8.getResources().getResourceName(i10)));
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
                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_pay_bills_error, viewGroup, false);
        int i = R.id.button_retry;
        if (((Button) ViewBindings.findChildViewById(viewInflate, R.id.button_retry)) != null) {
            i = R.id.image_view_error_image;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_error_image)) != null) {
                i = R.id.text_view_error_message;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_message)) != null) {
                    i = R.id.text_view_error_title;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_title)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_pay_bills_loading, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final C0323a P1() {
        C0323a c0323a = this.I0;
        if (c0323a != null) {
            return c0323a;
        }
        kotlin.jvm.internal.j.n("mBillersCategoryFragmentPresenter");
        throw null;
    }

    public final void Q1() {
        LinearLayout linearLayout = this.f13369v0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mTextViewEmptyFavorites");
            throw null;
        }
    }

    public final void R1() {
        RecyclerView recyclerView = this.u0;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
            throw null;
        }
    }

    public final void S1() {
        TextView textView = this.t0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mTextViewViewAllFavorites");
            throw null;
        }
    }

    public final void T1() {
        Intent intent;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("from_deep_link", "true");
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        intent.setData(null);
    }

    public final void U1(String str) {
        C1219h c1219hE = C1219h.e(AbstractC1173g.a(9));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("button", str);
        map.put("page", "Home");
        o1().b(c1219hE);
    }

    public final void Y1(BillerCategory category) {
        kotlin.jvm.internal.j.g(category, "category");
        InterfaceC1549b interfaceC1549b = this.f13360K0;
        if (interfaceC1549b != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1549b;
            MayaBillersFragment mayaBillersFragment = new MayaBillersFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("biller_category", category);
            mayaBillersFragment.setArguments(bundle);
            AbstractC1236z.i(mayaPayBillsActivity, R.id.fragment_container, mayaBillersFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    public final void Z1() {
        TextView textView = this.f13368s0;
        if (textView != null) {
            textView.setText(R.string.maya_label_my_favorites);
        } else {
            kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
    }

    public final void a2(String str, String str2) {
        InterfaceC1549b interfaceC1549b = this.f13360K0;
        if (interfaceC1549b != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1549b;
            MayaPayBillsFormFragment mayaPayBillsFormFragment = new MayaPayBillsFormFragment();
            Bundle bundle = new Bundle();
            bundle.putString("favorite_id", str);
            bundle.putString("notification_id", str2);
            mayaPayBillsFormFragment.setArguments(bundle);
            AbstractC1236z.i(mayaPayBillsActivity, R.id.fragment_container, mayaPayBillsFormFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C0323a c0323aP1 = P1();
        A5.b bVar = A5.b.i;
        if (c.b((c) c0323aP1.f, bVar)) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            mayaBillersCategoryFragment.getClass();
            mayaBillersCategoryFragment.o1().b(C1219h.e(AbstractC1173g.a(1)));
            C0187u c0187u = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get())).f13359J0;
            if (c0187u == null) {
                kotlin.jvm.internal.j.n("mCleverTapAPI");
                throw null;
            }
            c0187u.m(str2);
            if (!c.b((c) c0323aP1.f, bVar) || str == null || C2576A.H(str)) {
                return;
            }
            if (C.Y(str)) {
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
                mayaBillersCategoryFragment2.getClass();
                InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment2.f13360K0;
                if (interfaceC1549b != null) {
                    ((MayaPayBillsActivity) interfaceC1549b).Q0(str);
                    return;
                }
                return;
            }
            MayaBillersCategoryFragment mayaBillersCategoryFragment3 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            mayaBillersCategoryFragment3.getClass();
            InterfaceC1549b interfaceC1549b2 = mayaBillersCategoryFragment3.f13360K0;
            if (interfaceC1549b2 != null) {
                ((MayaPayBillsActivity) interfaceC1549b2).l(str);
            }
        }
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f13360K0 = (InterfaceC1549b) getActivity();
        a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.I0 = new C0323a(aVar.g(), aVar.h(), aVar.q(), (com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get(), (Uh.d) aVar.f4748y.get());
        this.f13359J0 = (C0187u) aVar.f.get();
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_billers_category, viewGroup, false);
        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
        int i = R.id.edit_text_search_field;
        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(viewInflate, R.id.edit_text_search_field);
        if (appCompatEditText != null) {
            i = R.id.frame_layout_content_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_content_container);
            if (frameLayout != null) {
                this.f13364o0 = new C0450f((ViewGroup) nestedScrollView, (Object) appCompatEditText, (Object) frameLayout, 7);
                View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
                C0450f c0450f = this.f13364o0;
                kotlin.jvm.internal.j.d(c0450f);
                ((FrameLayout) c0450f.f4088d).addView(viewOnCreateView);
                C0450f c0450f2 = this.f13364o0;
                kotlin.jvm.internal.j.d(c0450f2);
                NestedScrollView nestedScrollView2 = (NestedScrollView) c0450f2.c;
                kotlin.jvm.internal.j.f(nestedScrollView2, "getRoot(...)");
                return nestedScrollView2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
        this.f13365p0 = null;
        this.f13364o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        BannerAdCarousel bannerAdCarousel = this.f13358H0;
        if (bannerAdCarousel != null) {
            bannerAdCarousel.c();
        } else {
            kotlin.jvm.internal.j.n("mViewGamAdCarousel");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isBillsPayEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1173g.b(8));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("page", "Pay Bills");
            k kVar = this.f13362M0;
            if (kVar == null) {
                kotlin.jvm.internal.j.n("mBillersFavoriteAdapter");
                throw null;
            }
            map.put("has_favorites", String.valueOf(kVar.getItemCount() > 0));
            k kVar2 = this.f13362M0;
            if (kVar2 == null) {
                kotlin.jvm.internal.j.n("mBillersFavoriteAdapter");
                throw null;
            }
            map.put("favorites_count", String.valueOf(kVar2.getItemCount()));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str = this.N0;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            o1().b(c1219hE);
        }
        InterfaceC1549b interfaceC1549b = this.f13360K0;
        if (interfaceC1549b != null) {
            ((MayaPayBillsActivity) interfaceC1549b).f13344w = "Favorites";
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0323a c0323aP1 = P1();
        if (c.b((c) c0323aP1.f, A5.b.i)) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            mayaBillersCategoryFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1173g.d(8).concat("_APPEAR"));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("attribution", mayaBillersCategoryFragment.n1().f10371a);
            mayaBillersCategoryFragment.o1().b(c1219hE);
        } else {
            MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            mayaBillersCategoryFragment2.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(2);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("attribution", mayaBillersCategoryFragment2.n1().f10371a);
            mayaBillersCategoryFragment2.A1(c1219h);
        }
        InterfaceC1549b interfaceC1549b = this.f13360K0;
        if (interfaceC1549b != null) {
            ((MayaPayBillsActivity) interfaceC1549b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        P1().t();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f13364o0;
        kotlin.jvm.internal.j.d(c0450f);
        this.f13352B0 = (AppCompatEditText) c0450f.f4087b;
        C0435a c0435a = this.f13365p0;
        kotlin.jvm.internal.j.d(c0435a);
        this.f13366q0 = (RecyclerView) c0435a.c;
        F f = (F) c0435a.e;
        this.f13367r0 = f;
        this.f13357G0 = (MayaCarousel) c0435a.f;
        this.f13358H0 = (BannerAdCarousel) c0435a.f4048d;
        TextView textView = (TextView) f.j;
        this.f13368s0 = textView;
        this.t0 = (TextView) f.i;
        this.u0 = (RecyclerView) f.f;
        this.f13369v0 = (LinearLayout) f.f3615d;
        this.w0 = textView;
        this.f13370x0 = (LinearLayoutCompat) f.h;
        this.y0 = (LinearLayoutCompat) f.e;
        this.f13371z0 = ((G0) f.f3616g).f3627b;
        this.f13351A0 = (Button) f.c;
        this.f13362M0 = new k(this);
        RecyclerView recyclerView = this.u0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        k kVar = this.f13362M0;
        if (kVar == null) {
            kotlin.jvm.internal.j.n("mBillersFavoriteAdapter");
            throw null;
        }
        recyclerView.setAdapter(kVar);
        C0435a c0435a2 = this.f13365p0;
        kotlin.jvm.internal.j.d(c0435a2);
        C0453g c0453g = (C0453g) c0435a2.f4049g;
        this.f13353C0 = c0453g;
        this.f13354D0 = (Button) c0453g.c;
        this.f13355E0 = (MayaInputLayout) c0453g.e;
        this.f13356F0 = (Button) c0453g.f4095d;
        C0323a c0323aP1 = P1();
        if (((com.paymaya.data.preference.a) c0323aP1.i).e().isBillsPayInitialReceiptEntrypointEnabled()) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            MayaInputLayout mayaInputLayout = mayaBillersCategoryFragment.f13355E0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mInitialReceiptEntrypoint");
                throw null;
            }
            mayaInputLayout.setVisibility(0);
            Button button = mayaBillersCategoryFragment.f13356F0;
            if (button == null) {
                kotlin.jvm.internal.j.n("mButtonReceiptEntrypoint");
                throw null;
            }
            button.setVisibility(0);
        } else {
            MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            MayaInputLayout mayaInputLayout2 = mayaBillersCategoryFragment2.f13355E0;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mInitialReceiptEntrypoint");
                throw null;
            }
            mayaInputLayout2.setVisibility(8);
            Button button2 = mayaBillersCategoryFragment2.f13356F0;
            if (button2 == null) {
                kotlin.jvm.internal.j.n("mButtonReceiptEntrypoint");
                throw null;
            }
            button2.setVisibility(8);
        }
        C0323a c0323aP12 = P1();
        if (((com.paymaya.data.preference.a) c0323aP12.i).e().isPayWithMayaCreditFragmentEnabled() && ((com.paymaya.data.preference.a) c0323aP12.i).e().isPayWithMayaCreditSoonEnabled()) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment3 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP12.c.get());
            Button button3 = mayaBillersCategoryFragment3.f13354D0;
            if (button3 == null) {
                kotlin.jvm.internal.j.n("mButtonPayWithMayaCredit");
                throw null;
            }
            button3.setText(mayaBillersCategoryFragment3.getString(R.string.maya_label_pay_bills_with_maya_credit_soon_banner_title));
            C0453g c0453g2 = mayaBillersCategoryFragment3.f13353C0;
            if (c0453g2 == null) {
                kotlin.jvm.internal.j.n("mViewGroupPayWithMayaCredit");
                throw null;
            }
            ((ConstraintLayout) c0453g2.f4094b).setVisibility(0);
        } else if (((com.paymaya.data.preference.a) c0323aP12.i).e().isPayWithMayaCreditFragmentEnabled()) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment4 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP12.c.get());
            Button button4 = mayaBillersCategoryFragment4.f13354D0;
            if (button4 == null) {
                kotlin.jvm.internal.j.n("mButtonPayWithMayaCredit");
                throw null;
            }
            button4.setText(mayaBillersCategoryFragment4.getString(R.string.maya_label_pay_bills_with_maya_credit_banner_title));
            C0453g c0453g3 = mayaBillersCategoryFragment4.f13353C0;
            if (c0453g3 == null) {
                kotlin.jvm.internal.j.n("mViewGroupPayWithMayaCredit");
                throw null;
            }
            ((ConstraintLayout) c0453g3.f4094b).setVisibility(0);
        } else {
            C0453g c0453g4 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP12.c.get())).f13353C0;
            if (c0453g4 == null) {
                kotlin.jvm.internal.j.n("mViewGroupPayWithMayaCredit");
                throw null;
            }
            ((ConstraintLayout) c0453g4.f4094b).setVisibility(8);
        }
        C0323a c0323aP13 = P1();
        if (((com.paymaya.data.preference.a) c0323aP13.i).e().isPayWithMayaCreditNewTagEnabled()) {
            Button button5 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP13.c.get())).f13354D0;
            if (button5 == null) {
                kotlin.jvm.internal.j.n("mButtonPayWithMayaCredit");
                throw null;
            }
            button5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_new_tag_purple, 0, R.drawable.maya_ic_chevron_right_primary_black, 0);
        } else {
            Button button6 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP13.c.get())).f13354D0;
            if (button6 == null) {
                kotlin.jvm.internal.j.n("mButtonPayWithMayaCredit");
                throw null;
            }
            button6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_right_primary_black, 0);
        }
        this.f13361L0 = new j(this);
        RecyclerView recyclerView2 = this.f13366q0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewBillersCategoryList");
            throw null;
        }
        recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 4));
        j jVar = this.f13361L0;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mBillersCategoryCardAdapter");
            throw null;
        }
        recyclerView2.setAdapter(jVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.N0 = arguments.getString("analytics_source_page");
        }
        C0323a c0323aP14 = P1();
        if (c.b((c) c0323aP14.f, A5.b.j)) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment5 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP14.c.get());
            BannerAdCarousel bannerAdCarousel = mayaBillersCategoryFragment5.f13358H0;
            if (bannerAdCarousel == null) {
                kotlin.jvm.internal.j.n("mViewGamAdCarousel");
                throw null;
            }
            bannerAdCarousel.c();
            bannerAdCarousel.setVisibility(0);
            BannerAdCarousel bannerAdCarousel2 = mayaBillersCategoryFragment5.f13358H0;
            if (bannerAdCarousel2 == null) {
                kotlin.jvm.internal.j.n("mViewGamAdCarousel");
                throw null;
            }
            f fVar = new f(bannerAdCarousel2);
            fVar.f16717b = s5.d.f20008b;
            LifecycleOwner viewLifecycleOwner = mayaBillersCategoryFragment5.getViewLifecycleOwner();
            kotlin.jvm.internal.j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fVar.c = viewLifecycleOwner;
            FragmentActivity fragmentActivityRequireActivity = mayaBillersCategoryFragment5.requireActivity();
            kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            fVar.f16718d = fragmentActivityRequireActivity;
            fVar.e = mayaBillersCategoryFragment5;
            fVar.f16720k = new H0(6);
            fVar.f16721l = new i(7);
            fVar.j = new H0(7);
            fVar.a();
        } else {
            if (c.b((c) c0323aP14.f, A5.b.i)) {
                MayaBillersCategoryFragment mayaBillersCategoryFragment6 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP14.c.get());
                MayaCarousel mayaCarousel = mayaBillersCategoryFragment6.f13357G0;
                if (mayaCarousel == null) {
                    kotlin.jvm.internal.j.n("mCarousel");
                    throw null;
                }
                int iV1 = mayaBillersCategoryFragment6.v1() - (mayaCarousel.getResources().getDimensionPixelSize(R.dimen.maya_margin_large) * 2);
                int iA = sj.b.a(((double) iV1) / 3.27d);
                mayaCarousel.h(iV1, iA, 0);
                mayaCarousel.j(iV1, iA, 0);
                mayaCarousel.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
                mayaCarousel.setDividerMode(EnumC0650k.f7026b);
                mayaCarousel.setFilterAdsByScreen(AbstractC1173g.d(8).concat("_APPEAR"));
                mayaCarousel.setHideCarouselTitle(true);
                mayaCarousel.setAutomaticScrolling(true);
                mayaCarousel.setEndlessScrolling(true);
                mayaCarousel.setCarouselListener(mayaBillersCategoryFragment6);
                mayaCarousel.setCarouselStateListener(mayaBillersCategoryFragment6);
                mayaCarousel.setShouldSetDisplayListener(false);
                mayaCarousel.setBannerPriorityFixEnabled(c.b(mayaBillersCategoryFragment6.q1(), A5.b.f125o1));
                mayaCarousel.e();
                MayaCarousel mayaCarousel2 = mayaBillersCategoryFragment6.f13357G0;
                if (mayaCarousel2 == null) {
                    kotlin.jvm.internal.j.n("mCarousel");
                    throw null;
                }
                mayaCarousel2.setVisibility(0);
                MayaCarousel mayaCarousel3 = mayaBillersCategoryFragment6.f13357G0;
                if (mayaCarousel3 == null) {
                    kotlin.jvm.internal.j.n("mCarousel");
                    throw null;
                }
                C0187u c0187u = mayaCarousel3.f12035w;
                if (c0187u != null) {
                    c0187u.q(mayaCarousel3);
                }
                MayaCarousel mayaCarousel4 = mayaBillersCategoryFragment6.f13357G0;
                if (mayaCarousel4 == null) {
                    kotlin.jvm.internal.j.n("mCarousel");
                    throw null;
                }
                mayaCarousel4.k();
            }
        }
        TextView textView2 = this.t0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewViewAllFavorites");
            throw null;
        }
        textView2.setOnClickListener(new ViewOnClickListenerC1548a(this, 0));
        Button button7 = this.f13351A0;
        if (button7 == null) {
            kotlin.jvm.internal.j.n("mFavoritesErrorButton");
            throw null;
        }
        button7.setOnClickListener(new ViewOnClickListenerC1548a(this, 1));
        Button button8 = this.f13354D0;
        if (button8 == null) {
            kotlin.jvm.internal.j.n("mButtonPayWithMayaCredit");
            throw null;
        }
        button8.setOnClickListener(new ViewOnClickListenerC1548a(this, 2));
        Button button9 = this.f13356F0;
        if (button9 == null) {
            kotlin.jvm.internal.j.n("mButtonReceiptEntrypoint");
            throw null;
        }
        button9.setOnClickListener(new ViewOnClickListenerC1548a(this, 3));
        AppCompatEditText appCompatEditText = this.f13352B0;
        if (appCompatEditText == null) {
            kotlin.jvm.internal.j.n("mEditTextSearchField");
            throw null;
        }
        appCompatEditText.setOnClickListener(new ViewOnClickListenerC1548a(this, 4));
        P1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.PAY_BILLS;
    }
}
