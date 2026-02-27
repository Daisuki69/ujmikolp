package com.paymaya.mayaui.settings.view.fragment.impl;

import A5.b;
import A7.j;
import Ah.p;
import E4.d;
import G5.C;
import G6.r;
import G6.u;
import G6.v;
import N5.C0462k;
import Ob.a;
import Rb.h;
import S5.c;
import Sb.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.api.UnifiedGatewayApi;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.domain.model.DeviceInformationResponse;
import com.paymaya.domain.store.F;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import d4.AbstractC1331a;
import java.util.LinkedHashMap;
import kotlin.UninitializedPropertyAccessException;
import org.joda.time.Instant;
import v.AbstractC2329d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDeviceManagementMainFragment extends MayaBaseLoadingFragment implements h {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public a f13964A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public LinearLayoutManager f13965B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f13966C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f13967D0 = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0462k f13968o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NestedScrollView f13969p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f13970q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f13971r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f13972s0;
    public ConstraintLayout t0;
    public TextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f13973v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public RecyclerView f13974x0;
    public j y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public s f13975z0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_device_management_main, viewGroup, false);
        int i = R.id.image_view_active_device_arrow;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_active_device_arrow)) != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
            i = R.id.recycler_view_devices;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_devices);
            if (recyclerView != null) {
                i = R.id.text_view_active_device_icon;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_active_device_icon);
                if (textView != null) {
                    i = R.id.text_view_active_device_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_active_device_name);
                    if (textView2 != null) {
                        i = R.id.text_view_active_device_this_device;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_active_device_this_device)) != null) {
                            i = R.id.text_view_active_device_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_active_device_title);
                            if (textView3 != null) {
                                i = R.id.text_view_description;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                                if (textView4 != null) {
                                    i = R.id.text_view_logged_out_devices_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_logged_out_devices_title);
                                    if (textView5 != null) {
                                        i = R.id.text_view_title_header;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                                        if (textView6 != null) {
                                            i = R.id.text_view_update_my_email;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_my_email);
                                            if (textView7 != null) {
                                                i = R.id.view_active_device;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_active_device);
                                                if (constraintLayout != null) {
                                                    this.f13968o0 = new C0462k(nestedScrollView, nestedScrollView, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, constraintLayout);
                                                    kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                                                    return nestedScrollView;
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

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_title_message, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1() {
        s sVar = this.f13975z0;
        if (sVar != null) {
            ((MayaDeviceManagementActivity) sVar).X1();
        }
        s sVar2 = this.f13975z0;
        if (sVar2 != null) {
            ((MayaDeviceManagementActivity) sVar2).T1();
        }
        Object obj = this.f13975z0;
        if (obj != null) {
            ((q) obj).U1();
        }
        this.f13966C0 = false;
        s sVar3 = this.f13975z0;
        if (sVar3 != null) {
            sVar3.invalidateOptionsMenu();
        }
        O1();
        j jVar = this.y0;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
        boolean zB = c.b((c) jVar.e, b.f77S0);
        F f = (F) jVar.f;
        if (zB) {
            f.getClass();
            String str = d.f1258b;
            if (str == null) {
                throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("xx-device-session-id", str);
            p<DeviceInformationResponse> loginHistoryDevices = f.c.getLoginHistoryDevices(M.m(linkedHashMap));
            new Lh.d(new Lh.d(AbstractC1331a.l(loginHistoryDevices, loginHistoryDevices, zh.b.a()), new r(jVar, 17), 2), new u(jVar, 17), 0).e();
            return;
        }
        f.getClass();
        String str2 = d.f1258b;
        if (str2 == null) {
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        char[] cArr = F5.b.f1550a;
        String strValueOf = String.valueOf(Instant.now().getMillis());
        if (strValueOf != null) {
            linkedHashMap2.put("x-request-timestamp", strValueOf);
        }
        linkedHashMap2.put("xx-device-session-id", str2);
        p<DeviceInformationResponse> devices = f.f11347b.getDevices(M.m(linkedHashMap2));
        kotlin.jvm.internal.j.f(devices, "getDevices(...)");
        new Lh.d(new Lh.d(new Lh.h(devices, zh.b.a(), 0), new Gb.d(jVar, 16), 2), new v(jVar, 18), 0).e();
    }

    public final void Q1(int i, DeviceInformation deviceInformation) {
        String strValueOf = String.valueOf(deviceInformation.isActive() ? 1 : i + 2);
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.DEVICE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("position", strValueOf);
        c1219hH.j.put("device_type", deviceInformation.getPlatform());
        c1219hH.j.put("os", deviceInformation.getOsVersion());
        A1(c1219hH);
    }

    public final void R1() {
        s sVar = this.f13975z0;
        if (sVar != null) {
            ((MayaDeviceManagementActivity) sVar).W1();
        }
        s sVar2 = this.f13975z0;
        if (sVar2 != null) {
            ((MayaDeviceManagementActivity) sVar2).T1();
        }
        Object obj = this.f13975z0;
        if (obj != null) {
            ((q) obj).U1();
        }
        this.f13966C0 = false;
        s sVar3 = this.f13975z0;
        if (sVar3 != null) {
            sVar3.invalidateOptionsMenu();
        }
    }

    public final void S1() {
        s sVar = this.f13975z0;
        if (sVar != null) {
            ((MayaDeviceManagementActivity) sVar).X1();
        }
        s sVar2 = this.f13975z0;
        if (sVar2 != null) {
            ((MayaDeviceManagementActivity) sVar2).t1();
        }
        Object obj = this.f13975z0;
        if (obj != null) {
            ((q) obj).u1();
        }
        this.f13966C0 = true;
        s sVar3 = this.f13975z0;
        if (sVar3 != null) {
            sVar3.invalidateOptionsMenu();
        }
        L1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f13975z0 = (s) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        F f = new F((PayMayaClientApi) aVar.f4745w.get(), (UnifiedGatewayApi) aVar.w0.get());
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        j jVar = new j(flagConfigurationService, f, sessionSubject, 6);
        this.y0 = jVar;
        jVar.h(this);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.j.g(menu, "menu");
        kotlin.jvm.internal.j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.maya_menu_device_management, menu);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.y0;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
        jVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13968o0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.j.g(item, "item");
        if (item.getItemId() != R.id.maya_menu_help_icon) {
            return super.onOptionsItemSelected(item);
        }
        s sVar = this.f13975z0;
        if (sVar != null) {
            ((MayaDeviceManagementActivity) sVar).V1("get_help", null);
        }
        s sVar2 = this.f13975z0;
        if (sVar2 == null) {
            return true;
        }
        MayaDeviceManagementActivity mayaDeviceManagementActivity = (MayaDeviceManagementActivity) sVar2;
        mayaDeviceManagementActivity.n1().v(mayaDeviceManagementActivity, "https://support.maya.ph/s/article/What-is-the-Maya-Log-in-History", mayaDeviceManagementActivity.getString(R.string.maya_label_help));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        kotlin.jvm.internal.j.g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(R.id.maya_menu_help_icon);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.f13966C0);
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                icon.setAlpha(this.f13966C0 ? 255 : 0);
            }
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        A1(c1219h);
        m1().n(10);
        P1();
        s sVar = this.f13975z0;
        if (sVar != null) {
            ((MayaDeviceManagementActivity) sVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k);
        this.f13969p0 = (NestedScrollView) c0462k.f4133g;
        C0462k c0462k2 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k2);
        this.f13970q0 = (TextView) c0462k2.j;
        C0462k c0462k3 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k3);
        this.f13971r0 = (TextView) c0462k3.e;
        C0462k c0462k4 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k4);
        this.f13972s0 = (TextView) c0462k4.f4134k;
        kotlin.jvm.internal.j.d(this.f13968o0);
        C0462k c0462k5 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k5);
        this.t0 = (ConstraintLayout) c0462k5.f4131b;
        C0462k c0462k6 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k6);
        this.u0 = (TextView) c0462k6.c;
        C0462k c0462k7 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k7);
        this.f13973v0 = (TextView) c0462k7.f4132d;
        C0462k c0462k8 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k8);
        this.w0 = (TextView) c0462k8.i;
        C0462k c0462k9 = this.f13968o0;
        kotlin.jvm.internal.j.d(c0462k9);
        this.f13974x0 = (RecyclerView) c0462k9.h;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view_long_alt);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        this.f13965B0 = new LinearLayoutManager(getContext(), 1, false);
        a aVar = new a(this);
        this.f13964A0 = aVar;
        RecyclerView recyclerView = this.f13974x0;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewDevices");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = this.f13974x0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewDevices");
            throw null;
        }
        recyclerView2.setLayoutManager(this.f13965B0);
        RecyclerView recyclerView3 = this.f13974x0;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewDevices");
            throw null;
        }
        recyclerView3.addItemDecoration(bVar);
        NestedScrollView nestedScrollView = this.f13969p0;
        if (nestedScrollView == null) {
            kotlin.jvm.internal.j.n("mScrollView");
            throw null;
        }
        TextView textView = this.f13970q0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewTitleHeader");
            throw null;
        }
        C.a(nestedScrollView, textView, new Ag.j(this, 14));
        TextView textView2 = this.f13972s0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewUpdateEmail");
            throw null;
        }
        textView2.setOnClickListener(new Sb.r(this, 0));
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext2, "requireContext(...)");
        int iN = jk.b.n(contextRequireContext2, R.attr.mayaColorBackgroundPrimaryAlt);
        FrameLayout frameLayout = this.f10343W;
        if (frameLayout == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutLoadingContainer");
            throw null;
        }
        frameLayout.setBackgroundColor(iN);
        String string = getString(R.string.maya_label_device_management_loading_title);
        TextView textView3 = this.f10347a0;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.f10347a0;
        if (textView4 != null) {
            textView4.setText(string);
        }
        String string2 = getString(R.string.maya_label_device_management_loading_message);
        TextView textView5 = this.f10348b0;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.f10348b0;
        if (textView6 != null) {
            textView6.setText(string2);
        }
        j jVar = this.y0;
        if (jVar != null) {
            jVar.j();
        } else {
            kotlin.jvm.internal.j.n("mFragmentPresenter");
            throw null;
        }
    }
}
