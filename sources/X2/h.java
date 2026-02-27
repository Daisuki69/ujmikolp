package X2;

import Ih.AbstractC0267b;
import android.net.Uri;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import bi.EnumC1028f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.paymaya.R;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsReceiptFragment;
import ha.y;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Continuation, CallbackToFutureAdapter.Resolver, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6490b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6491d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6489a = obj;
        this.f6490b = obj2;
        this.c = obj3;
        this.f6491d = obj4;
        this.e = obj5;
    }

    public void a(final AbstractC0267b abstractC0267b) {
        W5.b bVar = new W5.b((A3.i) this.f6489a, (String) this.f6490b, (W5.e) this.c);
        ((Function1) this.f6491d).invoke(bVar);
        final int i = 2;
        Function0 function0 = new Function0() { // from class: X5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        abstractC0267b.onNext(EnumC1028f.c);
                        break;
                    case 1:
                        abstractC0267b.onNext(EnumC1028f.f9153d);
                        break;
                    case 2:
                        EnumC1028f enumC1028f = EnumC1028f.f9151a;
                        AbstractC0267b abstractC0267b2 = abstractC0267b;
                        abstractC0267b2.onNext(enumC1028f);
                        abstractC0267b2.onComplete();
                        break;
                    default:
                        abstractC0267b.onNext(EnumC1028f.f9152b);
                        break;
                }
                return Unit.f18162a;
            }
        };
        EnumC1028f enumC1028f = EnumC1028f.f9151a;
        Function0 function02 = (Function0) this.e;
        Xh.h hVar = bVar.c;
        if (hVar != null) {
            hVar.d(enumC1028f, new W5.a(bVar, enumC1028f, function0, function02));
        }
        final int i4 = 3;
        Function0 function03 = new Function0() { // from class: X5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        abstractC0267b.onNext(EnumC1028f.c);
                        break;
                    case 1:
                        abstractC0267b.onNext(EnumC1028f.f9153d);
                        break;
                    case 2:
                        EnumC1028f enumC1028f2 = EnumC1028f.f9151a;
                        AbstractC0267b abstractC0267b2 = abstractC0267b;
                        abstractC0267b2.onNext(enumC1028f2);
                        abstractC0267b2.onComplete();
                        break;
                    default:
                        abstractC0267b.onNext(EnumC1028f.f9152b);
                        break;
                }
                return Unit.f18162a;
            }
        };
        EnumC1028f enumC1028f2 = EnumC1028f.f9152b;
        Xh.h hVar2 = bVar.c;
        if (hVar2 != null) {
            hVar2.d(enumC1028f2, new W5.a(bVar, enumC1028f2, function03, null));
        }
        final int i6 = 0;
        Function0 function04 = new Function0() { // from class: X5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        abstractC0267b.onNext(EnumC1028f.c);
                        break;
                    case 1:
                        abstractC0267b.onNext(EnumC1028f.f9153d);
                        break;
                    case 2:
                        EnumC1028f enumC1028f22 = EnumC1028f.f9151a;
                        AbstractC0267b abstractC0267b2 = abstractC0267b;
                        abstractC0267b2.onNext(enumC1028f22);
                        abstractC0267b2.onComplete();
                        break;
                    default:
                        abstractC0267b.onNext(EnumC1028f.f9152b);
                        break;
                }
                return Unit.f18162a;
            }
        };
        EnumC1028f enumC1028f3 = EnumC1028f.c;
        Xh.h hVar3 = bVar.c;
        if (hVar3 != null) {
            hVar3.d(enumC1028f3, new W5.a(bVar, enumC1028f3, function04, null));
        }
        final int i10 = 1;
        W5.b.a(bVar, new Function0() { // from class: X5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        abstractC0267b.onNext(EnumC1028f.c);
                        break;
                    case 1:
                        abstractC0267b.onNext(EnumC1028f.f9153d);
                        break;
                    case 2:
                        EnumC1028f enumC1028f22 = EnumC1028f.f9151a;
                        AbstractC0267b abstractC0267b2 = abstractC0267b;
                        abstractC0267b2.onNext(enumC1028f22);
                        abstractC0267b2.onComplete();
                        break;
                    default:
                        abstractC0267b.onNext(EnumC1028f.f9152b);
                        break;
                }
                return Unit.f18162a;
            }
        });
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return OperationKt.launchOperation$lambda$2((Executor) this.f6489a, (Tracer) this.f6490b, (String) this.c, (Function0) this.f6491d, (MutableLiveData) this.e, completer);
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) this.f6489a;
        y yVar = mayaPayBillsReceiptFragment.f13468f1;
        if (yVar != null) {
            String string = mayaPayBillsReceiptFragment.getString(R.string.pma_label_share_authorized_without_account_number, (String) this.f6490b, (String) this.c, (String) this.f6491d, (String) this.e);
            Uri uriC = h0.c(mayaPayBillsReceiptFragment.getActivity(), file);
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) yVar;
            mayaPayBillsActivity.n1();
            B5.i.X(mayaPayBillsActivity, "Share Receipt", string, uriC);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Date date = (Date) this.f6491d;
        HashMap map = (HashMap) this.e;
        j jVar = (j) this.f6489a;
        jVar.getClass();
        Task task2 = (Task) this.f6490b;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        Task task3 = (Task) this.c;
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            i iVarB = jVar.b((String) task2.getResult(), ((C2.a) task3.getResult()).f668a, date, map);
            return iVarB.f6492a != 0 ? Tasks.forResult(iVarB) : jVar.f.e(iVarB.f6493b).onSuccessTask(jVar.c, new Na.d(iVarB, 27));
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }
}
