package o5;

import N5.K0;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.paymaya.R;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import pc.EnumC2032a;
import r5.f;
import r5.g;
import r5.h;
import r5.i;
import rc.C2194a;
import rc.m;
import wc.InterfaceC2390a;
import wc.InterfaceC2393d;
import wc.InterfaceC2394e;
import yc.InterfaceC2524e;
import yc.p;
import yc.y;

/* JADX INFO: renamed from: o5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1963b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18775b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1963b(int i, Object obj, Object obj2) {
        this.f18774a = i;
        this.f18775b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18774a) {
            case 0:
                i iVar = (i) obj;
                int i = VerticalBannerAd.h;
                boolean z4 = iVar instanceof h;
                VerticalBannerAd verticalBannerAd = (VerticalBannerAd) this.f18775b;
                if (z4) {
                    Log.d("VerticalBannerAd", "VerticalBannerAdState.Loading emitted.");
                    ((CardView) verticalBannerAd.f10225a.f4049g).setVisibility(0);
                    RecyclerView recyclerView = verticalBannerAd.f10226b;
                    recyclerView.setVisibility(0);
                    recyclerView.post(new androidx.window.layout.adapter.extensions.a(verticalBannerAd, 21));
                } else if (iVar instanceof f) {
                    Log.d("VerticalBannerAd", "VerticalBannerAdState.BannerLoaded emitted.");
                    verticalBannerAd.c(((f) iVar).f19859a);
                } else {
                    boolean z5 = iVar instanceof r5.e;
                    C1966e c1966e = (C1966e) this.c;
                    if (z5) {
                        Function1 function1 = c1966e.f;
                        if (function1 != null) {
                            function1.invoke(((r5.e) iVar).f19858a);
                        }
                    } else if (iVar instanceof r5.d) {
                        Function1 function12 = c1966e.f18781g;
                        if (function12 != null) {
                            function12.invoke(((r5.d) iVar).f19857a);
                        }
                    } else if (iVar instanceof r5.c) {
                        Function2 function2 = c1966e.h;
                        if (function2 != null) {
                            r5.c cVar = (r5.c) iVar;
                            function2.invoke(cVar.f19855a, cVar.f19856b);
                        }
                    } else if (iVar instanceof g) {
                        verticalBannerAd.f10226b.setVisibility(8);
                        ((CardView) verticalBannerAd.f10225a.f4049g).setVisibility(8);
                    }
                }
                return Unit.f18162a;
            case 1:
                View it = (View) obj;
                int i4 = MayaProfileActivity.f13490r;
                j.g(it, "it");
                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) this.f18775b;
                C1220i c1220iK1 = mayaProfileActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.MENU);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaProfileActivity, c1219hD);
                Intent intentO0 = mayaProfileActivity.n1().o0(mayaProfileActivity);
                intentO0.setData(mayaProfileActivity.getIntent().getData());
                B5.i.v0(mayaProfileActivity, intentO0);
                ((ActivityResultLauncher) this.c).launch(intentO0);
                return Unit.f18162a;
            case 2:
                C2194a c2194a = (C2194a) this.f18775b;
                PayMayaError payMayaError = (PayMayaError) this.c;
                if (((Integer) obj).intValue() == 20101) {
                    MayaPersonalDetailsFragment mayaPersonalDetailsFragment = (MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get());
                    InterfaceC2524e interfaceC2524e = mayaPersonalDetailsFragment.f14242a0;
                    if (interfaceC2524e != null) {
                        String strA = Je.c.a(jk.b.p(((K0) mayaPersonalDetailsFragment.G1()).f3715d));
                        MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) interfaceC2524e;
                        String strD = AbstractC1236z.d(mayaUpdateProfileActivity, MayaUpdateProfileActivity.class);
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, null, mayaUpdateProfileActivity.getString(R.string.maya_user_profile_update_contact_duplication_warning, strA), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_X);
                        mayaErrorDialogFragmentZ.f11850c0 = new o6.f(mayaErrorDialogFragmentZ, 18);
                        mayaErrorDialogFragmentZ.show(mayaUpdateProfileActivity.getSupportFragmentManager(), strD);
                    }
                } else {
                    c2194a.n(payMayaError, 1, false);
                }
                return Unit.f18162a;
            case 3:
                rc.i iVar2 = (rc.i) this.f18775b;
                Throwable th2 = (Throwable) this.c;
                if (((Integer) obj).intValue() == 20101) {
                    MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar2.c.get());
                    p pVar = mayaUserContactReferenceFragment.f14259a0;
                    if (pVar != null) {
                        ((MayaUserProfileUpdateActivity) pVar).Z1("CONTACT_REFERENCE", "+63" + ((Object) mayaUserContactReferenceFragment.c2().getInputEditText().getText()));
                    }
                } else {
                    j.d(th2);
                    iVar2.n(th2, EnumC2032a.f19083a, false);
                }
                return Unit.f18162a;
            case 4:
                m mVar = (m) this.f18775b;
                Throwable th3 = (Throwable) this.c;
                if (((Integer) obj).intValue() == 20101) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                    y yVar = mayaUserProfileUpdateFragment.f14267b0;
                    if (yVar != null) {
                        ((MayaUserProfileUpdateActivity) yVar).Z1("PERSONAL_INFO", "+" + ((Object) mayaUserProfileUpdateFragment.X1().getInputEditText().getText()));
                    }
                } else {
                    j.d(th3);
                    mVar.n(th3, EnumC2032a.f19083a, false);
                }
                return Unit.f18162a;
            case 5:
                return CoreComponent.eventThrottler$lambda$0((SecondGenServiceLocator) this.f18775b, (OneAgentConfiguration) this.c, (String) obj);
            case 6:
                j.g(obj, "<this>");
                Function1 function13 = (Function1) this.f18775b;
                if (function13 != null) {
                    function13.invoke(obj);
                }
                ((Function1) this.c).invoke(obj);
                return Unit.f18162a;
            case 7:
                String it2 = (String) obj;
                j.g(it2, "it");
                ((MayaPersonalDetailsFragment) this.f18775b).f14245d0.f(FieldType.AlternativeContactNumber.INSTANCE, ((Boolean) ((MayaProfileInputLayout) this.c).getLastValidationResult().f18160a).booleanValue());
                return Unit.f18162a;
            default:
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                z2.h hVar = (z2.h) this.f18775b;
                hVar.getClass();
                Preferences.Key key = z2.h.f21363d;
                String str = (String) this.c;
                mutablePreferences.set(key, str);
                hVar.h(mutablePreferences, str);
                return null;
        }
    }
}
