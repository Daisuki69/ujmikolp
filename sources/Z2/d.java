package z2;

import Oi.q;
import Xh.o;
import Xh.p;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.work.WorkManager;
import b1.t;
import ch.l;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.r;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInReceiptFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import hh.InterfaceC1573f;
import hh.n;
import j2.InterfaceC1665d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import mi.InterfaceC1866a;
import mi.InterfaceC1867b;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import o3.AbstractC1958a;
import o3.C1960c;
import oi.C1986d;
import oi.C1989g;
import p2.C2009e;
import p3.C2011b;
import s1.InterfaceC2231f;
import si.C2260b;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Ch.f, kotlin.coroutines.f, M5.f, InterfaceC1866a, SQLiteDatabaseHook, Q3.c, n, C3.n, f2.a, SuccessContinuation, InterfaceC1665d, InterfaceC1573f, b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21361a;

    public /* synthetic */ d(int i) {
        this.f21361a = i;
    }

    public static t j(Xh.d dVar, io.split.android.client.network.d dVar2, String str) {
        U8.c cVar = new U8.c(dVar2, io.split.android.client.network.b.a("https://sdk.split.io/api", "/splitChanges", str), (InterfaceC1867b) new C1989g());
        r rVar = new r(dVar2, new C2260b(), new C2011b(18));
        U8.c cVar2 = new U8.c(28, dVar2, io.split.android.client.network.b.a("https://auth.split.io/api/v2", "/auth", null), new C2009e());
        U8.c cVar3 = new U8.c(dVar2, io.split.android.client.network.b.a("https://events.split.io/api", "/events/bulk", null), new C2011b(26));
        U8.c cVar4 = new U8.c(dVar2, io.split.android.client.network.b.a("https://events.split.io/api", "/testImpressions/bulk", null), (InterfaceC1866a) new C1989g());
        U8.c cVar5 = new U8.c(dVar2, io.split.android.client.network.b.a("https://events.split.io/api", "/testImpressions/count", null), new C1986d(0));
        U8.c cVar6 = new U8.c(dVar2, io.split.android.client.network.b.a("https://telemetry.split.io/api/v1", "/keys/cs", null), (InterfaceC1866a) new C2009e());
        U8.c cVar7 = new U8.c(dVar2, io.split.android.client.network.b.a("https://telemetry.split.io/api/v1", "/metrics/config", null), new C2011b(10));
        U8.c cVar8 = new U8.c(dVar2, io.split.android.client.network.b.a("https://telemetry.split.io/api/v1", "/metrics/usage", null), new d(10));
        t tVar = new t();
        tVar.f8333a = cVar;
        tVar.f8334b = rVar;
        tVar.c = cVar2;
        tVar.f8335d = cVar3;
        tVar.e = cVar4;
        tVar.f = cVar5;
        tVar.f8336g = cVar6;
        tVar.h = cVar7;
        tVar.i = cVar8;
        return tVar;
    }

    public static zi.f k(Context context, Xh.d dVar, String str, Map map) {
        o oVar = o.f6668b;
        return new zi.f(WorkManager.getInstance(context), dVar, str, map.get(oVar) != null ? (p) map.get(oVar) : (p) map.get(o.f6667a));
    }

    public static String l(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c10 = (char) ((iCharAt >> 8) & 255);
        char c11 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c);
        if (length >= 2) {
            sb3.append(c10);
        }
        if (length >= 3) {
            sb3.append(c11);
        }
        return sb3.toString();
    }

    public static MayaCashInReceiptFragment m(ExecutePullFunds executePullFunds, BankPullPaymentOption bankPullPaymentOption, WesternUnionTransaction westernUnionTransaction, int i, int i4) {
        if ((i4 & 1) != 0) {
            executePullFunds = null;
        }
        if ((i4 & 2) != 0) {
            bankPullPaymentOption = null;
        }
        if ((i4 & 4) != 0) {
            westernUnionTransaction = null;
        }
        MayaCashInReceiptFragment mayaCashInReceiptFragment = new MayaCashInReceiptFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("execute_pull_funds", executePullFunds);
        bundle.putParcelable("bank_pull_payment_option", bankPullPaymentOption);
        bundle.putParcelable("western_union", westernUnionTransaction);
        bundle.putInt("mode", i);
        mayaCashInReceiptFragment.setArguments(bundle);
        return mayaCashInReceiptFragment;
    }

    public static MayaAlertBottomSheetDialogFragment n(int i, String str, CharSequence charSequence, Pair pair, Pair pair2, Pair pair3, int i4) {
        if ((i4 & 8) != 0) {
            pair = null;
        }
        if ((i4 & 16) != 0) {
            pair2 = null;
        }
        if ((i4 & 32) != 0) {
            pair3 = null;
        }
        boolean z4 = (i4 & 64) == 0;
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment = new MayaAlertBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("image_res_id", i);
        bundle.putCharSequence("title", str);
        bundle.putCharSequence("description", charSequence);
        bundle.putString("primary_value", pair != null ? (String) pair.f18160a : null);
        bundle.putString("secondary_value", pair2 != null ? (String) pair2.f18160a : null);
        bundle.putString("tertiary_value", pair3 != null ? (String) pair3.f18160a : null);
        bundle.putBoolean("loadMayaTheme", z4);
        mayaAlertBottomSheetDialogFragment.setArguments(bundle);
        mayaAlertBottomSheetDialogFragment.f11822e0 = pair != null ? (Function1) pair.f18161b : null;
        mayaAlertBottomSheetDialogFragment.f11823f0 = pair2 != null ? (Function1) pair2.f18161b : null;
        mayaAlertBottomSheetDialogFragment.f11824g0 = pair3 != null ? (Function1) pair3.f18161b : null;
        return mayaAlertBottomSheetDialogFragment;
    }

    @Override // mi.InterfaceC1866a
    public String a(Object obj) {
        return io.split.android.client.utils.b.b((q) obj);
    }

    @Override // hh.InterfaceC1573f
    public void accept(Object obj) {
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f21361a) {
            case 2:
                return obj;
            case 17:
                return new Xe.e((l) obj);
            default:
                return ((Ze.a) obj).f6933a;
        }
    }

    @Override // j2.InterfaceC1665d
    public void b() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
    public void c(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.h("PRAGMA cipher_compatibility=3;", null, null);
    }

    @Override // M5.f
    public String d() {
        switch (this.f21361a) {
            case 6:
                return String.format("SELECT * FROM %1$s", Arrays.copyOf(new Object[]{"credit_transaction"}, 1));
            case 7:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", Arrays.copyOf(new Object[]{"identity", SessionDescription.ATTR_TYPE, "msisdn"}, 3));
            default:
                return String.format("SELECT * FROM %1$s", "user");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[PHI: r1
  0x0041: PHI (r1v6 d4.c) = (r1v5 d4.c), (r1v30 d4.c) binds: [B:9:0x0016, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    @Override // C3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.b e(java.lang.String r28, C3.a r29, int r30, int r31, java.util.HashMap r32) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 2063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.d.e(java.lang.String, C3.a, int, int, java.util.HashMap):K3.b");
    }

    @Override // j2.InterfaceC1665d
    public String f() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        bg.AbstractC0983W.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        throw null;
     */
    @Override // Q3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(Q3.d r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.d.g(Q3.d):void");
    }

    @Override // f2.a
    public void h(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // j2.InterfaceC1665d
    public void i(long j, String str) {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public String toString() {
        switch (this.f21361a) {
            case 2:
                return "IdentityFunction";
            case 25:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        Set<C1960c> setK = bVar.k(C1960c.class);
        o3.d dVar = new o3.d();
        dVar.f18770a = new HashMap();
        for (C1960c c1960c : setK) {
            HashMap map = dVar.f18770a;
            c1960c.getClass();
            map.put(AbstractC1958a.class, c1960c.f18768a);
        }
        return dVar;
    }

    public d(ArrayList arrayList, InterfaceC2231f interfaceC2231f, int i, long j) {
        this.f21361a = 28;
    }
}
