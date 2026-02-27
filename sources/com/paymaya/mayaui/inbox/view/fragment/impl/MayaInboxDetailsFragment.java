package com.paymaya.mayaui.inbox.view.fragment.impl;

import B5.i;
import Bb.f;
import N5.C0462k;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.B;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxDetailsActivity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxDetailsFragment;
import kotlin.jvm.internal.j;
import l9.C1803a;
import org.joda.time.DateTime;
import s8.InterfaceC2246a;
import t8.b;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInboxDetailsFragment extends MayaBaseFragment implements InterfaceC2246a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0462k f12402U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public f f12403V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public b f12404W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InboxMessage f12405X;

    public static final void G1(MayaInboxDetailsFragment mayaInboxDetailsFragment) {
        String strMActionLink;
        C1220i c1220iO1 = mayaInboxDetailsFragment.o1();
        InboxMessage inboxMessage = mayaInboxDetailsFragment.f12405X;
        c1220iO1.e(inboxMessage != null ? inboxMessage.mId() : null);
        f fVar = mayaInboxDetailsFragment.f12403V;
        if (fVar == null) {
            j.n("mInboxDetailsFragmentPresenter");
            throw null;
        }
        InboxMessage inboxMessage2 = (InboxMessage) fVar.e;
        if (inboxMessage2 == null || (strMActionLink = inboxMessage2.mActionLink()) == null || strMActionLink.length() == 0) {
            return;
        }
        if (!C.Y(inboxMessage2.mActionLink())) {
            InterfaceC2246a interfaceC2246a = (InterfaceC2246a) fVar.c.get();
            String link = inboxMessage2.mActionLink();
            MayaInboxDetailsFragment mayaInboxDetailsFragment2 = (MayaInboxDetailsFragment) interfaceC2246a;
            mayaInboxDetailsFragment2.getClass();
            j.g(link, "link");
            b bVar = mayaInboxDetailsFragment2.f12404W;
            if (bVar != null) {
                MayaInboxDetailsActivity mayaInboxDetailsActivity = (MayaInboxDetailsActivity) bVar;
                mayaInboxDetailsActivity.e.k0(mayaInboxDetailsActivity, link);
                return;
            }
            return;
        }
        InterfaceC2246a interfaceC2246a2 = (InterfaceC2246a) fVar.c.get();
        String actionLink = inboxMessage2.mActionLink();
        MayaInboxDetailsFragment mayaInboxDetailsFragment3 = (MayaInboxDetailsFragment) interfaceC2246a2;
        mayaInboxDetailsFragment3.getClass();
        j.g(actionLink, "actionLink");
        b bVar2 = mayaInboxDetailsFragment3.f12404W;
        if (bVar2 != null) {
            MayaInboxDetailsActivity mayaInboxDetailsActivity2 = (MayaInboxDetailsActivity) bVar2;
            i iVar = mayaInboxDetailsActivity2.e;
            AttributionSource attributionSource = AttributionSource.f;
            iVar.getClass();
            i.l(mayaInboxDetailsActivity2, actionLink, attributionSource);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12405X = (InboxMessage) arguments.getParcelable("message");
        }
        this.f10338R = true;
        this.f12404W = (b) getActivity();
        a aVar = W4.a.e().o().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        f fVar = new f(21);
        this.f12403V = fVar;
        fVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_inbox_details, viewGroup, false);
        int i = R.id.inbox_details_app_bar_layout;
        if (((AppBarLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_app_bar_layout)) != null) {
            i = R.id.inbox_details_banner_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_banner_image);
            if (imageView != null) {
                i = R.id.inbox_details_body_text_view;
                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_body_text_view);
                if (htmlTextView != null) {
                    i = R.id.inbox_details_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_button);
                    if (button != null) {
                        i = R.id.inbox_details_collapsing_toolbar;
                        if (((CollapsingToolbarLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_collapsing_toolbar)) != null) {
                            i = R.id.inbox_details_coordinator;
                            if (((CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_coordinator)) != null) {
                                i = R.id.inbox_details_date_text_view;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_date_text_view);
                                if (textView != null) {
                                    i = R.id.inbox_details_default_banner_image;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_default_banner_image)) != null) {
                                        i = R.id.inbox_details_right_inset_space;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_right_inset_space);
                                        if (viewFindChildViewById != null) {
                                            i = R.id.inbox_details_scroll;
                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_scroll)) != null) {
                                                i = R.id.inbox_details_tag_text_view;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_tag_text_view);
                                                if (textView2 != null) {
                                                    i = R.id.inbox_details_title_text_view;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_title_text_view);
                                                    if (textView3 != null) {
                                                        i = R.id.inbox_details_toolbar;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_toolbar);
                                                        if (toolbar != null) {
                                                            i = R.id.inbox_details_toolbar_container;
                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_toolbar_container)) != null) {
                                                                i = R.id.inbox_details_toolbar_title;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_toolbar_title);
                                                                if (textView4 != null) {
                                                                    i = R.id.inbox_details_top_container;
                                                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_details_top_container)) != null) {
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                        this.f12402U = new C0462k(constraintLayout, imageView, htmlTextView, button, textView, viewFindChildViewById, textView2, textView3, toolbar, textView4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f12403V;
        if (fVar == null) {
            j.n("mInboxDetailsFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12402U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f12404W;
        if (bVar != null) {
            ((MayaInboxDetailsActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        f fVar = this.f12403V;
        if (fVar == null) {
            j.n("mInboxDetailsFragmentPresenter");
            throw null;
        }
        InboxMessage inboxMessage = this.f12405X;
        j.g(inboxMessage, "inboxMessage");
        fVar.e = inboxMessage;
        InterfaceC2246a interfaceC2246a = (InterfaceC2246a) fVar.c.get();
        String title = inboxMessage.mTitle();
        MayaInboxDetailsFragment mayaInboxDetailsFragment = (MayaInboxDetailsFragment) interfaceC2246a;
        mayaInboxDetailsFragment.getClass();
        j.g(title, "title");
        C0462k c0462k = mayaInboxDetailsFragment.f12402U;
        j.d(c0462k);
        ((TextView) c0462k.e).setText(title);
        InterfaceC2246a interfaceC2246a2 = (InterfaceC2246a) fVar.c.get();
        String body = inboxMessage.mMessage();
        MayaInboxDetailsFragment mayaInboxDetailsFragment2 = (MayaInboxDetailsFragment) interfaceC2246a2;
        mayaInboxDetailsFragment2.getClass();
        j.g(body, "body");
        C0462k c0462k2 = mayaInboxDetailsFragment2.f12402U;
        j.d(c0462k2);
        String strT = z.t(z.t(z.t(body, Global.NEWLINE, "<br>"), "&lt;", "<"), "&gt;", ">");
        B b8 = new B();
        HtmlTextView htmlTextView = (HtmlTextView) c0462k2.h;
        if (!TextUtils.isEmpty(strT)) {
            htmlTextView.setText(htmlTextView.a(strT, b8, null));
        }
        String strMTag = inboxMessage.mTag();
        if ("Promos".equalsIgnoreCase(strMTag)) {
            MayaInboxDetailsFragment mayaInboxDetailsFragment3 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            C0462k c0462k3 = mayaInboxDetailsFragment3.f12402U;
            j.d(c0462k3);
            ((TextView) c0462k3.f4132d).setText(mayaInboxDetailsFragment3.getString(R.string.maya_label_paymaya_deals));
            MayaInboxDetailsFragment mayaInboxDetailsFragment4 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            C0462k c0462k4 = mayaInboxDetailsFragment4.f12402U;
            j.d(c0462k4);
            ((TextView) c0462k4.i).setText(mayaInboxDetailsFragment4.getString(R.string.maya_label_paymaya_deals));
        } else if ("Updates".equalsIgnoreCase(strMTag)) {
            MayaInboxDetailsFragment mayaInboxDetailsFragment5 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            C0462k c0462k5 = mayaInboxDetailsFragment5.f12402U;
            j.d(c0462k5);
            ((TextView) c0462k5.f4132d).setText(mayaInboxDetailsFragment5.getString(R.string.maya_label_updates));
            MayaInboxDetailsFragment mayaInboxDetailsFragment6 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            C0462k c0462k6 = mayaInboxDetailsFragment6.f12402U;
            j.d(c0462k6);
            ((TextView) c0462k6.i).setText(mayaInboxDetailsFragment6.getString(R.string.maya_label_updates));
        }
        String strMActionText = inboxMessage.mActionText();
        if (strMActionText == null || strMActionText.length() == 0) {
            C0462k c0462k7 = ((MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get())).f12402U;
            j.d(c0462k7);
            ((Button) c0462k7.f).setVisibility(8);
        } else {
            C0462k c0462k8 = ((MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get())).f12402U;
            j.d(c0462k8);
            ((Button) c0462k8.f).setVisibility(0);
            MayaInboxDetailsFragment mayaInboxDetailsFragment7 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            mayaInboxDetailsFragment7.getClass();
            C0462k c0462k9 = mayaInboxDetailsFragment7.f12402U;
            j.d(c0462k9);
            ((Button) c0462k9.f).setText(strMActionText);
        }
        String strMMediaLink = inboxMessage.mMediaLink();
        if (strMMediaLink != null && strMMediaLink.length() != 0) {
            MayaInboxDetailsFragment mayaInboxDetailsFragment8 = (MayaInboxDetailsFragment) ((InterfaceC2246a) fVar.c.get());
            mayaInboxDetailsFragment8.getClass();
            mayaInboxDetailsFragment8.getContext();
            C0462k c0462k10 = mayaInboxDetailsFragment8.f12402U;
            j.d(c0462k10);
            C.e0(strMMediaLink, (ImageView) c0462k10.f4133g, 2131231693);
        }
        DateTime dateTimeMDate = inboxMessage.mDate();
        InterfaceC2246a interfaceC2246a3 = (InterfaceC2246a) fVar.c.get();
        String strPrint = AbstractC1234x.f.withLocale(AbstractC1234x.l()).print(dateTimeMDate);
        j.f(strPrint, "formatDateComplete3(...)");
        String strT2 = z.t(z.t(strPrint, "am", "AM"), "pm", "PM");
        MayaInboxDetailsFragment mayaInboxDetailsFragment9 = (MayaInboxDetailsFragment) interfaceC2246a3;
        mayaInboxDetailsFragment9.getClass();
        C0462k c0462k11 = mayaInboxDetailsFragment9.f12402U;
        j.d(c0462k11);
        ((TextView) c0462k11.c).setText(strT2);
        C0462k c0462k12 = this.f12402U;
        j.d(c0462k12);
        MayaBaseFragment.l1((Toolbar) c0462k12.f4134k);
        C0462k c0462k13 = this.f12402U;
        j.d(c0462k13);
        ((HtmlTextView) c0462k13.h).setOnLinkClickListener(new C1803a(this, 18));
        C0462k c0462k14 = this.f12402U;
        j.d(c0462k14);
        final int i = 0;
        ((Toolbar) c0462k14.f4134k).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: t8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaInboxDetailsFragment f20182b;

            {
                this.f20182b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaInboxDetailsFragment mayaInboxDetailsFragment10 = this.f20182b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxDetailsFragment10.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaInboxDetailsFragment mayaInboxDetailsFragment11 = this.f20182b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaInboxDetailsFragment.G1(mayaInboxDetailsFragment11);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0462k c0462k15 = this.f12402U;
        j.d(c0462k15);
        final int i4 = 1;
        ((Button) c0462k15.f).setOnClickListener(new View.OnClickListener(this) { // from class: t8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaInboxDetailsFragment f20182b;

            {
                this.f20182b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaInboxDetailsFragment mayaInboxDetailsFragment10 = this.f20182b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxDetailsFragment10.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaInboxDetailsFragment mayaInboxDetailsFragment11 = this.f20182b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaInboxDetailsFragment.G1(mayaInboxDetailsFragment11);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
