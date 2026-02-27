package com.paymaya.ui.ekyc.view.fragment.impl;

import Bb.f;
import Dh.c;
import Kh.B;
import Kh.C0301f;
import Kh.C0307l;
import O5.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.ui.ekyc.view.activity.impl.EDDSearchActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o6.C1967a;
import vd.C2346a;
import y9.d;
import yd.j;
import zd.p;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSearchFragment extends BaseFragment implements j {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public f f14546S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public SearchView f14547T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public p f14548U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C2346a f14549V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final c f14550W = new c(1);

    @BindView(R.id.pma_fragment_edd_search_list)
    public RecyclerView mSearchRecyclerView;

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f14548U = (p) getActivity();
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        f fVar = new f();
        this.f14546S = fVar;
        fVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.j.g(menu, "menu");
        kotlin.jvm.internal.j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.pma_menu_edd_search, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_search, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f14546S;
        if (fVar == null) {
            kotlin.jvm.internal.j.n("mEDDSearchFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        kotlin.jvm.internal.j.g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        View actionView = menu.findItem(R.id.pma_menu_edd_search_field).getActionView();
        kotlin.jvm.internal.j.e(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        this.f14547T = (SearchView) actionView;
        C0301f c0301f = new C0301f(new d(this, 5), 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        B bE = new C0307l(c0301f.b(150L), 0).e(b.a());
        Gh.f fVar = new Gh.f(new C1967a(this, 25), Eh.d.f1366d);
        bE.g(fVar);
        this.f14550W.a(fVar);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        p pVar = this.f14548U;
        if (pVar != null) {
            ((EDDSearchActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Collection searchList;
        List selectedItems;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        this.f14549V = new C2346a(contextRequireContext, this);
        RecyclerView recyclerView = this.mSearchRecyclerView;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mSearchRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.mSearchRecyclerView;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mSearchRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f14549V);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArrayList2 = arguments.getStringArrayList("search_list")) == null || (searchList = C1110A.V(stringArrayList2)) == null) {
            searchList = C1112C.f9377a;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (stringArrayList = arguments2.getStringArrayList("selected_list")) == null || (selectedItems = C1110A.V(stringArrayList)) == null) {
            selectedItems = C1112C.f9377a;
        }
        Bundle arguments3 = getArguments();
        boolean z4 = arguments3 != null ? arguments3.getBoolean("has_other_option") : false;
        f fVar = this.f14546S;
        if (fVar == null) {
            kotlin.jvm.internal.j.n("mEDDSearchFragmentPresenter");
            throw null;
        }
        kotlin.jvm.internal.j.g(searchList, "searchList");
        kotlin.jvm.internal.j.g(selectedItems, "selectedItems");
        ArrayList arrayListW = C1110A.W(searchList);
        if (z4) {
            String string = ((EDDSearchFragment) ((j) fVar.c.get())).getString(R.string.pma_item_edd_others);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            arrayListW.add(string);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListW) {
            if (!selectedItems.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ((ArrayList) fVar.e).addAll(arrayList);
        ((EDDSearchFragment) ((j) fVar.c.get())).r1((ArrayList) fVar.e);
    }

    public final void r1(ArrayList results) {
        kotlin.jvm.internal.j.g(results, "results");
        C2346a c2346a = this.f14549V;
        if (c2346a != null) {
            ArrayList arrayList = c2346a.f20488b;
            arrayList.clear();
            arrayList.addAll(results);
            c2346a.notifyDataSetChanged();
        }
    }
}
