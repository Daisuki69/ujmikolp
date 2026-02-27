package oi;

import D.C0187u;
import N5.C0447e;
import N5.C0450f;
import N5.C0453g;
import N5.C0491z;
import Xb.A;
import a7.InterfaceC0641b;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.util.Supplier;
import ch.InterfaceC1106e;
import cj.C1110A;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;
import com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import hh.InterfaceC1570c;
import hh.InterfaceC1573f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ki.C1781b;
import kotlin.jvm.internal.j;
import o5.C1963b;
import pg.t;
import rc.C2196c;
import rc.i;
import rc.k;
import rc.m;
import rc.o;
import s.AbstractC2217b;
import se.l;
import wc.InterfaceC2393d;
import wc.InterfaceC2394e;
import we.InterfaceC2428q;
import we.ViewOnClickListenerC2420i;
import y5.q;
import ya.C2516a;
import yc.F;
import yc.y;
import zj.C2576A;

/* JADX INFO: renamed from: oi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1983a implements Supplier, Ch.c, InterfaceC1570c, InterfaceC0641b, rk.a, HuiYanAuthEventCallBack, vk.b, Sc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18892b;

    public /* synthetic */ C1983a(Object obj, int i) {
        this.f18891a = i;
        this.f18892b = obj;
    }

    @Override // ad.InterfaceC0684a
    public void B0(HashMap map) {
        String strTnTj78 = numX49.tnTj78("bQjL");
        String str = (String) map.get(strTnTj78);
        String strTnTj782 = numX49.tnTj78("bQjr");
        String str2 = (String) map.get(strTnTj782);
        BaseMayaProfileFragment baseMayaProfileFragment = (BaseMayaProfileFragment) this.f18892b;
        C1220i c1220iO1 = baseMayaProfileFragment.o1();
        String strTnTj783 = numX49.tnTj78("bQjZ");
        String strTnTj784 = (String) map.get(strTnTj783);
        String str3 = (String) map.get(numX49.tnTj78("bQjk"));
        String strTnTj785 = numX49.tnTj78("bQjB");
        String str4 = (String) map.get(strTnTj785);
        String strTnTj786 = numX49.tnTj78("bQju");
        String str5 = (String) map.get(strTnTj786);
        String str6 = (String) map.get(strTnTj78);
        String str7 = (String) map.get(strTnTj782);
        C1219h c1219h = new C1219h();
        HashMap map2 = c1219h.j;
        c1219h.o(EnumC1215d.MENU);
        c1219h.r(EnumC1216e.BANNER);
        c1219h.n(17);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map2.put(strTnTj786, str5);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        map2.put(numX49.tnTj78("bQjV"), str6);
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        if (strTnTj784 == null) {
            strTnTj784 = numX49.tnTj78("bQjS");
        }
        if (!C2576A.H(strTnTj784)) {
            str3 = strTnTj784;
        }
        map2.put(strTnTj783, str3);
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        map2.put(numX49.tnTj78("bQjd"), AbstractC1414e.h(numX49.tnTj78("bQjj"), str5));
        EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
        map2.put(numX49.tnTj78("bQji"), str7);
        EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
        map2.put(strTnTj785, str4);
        c1219h.i();
        c1220iO1.b(c1219h);
        C0187u c0187u = baseMayaProfileFragment.f13503J0;
        if (c0187u == null) {
            j.n(numX49.tnTj78("bQjE"));
            throw null;
        }
        c0187u.m(str);
        baseMayaProfileFragment.H1().k(str2);
    }

    @Override // hh.InterfaceC1570c
    public Object a(Object obj, Object obj2) {
        ((InterfaceC1573f) this.f18892b).accept((InterfaceC1106e) obj2);
        return obj;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f18891a) {
            case 1:
                j.g((Throwable) obj, numX49.tnTj78("bQj7"));
                A7.j jVar = (A7.j) this.f18892b;
                jVar.getClass();
                MayaInboxFragment mayaInboxFragment = (MayaInboxFragment) ((s8.b) jVar.c.get());
                C0491z c0491z = mayaInboxFragment.f12406U;
                j.d(c0491z);
                ((Group) c0491z.e).setVisibility(0);
                C0491z c0491z2 = mayaInboxFragment.f12406U;
                j.d(c0491z2);
                ((TextView) c0491z2.f4304d).setVisibility(0);
                C0491z c0491z3 = mayaInboxFragment.f12406U;
                j.d(c0491z3);
                ((TabLayout) c0491z3.f).setVisibility(8);
                break;
            case 2:
            case 3:
            case 4:
            case 10:
            case 11:
            case 14:
            case 21:
            case 22:
            case 24:
            default:
                MayaInboxSupportActivity mayaInboxSupportActivity = (MayaInboxSupportActivity) this.f18892b;
                t tVar = mayaInboxSupportActivity.f12423u;
                if (tVar != null) {
                    AbstractC1331a.t(numX49.tnTj78("bQjF"), ((com.paymaya.data.preference.a) mayaInboxSupportActivity.V1().e).s(), tVar);
                }
                break;
            case 5:
                Throwable th2 = (Throwable) obj;
                j.g(th2, numX49.tnTj78("bQjy"));
                C2196c c2196c = (C2196c) this.f18892b;
                PayMayaError payMayaErrorF = c2196c.f(th2, true);
                j.f(payMayaErrorF, numX49.tnTj78("bQjv"));
                c2196c.n(payMayaErrorF, 1, false);
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                j.g(th3, numX49.tnTj78("bQj3"));
                ((MayaBaseFragment) ((InterfaceC2393d) ((i) this.f18892b).c.get())).w1();
                i iVar = (i) this.f18892b;
                iVar.m(th3, new C1963b(3, iVar, th3));
                break;
            case 7:
                j.g((Throwable) obj, numX49.tnTj78("bQjG"));
                Y6.d dVar = ((MayaContactsSelectionFragment) ((X6.c) ((k) this.f18892b).c.get())).f11913v0;
                if (dVar != null) {
                    dVar.U();
                }
                break;
            case 8:
                j.g((MayaUpdateProfileData) obj, numX49.tnTj78("bQj6"));
                m mVar = (m) this.f18892b;
                if (mVar.f19922t == null) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                    mayaUserProfileUpdateFragment.requireActivity().setResult(121);
                    mayaUserProfileUpdateFragment.requireActivity().finish();
                    ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) ((m) this.f18892b).c.get())).o2(numX49.tnTj78("bQjX"));
                    ((MayaBaseFragment) ((InterfaceC2394e) ((m) this.f18892b).c.get())).w1();
                } else {
                    InterfaceC2394e interfaceC2394e = (InterfaceC2394e) mVar.c.get();
                    String str = ((m) this.f18892b).f19922t;
                    String strTnTj78 = numX49.tnTj78("bQja");
                    if (str == null) {
                        str = strTnTj78;
                    }
                    y yVar = ((MayaUserProfileUpdateFragment) interfaceC2394e).f14267b0;
                    if (yVar != null) {
                        MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) yVar;
                        mayaUserProfileUpdateActivity.n1();
                        B5.i.k(mayaUserProfileUpdateActivity, str);
                    }
                    InterfaceC2394e interfaceC2394e2 = (InterfaceC2394e) ((m) this.f18892b).c.get();
                    String str2 = ((m) this.f18892b).f19922t;
                    if (str2 != null) {
                        strTnTj78 = str2;
                    }
                    ((MayaUserProfileUpdateFragment) interfaceC2394e2).o2(strTnTj78);
                    ((MayaBaseFragment) ((InterfaceC2394e) ((m) this.f18892b).c.get())).w1();
                }
                break;
            case 9:
                j.g((MayaUpdateProfileData) obj, numX49.tnTj78("bQjh"));
                o oVar = (o) this.f18892b;
                if (oVar.f19932p == null) {
                    ((MayaBaseFragment) ((wc.f) oVar.c.get())).w1();
                    ((MayaUserUpdateWorkDetailsFragment) ((wc.f) ((o) this.f18892b).c.get())).h2(numX49.tnTj78("bQjN"));
                    MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = (MayaUserUpdateWorkDetailsFragment) ((wc.f) ((o) this.f18892b).c.get());
                    mayaUserUpdateWorkDetailsFragment.requireActivity().setResult(121);
                    mayaUserUpdateWorkDetailsFragment.requireActivity().finish();
                } else {
                    wc.f fVar = (wc.f) oVar.c.get();
                    String str3 = ((o) this.f18892b).f19932p;
                    String strTnTj782 = numX49.tnTj78("bQjM");
                    if (str3 == null) {
                        str3 = strTnTj782;
                    }
                    F f = ((MayaUserUpdateWorkDetailsFragment) fVar).f14272a0;
                    if (f != null) {
                        MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity2 = (MayaUserProfileUpdateActivity) f;
                        mayaUserProfileUpdateActivity2.n1();
                        B5.i.k(mayaUserProfileUpdateActivity2, str3);
                    }
                    wc.f fVar2 = (wc.f) ((o) this.f18892b).c.get();
                    String str4 = ((o) this.f18892b).f19932p;
                    if (str4 != null) {
                        strTnTj782 = str4;
                    }
                    ((MayaUserUpdateWorkDetailsFragment) fVar2).h2(strTnTj782);
                    ((MayaBaseFragment) ((wc.f) ((o) this.f18892b).c.get())).w1();
                }
                break;
            case 12:
                j.g((Throwable) obj, numX49.tnTj78("bQjD"));
                ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((ve.c) ((se.e) this.f18892b).c.get());
                shopV3HomePageFragment.getClass();
                shopV3HomePageFragment.x1(200, new ViewOnClickListenerC2420i(shopV3HomePageFragment, 1));
                break;
            case 13:
                Throwable th4 = (Throwable) obj;
                j.g(th4, numX49.tnTj78("bQjo"));
                se.f fVar3 = (se.f) this.f18892b;
                PayMayaError payMayaErrorF2 = fVar3.f(th4, false);
                j.f(payMayaErrorF2, numX49.tnTj78("bQjK"));
                ((ShopV3PaymentFragment) ((ve.e) fVar3.c.get())).n1();
                if (!payMayaErrorF2.isSessionTimeout()) {
                    ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) ((ve.e) fVar3.c.get());
                    shopV3PaymentFragment.getClass();
                    InterfaceC2428q interfaceC2428q = shopV3PaymentFragment.f14815d0;
                    if (interfaceC2428q != null) {
                        String string = shopV3PaymentFragment.getString(R.string.pma_toast_error_title_shop_error);
                        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString(numX49.tnTj78("bQjw"), string);
                        bundle.putParcelable(numX49.tnTj78("bQjc"), payMayaErrorF2);
                        errorDialogFragment.setArguments(bundle);
                        errorDialogFragment.show(((ShopV3Activity) interfaceC2428q).getSupportFragmentManager(), numX49.tnTj78("bQjm"));
                    }
                }
                break;
            case 15:
                List list = (List) obj;
                j.g(list, numX49.tnTj78("bQj4"));
                ((se.i) this.f18892b).l(list);
                break;
            case 16:
                List list2 = (List) obj;
                j.g(list2, numX49.tnTj78("bQjC"));
                ((l) this.f18892b).n(list2);
                break;
            case 17:
                A a8 = (A) this.f18892b;
                PayMayaError payMayaErrorF3 = a8.f((Throwable) obj, false);
                j.f(payMayaErrorF3, numX49.tnTj78("bQj8"));
                a8.l(payMayaErrorF3);
                break;
            case 18:
                Throwable th5 = (Throwable) obj;
                j.g(th5, numX49.tnTj78("bQje"));
                A7.j jVar2 = (A7.j) this.f18892b;
                jVar2.r(jVar2.f(th5, true), true);
                break;
            case 19:
                j.g((Throwable) obj, numX49.tnTj78("bQjU"));
                ((MayaBaseFragment) ((x9.b) ((Bb.f) this.f18892b).c.get())).w1();
                qk.i.D((x9.b) ((Bb.f) this.f18892b).c.get());
                break;
            case 20:
                Throwable th6 = (Throwable) obj;
                j.g(th6, numX49.tnTj78("bQjt"));
                x9.c cVar = (x9.c) ((A7.j) this.f18892b).c.get();
                PayMayaError payMayaErrorF4 = ((A7.j) this.f18892b).f(th6, true);
                y9.f fVar4 = ((MayaMultiTypeOtpFragment) cVar).f12943W;
                if (fVar4 != null) {
                    ((MayaMfaActivity) fVar4).Z1().r(payMayaErrorF4, false);
                }
                break;
            case 23:
                CharSequence charSequence = (CharSequence) obj;
                j.g(charSequence, numX49.tnTj78("bQjQ"));
                String string2 = charSequence.toString();
                ShopV3ProviderProductsListSearchFragment shopV3ProviderProductsListSearchFragment = (ShopV3ProviderProductsListSearchFragment) this.f18892b;
                shopV3ProviderProductsListSearchFragment.f14853i0 = string2;
                shopV3ProviderProductsListSearchFragment.B1().l();
                break;
            case 25:
                List list3 = (List) obj;
                j.g(list3, numX49.tnTj78("bQjH"));
                C2516a c2516a = (C2516a) this.f18892b;
                c2516a.getClass();
                if (!list3.isEmpty()) {
                    Da.b bVar = (Da.b) c2516a.c.get();
                    List listQ = C1110A.Q(new B9.a(15), list3);
                    MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) bVar;
                    mayaPushApprovalListFragment.getClass();
                    j.g(listQ, numX49.tnTj78("bQjO"));
                    mayaPushApprovalListFragment.N1();
                    C0450f c0450f = mayaPushApprovalListFragment.f13552X;
                    j.d(c0450f);
                    ((LinearLayout) ((C0447e) ((C0453g) c0450f.f4088d).f4095d).f4079b).setVisibility(8);
                    mayaPushApprovalListFragment.H1().setVisibility(0);
                    mayaPushApprovalListFragment.f13549U.submitList(listQ);
                } else {
                    MayaPushApprovalListFragment mayaPushApprovalListFragment2 = (MayaPushApprovalListFragment) ((Da.b) c2516a.c.get());
                    mayaPushApprovalListFragment2.N1();
                    C0450f c0450f2 = mayaPushApprovalListFragment2.f13552X;
                    j.d(c0450f2);
                    ((LinearLayout) ((C0447e) ((C0453g) c0450f2.f4088d).f4095d).f4079b).setVisibility(0);
                    mayaPushApprovalListFragment2.H1().setVisibility(8);
                }
                break;
        }
    }

    @Override // vk.b
    public xk.a b(int i) {
        boolean z4;
        xk.a aVarE = xk.a.e(i);
        Bitmap bitmap = (Bitmap) this.f18892b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = {height, width, 3};
        int iC = AbstractC2217b.c(aVarE.h());
        if (iC == 0) {
            float[] fArr = new float[i4 * 3];
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                int i11 = iArr[i10];
                fArr[i6] = (i11 >> 16) & 255;
                int i12 = i6 + 2;
                fArr[i6 + 1] = (i11 >> 8) & 255;
                i6 += 3;
                fArr[i12] = i11 & 255;
            }
            aVarE.l(fArr, iArr2);
            return aVarE;
        }
        if (iC != 2) {
            throw new IllegalStateException(numX49.tnTj78("bQjR") + aVarE.f21025a + numX49.tnTj78("bQjp"));
        }
        byte[] bArr = new byte[i4 * 3];
        int i13 = 0;
        for (int i14 = 0; i14 < i4; i14++) {
            int i15 = iArr[i14];
            bArr[i13] = (byte) ((i15 >> 16) & 255);
            int i16 = i13 + 2;
            bArr[i13 + 1] = (byte) ((i15 >> 8) & 255);
            i13 += 3;
            bArr[i16] = (byte) (i15 & 255);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.nativeOrder());
        int i17 = 0;
        while (true) {
            if (i17 >= 3) {
                z4 = true;
                break;
            }
            if (iArr2[i17] < 0) {
                z4 = false;
                break;
            }
            i17++;
        }
        qk.i.j(numX49.tnTj78("bQjA"), z4);
        int iC2 = xk.a.c(iArr2);
        qk.i.j(numX49.tnTj78("bQjY") + (aVarE.k() * iC2) + numX49.tnTj78("bQjT") + byteBufferWrap.limit(), byteBufferWrap.limit() == aVarE.k() * iC2);
        if (!aVarE.f21027d && !Arrays.equals(iArr2, aVarE.f21026b)) {
            throw new IllegalArgumentException();
        }
        aVarE.f21026b = (int[]) iArr2.clone();
        aVarE.c = iC2;
        byteBufferWrap.rewind();
        aVarE.f21025a = byteBufferWrap;
        return aVarE;
    }

    @Override // ad.InterfaceC0684a
    public void c(int i, String str, String str2) {
        BaseMayaProfileFragment baseMayaProfileFragment = (BaseMayaProfileFragment) this.f18892b;
        C0187u c0187u = baseMayaProfileFragment.f13503J0;
        if (c0187u == null) {
            j.n(numX49.tnTj78("bQj0"));
            throw null;
        }
        c0187u.m(str2);
        baseMayaProfileFragment.H1().k(str);
    }

    @Override // rk.a
    public void clear() {
        qk.a aVar = (qk.a) this.f18892b;
        Map map = (Map) aVar.get();
        if (map != null) {
            map.clear();
            aVar.remove();
        }
    }

    public Object clone() {
        switch (this.f18891a) {
            case 22:
                Bitmap bitmap = (Bitmap) this.f18892b;
                return new C1983a(bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
            default:
                return super.clone();
        }
    }

    @Override // vk.b
    public Bitmap d() {
        return (Bitmap) this.f18892b;
    }

    @Override // Sc.b
    public void e() {
        q qVar = (q) this.f18892b;
        qVar.getClass();
        qVar.o1().g();
    }

    @Override // vk.b
    public int f() {
        Bitmap.Config config = ((Bitmap) this.f18892b).getConfig();
        int i = vk.a.f20509a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQjg") + config + numX49.tnTj78("bQjf"));
    }

    @Override // rk.a
    public Map g() {
        Map map = (Map) ((qk.a) this.f18892b).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        Ci.b bVar = (Ci.b) this.f18892b;
        Object obj = bVar.f785b;
        return new yi.f((C1781b) bVar.c, new Zj.b(1), 3);
    }

    @Override // rk.a
    public void h(Map map) {
        ((qk.a) this.f18892b).set(map != null ? new HashMap(map) : null);
    }

    @Override // a7.InterfaceC0641b
    public void o0() {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent) {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onBeginTransition() {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onEndTransition() {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onMainViewCreate(View view) {
    }

    @Override // com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack
    public void onMainViewDestroy() {
        ((W4.b) this.f18892b).invoke();
    }

    public C1983a(Bitmap bitmap) {
        this.f18891a = 22;
        qk.i.m(bitmap, numX49.tnTj78("bQjb"));
        qk.i.j(numX49.tnTj78("bQj2"), bitmap.getConfig().equals(Bitmap.Config.ARGB_8888));
        this.f18892b = bitmap;
    }

    public C1983a() {
        this.f18891a = 4;
        new ThreadLocal();
        this.f18892b = new qk.a();
    }
}
