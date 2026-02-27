package de;

import D8.E;
import G5.C0251a;
import Kh.C0300e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.mayaui.autodebitarrangement.view.activity.impl.MayaAutoDebitArrangementActivity;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSuccessFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelReceiptFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import dOYHB6.tiZVw8.numX49;
import e2.C1419a;
import e2.C1420b;
import e2.C1422d;
import f1.C1455a;
import f1.EnumC1457c;
import h2.C1531a;
import i2.C1585a;
import i8.C1594b;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import j1.C1659g;
import j1.InterfaceC1655c;
import j1.InterfaceC1656d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k1.InterfaceC1690a;
import lb.InterfaceC1823d;
import m8.InterfaceC1855b;
import md.InterfaceC1862a;
import n2.C1915b;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Uc.b, B2.a, OnSuccessListener, EventListener.Factory, EventSource.Factory, Ch.a, g0, Continuation, NestedScrollView.OnScrollChangeListener, Ah.i, InterfaceC1690a, KeyEventChannel.EventResponseHandler, OnCompleteListener, ActivityResultCallback, pg.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16373b;

    public /* synthetic */ m(Object obj, int i) {
        this.f16372a = i;
        this.f16373b = obj;
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        switch (this.f16372a) {
            case 7:
                h0.g(((UserActivityFragment) this.f16373b).getActivity(), numX49.tnTj78("bd1Z"), file);
                break;
            default:
                MayaTravelReceiptFragment mayaTravelReceiptFragment = (MayaTravelReceiptFragment) this.f16373b;
                kc.e eVar = mayaTravelReceiptFragment.I0;
                if (eVar != null) {
                    String string = mayaTravelReceiptFragment.getString(R.string.maya_label_receipt_action_share_save_receipt);
                    Uri uriC = h0.c(mayaTravelReceiptFragment.getActivity(), file);
                    MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) eVar;
                    mayaTravelActivity.n1();
                    B5.i.W(mayaTravelActivity, string, uriC);
                }
                break;
        }
    }

    @Override // Ah.i
    public void c(C0300e c0300e) {
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) this.f16373b;
        AppCompatEditText appCompatEditText = mayaPayBillsSearchFragment.f13473V;
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(new C0251a(6, mayaPayBillsSearchFragment, c0300e));
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bd1k"));
            throw null;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f16373b, call);
    }

    @Override // B2.a
    public void d(B2.b bVar) {
        switch (this.f16372a) {
            case 1:
                C1419a c1419a = (C1419a) this.f16373b;
                c1419a.getClass();
                String strTnTj78 = numX49.tnTj78("bd1S");
                if (Log.isLoggable(strTnTj78, 3)) {
                    Log.d(strTnTj78, numX49.tnTj78("bd1j"), null);
                }
                c1419a.f16552b.set((C1419a) bVar.get());
                break;
            default:
                com.google.firebase.messaging.r rVar = ((W2.j) ((Z2.a) bVar.get())).b(numX49.tnTj78("bd1B")).j;
                Set set = (Set) rVar.e;
                C1420b c1420b = (C1420b) this.f16373b;
                set.add(c1420b);
                Task taskB = ((X2.d) rVar.f9803b).b();
                taskB.addOnSuccessListener((Executor) rVar.f9804d, new Bb.c(13, rVar, taskB, c1420b));
                String strTnTj782 = numX49.tnTj78("bd1u");
                if (Log.isLoggable(strTnTj782, 3)) {
                    Log.d(strTnTj782, numX49.tnTj78("bd1V"), null);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.InterfaceC1690a
    public Object execute() {
        Object obj = this.f16373b;
        byte b8 = 0;
        Object[] objArr = 0;
        switch (this.f16372a) {
            case 14:
                C1659g c1659g = (C1659g) ((InterfaceC1655c) obj);
                c1659g.getClass();
                int i = C1455a.e;
                com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(17, (boolean) (objArr == true ? 1 : 0));
                rVar.c = null;
                rVar.f9804d = new ArrayList();
                rVar.e = null;
                rVar.f9803b = numX49.tnTj78("bd1d");
                HashMap map = new HashMap();
                String strTnTj78 = numX49.tnTj78("bd1i");
                SQLiteDatabase sQLiteDatabaseB = c1659g.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    C1455a c1455a = (C1455a) C1659g.q(sQLiteDatabaseB.rawQuery(strTnTj78, new String[0]), new C1585a(3, c1659g, map, rVar));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return c1455a;
                } finally {
                }
            case 15:
                C1659g c1659g2 = (C1659g) ((InterfaceC1656d) obj);
                long jF = c1659g2.f17664b.f() - c1659g2.f17665d.f17658d;
                SQLiteDatabase sQLiteDatabaseB2 = c1659g2.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jF)};
                    Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c1659g2.i(cursorRawQuery.getInt(0), EnumC1457c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                        break;
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    sQLiteDatabaseB2.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 16:
                C1659g c1659g3 = (C1659g) ((i1.f) obj).i;
                SQLiteDatabase sQLiteDatabaseB3 = c1659g3.b();
                sQLiteDatabaseB3.beginTransaction();
                try {
                    sQLiteDatabaseB3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c1659g3.f17664b.f()).execute();
                    sQLiteDatabaseB3.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                i1.g gVar = (i1.g) obj;
                SQLiteDatabase sQLiteDatabaseB4 = ((C1659g) gVar.f17083b).b();
                sQLiteDatabaseB4.beginTransaction();
                try {
                    List list = (List) C1659g.q(sQLiteDatabaseB4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new df.o(2, b8));
                    sQLiteDatabaseB4.setTransactionSuccessful();
                    sQLiteDatabaseB4.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        gVar.c.a((c1.p) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // okhttp3.sse.EventSource.Factory
    public EventSource newEventSource(Request request, EventSourceListener eventSourceListener) {
        return EventSources.createFactory$lambda$1((OkHttpClient) this.f16373b, request, eventSourceListener);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = MayaForgotPasswordActivity.f12356r;
        kotlin.jvm.internal.j.g(activityResult, numX49.tnTj78("bd1E"));
        ((MayaForgotPasswordActivity) this.f16373b).f12357n.invoke(activityResult);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f16372a) {
            case 22:
                FlutterFirebaseCorePlugin.lambda$listenToResponse$1((GeneratedAndroidFirebaseCore.Result) this.f16373b, task);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10((pg.t) this.f16373b, task);
                break;
        }
    }

    @Override // Uc.b
    public void onDismiss() {
        ((QRScannerFragment) this.f16373b).r1();
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
    public void onFrameworkResponse(boolean z4) {
        ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.f16373b).onKeyEventHandled(z4);
    }

    @Override // pg.s
    public void onMethodCall(pg.r rVar, pg.t tVar) {
        int i = MayaAutoDebitArrangementActivity.f11527p;
        kotlin.jvm.internal.j.g(rVar, numX49.tnTj78("bd1F"));
        kotlin.jvm.internal.j.g(tVar, numX49.tnTj78("bd1H"));
        MayaAutoDebitArrangementActivity mayaAutoDebitArrangementActivity = (MayaAutoDebitArrangementActivity) this.f16373b;
        mayaAutoDebitArrangementActivity.getClass();
        new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(19, rVar, mayaAutoDebitArrangementActivity, tVar));
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i4, int i6, int i10) {
        kotlin.jvm.internal.j.g(nestedScrollView, numX49.tnTj78("bd1O"));
        int height = nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight();
        MayaRegistrationUserFragment mayaRegistrationUserFragment = (MayaRegistrationUserFragment) this.f16373b;
        MultiColorTextView multiColorTextView = mayaRegistrationUserFragment.f12807X;
        String strTnTj78 = numX49.tnTj78("bd1Q");
        if (multiColorTextView == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        int height2 = multiColorTextView.getHeight();
        MultiColorTextView multiColorTextView2 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView2 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = multiColorTextView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i11 = height2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        MultiColorTextView multiColorTextView3 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView3 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        if (height <= multiColorTextView3.getPaddingTop() + i11) {
            MultiColorTextView multiColorTextView4 = mayaRegistrationUserFragment.f12807X;
            if (multiColorTextView4 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            multiColorTextView4.setAlpha(1.0f);
            MultiColorTextView multiColorTextView5 = mayaRegistrationUserFragment.f12807X;
            if (multiColorTextView5 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            multiColorTextView5.setVisibility(0);
            h9.t tVar = mayaRegistrationUserFragment.f12817h0;
            if (tVar != null) {
                ((MayaRegistrationActivity) tVar).B0(1.0f);
                return;
            }
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        MultiColorTextView multiColorTextView6 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView6 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        multiColorTextView6.getGlobalVisibleRect(rect);
        nestedScrollView.getGlobalVisibleRect(rect2);
        float f = rect.bottom - rect2.top;
        if (f < 0.0f) {
            f = 0.0f;
        }
        MultiColorTextView multiColorTextView7 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView7 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        float height3 = multiColorTextView7.getHeight();
        if (f > height3) {
            f = height3;
        }
        if (mayaRegistrationUserFragment.f12807X == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        float height4 = f / r9.getHeight();
        MultiColorTextView multiColorTextView8 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView8 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        multiColorTextView8.setAlpha(height4);
        MultiColorTextView multiColorTextView9 = mayaRegistrationUserFragment.f12807X;
        if (multiColorTextView9 == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        multiColorTextView9.setVisibility(height4 <= 0.0f ? 4 : 0);
        h9.t tVar2 = mayaRegistrationUserFragment.f12817h0;
        if (tVar2 != null) {
            ((MayaRegistrationActivity) tVar2).B0(height4);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f16372a) {
            case 3:
                ((com.squareup.wire.internal.a) this.f16373b).invoke(obj);
                break;
            case 10:
                ((com.squareup.wire.internal.a) this.f16373b).invoke(obj);
                break;
            default:
                ((com.squareup.wire.internal.a) this.f16373b).invoke(obj);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f16372a) {
            case 6:
                InterfaceC1823d interfaceC1823d = ((ReKycSubmittedFragment) ((kb.c) ((E) this.f16373b).c.get())).f13715W;
                if (interfaceC1823d != null) {
                    ReKycSubmittedActivity reKycSubmittedActivity = (ReKycSubmittedActivity) interfaceC1823d;
                    reKycSubmittedActivity.n1().z(reKycSubmittedActivity);
                }
                break;
            case 20:
                C1594b c1594b = (C1594b) this.f16373b;
                ((MayaBaseFragment) ((InterfaceC1855b) c1594b.c.get())).w1();
                n8.f fVar = ((MayaForgotPasswordSetNewPasswordFragment) ((InterfaceC1855b) c1594b.c.get())).f12385g0;
                if (fVar != null) {
                    AbstractC1236z.g((MayaForgotPasswordActivity) fVar, R.id.fragment_container, new MayaForgotPasswordSuccessFragment());
                }
                break;
            case 24:
                ((BaseFragment) ((od.a) ((M7.c) this.f16373b).c.get())).n1();
                break;
            case 25:
                M7.c cVar = (M7.c) this.f16373b;
                ((BaseDialogFragment) ((InterfaceC1862a) cVar.c.get())).f10242K.dismiss();
                ((DataPrivacyDialogFragment) ((InterfaceC1862a) cVar.c.get())).dismiss();
                break;
            default:
                ((BaseFragment) ((od.b) ((M7.c) this.f16373b).c.get())).n1();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        switch (this.f16372a) {
            case 8:
                ((C1915b) this.f16373b).getClass();
                if (task.isSuccessful()) {
                    C1531a c1531a = (C1531a) task.getResult();
                    C1422d c1422d = C1422d.f16556a;
                    c1422d.c(numX49.tnTj78("bd1t") + c1531a.f16854b);
                    File file = c1531a.c;
                    if (file.delete()) {
                        c1422d.c(numX49.tnTj78("bd1U") + file.getPath());
                    } else {
                        c1422d.g(numX49.tnTj78("bd1e") + file.getPath(), null);
                    }
                    z4 = true;
                } else {
                    Log.w(numX49.tnTj78("bd18"), numX49.tnTj78("bd1C"), task.getException());
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 9:
                ((CountDownLatch) this.f16373b).countDown();
                return null;
            case 18:
                return (Task) ((h2.j) this.f16373b).call();
            default:
                ((Runnable) this.f16373b).run();
                return Tasks.forResult(null);
        }
    }
}
