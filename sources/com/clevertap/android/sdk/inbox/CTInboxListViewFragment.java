package com.clevertap.android.sdk.inbox;

import C2.f;
import D.C0176i;
import D.C0187u;
import D.I;
import D.S;
import D.d0;
import G.d;
import G.e;
import Z.h;
import Z.r;
import Z.s;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import defpackage.AbstractC1414e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import q0.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxListViewFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CleverTapInstanceConfig f9544B;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearLayout f9547Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public d f9548R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RecyclerView f9549S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public s f9550T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CTInboxStyleConfig f9551U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public WeakReference f9553W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f9554X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public I f9555Y;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f9545K = c.f19736b;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f9546P = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f9552V = true;

    public final void l1(Bundle bundle, int i, HashMap map) {
        r rVar;
        try {
            rVar = (r) this.f9553W.get();
        } catch (Throwable unused) {
            rVar = null;
        }
        if (rVar == null) {
            S.l("InboxListener is null for messages");
        }
        if (rVar != null) {
            getActivity().getBaseContext();
            CTInboxMessage cTInboxMessage = (CTInboxMessage) this.f9546P.get(i);
            h hVarG1 = ((CTInboxActivity) rVar).g1();
            if (hVarG1 != null) {
                ((C0176i) ((C0187u) hVarG1).f949b.f).s(true, cTInboxMessage, bundle);
                S.l("clicked inbox notification.");
                if (map == null || map.isEmpty()) {
                    return;
                }
                S.l("clicked button of an inbox notification.");
            }
        }
    }

    public final void m1(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.replace(Global.NEWLINE, "").replace("\r", "")));
            if (getActivity() != null) {
                d0.j(getActivity(), intent);
            }
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public final void n1(int i, String str, JSONObject jSONObject, HashMap map) {
        boolean z4 = false;
        try {
            if (jSONObject != null) {
                ((CTInboxMessageContent) ((CTInboxMessage) this.f9546P.get(i)).j.get(0)).getClass();
                String strD = CTInboxMessageContent.d(jSONObject);
                if (strD.equalsIgnoreCase(ImagesContract.URL)) {
                    ((CTInboxMessageContent) ((CTInboxMessage) this.f9546P.get(i)).j.get(0)).getClass();
                    String string = null;
                    if (jSONObject != null) {
                        try {
                            JSONObject jSONObject2 = jSONObject.has(ImagesContract.URL) ? jSONObject.getJSONObject(ImagesContract.URL) : null;
                            if (jSONObject2 != null) {
                                JSONObject jSONObject3 = jSONObject2.has("android") ? jSONObject2.getJSONObject("android") : null;
                                string = (jSONObject3 == null || !jSONObject3.has("text")) ? "" : jSONObject3.getString("text");
                            }
                        } catch (JSONException e) {
                            AbstractC1414e.t(e, new StringBuilder("Unable to get Link URL with JSON - "));
                        }
                    }
                    if (string != null) {
                        m1(string);
                    }
                } else if (strD.contains("rfp") && this.f9555Y != null) {
                    ((CTInboxMessageContent) ((CTInboxMessage) this.f9546P.get(i)).j.get(0)).getClass();
                    try {
                        if (jSONObject.has("fbSettings")) {
                            z4 = jSONObject.getBoolean("fbSettings");
                        }
                    } catch (JSONException e7) {
                        S.l("Unable to get fallback settings key with JSON - " + e7.getLocalizedMessage());
                    }
                    this.f9555Y.R0(z4);
                }
            } else {
                String str2 = ((CTInboxMessageContent) ((CTInboxMessage) this.f9546P.get(i)).j.get(0)).f9566a;
                if (str2 != null) {
                    m1(str2);
                }
            }
            Bundle bundle = new Bundle();
            JSONObject jSONObject4 = ((CTInboxMessage) this.f9546P.get(i)).f9565q;
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    bundle.putString(next, jSONObject4.getString(next));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString("wzrk_c2a", str);
            }
            l1(bundle, i, map);
        } catch (Throwable th2) {
            S.b("Error handling notification button click: " + th2.getCause());
        }
    }

    public final void o1(int i, int i4) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = ((CTInboxMessage) this.f9546P.get(i)).f9565q;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
            l1(bundle, i, null);
            m1(((CTInboxMessageContent) ((CTInboxMessage) this.f9546P.get(i)).j.get(i4)).f9566a);
        } catch (Throwable th2) {
            S.b("Error handling notification button click: " + th2.getCause());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f9544B = (CleverTapInstanceConfig) arguments.getParcelable("config");
            this.f9551U = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.f9554X = arguments.getInt("position", -1);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                String string = arguments2.getString("filter", null);
                C0187u c0187uJ = C0187u.j(getActivity(), this.f9544B);
                if (c0187uJ != null) {
                    S.l("CTInboxListViewFragment:onAttach() called with: tabPosition = [" + this.f9554X + "], filter = [" + string + "]");
                    ArrayList<CTInboxMessage> arrayListD = c0187uJ.d();
                    if (string != null) {
                        ArrayList arrayList = new ArrayList();
                        for (CTInboxMessage cTInboxMessage : arrayListD) {
                            ArrayList arrayList2 = cTInboxMessage.f9562n;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                Iterator it = cTInboxMessage.f9562n.iterator();
                                while (it.hasNext()) {
                                    if (((String) it.next()).equalsIgnoreCase(string)) {
                                        arrayList.add(cTInboxMessage);
                                    }
                                }
                            }
                        }
                        arrayListD = arrayList;
                    }
                    this.f9546P = arrayListD;
                }
            }
            if (context instanceof CTInboxActivity) {
                this.f9553W = new WeakReference((r) getActivity());
            }
            if (context instanceof I) {
                this.f9555Y = (I) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.inbox_list_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.list_view_linear_layout);
        this.f9547Q = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.f9551U.c));
        TextView textView = (TextView) viewInflate.findViewById(R.id.list_view_no_message_view);
        if (this.f9546P.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.f9551U.f9436g);
            textView.setTextColor(Color.parseColor(this.f9551U.h));
            return viewInflate;
        }
        textView.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        ArrayList arrayList = this.f9546P;
        s sVar = new s();
        S.l("CTInboxMessageAdapter: messages=" + arrayList);
        sVar.f6854b = arrayList;
        sVar.f6853a = this;
        this.f9550T = sVar;
        if (!this.f9545K) {
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list_view_recycler_view);
            this.f9549S = recyclerView;
            recyclerView.setVisibility(0);
            this.f9549S.setLayoutManager(linearLayoutManager);
            this.f9549S.addItemDecoration(new e());
            this.f9549S.setItemAnimator(new DefaultItemAnimator());
            RecyclerView recyclerView2 = this.f9549S;
            recyclerView2.setClipToPadding(false);
            ViewCompat.setOnApplyWindowInsetsListener(recyclerView2, new f(26));
            this.f9549S.setAdapter(this.f9550T);
            this.f9550T.notifyDataSetChanged();
            return viewInflate;
        }
        d dVar = new d(getActivity());
        this.f9548R = dVar;
        dVar.setVisibility(0);
        this.f9548R.setLayoutManager(linearLayoutManager);
        this.f9548R.addItemDecoration(new e());
        this.f9548R.setItemAnimator(new DefaultItemAnimator());
        d dVar2 = this.f9548R;
        dVar2.setClipToPadding(false);
        ViewCompat.setOnApplyWindowInsetsListener(dVar2, new f(26));
        this.f9548R.setAdapter(this.f9550T);
        this.f9550T.notifyDataSetChanged();
        this.f9547Q.addView(this.f9548R);
        if (this.f9552V && this.f9554X <= 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new C.h(this, 14), 1000L);
            this.f9552V = false;
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d dVar = this.f9548R;
        if (dVar != null) {
            dVar.f1686a.pause();
            dVar.e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        d dVar = this.f9548R;
        if (dVar != null) {
            dVar.f1686a.setPlayWhenReady(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f9548R;
        if (dVar != null) {
            dVar.a();
            dVar.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d dVar = this.f9548R;
        if (dVar != null && dVar.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.f9548R.getLayoutManager().onSaveInstanceState());
        }
        RecyclerView recyclerView = this.f9549S;
        if (recyclerView == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        bundle.putParcelable("recyclerLayoutState", this.f9549S.getLayoutManager().onSaveInstanceState());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            d dVar = this.f9548R;
            if (dVar != null && dVar.getLayoutManager() != null) {
                this.f9548R.getLayoutManager().onRestoreInstanceState(parcelable);
            }
            RecyclerView recyclerView = this.f9549S;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            this.f9549S.getLayoutManager().onRestoreInstanceState(parcelable);
        }
    }
}
