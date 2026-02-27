package com.clevertap.android.sdk.inapp.fragment;

import D.AbstractC0184q;
import D.C0187u;
import D.I;
import D.S;
import N.a;
import N.f;
import N.l;
import T.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.List;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBaseFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CTInAppNotification f9518B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CleverTapInstanceConfig f9519K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9520P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CloseImageView f9521Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public WeakReference f9522R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public I f9523S;

    public abstract void l1();

    public final void m1(Bundle bundle) {
        l1();
        l lVarQ1 = q1();
        if (lVarQ1 != null) {
            lVarQ1.K0(p1(), bundle);
        }
    }

    public abstract void n1();

    public final CleverTapInstanceConfig o1() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f9519K;
        if (cleverTapInstanceConfig != null) {
            return cleverTapInstanceConfig;
        }
        j.n("config");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("inApp");
            j.d(parcelable);
            this.f9518B = (CTInAppNotification) parcelable;
            Parcelable parcelable2 = arguments.getParcelable("config");
            j.d(parcelable2);
            this.f9519K = (CleverTapInstanceConfig) parcelable2;
            this.f9520P = getResources().getConfiguration().orientation;
            n1();
            if (context instanceof I) {
                this.f9523S = (I) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        l lVarQ1 = q1();
        if (lVarQ1 != null) {
            lVarQ1.K(p1());
        }
    }

    public final CTInAppNotification p1() {
        CTInAppNotification cTInAppNotification = this.f9518B;
        if (cTInAppNotification != null) {
            return cTInAppNotification;
        }
        j.n("inAppNotification");
        throw null;
    }

    public final l q1() {
        WeakReference weakReference = this.f9522R;
        l lVar = weakReference != null ? (l) weakReference.get() : null;
        if (lVar == null) {
            S sC = o1().c();
            CleverTapInstanceConfig cleverTapInstanceConfigO1 = o1();
            String str = "InAppListener is null for notification: " + AbstractC0184q.b(p1().f);
            String str2 = cleverTapInstanceConfigO1.f9439a;
            sC.getClass();
            S.s(str2, str);
        }
        return lVar;
    }

    public final int r1(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public final void s1(int i) {
        I i4;
        I i6;
        try {
            CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) p1().i.get(i);
            CTInAppAction cTInAppAction = cTInAppNotificationButton.f;
            if (cTInAppAction == null) {
                CTInAppAction.CREATOR.getClass();
                cTInAppAction = new CTInAppAction(null);
                cTInAppAction.f9471a = f.c;
            }
            CTInAppAction cTInAppAction2 = cTInAppAction;
            String str = cTInAppNotificationButton.f9509a;
            l lVarQ1 = q1();
            Bundle bundleA = lVarQ1 != null ? lVarQ1.A(p1(), cTInAppAction2, str, null, getActivity()) : null;
            if (p1().f9500q && (i6 = this.f9523S) != null) {
                if (i == 0) {
                    i6.R0(p1().f9501r);
                    return;
                } else if (i == 1) {
                    i6.f0();
                }
            }
            CTInAppAction cTInAppAction3 = cTInAppNotificationButton.f;
            if (cTInAppAction3 == null || f.e != cTInAppAction3.f9471a || (i4 = this.f9523S) == null) {
                m1(bundleA);
            } else {
                i4.R0(cTInAppAction3.e);
            }
        } catch (Throwable th2) {
            o1().c().getClass();
            if (C0187u.c > 0) {
                Log.d("CleverTap", "Error handling notification button click", th2);
            }
            m1(null);
        }
    }

    public final b t1() {
        Kh.I i = b.f;
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        return i.h(contextRequireContext, o1().c());
    }

    public final void u1(CTInAppAction cTInAppAction, String str, Bundle bundle) {
        CTInAppAction cTInAppAction2;
        Bundle bundle2;
        if (cTInAppAction.f9471a == f.f3463d) {
            Bundle bundleA = n0.f.a(cTInAppAction.f9472b, false);
            String string = bundleA.getString("wzrk_c2a");
            bundleA.remove("wzrk_c2a");
            if (bundle != null) {
                bundleA.putAll(bundle);
            }
            if (string != null) {
                List listT = C2576A.T(string, new String[]{"__dl__"}, 6);
                if (listT.size() == 2) {
                    try {
                        string = URLDecoder.decode((String) listT.get(0), "UTF-8");
                    } catch (Exception e) {
                        o1().c().getClass();
                        if (C0187u.c > 0) {
                            Log.d("CleverTap", "Error parsing c2a param", e);
                        }
                    }
                    a aVar = CTInAppAction.CREATOR;
                    String url = (String) listT.get(1);
                    aVar.getClass();
                    j.g(url, "url");
                    cTInAppAction = new CTInAppAction(null);
                    cTInAppAction.f9471a = f.f3463d;
                    cTInAppAction.f9472b = url;
                }
            }
            cTInAppAction2 = cTInAppAction;
            bundle2 = bundleA;
            if (str == null) {
                str = string;
            }
        } else {
            cTInAppAction2 = cTInAppAction;
            bundle2 = bundle;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        l lVarQ1 = q1();
        m1(lVarQ1 != null ? lVarQ1.A(p1(), cTInAppAction2, str2, bundle2, getActivity()) : null);
    }
}
