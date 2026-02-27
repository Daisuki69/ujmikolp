package com.paymaya.mayaui.inbox.view.fragment.impl;

import Kh.C0310o;
import N5.C0435a;
import O5.a;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import kotlin.jvm.internal.j;
import p8.b;
import r8.C2191a;
import s8.c;
import t8.e;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInboxPageFragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f12410U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public b f12411V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public e f12412W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C2191a f12413X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C2191a f12414Y;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12412W = (e) getActivity();
        a aVar = W4.a.e().o().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C1250b0 c1250b0U = aVar.u();
        d dVar = (d) aVar.f4725k0.get();
        b bVar = new b(c1250b0U, dVar);
        this.f12411V = bVar;
        bVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_inbox_page, viewGroup, false);
        int i = R.id.inbox_page_earlier_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_earlier_recycler_view);
        if (recyclerView != null) {
            i = R.id.inbox_page_empty_icon;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_empty_icon)) != null) {
                i = R.id.inbox_page_empty_subtitle_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_empty_subtitle_text_view);
                if (textView != null) {
                    i = R.id.inbox_page_empty_title_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_empty_title_text_view);
                    if (textView2 != null) {
                        i = R.id.inbox_page_empty_view_group;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_empty_view_group);
                        if (group != null) {
                            i = R.id.inbox_page_recent_recycler_view;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_page_recent_recycler_view);
                            if (recyclerView2 != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                this.f12410U = new C0435a(nestedScrollView, recyclerView, textView, textView2, group, recyclerView2, 11);
                                j.f(nestedScrollView, "getRoot(...)");
                                return nestedScrollView;
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
        b bVar = this.f12411V;
        if (bVar == null) {
            j.n("mInboxPageFragmentPresenter");
            throw null;
        }
        bVar.i();
        super.onDestroy();
        this.f12410U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        e eVar = this.f12412W;
        if (eVar != null) {
            Bundle bundle = ((MayaInboxV2Activity) eVar).f12401o;
            if (bundle != null) {
                Bundle arguments = getArguments();
                String string = arguments != null ? arguments.getString("inbox_tag") : null;
                bundle.putString("inbox_last_fragment", string);
                C0435a c0435a = this.f12410U;
                j.d(c0435a);
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) c0435a.f4049g).getLayoutManager();
                bundle.putParcelable(string, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
            } else {
                bundle = null;
            }
            ((MayaInboxV2Activity) eVar).f12401o = bundle;
        }
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12410U;
        j.d(c0435a);
        ((RecyclerView) c0435a.f4049g).setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        C0435a c0435a2 = this.f12410U;
        j.d(c0435a2);
        ((RecyclerView) c0435a2.c).setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        Context context = getContext();
        if (context != null) {
            String string = context.getString(R.string.maya_label_recent);
            j.f(string, "getString(...)");
            this.f12413X = new C2191a(context, this, string);
            String string2 = context.getString(R.string.maya_label_earlier);
            j.f(string2, "getString(...)");
            this.f12414Y = new C2191a(context, this, string2);
            C0435a c0435a3 = this.f12410U;
            j.d(c0435a3);
            ((RecyclerView) c0435a3.f4049g).setAdapter(this.f12413X);
            C0435a c0435a4 = this.f12410U;
            j.d(c0435a4);
            ((RecyclerView) c0435a4.c).setAdapter(this.f12414Y);
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String inboxTag = arguments != null ? arguments.getString("inbox_tag") : null;
            b bVar = this.f12411V;
            if (bVar == null) {
                j.n("mInboxPageFragmentPresenter");
                throw null;
            }
            j.g(inboxTag, "inboxTag");
            if ("All".equals(inboxTag)) {
                inboxTag = "";
            }
            bVar.f = inboxTag;
            bVar.e(new C0310o(bVar.e.e(zh.b.a()), new M(bVar, 27), Eh.d.c, Eh.d.f1365b).f());
            bVar.k();
        }
    }
}
