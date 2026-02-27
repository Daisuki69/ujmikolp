package com.paymaya.mayaui.travel.view.fragment.impl;

import Ah.p;
import Kh.C0310o;
import Lh.d;
import Lh.h;
import N5.P0;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.W0;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import d4.AbstractC1331a;
import fa.ViewOnClickListenerC1479a;
import jc.a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelConfirmationFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public P0 f14178U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14179V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f14180W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f14181X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f14182Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f14183Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f14184a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f14185b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f14186c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f14187d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Button f14188e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Lb.a f14189f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public kc.a f14190g0;

    public static final void G1(MayaTravelConfirmationFragment mayaTravelConfirmationFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BUY);
        c1219hH.i();
        mayaTravelConfirmationFragment.A1(c1219hH);
        Lb.a aVar = mayaTravelConfirmationFragment.f14189f0;
        if (aVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        ((MayaBaseFragment) ((a) aVar.c.get())).E1();
        W0 w0 = (W0) aVar.e;
        TicketPurchaseConfirmation ticketPurchaseConfirmation = (TicketPurchaseConfirmation) aVar.h;
        p<PurchasedTicket> pVarExecuteTicketPurchase = w0.f11403b.executeTicketPurchase(ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.mId() : null);
        aVar.e(new d(new d(AbstractC1331a.l(pVarExecuteTicketPurchase, pVarExecuteTicketPurchase, b.a()), new A0(aVar, 7), 2), new C1258f0(aVar, 8), 0).e());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRMATION;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f14190g0 = (kc.a) getActivity();
        O5.a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        W0 w0U = aVar.U();
        C1247a c1247aA = aVar.a();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        Lb.a aVar2 = new Lb.a(preference, w0U, c1247aA, sessionPublishSubject);
        this.f14189f0 = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_travel_confirmation, viewGroup, false);
        int i = R.id.barrier_convenience_fee;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_convenience_fee)) != null) {
            i = R.id.barrier_destination;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_destination)) != null) {
                i = R.id.barrier_fare;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_fare)) != null) {
                    i = R.id.barrier_operator;
                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_operator)) != null) {
                        i = R.id.barrier_origin;
                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_origin)) != null) {
                            i = R.id.barrier_route;
                            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_route)) != null) {
                                i = R.id.barrier_source;
                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_source)) != null) {
                                    i = R.id.button_pay_now;
                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_pay_now);
                                    if (button != null) {
                                        i = R.id.guideline_labels;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_labels)) != null) {
                                            i = R.id.image_view_information_icon;
                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_information_icon)) != null) {
                                                i = R.id.scroll_view_travel_confirmation;
                                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_travel_confirmation)) != null) {
                                                    i = R.id.text_view_available_balance_label;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_available_balance_label)) != null) {
                                                        i = R.id.text_view_available_balance_value;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_available_balance_value);
                                                        if (textView != null) {
                                                            i = R.id.text_view_confirm_payment;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_payment)) != null) {
                                                                i = R.id.text_view_convenience_fee_label;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_convenience_fee_label)) != null) {
                                                                    i = R.id.text_view_convenience_fee_value;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_convenience_fee_value);
                                                                    if (textView2 != null) {
                                                                        i = R.id.text_view_destination_label;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_label)) != null) {
                                                                            i = R.id.text_view_destination_value;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_value);
                                                                            if (textView3 != null) {
                                                                                i = R.id.text_view_fare_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fare_label)) != null) {
                                                                                    i = R.id.text_view_fare_value;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fare_value);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.text_view_operator_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_operator_label)) != null) {
                                                                                            i = R.id.text_view_operator_value;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_operator_value);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.text_view_origin_label;
                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_origin_label)) != null) {
                                                                                                    i = R.id.text_view_origin_value;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_origin_value);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.text_view_route_label;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_route_label)) != null) {
                                                                                                            i = R.id.text_view_route_value;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_route_value);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.text_view_source_label;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                                                                                    i = R.id.text_view_source_number;
                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_number);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.text_view_source_value;
                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_value)) != null) {
                                                                                                                            i = R.id.text_view_total_amount;
                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_total_amount);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i = R.id.text_view_travel_confirmation_note;
                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_travel_confirmation_note)) != null) {
                                                                                                                                    i = R.id.view_bottom_space_information_content;
                                                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_bottom_space_information_content);
                                                                                                                                    if (viewFindChildViewById != null) {
                                                                                                                                        i = R.id.view_bottom_space_payment_content;
                                                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_bottom_space_payment_content);
                                                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                                                            i = R.id.view_divider_destination;
                                                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_destination);
                                                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                                                i = R.id.view_divider_fare;
                                                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_fare);
                                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                                    i = R.id.view_divider_operator;
                                                                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_operator);
                                                                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                                                                        i = R.id.view_divider_origin;
                                                                                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_origin);
                                                                                                                                                        if (viewFindChildViewById6 != null) {
                                                                                                                                                            i = R.id.view_divider_route;
                                                                                                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_route);
                                                                                                                                                            if (viewFindChildViewById7 != null) {
                                                                                                                                                                i = R.id.view_divider_source;
                                                                                                                                                                View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_source);
                                                                                                                                                                if (viewFindChildViewById8 != null) {
                                                                                                                                                                    i = R.id.view_information_background;
                                                                                                                                                                    View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, R.id.view_information_background);
                                                                                                                                                                    if (viewFindChildViewById9 != null) {
                                                                                                                                                                        i = R.id.view_payment_background;
                                                                                                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, R.id.view_payment_background);
                                                                                                                                                                        if (viewFindChildViewById10 != null) {
                                                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                                                                            this.f14178U = new P0(constraintLayout, button, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Lb.a aVar = this.f14189f0;
        if (aVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14178U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        c1219h.i();
        A1(c1219h);
        kc.a aVar = this.f14190g0;
        if (aVar != null) {
            ((MayaTravelActivity) aVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        P0 p02 = this.f14178U;
        j.d(p02);
        this.f14179V = p02.f3862k;
        P0 p03 = this.f14178U;
        j.d(p03);
        this.f14180W = p03.j;
        P0 p04 = this.f14178U;
        j.d(p04);
        this.f14181X = p04.c;
        P0 p05 = this.f14178U;
        j.d(p05);
        this.f14182Y = p05.f3861g;
        P0 p06 = this.f14178U;
        j.d(p06);
        this.f14183Z = p06.i;
        P0 p07 = this.f14178U;
        j.d(p07);
        this.f14184a0 = p07.h;
        P0 p08 = this.f14178U;
        j.d(p08);
        this.f14185b0 = p08.e;
        P0 p09 = this.f14178U;
        j.d(p09);
        this.f14186c0 = p09.f;
        P0 p010 = this.f14178U;
        j.d(p010);
        this.f14187d0 = p010.f3860d;
        P0 p011 = this.f14178U;
        j.d(p011);
        this.f14188e0 = p011.f3859b;
        Bundle arguments = getArguments();
        if (arguments != null) {
            TicketPurchaseConfirmation ticketPurchaseConfirmation = (TicketPurchaseConfirmation) arguments.getParcelable("ticket_purchase_confirmation");
            Lb.a aVar = this.f14189f0;
            if (aVar == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            aVar.j();
            aVar.h = ticketPurchaseConfirmation;
            a aVar2 = (a) aVar.c.get();
            String totalAmount = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getTotalAmount() : null;
            MayaTravelConfirmationFragment mayaTravelConfirmationFragment = (MayaTravelConfirmationFragment) aVar2;
            TextView textView = mayaTravelConfirmationFragment.f14179V;
            if (textView == null) {
                j.n("mTextViewTotalAmount");
                throw null;
            }
            textView.setText(mayaTravelConfirmationFragment.getString(R.string.maya_currency_symbol_with_amount_value, totalAmount));
            a aVar3 = (a) aVar.c.get();
            String strP = C.p(((com.paymaya.data.preference.a) aVar.f).r());
            TextView textView2 = ((MayaTravelConfirmationFragment) aVar3).f14180W;
            if (textView2 == null) {
                j.n("mTextViewMobileNumber");
                throw null;
            }
            textView2.setText(strP);
            ((MayaBaseFragment) ((a) aVar.c.get())).E1();
            aVar.e(new C0310o(((C1247a) aVar.f2942g).c().e(b.a()), new M(aVar, 7), Eh.d.c, Eh.d.f1365b).f());
            aVar.e(new d(new h(((C1247a) aVar.f2942g).a(), b.a(), 0), new com.google.firebase.messaging.p(aVar, 9), 0).e());
            a aVar4 = (a) aVar.c.get();
            String operatorName = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getOperatorName() : null;
            TextView textView3 = ((MayaTravelConfirmationFragment) aVar4).f14182Y;
            if (textView3 == null) {
                j.n("mTextViewOperatorName");
                throw null;
            }
            textView3.setText(operatorName);
            a aVar5 = (a) aVar.c.get();
            String routeName = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getRouteName() : null;
            TextView textView4 = ((MayaTravelConfirmationFragment) aVar5).f14183Z;
            if (textView4 == null) {
                j.n("mTextViewRouteName");
                throw null;
            }
            textView4.setText(routeName);
            a aVar6 = (a) aVar.c.get();
            String originName = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getOriginName() : null;
            TextView textView5 = ((MayaTravelConfirmationFragment) aVar6).f14184a0;
            if (textView5 == null) {
                j.n("mTextViewOriginName");
                throw null;
            }
            textView5.setText(originName);
            a aVar7 = (a) aVar.c.get();
            String destinationName = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getDestinationName() : null;
            TextView textView6 = ((MayaTravelConfirmationFragment) aVar7).f14185b0;
            if (textView6 == null) {
                j.n("mTextViewDestinationName");
                throw null;
            }
            textView6.setText(destinationName);
            a aVar8 = (a) aVar.c.get();
            String fareAmount = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getFareAmount() : null;
            MayaTravelConfirmationFragment mayaTravelConfirmationFragment2 = (MayaTravelConfirmationFragment) aVar8;
            TextView textView7 = mayaTravelConfirmationFragment2.f14186c0;
            if (textView7 == null) {
                j.n("mTextViewFareAmount");
                throw null;
            }
            textView7.setText(mayaTravelConfirmationFragment2.getString(R.string.maya_currency_symbol_with_amount_value, fareAmount));
            a aVar9 = (a) aVar.c.get();
            String convenienceFeeAmount = ticketPurchaseConfirmation != null ? ticketPurchaseConfirmation.getConvenienceFeeAmount() : null;
            MayaTravelConfirmationFragment mayaTravelConfirmationFragment3 = (MayaTravelConfirmationFragment) aVar9;
            TextView textView8 = mayaTravelConfirmationFragment3.f14187d0;
            if (textView8 == null) {
                j.n("mTextViewConvenienceFeeAmount");
                throw null;
            }
            textView8.setText(mayaTravelConfirmationFragment3.getString(R.string.maya_currency_symbol_with_amount_value, convenienceFeeAmount));
        }
        Button button = this.f14188e0;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC1479a(this, 12));
        } else {
            j.n("mButtonPayNow");
            throw null;
        }
    }
}
